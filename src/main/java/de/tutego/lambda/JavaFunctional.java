package de.tutego.lambda;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Lernziel: Prinzipien der funktionalen Programmierung
 * - Lambda-Ausdrücke übergeben und zurückgeben
 * - Execute-Around pattern
 *
 * @see JavaUtilFunction
 */
public class JavaFunctional {
  /*
      +--+--> imperative Sprachen
         |
         +--> deklarative Sprachen +--+--> funktionale Sprachen
                                      |
                                      +--> logische Sprachen
  */
  /*
   * - Funktionen höherer Ordnung => gute Wiederverwendbarkeit
   * - Keine Seiteneffekte => gute Testbarkeit, Parallelisierbarkeit
   * - Keine Schleifen -> Rekursion
   */
  public static void main( String[] args ) {
    Predicate<String> empty = isEmpty( true );
    long ms = execute( () -> {
      for ( int i = 0; i < 10000; i++ ) {
        System.out.println( "Hallo" );
      }
    } );
    System.out.println( ms );
  }

  static Predicate<String> isEmpty( boolean shouldTrim ) {
    if ( shouldTrim )
      return ( String s ) -> s.trim().isEmpty();
    return ( String s ) -> s.isEmpty();
  }

  static long execute( Runnable runnable ) {
    long start = System.nanoTime();
    runnable.run();
    long end = System.nanoTime();
    return TimeUnit.NANOSECONDS.toMillis( end - start );
  }
}
