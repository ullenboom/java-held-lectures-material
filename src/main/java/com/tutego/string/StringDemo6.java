package com.tutego.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.UUID;

public class StringDemo6 {
  public static void main( String[] args ) {

    /*
     Concatenation and Joining
     */

    // +
    // concat(String)

    System.out.println( String.join( ", ", "Chris", "Cora", "Eva", "Heinz" ) );
    // Chris, Cora, Eva, Heinz

    ArrayList<String> uuids = new ArrayList<>();
    uuids.add( UUID.randomUUID().toString() );
    uuids.add( UUID.randomUUID().toString() );
    uuids.add( UUID.randomUUID().toString() );

    System.out.println( String.join( "\n", uuids ) );

    System.out.println( "-*".repeat( 10 ) );  // -*-*-*-*-*-*-*-*-*-*

    String cell = "345";
    System.out.println( cell );
    System.out.println( "-".repeat( cell.length() ) );

    /*
     Formatting and Parsing
     */

    // .toString()
    String numberString = String.valueOf( 345345 );
    String numberString2 = Integer.toString( 7635 );

    String name = "Chris";
    int age = 50;

    //    String line = "Name: " + name + ", " + "Age: " + age;
    //    String line = String.format( "Name: %s, Age: %d", name, age );
    String line = "Name: %s, Age: %d".formatted( name, age );
    System.out.println( line );  // Name: Chris, Age: 50

    String[] tokens = "1234;3456;67345;36".split( ";" );
    System.out.println( Arrays.toString( tokens ) );

    System.out.println( String.join( ",", tokens ) ); // 1234,3456,67345,36

    // String --> Primitive Type

    int number = Integer.parseInt( "345345" );
    Long.parseLong( "3658263458972365" );
    Double.parseDouble( "345345.4545" );


  }
}
