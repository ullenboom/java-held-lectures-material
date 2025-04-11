package com.tutego.array;

public class FirstArray {
  public static void main( String[] args ) {

    // Declaring Arrays

    String email1 = "abc@def.com";
    String email2 = "abc@def.com";
    String email3 = "abc@def.com";

    //    String[] emails;
    //    emails = new String[ 3 ];

    String[] emails = new String[ 3 ];

    int[] primes = new int[ 5 ];
    // primes = new int[ 6 ];

    // Writing and Reading Array Content with []

  /*
                   +---+---+---+---+----+
    primes +------>+ 2 | 3 | 5 | 7 | 11 |
                   +---+---+---+---+----+
                     0   1   2   3   4      Index
   */

    primes[ 0 ] = 2;
    primes[ 1 ] = 3;
    primes[ 2 ] = 5;
    primes[ 3 ] = 7;
    primes[ 4 ] = 11;
    System.out.println( primes[ 0 ] );
    System.out.println( primes[ 1 ] );

    System.out.println( emails[ 0 ] );

    int i = 0;
    System.out.println( primes[ i ] );
    i++;
    System.out.println( primes[ i ] );

    for ( int j = 0; j < 5; j++ ) {
      System.out.print( primes[ j ] + " " );
    }
    System.out.println();

  }
}
