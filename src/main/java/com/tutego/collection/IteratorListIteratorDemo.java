package com.tutego.collection;

import java.util.*;

public class IteratorListIteratorDemo {
  public static void main( String[] args ) {
    // 1. Navigation

    List<String> names = new LinkedList<>();
    Collections.addAll( names, "Tiki", "Taka" );
    ListIterator<String> listIterator = names.listIterator();
    System.out.println( listIterator.hasPrevious() );  // false
    String next1 = listIterator.next();
    System.out.println( next1 );   // Tiki
    String next2 = listIterator.next();
    System.out.println( next2 );   // Taka
    System.out.println( listIterator.hasNext() ); // false

    String previous = listIterator.previous();
    System.out.println( previous );               // Taka

    listIterator.add( "Pipi" );
    System.out.println( listIterator.previous() );  // Pipi
    System.out.println( listIterator.next() );      // Pipi

    // 2. Removing

    List<Integer> numbers = new LinkedList<>();
    Collections.addAll( numbers, 1, 34, 5, -1, 34, -22 );
    Iterator<Integer> iterator = numbers.iterator();
    while ( iterator.hasNext() ) {
      Integer number = iterator.next();
      if ( number < 0 ) {
        // numbers.remove( number );  // -> java.util.ConcurrentModificationException
        iterator.remove();
      }
    }
    System.out.println( numbers );  // [1, 34, 5, 34]

    // numbers.removeIf( ... );
  }
}
