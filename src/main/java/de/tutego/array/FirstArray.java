package de.tutego.array;

/**
 * Lernziel: Arrays nutzen
 * - Array-Objekte aufbauen
 * - Referenzen
 * - Initialisierung bei primitiven Elementen und Referenzen
 * - length Attribut
 * - Elementzugriff, lesen und schreiben
 * - `ArrayIndexOutOfBoundsException`
 * - Arrays an Methoden übergeben
 *
 * @see ArrayInitializer
 */
public class FirstArray {
  public static void main( String[] args ) {

    //    int[] primes;
    //    primes = new int[5];

    int[] primes = new int[ 5 ];
    System.out.println( primes.length );
    // primes.length = 10;
    // primes = new int[10];
    System.out.println( primes[ 0 ] );
    System.out.println( primes[ primes.length - 1 ] );

    primes[ 0 ] = 2;
    primes[ 1 ] = 3;
    primes[ 2 ] = 5;
    primes[ 3 ] = 7;
    primes[ 4 ] = primes[ 3 ] + 3;
    primes[ 4 ]++;    // 1

    System.out.println( primes[ primes.length / 2 ] );
    System.out.println( primes[ primes.length - 1 ] );

    /*
                   +---+---+---+---+----+
    primes +------>+ 2 | 3 | 5 | 7 | 11 |
                   +---+---+---+---+----+
                     0   1   2   3   4      Index

     */

    //    System.out.println(primes[999999]); // ArrayIndexOutOfBoundsException
    //    System.out.println( primes[ -1 ] ); // ArrayIndexOutOfBoundsException

    //    primes = null;
    //    System.out.println(primes[1]);  // NullPointerException

    printArray( primes );

    int[] newPrimes = firstPrimes();
    printArray( newPrimes );

    String[] names = new String[2];
    System.out.println(names[0]);
    names[ 0 ] = "Christian";
    names[ 1 ] = "Cora";

    printArray( names );
  }

  static void printArray( int[] array ) {
    for ( int i = 0; i < array.length; i++ ) {
      System.out.println( array[ i ] );
    }
  }
  static void printArray( String[] array ) {
    for ( int i = 0; i < array.length; i++ ) {
      System.out.println( array[ i ] );
    }
  }

  static int[] firstPrimes() {
    int[] primes = new int[ 5 ];
    primes[ 0 ] = 2;
    primes[ 1 ] = 3;
    primes[ 2 ] = 5;
    primes[ 3 ] = 7;
    primes[ 4 ] = primes[ 3 ] + 3;
    primes[ 4 ]++;    // 1
    return primes;
  }
}
