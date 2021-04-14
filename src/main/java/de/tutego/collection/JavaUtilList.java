package de.tutego.collection;

import java.util.*;

/**
 * Lernziel: Schnittstelle `List`
 * - `ArrayList`
 * - `LinkedList`
 * - Arrays zu Listen machen über einen Adapter
 *
 * @see JavaUtilIteratorListIterator
 */
public class JavaUtilList {
  public static void main( String[] args ) {

    // ArrayList
    /*
                  +---+---+---+---+---+---+---+---
                  | A | B | C | D | E | F | G | ...
                  +---+---+---+---+---+---+---+---
      Index         0   1   2   3   4   5   6
     */

    List<String> names = new ArrayList<>( 100 );
    names.add( "Peter" );
    names.add( "Pan" );
    names.add( "Chris" );
    names.add( "Cora" );
    System.out.println( names );

    System.out.println( names.indexOf( "Peter" ) );
    System.out.println( names.indexOf( "Cora" ) );
    System.out.println( names.indexOf( "Kikki" ) );
    System.out.println( names.contains( "Kikki" ) );
    System.out.println( names.contains( "Cora" ) );

    System.out.println( names.get( 0 ) );
    System.out.println( names.get( 1 ) );
    // System.out.println( names.get( 100 ) ); // java.lang.IndexOutOfBoundsException

    names.replaceAll( s -> s.toUpperCase( Locale.ROOT ) );

    names.sort( Comparator.naturalOrder() );

    names.forEach( s -> System.out.println( "'" + s + "'" ) );

    // LinkedList
    /*
            +-------+       +-------+       +-------+
    +------>|       +------>|       +------>|       |
            |   A   |       |   B   |       |   C   |
    <-------+       |<------+       |<------+       |
            +-------+       +-------+       +-------+
     */

    String[] names2 = { "Joe", "Jill" };
    List<String> stringList = Arrays.asList( names2 );
    // stringList.add( "" ); // Exception in thread "main" java.lang.UnsupportedOperationException
    System.out.println( stringList.contains( "Jill" ) );
  }
}