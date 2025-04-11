package com.tutego.test;

public class ArrayUtils {

  public static double average( int[] numbers ) {
    if ( numbers == null || numbers.length == 0 )
      throw new IllegalArgumentException( "Array cannot be empty or null" );

    int sum = 0;
    for ( int num : numbers )
      sum += num;

    return (double) sum / numbers.length;
  }
}