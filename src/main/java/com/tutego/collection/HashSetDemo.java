package com.tutego.collection;

import java.util.*;

public class HashSetDemo {
  public static void main( String[] args ) {

    // HashSet

    //    Set<String> set = new HashSet<>();
    //    set.add( "Hello" );
    //    set.add( "World" );
    //    set.add( "World" );
    //    System.out.println( set );  // [Hello, World]

    Set<Location> set = new HashSet<>();
    set.add( new Location( 1, 1 ) );
    set.add( new Location( 1, 2 ) );
    set.add( new Location( 1, 3 ) );
    set.add( new Location( 1, 1 ) );
    System.out.println( set );
    System.out.println( set.contains( new Location( 1, 1 ) ) );   // true
    System.out.println( set.contains( new Location( 1, 1111 ) ) ); // false

    // LinkedHashSet

    Collection<Integer> numbers = Arrays.asList( 9, 7, 6, 3, 2, 2, 4, 4, 1 );
    System.out.println( new LinkedHashSet<>( numbers ) ); // [9, 7, 6, 3, 2, 4, 1]
  }
}

record Location( int x, int y ) {
}