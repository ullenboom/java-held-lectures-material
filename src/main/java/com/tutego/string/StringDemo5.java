package com.tutego.string;

public class StringDemo5 {
  public static void main( String[] args ) {

    /*
     Comparisons
     */

    String name1 = "Chris";
    String name2 = "Chris";
    System.out.println( name1.equals( name2 ) );
    System.out.println( name1.equalsIgnoreCase( "CHRIS" ) );

    StringBuilder name3 = new StringBuilder( "Chris" );
    System.out.println( name1.equals( name3 ) );            // false
    System.out.println( name1.contentEquals( name3 ) );     // true

    System.out.println( "abc".compareTo( "xyz" ) );         // <0
    System.out.println( "xyz".compareTo( "abc" ) );         // >0
    System.out.println( "xyz".compareTo( "xyz" ) );         // =0
    System.out.println( "abc".compareToIgnoreCase( "XYZ" ) );         // <0
    System.out.println( "xyz".compareToIgnoreCase( "ABC" ) );         // >0
    System.out.println( "xyz".compareToIgnoreCase( "XYZ" ) );         // =0

    // "".regionMatches(  )

    boolean matches = "234857263458".matches( "\\d+" );
    System.out.println( matches );

    System.out.println("3645.345 €".matches( "\\d*[.]\\d+ €" ));
    System.out.println("3 €".matches( "\\d*([.]\\d+)? €" ));

  }
}
