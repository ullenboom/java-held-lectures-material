package com.tutego.exception;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MoreOnThrowNewException {

  static int multiplyExact( int a, int b ) {
    try {
      return Math.multiplyExact( a, b );
    }
    catch ( ArithmeticException e ) {
      System.err.println( "multiplyExact had an overflow with " + a + " and " + b );

      //      Exception in thread "main" java.lang.ArithmeticException: integer overflow
      //      at java.base/java.lang.Math.multiplyExact(Math.java:992)
      //      at com.tutego.exception.MoreOnThrowNewException.multiplyExact(MoreOnThrowNewException.java:7)
      //      at com.tutego.exception.MoreOnThrowNewException.main(MoreOnThrowNewException.java:20)

      e.fillInStackTrace();

      // ->
      //      Exception in thread "main" java.lang.ArithmeticException: integer overflow
      //      at com.tutego.exception.MoreOnThrowNewException.multiplyExact(MoreOnThrowNewException.java:11)
      throw e;   // rethrow
    }
  }

  private static IllegalArgumentException illegalArgumentException = new IllegalArgumentException();

  static void printSqrt( double d ) {
    if ( d < 0 ) {
      illegalArgumentException.fillInStackTrace();
      throw illegalArgumentException;
    }

    System.out.println( Math.sqrt( d ) );
  }

  static List<String> readAllLines( Path path ) {
    try {
      return Files.readAllLines( path );
    }
    catch ( IOException e ) {
      throw new UncheckedIOException( e );
    }
  }

  public static void main( String[] args ) {
    // System.out.println( multiplyExact( 11111111, 2222222 ) );
    // printSqrt( -245667 );
    try {
      readAllLines( Paths.get( "kjasdhflkajshdlkajds" ) );
    }
    catch ( Exception e ) {
      System.out.println( e );
      System.out.println( e.getCause() );
    }
  }
}
