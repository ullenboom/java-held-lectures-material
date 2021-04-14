package de.tutego.collection;

import java.util.*;

/**
 * Lernziel: Mengen, die Schnittstelle `Set`
 * - `HashSet`
 * - `TreeSet`
 * - `SortedSet`, `NavigableSet`
 * - `LinkedHashSet`
 *
 * @see JavaUtilMap
 */
public class JavaUtilSet {
  public static void main( String[] args ) {
    // HashSet
    //    Set<String> set = new HashSet<>();
    //    set.add( "Hallo" );
    //    set.add( "Welt" );
    //    set.add( "Welt" );
    //    System.out.println( set );
    Set<Location> set = new HashSet<>();
    set.add( new Location( 1, 1 ) );
    set.add( new Location( 1, 2 ) );
    set.add( new Location( 1, 3 ) );
    set.add( new Location( 1, 1 ) );
    System.out.println( set.contains( new Location( 1, 1 ) ) );
    System.out.println( set.contains( new Location( 1, 1111 ) ) );

    // TreeSet

    NavigableSet<Integer> sortedSet = new TreeSet<>();
    sortedSet.add( 3243 );
    sortedSet.add( 343 );
    sortedSet.add( 323 );
    sortedSet.add( 324 );
    System.out.println( sortedSet.ceiling( 300 ) );  // 323

    //    Set<Point> points = new TreeSet<>();
    //    points.add( new Point() );
    //    points.add( new Point() );
    //    points.add( new Point() );

    TreeSet<String> strings = new TreeSet<>( String.CASE_INSENSITIVE_ORDER );
    strings.addAll( Arrays.asList( "abc", "ABC", "DEF", "def" ) );
    System.out.println( strings ); // [abc, DEF]

    // LinkedHashSet
    Collection<Integer> numbers = Arrays.asList( 9, 7, 6, 3, 2, 2, 4, 4, 1 );
    System.out.println( new LinkedHashSet<>( numbers ) );
  }
}

class Location {
  int x;
  int y;

  public Location( int x, int y ) {
    this.x = x;
    this.y = y;
  }

  @Override public boolean equals( Object o ) {
    if ( this == o )
      return true;
    if ( o == null || getClass() != o.getClass() )
      return false;

    Location location = (Location) o;

    if ( x != location.x )
      return false;
    return y == location.y;
  }

  @Override public int hashCode() {
    int result = x;
    result = 31 * result + y;
    return result;
  }

  @Override public String toString() {
    return "Location{" + "x=" + x + ", y=" + y + '}';
  }
}