package com.tutego.functional;

import java.util.concurrent.TimeUnit;
import java.util.function.Predicate;

public class JavaFunctional {
  public static void main( String[] args ) {
    //    List<String> list = List.of();
    //    list.removeIf( ... );
    Predicate<String> empty = isEmpty( true );

    // Execute-Around-Pattern

    long ms = execute( () -> {
      for ( int i = 0; i < 10_000; i++ ) {
        System.out.println( "Hello" );
      }
    } );
    System.out.println( ms );
  }

  static Predicate<String> isEmpty( boolean shouldTrim ) {
    if ( shouldTrim ) {
//      return ( String s ) -> s.trim().isEmpty();
      return ( String s ) -> s.isBlank();
    }
    return ( String s ) -> s.isEmpty();
  }

  static long execute( Runnable runnable ) {
    long start = System.nanoTime();
    runnable.run();
    long end = System.nanoTime();

    return TimeUnit.NANOSECONDS.toMillis( end - start );
  }
}
