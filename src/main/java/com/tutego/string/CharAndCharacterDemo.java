package com.tutego.string;

public class CharAndCharacterDemo {
  public static void main( String[] args ) {

    // char

    char c = '+';  // char is unsigned 2 byte numeric data type, 0 ... 64 k
    System.out.println( c + 1 );  // 44   => int
    System.out.println( ((char) (c + 1)) );  // ,

    char a = 65 + 1;
    System.out.println( a );   // B

    for ( char ch = 'A'; ch <= 'Z'; ch++ ) {
      System.out.print( ch );  // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    }

    System.out.println();

    char d = '\u1a01';
    System.out.println( d );   // ᨁ

    // Character
    // 1. Static utility methods
    // 2. Wrapper

    System.out.println( Character.isWhitespace( ' ' ) );   // true
    System.out.println( Character.isWhitespace( '\t' ) );  // true
    System.out.println( Character.isWhitespace( 't' ) );   // false

    System.out.println( Character.isLetter( 't' ) );       // true
    System.out.println( Character.isLetter( '0' ) );       // false
    System.out.println( Character.isLetter( ' ' ) );       // false

    System.out.println( Character.isDigit( '1' ) );        // true
    System.out.println( Character.isDigit( '0' ) );        // true
    System.out.println( Character.isDigit( '-' ) );        // false

    System.out.println( Character.isLetter( 'η' ) );       // true
    System.out.println( Character.isDigit( '٣' ) );        // true
  }
}