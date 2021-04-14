package de.tutego.lang;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Lernziel: `Comparable` und `Comparator`
 * - `equals(Object)` vs. Ordnung
 * - Schnittstelle `Comparable`, natürliche Ordnung
 * - Schnittstelle `Comparator`
 * - Größtes und kleinstes Element einer Sammlung ermitteln
 * - `Comparator`-Instanzen verketten
 *
 * @see JavaUtilObjects
 */
public class ComparatorAndComparable {
  public static void main( String[] args ) {

    Freezer f1 = new Freezer();
    f1.capacity = 10;
    f1.watt = 1000;
    Freezer f2 = new Freezer();
    f2.capacity = 100;
    f2.watt = 100;
    System.out.println( f1.equals( f2 ) );
//    System.out.println(f1.compareTo( f2 ));
//    System.out.println(f2.compareTo( f1 ));
    Comparator<Freezer> wattComparator = new FreezerWattComparator();
    Comparator<Freezer> capacityComparator = new FreezerCapacityComparator();
    Comparator<Freezer> wattCapacityFreezerComparator = wattComparator.thenComparing( capacityComparator );
    System.out.println( wattComparator.compare( f1, f2 ) );
    System.out.println( capacityComparator.compare( f1, f2 ) );

    System.out.println( "abc".compareTo( "cde" ) ); // <0
    System.out.println( "zyx".compareTo( "cde" ) ); // >0
    System.out.println( "abc".compareTo( "abc" ) ); // =0

    System.out.println( LocalTime.of( 20, 23 ).compareTo( LocalTime.of( 21, 23 ) ) ); // <0
    System.out.println( LocalTime.of( 22, 23 ).compareTo( LocalTime.of( 21, 23 ) ) ); // >0
    System.out.println( LocalTime.of( 20, 23 ).compareTo( LocalTime.of( 20, 23 ) ) ); // =0

    List<LocalTime> times = new ArrayList<>();
    times.add( LocalTime.now() );
    times.add( LocalTime.now().plusHours( 1 ) );
    times.add( LocalTime.now().minusHours( 1 ) );
    times.add( LocalTime.now().plusHours( 2 ) );
    System.out.println(times);
    System.out.println( Collections.min( times ) );
    Collections.sort( times );
    System.out.println(times);
  }
}

class Freezer {
  double watt;
  int capacity;

  @Override public boolean equals( Object o ) {
    if ( this == o )
      return true;
    if ( o == null || getClass() != o.getClass() )
      return false;

    Freezer freezer = (Freezer) o;

    if ( Double.compare( freezer.watt, watt ) != 0 )
      return false;
    return capacity == freezer.capacity;
  }

  @Override public int hashCode() {
    int result;
    long temp;
    temp = Double.doubleToLongBits( watt );
    result = (int) (temp ^ (temp >>> 32));
    result = 31 * result + capacity;
    return result;
  }

//  @Override public int compareTo( Freezer o ) {
////    if ( watt > o.watt) return +1;
////    if ( watt < o.watt ) return -1;
////    return 0;
//     return Double.compare( watt, o.watt );
//  }
}

class FreezerWattComparator implements Comparator<Freezer>{
  @Override public int compare( Freezer o1, Freezer o2 ) {
    return Double.compare( o1.watt, o2.watt );
  }
}

class FreezerCapacityComparator implements Comparator<Freezer>{
  @Override public int compare( Freezer o1, Freezer o2 ) {
    return Double.compare( o1.capacity, o2.capacity );
  }
}