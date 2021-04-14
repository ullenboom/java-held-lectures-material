package de.tutego.exception;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Lernziel: Eigene Ausnahmen auslösen
 * - `throw`
 * - message
 * - Ausnahme statt Methodenrückgabe (`UnsupportedOperationException`)
 * - rethrow
 * - `fillStacktrace()`
 * - Checked in unchecked Exceptions ummanteln
 * - Grund einer Exception (cause) setzen
 *
 * @see NewExceptionClasses
 */
public class ThrowNewException {

  static void printFileSize( Path path ) throws IOException {
    if ( path == null )
      throw new IOException();
    // ...
  }

  static void printSqrt( double d ) {
    if ( d < 0 )
      throw new IllegalArgumentException( "argument " + d + " was negative but has to be positive or null" );
    System.out.println( Math.sqrt( d ) );
  }

  static int multiplyExact( int a, int b ) {
    try {
      return Math.multiplyExact( a, b );
    }
    catch ( ArithmeticException e ) {
      System.err.println( "multiplyExact had an overflow with " + a + " and " + b );

      /*
      mit e.fillInStackTrace();

      multiplyExact had an overflow with 111111 and 22222
      Exception in thread "main" java.lang.ArithmeticException: integer overflow
        at de.tutego.exception.ThrowNewException.multiplyExact(ThrowNewException.java:38)
        at de.tutego.exception.ThrowNewException.main(ThrowNewException.java:45)
       */
      // e.fillInStackTrace();
      throw e;
    }
  }

  private static IllegalArgumentException illegalArgumentException = new IllegalArgumentException();

  static void printSqrt2( double d ) {
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
    // printSqrt2( -2342345 );
    // System.out.println( multiplyExact( 111111, 22222 ) );
    try {
      readAllLines( Paths.get("asdfasdf") );
    }
    catch ( Exception e ) {
      System.out.println(e);
      System.out.println(e.getCause());
    }
  }
}
