package com.tutego.array;

public class MoreOnMultiDimensionalArrays {
  public static void main( String[] args ) {
    /*
      Triangular Arrays
     */

    int[][] triangle = new int[ 5 ][];
    System.out.println( triangle[ 0 ] );
    triangle[ 0 ] = new int[ 1 ];
    System.out.println( triangle[ 0 ] );
    System.out.println( triangle[ 0 ][ 0 ] );
    triangle[ 1 ] = new int[]{ 1, 2 };
    System.out.println( triangle[ 1 ][ 0 ] );

    /*
     =>
     0
     1 2
     null
     null
     null
     */

    /*
     Changing already initialized Arrays
     */

    {
      char[][] plus = {
          { ' ', '+', ' ' },
          { '+', '+', '+' },
          { ' ', '+', ' ' },
          };

      plus[ 0 ] = new char[]{ ' ', '*', ' ' };

      printCharArray( plus );
    }

    /*
     Converting 2D Arrays into flat Arrays
     */

    /*

       1 2 3
       3 4 5
       5 6 7

       ->

       1 2 3 3 4 5 5 6 7
     */

    int[] numbers = { 1, 2, 3, 3, 4, 5, 5, 6, 7 };
    int row = 2;
    int col = 1;    // => 6
    int index = 3 * row + col;
    System.out.println( numbers[index] );

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