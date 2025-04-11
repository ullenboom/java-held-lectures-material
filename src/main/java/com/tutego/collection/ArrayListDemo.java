package com.tutego.collection;

import java.util.*;

public class ArrayListDemo {
  public static void main( String[] args ) {

    /*
                  +---+---+---+---+---+---+---+---
                  | A | B | C | D | E | F | G | ...
                  +---+---+---+---+---+---+---+---
      Index         0   1   2   3   4   5   6   Capacity
     */

    // ArrayList

    List<String> names = new ArrayList<>( 100 );
    names.add( "Peter" );
    names.add( "Pan" );
    names.add( "Chris" );
    names.add( "Cora" );
    System.out.println( names );   // [Peter, Pan, Chris, Cora]

    System.out.println( names.indexOf( "Peter" ) );  // 0
    System.out.println( names.indexOf( "Cora" ) );   // 3
    System.out.println( names.indexOf( "Kiki" ) );   // -1

    System.out.println( names.contains( "Kiki" ) );  // false
    System.out.println( names.contains( "Cora" ) );  // true

    System.out.println( names.get( 0 ) );   // Peter
    System.out.println( names.get( 1 ) );   // Pan
    //    System.out.println( names.get( 100 ) );  // java.lang.IndexOutOfBoundsException: Index 100 out of bounds for length 4

    names.replaceAll( s -> s.toUpperCase( Locale.ROOT ) );

    names.sort( Comparator.naturalOrder() );

    names.forEach( s -> System.out.println( "'" + s + "'" ) );

    // Use an Array as a List, Adapter

    String[] names2 = { "Joe", "Jill" };
    List<String> stringList = Arrays.asList( names2 );
    // stringList.add( "" ); // Exception in thread "main" java.lang.UnsupportedOperationException
    System.out.println( stringList.contains( "Jill" ) ); // true
  }
}