package de.tutego.collection;

import java.text.ParseException;
import java.time.Duration;
import java.time.format.DateTimeParseException;
import java.util.*;

/**
 * Lernziel: Iteratoren und Änderung während des Durchlaufens
 * - Schnittstellen `Iterator` und `ListIterator`
 * - `ConcurrentModificationException`
 *
 * @see JavaUtilSet
 */
public class JavaUtilIteratorListIterator {
  public static void main( String[] args ) {

    List<String> names = new LinkedList<>();
    Collections.addAll( names, "Tiki", "Taka" );
    ListIterator<String> listIterator = names.listIterator();
    System.out.println( listIterator.hasPrevious() );
    String next1 = listIterator.next();
    System.out.println( next1 );
    String next2 = listIterator.next();
    System.out.println( next2 );
    System.out.println( listIterator.hasNext() );
    String previous = listIterator.previous();
    System.out.println( previous );
    listIterator.add( "Pipi" );
    System.out.println( listIterator.previous() );
    System.out.println( listIterator.next() );

    //

    List<Integer> numbers = new LinkedList<>();
    Collections.addAll( numbers, 1, 34, 5, -1, 34, -22 );
    Iterator<Integer> iterator = numbers.iterator();
    while ( iterator.hasNext() ) {
      Integer number = iterator.next();
      if ( number < 0 ) {
        // iterator.remove();
        numbers.remove( number );  // java.util.ConcurrentModificationException
      }
    }
    System.out.println( numbers );
  }
}
