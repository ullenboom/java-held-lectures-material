package de.tutego.collection;

import java.time.LocalDate;
import java.util.*;

/**
 * Lernziel: Schnittstelle `Map`
 * - `HashMap`
 * - `TreeMap`, `SortedMap`, `NavigableMap`
 * - `WeakHashMap`
 * - `LinkedHashMap`
 *
 * @see CollectionsDemo
 */
public class JavaUtilMap {
  public static void main( String[] args ) {
    Map<String, String> colors = new LinkedHashMap<>();
    colors.put( "red", null );
    colors.put( "blue", "#0000ff" );
    colors.put( "green", "#00ff00" );
    System.out.println( colors.containsKey( "red" ) );
    System.out.println( colors.get( "red" ) );
    System.out.println( colors.get( "yellow" ) );
    System.out.println( colors );

    NavigableMap<LocalDate, String> dates = new TreeMap<>();
    dates.put( LocalDate.of( 2020, 3, 20 ), "Schläfertag" );
    dates.put( LocalDate.of( 2010, 3, 20 ), "Tag der guten Laune" );
    dates.put( LocalDate.of( 2030, 3, 20 ), "Schlumpftag" );
    System.out.println( dates );

    System.out.println( dates.ceilingEntry( LocalDate.of( 2015, 1, 1 ) ) );

  }
}
