package de.tutego.javaselib;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;
import java.math.RoundingMode;

/**
 * Lernziel: Große Ganz und -Fließkommazahlen
 * - `BigInteger`
 * - `BigDecimal`
 *
 * @see RandomThings
 */
public class BigIntegerBigDecimal {
  public static void main( String[] args ) {

    // BigInteger

    // int -> 4 Byte
    // long -> 8 Byte

    BigInteger bigInteger = new BigInteger( "101010100010101111111111111111111111100100100000010000100001", 2 );
    System.out.println( bigInteger.longValueExact() );

    System.out.println( BigInteger.valueOf( 10_000_000L ).gcd( new BigInteger( "50000" ) ) );

    // BigDecimal

    BigDecimal bigDecimal1 = new BigDecimal( "7474.29348572938572903857290357" );
    BigDecimal bigDecimal2 = new BigDecimal( 7474.293485729385378590837459038772903857290357 );
    System.out.println( bigDecimal1 );
    System.out.println( bigDecimal2 );

    System.out.println( BigDecimal.ONE.divide( new BigDecimal( "3" ), new MathContext( 10, RoundingMode.CEILING ) ) );
  }
}
