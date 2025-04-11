package com.tutego.util;

import java.util.Comparator;

public class ComparatorDemo {
  public static void main( String[] args ) {
    Freezer f1 = new Freezer( 10, 1000 );
    Freezer f2 = new Freezer( 100, 100 );

    Comparator<Freezer> wattComparator = new FreezerWattComparator();
    System.out.println( wattComparator.compare( f1, f2 ) );  // -1   => f1 < f2

    Comparator<Freezer> capacityComparator = new FreezerCapacityComparator();
    System.out.println( capacityComparator.compare( f1, f2 ) );  // 1   => f1 > f2

    // Comparator<Freezer> freezerComparator = wattComparator.thenComparing( capacityComparator );
  }
}

record Freezer( double watt, int capacity ) {
  //  @Override public int compareTo( Freezer o ) {
  //     return Double.compare( watt, o.watt );
  //  }
}

class FreezerWattComparator implements Comparator<Freezer> {
  @Override public int compare( Freezer o1, Freezer o2 ) {
    return Double.compare( o1.watt(), o2.watt() );
  }
}

class FreezerCapacityComparator implements Comparator<Freezer> {
  @Override public int compare( Freezer o1, Freezer o2 ) {
    return Double.compare( o1.capacity(), o2.capacity() );
  }
}