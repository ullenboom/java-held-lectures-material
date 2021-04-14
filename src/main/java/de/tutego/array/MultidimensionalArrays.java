package de.tutego.array;

/**
 * Lernziel: Mehrdimensionale Arrays
 * - Arrays referenzieren Arrays
 * - Zwei Arten der Initialisierung kennenlernen
 * - Optimierung durch flache Arrays
 *
 * @see ArraysLibrarySupport
 */
public class MultidimensionalArrays {
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

    int[][] array = new int[ 4 ][ 3 ];  // 4 Zeilen und 3 Spalten
    System.out.println( array[ 0 ][ 0 ] );

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
    System.out.println( array[ 0 ][ 0 ] );

    // array[2][3] = 99; // AIOOBE

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
      for ( int column = 0; column < ints.length; column++ ) {
        System.out.print( array[ row ][ column ] + " " );
      }
      System.out.println();
    }

    char[][] plus = {
        { ' ', '+', ' ' },
        { '+', '+', '+' },
        { ' ', '+', ' ' },
        };

    plus[ 0 ] = new char[]{ ' ', '*', ' ' };

    char[][] minus = {
        { ' ', ' ', ' ' },
        { '-', '-', '-' },
        { ' ', ' ', ' ' },
        };

    //        int number = new Scanner( System.in ).nextInt();
    //        if ( number < 0 )
    //          printCharArray( minus );
    //        else
    //          printCharArray( plus );

    int[][] triangle = new int[ 5 ][];
    System.out.println( triangle[ 0 ] );
    triangle[ 0 ] = new int[ 1 ];
    System.out.println( triangle[ 0 ][ 0 ] );
    triangle[ 1 ] = new int[]{ 1, 2 };
    System.out.println( triangle[ 1 ][ 0 ] );

    // =>
    // 0
    // 1 2
    // null
    // null
    // null

    /*

       1 2 3
       3 4 5
       5 6 7

       ->

       1 2 3 3 4 5 5 6 7
     */

    int[] numbers = { 1, 2, 3, 3, 4, 5, 5, 6, 7 };
    int row = 2; int col = 1;  // -> 6
    int index = 3 * row + col;
    System.out.println(numbers[index]);
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
