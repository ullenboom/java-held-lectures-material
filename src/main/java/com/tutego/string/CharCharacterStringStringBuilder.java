package com.tutego.string;

public class CharCharacterStringStringBuilder {
  public static void main( String[] args ) {

    /*
      char
     */

    char letter = '0';

    /*
      java.lang.Character Wrapper Class
     */

    System.out.println( Character.isDigit( letter ) );

    /*
      String  => Immutable Data Type
     */

    String string = "";  // new String()
    System.out.println( string + " " + string );
    System.out.println( string.length() );

    /*
      StringBuilder => Mutable Data Type
      StringBuffer => Synchronized Mutable Data Type
     */
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append( 12 );
    stringBuilder.append( "12" );
    String s = stringBuilder.toString();
  }

}
