package com.tutego.string;

import java.util.StringJoiner;

public class StringJoinerDemo {
  public static void main( String[] args ) {

    // String join(...)

    //    StringJoiner stringJoiner = new StringJoiner(".", "[", "]");
    //    stringJoiner.setEmptyValue( "--" );
    //    stringJoiner.add( "192" );
    //    stringJoiner.add( "18" );
    //    stringJoiner.add( "1" );
    //    stringJoiner.add( "2" );
    //    System.out.println( stringJoiner );

    System.out.println( joinWithCommaAndAnd( "abc", "def" ) );
    System.out.println( joinWithCommaAndAnd( "abc", "def", "ghi" ) );
    System.out.println( joinWithCommaAndAnd( "abc" ) );
    System.out.println( joinWithCommaAndAnd() );
  }

  static String joinWithCommaAndAnd( String... strings ) {

    if ( strings.length <= 2 ) {
      // strings.length == 0
      // strings.length == 1
      // strings.length == 2

      return String.join( " and ", strings );
    }

    StringJoiner stringJoiner = new StringJoiner( ", " );
    for ( int i = 0; i < strings.length - 1; i++ ) {
      stringJoiner.add( strings[ i ] );
    }

    return stringJoiner + " and " + strings[ strings.length - 1 ];
  }

}
