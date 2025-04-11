package com.tutego.lang;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {
  public static void main( String[] args ) {
    Freezer f1 = new Freezer( 1000, 1000 );
    Freezer f2 = new Freezer( 100, 100 );
    System.out.println( f1.equals( f2 ) );    // false
    System.out.println( f1.compareTo( f2 ) ); // 1
    System.out.println( f2.compareTo( f1 ) ); // -1

    //

    System.out.println( "abc".compareTo( "cde" ) );  // <0
    System.out.println( "xyz".compareTo( "cde" ) );  // >0
    System.out.println( "abc".compareTo( "abc" ) );  // ==0

    //

    System.out.println( LocalTime.of( 20, 23 ).compareTo( LocalTime.of( 21, 23 ) ) ); // <0
    System.out.println( LocalTime.of( 22, 23 ).compareTo( LocalTime.of( 21, 23 ) ) ); // >0
    System.out.println( LocalTime.of( 20, 23 ).compareTo( LocalTime.of( 20, 23 ) ) ); // ==0

    List<LocalTime> times = new ArrayList<>();
    times.add( LocalTime.now() );
    times.add( LocalTime.now().plusHours( 1 ) );
    times.add( LocalTime.now().minusHours( 1 ) );
    times.add( LocalTime.now().plusHours( 2 ) );

    System.out.println( times );

    System.out.println( Collections.max( times ) );
    System.out.println( Collections.min( times ) );

    Collections.sort( times );
    System.out.println( times );
  }
}

record Freezer( double watt, double capacity ) implements Comparable<Freezer> {

  @Override public int compareTo( Freezer o ) {
    //    if ( watt > o.watt )
    //      return +1;
    //    if ( watt < o.watt )
    //      return -1;
    //    return 0;
    return Double.compare( watt, o.watt );
  }
}