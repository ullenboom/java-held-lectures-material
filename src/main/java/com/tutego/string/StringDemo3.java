package com.tutego.string;

public class StringDemo3 {
  public static void main( String[] args ) {

    /*
     Substring Extraction and Creation, Whitespace Handling and Trimming
     */

    String url = "http://tutego.com/index.html";
    //            01234567891      17

    System.out.println( url.substring( 7, 17 ) );  // tutego.com, startIndex incl., endIndex excl.
    System.out.println( url.substring( 17 ) );  // /index.html
    System.out.println( url.substring( 0, 4 ) );   // http

    String number = "      \t\n 67354    ";
    System.out.println( Integer.parseInt( number.trim() ) );

    String empty = "   ";
    System.out.println( empty.trim().isEmpty() );
    System.out.println( empty.isBlank() );

    String firstname = "Chris";
    String lastname = "Ullenboom";
    String name = firstname + ' ' + lastname;
    System.out.println( name );
    System.out.println( firstname.concat( lastname ) );
    System.out.println( firstname.concat( Character.toString( ' ' ) ).concat( lastname ) );
  }
}
