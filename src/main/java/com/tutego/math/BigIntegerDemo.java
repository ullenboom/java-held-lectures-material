package com.tutego.math;

import java.math.BigInteger;

public class BigIntegerDemo {
  public static void main( String[] args ) {
    // int -> 4 byte
    // long -> 8 byte

    //    BigInteger bigInteger = new BigInteger( "364587263459872634598723645827346582934756239842643" );
    BigInteger bigInteger = new BigInteger( "1011010101001010010011111111111111111111111111111111111111111111101001001000100111000011",
                                            2 );  // 10783171
    //    bigInteger = bigInteger.multiply( new BigInteger( "2390762093457728743975" ) );
    System.out.println( bigInteger );
//    System.out.println( bigInteger.longValueExact() );

    System.out.println(
        BigInteger.valueOf( 72346598276345L ).gcd( new BigInteger( "72364598234658" ) )
    );
  }
}
