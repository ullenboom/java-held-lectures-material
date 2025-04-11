package com.tutego.array;

public class ArrayInitializer {
  public static void main( String[] args ) {
    int[] numbers = new int[ 3 ];
    numbers[ 0 ] = 12;
    numbers[ 1 ] = 3452;
    numbers[ 2 ] = 345;

    String[] cities = new String[ 2 ];
    cities[ 0 ] = "Berlin";
    cities[ 1 ] = "London";

    // =>

    int[] numbers2 = {};  // => ... = new int[0];
    int[] numbers3 = { 12, 3452, 345 };  // => ... = new int[3];

    String[] cities2 = { "Berlin", "London" };
    System.out.println( cities2.length );

    int[] numbers4 = addLast( numbers, 1 );
    System.out.println( numbers.length );
    System.out.println( numbers4.length );
    System.out.println( numbers4[ 0 ] );
    System.out.println( numbers4[ numbers4.length - 1 ] );

    // numbers = { 12, 3452, 345 }; // Array initializer is not allowed here

    // 1.
    int[] tempInts = { 12, 3452, 345 };
    numbers = tempInts;

    // 2.
    numbers = new int[]{ 12, 3452, 345 };

    addLast( numbers, 1 );

    addLast( new int[]{ 12, 3452, 345 }, 1 );

  }

  static int[] addLast( int[] numbers, int number ) {
    int[] result = new int[ numbers.length + 1 ];
    for ( int i = 0; i < numbers.length; i++ ) {
      result[ i ] = numbers[ i ];
    }
    result[ result.length - 1 ] = number;
    return result;
  }

  static boolean containsCityName( String name ) {

    // String[] cities = { "Berlin", "London" };

    // =>

    String[] cities = new String[ 2 ];
    cities[ 0 ] = "Berlin";
    cities[ 1 ] = "London";

    for ( int i = 0; i < cities.length; i++ ) {
      if ( cities[i].equals( name ) ) {
        return true;
      }
    }
    return false;
  }
}
