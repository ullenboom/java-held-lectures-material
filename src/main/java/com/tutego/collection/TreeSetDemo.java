package com.tutego.collection;

import java.util.Arrays;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetDemo {
  public static void main( String[] args ) {

    NavigableSet<Integer> sortedSet = new TreeSet<>();
    sortedSet.add( 3243 );
    sortedSet.add( 343 );
    sortedSet.add( 323 );
    sortedSet.add( 324 );
    System.out.println( sortedSet ); // [323, 324, 343, 3243]
    System.out.println( sortedSet.ceiling( 300 ) );  // 323

    //    Set<Point> points = new TreeSet<>();
    //    points.add( new Point() );
    //    points.add( new Point() );
    //    points.add( new Point() );
    //    // -> java.lang.ClassCastException: class java.awt.Point cannot be cast to class java.lang.Comparable

    TreeSet<String> strings = new TreeSet<>( String.CASE_INSENSITIVE_ORDER );
    strings.addAll( Arrays.asList( "abc", "ABC", "DEF", "def" ) );
    System.out.println( strings ); // [abc, DEF]
  }
}
