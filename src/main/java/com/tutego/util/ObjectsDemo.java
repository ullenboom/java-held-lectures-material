package com.tutego.util;

import java.util.Comparator;
import java.util.Objects;

public class ObjectsDemo {
  public static void main( String[] args ) {

    // Prevent NullPointerException

    String s = "Hello World";
    String t = null;
    System.out.println( s.equals( t ) );  // false
    // System.out.println( t.equals( s ) );  // NPE

    boolean equals = Objects.equals( s, t );

    Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
    System.out.println( comparator.compare( "ab", "AB" ) );  // 0
    //    System.out.println( comparator.compare( null, null ) );  // java.lang.NullPointerException: Cannot read field "value" because "s1" is null

    //    System.out.println( Objects.compare( null, null, String.CASE_INSENSITIVE_ORDER ) ); // 0
    //    System.out.println( Objects.compare( "null", null, String.CASE_INSENSITIVE_ORDER ) );
    // java.lang.NullPointerException: Cannot read field "value" because "s2" is null

    // Provoke NullPointerException

    reverse( null );
  }

  static String reverse( String string ) {
    // Objects.requireNonNull( string, "Parameter was null, shouldn't be" );
    //    if ( string == null ) {
    //      throw new IllegalArgumentException( "Parameter was null, shouldn't be" );
    //    }
    return new StringBuilder(
        Objects.requireNonNull( string, "Parameter was null, shouldn't be" )
    ).reverse().toString();
  }

}

class Giliad {
  String name;

  public void setName( String name ) {
    //    this.name = Objects.requireNonNull( name );
    this.name = Objects.requireNonNullElse( name, "" );
  }
}