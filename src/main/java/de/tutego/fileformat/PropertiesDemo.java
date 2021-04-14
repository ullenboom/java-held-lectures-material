package de.tutego.fileformat;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * Lernziel: `Properties`-Klasse
 * - `Properties`-Objekt aufbauen, abfragen, füllen, verketten
 * - Properties laden und speichern
 *
 * @see JAXBdemo
 */
public class PropertiesDemo {
  public static void main( String[] args ) {
    Properties defaultProperties = new Properties();
    defaultProperties.setProperty( "name", "chris" );
    defaultProperties.setProperty( "age", "55" );
    System.out.println( defaultProperties );
    System.out.println( defaultProperties.getProperty( "name" ) );  // chris
    System.out.println( defaultProperties.getProperty( "firstname" ) ); // null
    System.out.println( defaultProperties.getProperty( "firstname", "none" ) ); // none

    Properties properties = new Properties( defaultProperties );
    System.out.println( properties.getProperty( "name" ) ); // chris
    properties.setProperty( "name", "cora" );
    System.out.println( properties.getProperty( "name" ) );  // cora
    properties.remove( "name" );
    System.out.println( properties.getProperty( "name" ) );  // chris

//    try ( Writer writer = Files.newBufferedWriter( Paths.get( "default.properties" ) ) ) {
//      defaultProperties.store( writer, "" );
//    }
//    catch ( IOException e ) {
//      e.printStackTrace();
//    }

    Properties newProperties = new Properties();
    try ( Reader reader = Files.newBufferedReader( Paths.get( "default.properties" ) ) ) {
      newProperties.load( reader );
      System.out.println( newProperties );
      newProperties.list( System.out );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
