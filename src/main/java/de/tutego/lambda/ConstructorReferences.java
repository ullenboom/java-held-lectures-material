package de.tutego.lambda;

import java.awt.*;
import java.math.BigDecimal;
import java.util.function.IntFunction;

/**
 * Lernziel: Konstruktorreferenzen verstehen
 *
 * @see JavaFunctional
 */
public class ConstructorReferences {

  interface IntToBigDecimalFunction {
    BigDecimal map( int value );
  }

  public static void main( String[] args ) {

    BigDecimal bigDecimal1 = new BigDecimal( 100 );
    BigDecimal bigDecimal2 = BigDecimal.valueOf( 100 );

    IntToBigDecimalFunction function1 = value -> BigDecimal.valueOf( value );
    IntToBigDecimalFunction function2 = value -> new BigDecimal( value );
    IntToBigDecimalFunction function3 = BigDecimal::valueOf;
    IntToBigDecimalFunction function4 = BigDecimal::new;

    // int -> Objekt
    IntFunction<int[]> function5 = value -> new int[ value ];
    IntFunction<int[]> function6 = int[]::new;

    IntFunction<Point[]> function7 = Point[]::new;

    System.out.println( function1.map( 100 ) );
    System.out.println( function2.map( 100 ) );
    System.out.println( function3.map( 100 ) );
    System.out.println( function4.map( 100 ) );

    int[] apply = function5.apply( 10 );
    int[] apply1 = function6.apply( 10 );
    System.out.println(apply.length);
    System.out.println(apply1.length);

    System.out.println( function7.apply( 10 ).length );
  }
}