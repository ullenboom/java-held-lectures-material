package com.tutego.array;

public class VarargsDesignTips {
  public static void main( String... args ) {

    // 1. Varargs just allowed at the end.
    // 2. Only one varargs

    // (1,2,  3,5)

    printInts( 1 );
    printInts( 1, 2 );
    printInts( 1, 2, 3, 4, 5 );
    printInts();

    //

    // System.out.printf( "" );

    System.out.println( max( 9, 3, 11 ) );

    // System.out.println( max( 9, 3, null ) );

    print( "", "" );
    print(  );
    print( "", null );
    print( null, null );   // =>  new String[]{null, null}
    // print( null );         // =>  new String[]{null}  ??
    print( (String) null );         // =>  new String[]{null}
  }

  static void print( String... strings ) {
    System.out.println( strings.length );
  }

  static int max( int number1, int number2, int... numbers ) {
    int max = Math.max( number1, number2 );
    for ( int number : numbers ) {
      //      if ( number > max )
      //        max = number;
      max = Math.max( max, number );
    }
    return max;
  }

  static void printInts( int number ) {
    System.out.println( number );
  }

  static void printInts( int number1, int number2 ) {
    System.out.println( number1 );
    System.out.println( number2 );
  }

  static void printInts( int... numbers ) {
    for ( int number : numbers ) {
      System.out.println( number );
    }
  }
}
