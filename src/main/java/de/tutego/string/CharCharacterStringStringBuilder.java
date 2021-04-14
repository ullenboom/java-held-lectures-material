package de.tutego.string;

import java.util.Locale;

/**
 * Lernziel: Datentypen für Zeichen und Zeichenfolgen
 * - Kurzvergleich: `char`, `Character`, `String`, `StringBuilder`
 *
 * @see StringClass
 */
public class CharCharacterStringStringBuilder {
  public static void main( String[] args ) {

    // char
    char c = '+';                // 2 Byte , 0 .. 64k
    System.out.println( c + 1 );  // => int
    System.out.println( (char) (c + 1) );  // => char

    char a = 65 + 1;
    System.out.println( a );

    for ( int ch = 'A'; ch <= 'Z'; ch++ )
      System.out.print( ch );

    char d = '\u1a01';
    System.out.println( d );

    // java.lang.Character
    // 1. Hilfsmethoden
    // 2. Wrapper

    System.out.println( Character.isWhitespace( ' ' ) );
    System.out.println( Character.isWhitespace( '\t' ) );
    System.out.println( Character.isWhitespace( 't' ) );

    System.out.println( Character.isLetter( 't' ) );
    System.out.println( Character.isLetter( '0' ) );
    System.out.println( Character.isLetter( 'η' ) );

    System.out.println( Character.isDigit( '1' ) );
    System.out.println( Character.isDigit( '0' ) );
    System.out.println( Character.isDigit( '٣' ) );

    // String  => immutable Datentyp
    String name = "Chris";
    System.out.println( "Chris".length() );
    name = "Christian";

    System.out.println( name.toUpperCase( Locale.ROOT ) ); // CHRISTIAN

    // StringBuilder
    StringBuilder sb = new StringBuilder();
    sb.append( "Hallo" );
    sb.append( " Welt" );
    System.out.println( sb ); // Hallo Welt
    sb.reverse();
    System.out.println(sb);

    // StringBuffer (sync.)
  }

}
