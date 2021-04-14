package de.tutego.array;

/**
 * Lernziel: Variable Argumentlisten
 * - varargs Parameter deklarieren
 * - varargs Methoden aufrufen
 * - Designtipps
 *
 * @see MultidimensionalArrays
 */
public class Varargs {
  public static void main( String... args ) {

    System.out.printf( "%s %d%n", "Hallo", 12 );
    System.out.printf( "%s %d %d%n", "Hallo", 12, 12 );
    System.out.printf( "%s %d %d%n", "Hallo", 12, 12, 23452345, 353, 5 );
    System.out.printf( "%s %d %d%n", "Hallo", 12, 12, "asdf", 3445. );

    printInts( 1 );
    printInts( 1, 3 );
    printInts( new int[]{ 1, 2, 3, 4 } );
    printInts();

    int[] numbers = { 1, 2, 3, 4, 5 };
    printInts( numbers );
    numbers[ 0 ] = 6;
    printInts( numbers );

    System.out.println( max( 9, 3 ) );

    print( "", "" );
    print();
    print( null, null );       // -> new String[]{null, null}
//    print( null );             // -> new String[]{null} ??????? -> falsch
    print( (String) null );    // -> new String[]{null}
  }

  static void print( String... strings ) {
    System.out.println( strings.length );
  }

  public static void printInts( int number ) {
    System.out.println( number );
  }

  public static void printInts( int number1, int number2 ) {
    System.out.println( number1 );
    System.out.println( number2 );
  }

  public static void printInts( int... numbers ) {   // -> (int[] numbers)
    for ( int number : numbers ) {
      System.out.println( number );
    }
  }

  // 1. Immer am Ende
  // 2. Nur ein vararg
  // (1,2,3,5)

  static int max( int number1, int number2, int... numbers ) {
    int max = Math.max( number1, number2 );
    for ( int number : numbers ) {
      //      if ( number > max )
      //        max = number;
      max = Math.max( max, number );
    }
    return max;
  }

}
