package com.tutego.array;

public class Varargs {
  public static void main( String[] args ) {

    //    System.out.printf( "%s %d%n", "Hello", 12 );
    //    System.out.printf( "%s %d %d%n", "Hello", 12, 12 );
    //    System.out.printf( "%s %d %d%n", "Hello", 12, 12, 345345345 );
    //    System.out.printf( "%s %d %d%n", "Hello", 12, 12, "World", 333.333 );

    printInts( 1, 2, 3 );
    printInts( 1, 2, 3, 4 );
    printInts( new int[]{ 1, 2, 3, 4 } );
    printInts();

    int[] numbers = { 1, 2, 3, 4, 5 };
    printInts( numbers );
    numbers[ 0 ] = 6;
    printInts( numbers );
  }

  static void printInts( int... numbers ) {    // => int[] numbers
    for ( int number : numbers ) {
      System.out.println( number );
    }
  }

}
