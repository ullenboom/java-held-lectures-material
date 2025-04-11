package com.tutego.lambda;

import java.awt.*;
import java.math.BigDecimal;
import java.util.function.IntFunction;

public class ConstructorReferences {

  interface IntToBigDecimalFunction {
    BigDecimal map( int value );
  }

  public static void main( String[] args ) {

    // Constructor, factory method

    BigDecimal bigDecimal1 = new BigDecimal( 100 );
    BigDecimal bigDecimal2 = BigDecimal.valueOf( 100 );
    // 100 -> BigDecimal

    IntToBigDecimalFunction function1 = value -> BigDecimal.valueOf( value );
    IntToBigDecimalFunction function2 = value -> new BigDecimal( value );

    IntToBigDecimalFunction function3 = BigDecimal::valueOf;  // value -> BigDecimal.valueOf( value );
    IntToBigDecimalFunction function4 = BigDecimal::new;      // value -> new BigDecimal( value );

    // Constructor reference for arrays

    // IntFunction: int -> Object
    IntFunction<int[]> function5 = value -> new int[ value ];
    IntFunction<int[]> function6 = int[]::new;                // short for value -> new int[value];

    IntFunction<Point[]> function7 = Point[]::new;

    System.out.println( function1.map( 100 ) );
    System.out.println( function2.map( 100 ) );
    System.out.println( function3.map( 100 ) );
    System.out.println( function4.map( 100 ) );

    int[] apply1 = function5.apply( 10 );
    int[] apply2 = function6.apply( 10 );
    System.out.println(apply1.length);
    System.out.println(apply2.length);

    System.out.println( function7.apply( 10 ).length );

  }
}