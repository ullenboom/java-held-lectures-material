package com.tutego.array;

import java.util.Arrays;

public class ArraysDemo {
  public static void main( String[] args ) {
    /*
     toString()
     */

    int[] numbers = { 12, 34, 234, 34, 344 };
    String[] names = { "Chris", "Peter", "Anton" };
    System.out.println( numbers.toString() );
    System.out.println( numbers );
    System.out.println( names );
    System.out.println( Arrays.toString( numbers ) );
    System.out.println( Arrays.toString( names ) );

    /*
     fill(...)
     */

    Arrays.fill( numbers, 1 );
    System.out.println( Arrays.toString( numbers ) );

    //    Arrays.fill( names, "" );
    //    System.out.println( Arrays.toString( names ) );

    /*
     sort(...)
     */

    double[] randoms = { Math.random(), Math.random(), Math.random() };
    Arrays.sort( randoms );
    System.out.println( Arrays.toString( randoms ) );

    Arrays.sort( names );
    System.out.println( Arrays.toString( names ) );

    /*
     binarySearch(...)
     */

    //                                                        0      1      2
    int index = Arrays.binarySearch( names, "Bert" );// [Anton, Chris, Peter]
    // -2  ---negate--->  +2  --- -1 ---> +1                       ^ Bert
    System.out.println( index );

    /*
     equals(...)
     */

    int[] numbers1 = { 12, 234, 3 };
    int[] numbers2 = { 3, 12, 234 };
    System.out.println( Arrays.equals( numbers1, numbers2 ) );

    /*
     mismatch(...)
     */

    //              0  1  2
    int[] ints1 = { 1, 2, 3, 4 };
    int[] ints2 = { 1, 2, 2, 4 };
    System.out.println( Arrays.mismatch( ints1, ints2 ) );  // 2
  }
}
