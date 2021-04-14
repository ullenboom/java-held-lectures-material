package de.tutego.array;

import java.util.Arrays;

/**
 * Lernziel: Klasse `java.util.Arrays`
 * - Zentrale Methoden der Klasse `Arrays` kennenlernen
 *
 * @link https://github.com/apache/commons-lang/blob/master/src/main/java/org/apache/commons/lang3/ArrayUtils.java
 * @see MainArgs
 */
public class JavaUtilArrays {
  public static void main( String[] args ) {
    // toString()
    int[] numbers = { 12, 34, 34, 345, 35 };
    String[] names = { "Chris", "Peter", "Anton" };
    System.out.println( numbers );
    System.out.println( numbers.toString() );
    System.out.println( names.toString() );
    System.out.println( Arrays.toString( numbers ) );
    System.out.println( Arrays.toString( names ) );

    // fill(...)
    Arrays.fill( numbers, 1 );
    System.out.println( Arrays.toString( numbers ) );
    //    Arrays.fill( names, "" );
    //    System.out.println( Arrays.toString( names ) );

    // sort(...)
    double[] random = { Math.random(), Math.random(), Math.random() };
    Arrays.sort( random );
    System.out.println( Arrays.toString( random ) );

    Arrays.sort( names );
    System.out.println( Arrays.toString( names ) );

    // binarySearch(...)
    int index = Arrays.binarySearch( names, "Bert" );// [Anton, Chris, Peter]
    System.out.println( index );

    // equals(...)
    int[] numbers1 = { 12, 234, 3 };
    int[] numbers2 = { 3, 12, 234 };
    System.out.println( Arrays.equals( numbers1, numbers2 ) );

    // mismatch(...)
    int[] ints1 = { 1, 2, 3, 4 };
    int[] ints2 = { 1, 2, 2, 4 };
    System.out.println(Arrays.mismatch( ints1, ints2 )); // 2
  }
}
