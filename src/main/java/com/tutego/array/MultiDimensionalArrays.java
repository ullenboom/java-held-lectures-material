package com.tutego.array;

import java.util.Scanner;

public class MultiDimensionalArrays {
  public static void main( String[] args ) {
    /*
                                   |
                                   |
                                   v
                                 +-+-+
                              0  | a |
                                 +---+
                              1  | b |
                                 +---+
                              2  | c |
                                 +---+
                              3  | d |
                                 +---+
                              4  | e |
                                 +---+
     */
    /*
               |
               |
               v
             +-+-+      +---+---+
          0  | o-|----->+ a | b |
             +---|      +-----------+
          1  | o-|----->+ c | d | e |
             +---+      +---+---+---+
          2  |NUL|
             +---+      +---+
          3  | o-|----->+ f |
             +---+      +---+
          4  |NUL|
             +---+
     */

    int[][] array = new int[ 4 ][ 3 ];  // 4 rows and 3 columns

    System.out.println( array[ 0 ][ 0 ] );  // 0

    /*
        +---------+---------+---------+
        | a[0][0] | a[0][1] | a[0][2] |
        +-----------------------------+
        | a[1][0] | a[1][1] | a[1][2] |
        +-----------------------------+
        | a[2][0] | a[2][1] | a[2][2] |
        +-----------------------------+
        | a[3][0] | a[3][1] | a[3][2] |
        +---------+---------+---------+
     */

    array[ 0 ][ 0 ] = 99;
    array[ 3 ][ 2 ] = 32;
    System.out.println( array[ 0 ][ 0 ] ); // 99

    // array[ 2 ][ 3 ] = 99;
    // -> java.lang.ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 3

    int[] firstRow = array[ 0 ];
    System.out.println( firstRow[ 0 ] );  // 99

    for ( int[] ints : array ) {
      for ( int number : ints ) {
        System.out.print( number + " " );
      }
      System.out.println();
    }

    for ( int row = 0; row < array.length; row++ ) {
      int[] ints = array[ row ];
      for ( int col = 0; col < ints.length; col++ ) {
        System.out.print( array[ row ][ col ] + " " );
      }
      System.out.println();
    }

    //

    char[][] plus = {
        { ' ', '+', ' ' },
        { '+', '+', '+' },
        { ' ', '+', ' ' }
    };

    char[][] minus = {
        { ' ', ' ', ' ' },
        { '-', '-', '-' },
        { ' ', ' ', ' ' }
    };

    System.out.println( plus.length );    // 3
    System.out.println( plus[ 0 ].length );

    printCharArray( plus );

    int number = new Scanner( System.in ).nextInt();
    if ( number < 0 )
      printCharArray( minus );
    else
      printCharArray( plus );
  }

  static void printCharArray( char[][] matrix ) {
    for ( char[] row : matrix ) {
      for ( char c : row ) {
        System.out.print( c + " " );
      }
      System.out.println();
    }
  }
}
