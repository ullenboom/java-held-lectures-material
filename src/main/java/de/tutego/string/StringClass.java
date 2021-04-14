package de.tutego.string;

import java.util.Arrays;
import java.util.Locale;

/**
 * Lernziel: Klasse `String`
 * - Zentrale `String`-Methoden
 * - Länge, Leertest
 * - Zeichenzugriff
 * - Suche
 * - Vergleiche
 * - Strings verbinden
 * - Konvertierung und Groß-/Kleinschreibung
 * - Ersetzen
 * - Zeichenketten wiederholen
 * - Ausblick auf Reguläre Ausdrücke
 *
 * @see StringBuilderClass
 */
public class StringClass {
  public static void main( String[] args ) {

    // Länge, Leertest
    String name = "Chris";
    System.out.println( name.length() );
    System.out.println( !name.isEmpty() );  // length() == 0
    System.out.println( "   ".isBlank() );

    // Zeichenzugriff
    System.out.println( name.charAt( 0 ) );
    System.out.println( name.charAt( name.length() - 1 ) );

    System.out.println( isAllDigits( "234" ) );
    System.out.println( isAllDigits( "234a" ) );
    System.out.println( isAllDigits( "" ) );

    // Suche
    System.out.println( name.indexOf( 'i' ) );
    System.out.println( name.indexOf( "X" ) );
    System.out.println( name.indexOf( "c" ) );

    String text = "hallo welt, alles schön";
    int indexOfe = text.indexOf( 'e' );
    if ( indexOfe >= 0 ) {
      System.out.println( indexOfe );
      System.out.println( text.indexOf( 'e', indexOfe + 1 ) );
    }

    int lastIndexOfe = text.lastIndexOf( 'e', 10 );
    System.out.println( lastIndexOfe );

    // Vergleiche
    System.out.println( "abc".equals( "abc" ) );
    System.out.println( "abc".equals( "Abc" ) );
    System.out.println( "abc".equalsIgnoreCase( "Abc" ) );

    System.out.println( "abc".compareTo( "xyz" ) );   // abc < xzy  => <0
    System.out.println( "xyz".compareTo( "abc" ) );   // xyz > abc  => >0
    System.out.println( "abc".compareTo( "abc" ) );   // abc == abc => =0

    // Strings verbinden
    System.out.println( "a" + 1 + "b" + false + "c" ); // a1bfalsec
    System.out.println( "Hallo ".concat( "Welt" ) );

    String ip = String.join( ".", "128", "127", "19", "9" );
    System.out.println( ip );

    // Konvertierung und Groß-/Kleinschreibung
    System.out.println( name.toUpperCase() ); // CHRIS
    System.out.println( name.toLowerCase() ); // chris
    System.out.println( "ß".toUpperCase( Locale.ROOT ) );  // SS

    // Ersetzen
    System.out.println( name.replace( 'i', ' ' ) );
    System.out.println( name.replace( "i", "" ) );
    System.out.println( "ababcabababd".replace( "ab", "" ) );
    // replaceAll/replaceFirst

    System.out.println( "ab".repeat( 5 ) );

    // split(...)
    String[] split = "abc6def9abc8".split( "\\d" );
    System.out.println( Arrays.toString( split ) ); // [abc, def, abc]

    // matches(...)
    System.out.println( "3458".matches( "\\d+" ) );
    System.out.println( "3458 ".matches( "\\d+" ) );
    System.out.println( "ab".matches( "\\d+" ) );

    String filename = "li.ve.tXt   ";
    boolean endsWith = filename.trim().toLowerCase( Locale.ROOT ).endsWith( ".txt" );
    System.out.println( endsWith ); // true

    int indexOfDot = filename.lastIndexOf( '.' );
    if ( indexOfDot > 0 ) {
      System.out.println(indexOfDot);
      System.out.println(filename.substring( 0, indexOfDot ));
    }
  }

  private static boolean isAllDigits( String string ) {
    if ( string.isEmpty() )
      return false;
    for ( int i = 0; i < string.length(); i++ ) {
      char c = string.charAt( i );
      if ( !Character.isDigit( c ) )
        return false;
    }
    return true;
  }

}
