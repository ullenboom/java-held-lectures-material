package com.tutego.array;

public class ArrayLength {
  public static void main( String[] args ) {

    // length

    int[] primes = new int[ 3 ];
    primes[ 0 ] = 2;
    primes[ 1 ] = 3;
    primes[ 2 ] = 5;

    System.out.println( primes.length );  // 3

    // ArrayIndexOutOfBoundsException

    // System.out.println( primes[ -1 ] );
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 3

    // System.out.println( primes[ 9999 ] );
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 9999 out of bounds for length 3

    // Access last Element
    System.out.println( primes[ primes.length - 1 ] );

    //    for ( int i = 0; i <= primes.length - 1; i++ ) {
    for ( int i = 0; i < primes.length; i++ ) {
      System.out.print( primes[ i ] + " " );
    }

    for ( int i = 0; i < primes.length; i++ ) {
//      int prime = primes[ i ];
//      prime++;
//      primes[ i ] = prime;
      // primes[ i ] = primes[ i ] + 1;
      primes[ i ]++;
    }

  }
}
