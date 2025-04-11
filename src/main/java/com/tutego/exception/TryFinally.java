package com.tutego.exception;

import java.math.BigInteger;
import java.util.concurrent.TimeUnit;

public class TryFinally {
  public static void main( String[] args ) {
    long start = System.nanoTime();
    try {
      //
      new BigInteger( "374659827364598236458972436827369485" ).isProbablePrime( 100000 );
      // System.out.println( 1 / 0 );
      // return;
      //
    }
    finally {
      long end = System.nanoTime();
      System.out.println( TimeUnit.NANOSECONDS.toMillis( end - start ) + " ms" );
    }

    //

    System.out.println( foo() );
  }

//  static int foo() {
//    try {
//      System.out.println( 1 / 0 );
//      return 0;
//    }
//    finally {
//      // And the winner is ...
//      return -1;
//    }
//  }

  static int foo() {
    try {
      return 0;
    }
    finally {
      System.out.println( 1 / 0 );
    }
  }

}