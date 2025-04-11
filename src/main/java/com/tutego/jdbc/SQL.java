package com.tutego.jdbc;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/*
 * H2 Database
 * - https://h2database.com/
 * - https://h2database.com/html/features.html#database_url
 * Demo Database MONDIAL
 * - https://github.com/ullenboom/mondial-database
 * JDBC Specification, Appendix B (Data Type Conversion Tables)
 * - https://download.oracle.com/otn-pub/jcp/jdbc-4_3-mrel3-eval-spec/jdbc4.3-fr-spec.pd
 */
public class SQL implements AutoCloseable {

  interface RowMapper<T> {
    T mapRow( ResultSet resultSet ) throws SQLException;
  }

  private final Connection connection;

  public SQL( String jdbcUrl ) throws SQLException {
    connection = DriverManager.getConnection( jdbcUrl );
  }

  public <T> List<T> query( String sql, RowMapper<T> rowMapper ) throws SQLException {
    ResultSet resultSet = connection.createStatement().executeQuery( sql );

    List<T> result = new ArrayList<>();
    while ( resultSet.next() ) {
      result.add( rowMapper.mapRow( resultSet ) );
    }
    return result;
  }

  @Override public void close() throws SQLException {
    connection.close();
  }
}

class SqlDemo {
  static String getMondialSql() {
    try ( InputStream stream = SQL.class.getResourceAsStream( "/db/mondial.sql" ) ) {
      return new String( stream.readAllBytes(), StandardCharsets.UTF_8 );
    }
    catch ( Exception e ) {
      throw new RuntimeException( e );
    }
  }

  record Country( String name, int population ) {}

  public static void main( String[] args ) {
    try ( SQL sql = new SQL( "jdbc:h2:file:./mondial" ) ) {
      // CREATE TABLE Country(
      // Name VARCHAR(35) NOT NULL UNIQUE, Code VARCHAR(4), Capital VARCHAR(35),
      // Province VARCHAR(35), Area FLOAT, Population INT,
      // CONSTRAINT CountryKey PRIMARY KEY(Code), CONSTRAINT CountryArea
      // CHECK (Area >= 0), CONSTRAINT CountryPop CHECK (Population >= 0));

      SQL.RowMapper<Country> rowMapper = resultSet -> new Country( resultSet.getString( "Name" ),
                                                                   resultSet.getInt( "Population" ) );
      List<Country> list = sql.query( "SELECT * FROM COUNTRY", rowMapper );
      System.out.println( list );
    }
    catch ( SQLException e ) {
      e.printStackTrace();
    }
  }
}
