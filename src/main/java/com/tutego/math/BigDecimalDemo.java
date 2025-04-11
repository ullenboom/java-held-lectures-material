package com.tutego.math;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class BigDecimalDemo {
  public static void main( String[] args ) {

    System.out.printf( "%s%n", BigDecimal.TEN.multiply( BigDecimal.TEN ) );
    BigDecimal bigDecimal1 = new BigDecimal( 6837456823465.7398457923847529038475 );
    BigDecimal bigDecimal2 = new BigDecimal( "6837456823465.7398457923847529038475" );
    System.out.println( bigDecimal1 );        // 6837456823465.740234375
    System.out.println( bigDecimal2 );        // 6837456823465.7398457923847529038475

    // System.out.println( BigDecimal.ONE.divide( BigDecimal.valueOf( 3 ) ) );
    // Exception in thread "main" java.lang.ArithmeticException: Non-terminating decimal expansion; no exact representable decimal result.

    System.out.println( BigDecimal.ONE.divide( BigDecimal.valueOf( 3 ), RoundingMode.CEILING ) );
    System.out.println( BigDecimal.ONE.divide( BigDecimal.valueOf( 3 ), RoundingMode.FLOOR ) );

    System.out.println( BigDecimal.ONE.divide( BigDecimal.valueOf( 3 ), new MathContext( 3 ) ) );
  }
}
