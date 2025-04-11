package com.tutego.exception;

import java.io.IOException;
import java.nio.file.Path;

public class ThrowNewException {

  static void printFileSize( Path path ) throws IOException {
    if ( path == null ) {
      throw new IOException();
    }
    // ...
  }

  static void printSqrt( double d ) {
    if ( d < 0 )
      throw new IllegalArgumentException( "Argument " + d + " was negative but has to be positive or null" );

    System.out.println( Math.sqrt( d ) );
  }

  public static void main( String[] args ) {
    printSqrt( 245 );

    printSqrt( -245 );
    // Exception in thread "main" java.lang.IllegalArgumentException: Argument -245.0 was negative but has to be positive or null
  }
}
