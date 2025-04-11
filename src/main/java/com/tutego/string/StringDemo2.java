package com.tutego.string;

public class StringDemo2 {
  public static void main( String[] args ) {

    /*
     Search and Match Operations
     */

    String email = "joe.doe@example.com";
    //              01234567
    System.out.println( email.indexOf( '@' ) );
    System.out.println( email.indexOf( '|' ) );    // -1
    System.out.println( email.indexOf( "joe" ) );
    System.out.println( email.indexOf( "com" ) );  // -1
    System.out.println( email.indexOf( "hello" ) );

    System.out.println( email.indexOf( '.', email.indexOf( '.' ) ) );
    System.out.println( email.indexOf( '.', email.indexOf( '.' ) + 1 ) );
    System.out.println( email.indexOf( '.', email.indexOf( '.' ) + 10000 ) );  // -1

    System.out.println( email.lastIndexOf( '.' ) );

    System.out.println( email.indexOf( "com" ) >= 0 );
    System.out.println( email.contains( "com" ) );
    System.out.println( email.contains( new StringBuilder("com") ) );

    System.out.println( email.startsWith( "joe" ) );
    System.out.println( email.endsWith( ".com" ) );
  }
}
