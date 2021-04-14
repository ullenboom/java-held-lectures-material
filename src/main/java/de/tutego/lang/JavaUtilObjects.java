package de.tutego.lang;

import java.util.Comparator;
import java.util.Objects;

/**
 * Lernziel: `java.util.Objects`
 * - `NullPointerException` vermeiden
 * - `NullPointerException` provozieren
 * - Index-Prüfungen
 *
 * @see WrapperClassesAutoboxing
 */
public class JavaUtilObjects {
  public static void main( String[] args ) {
    String s = "Hallo Welt";
    String t = null;
    System.out.println( s.equals( t ) );  // false
    //    System.out.println(t.equals( s ));  // NPE
    boolean equals = Objects.equals( s, t );

    Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
    //    System.out.println( comparator.compare( null, null ) );

//    System.out.println( Objects.compare( null, null, String.CASE_INSENSITIVE_ORDER ) );
//    System.out.println( Objects.compare( "null", null, String.CASE_INSENSITIVE_ORDER ) );

    reverse( null );
  }

  static String reverse( String string ) {
//    if ( string == null )
//      throw new IllegalArgumentException("parameter was null, shouldn't be");
    Objects.requireNonNull( string, "parameter was null, shouldn't be" );
    return new StringBuilder(Objects.requireNonNull(string)).reverse().toString();
  }
}

class Giliad {
  String name;

  public void setName( String name ) {
    this.name = Objects.requireNonNullElse( name, "" );
  }
}