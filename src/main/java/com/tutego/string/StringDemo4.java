package com.tutego.string;

import java.util.Locale;

public class StringDemo4 {
  public static void main( String[] args ) {

    /*
     Replacement and 'Modification'
     */

    String name = "Christian Ullenboom";
    System.out.println( name.replace( ' ', ' ' ) );
    System.out.println( name.replace( "Christian", "Eva" ) );
    System.out.println( name.replace( " Ullenboom", "" ) );

    System.out.println( name.replaceAll( ".", "," ) ); // ,,,,,,,,,,,,,,,,,,,

    System.out.println( " \t ABC ".strip() );
    // "".stripLeading()
    // "".stripTrailing()

    // "".indent( 1 )

    /*
     Case Conversion
     */

    System.out.println( name.toUpperCase( Locale.ROOT ) );
    System.out.println( name.toLowerCase( Locale.ROOT ) );
  }
}
