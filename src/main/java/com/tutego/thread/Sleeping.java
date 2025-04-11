package com.tutego.thread;

import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class Sleeping {
  public static void main( String[] args ) {
    try {
      System.out.println( LocalTime.now() );
//      Thread.sleep( 2000 /* ms */ );
//      Thread.sleep( Duration.ofSeconds( 2 ) );
      TimeUnit.SECONDS.sleep( 1 );
      System.out.println( LocalTime.now() );
    }
    catch ( InterruptedException e ) {
      // Empty
    }

    // TimeUnit methods for conversion

    // days -> seconds
    System.out.println( TimeUnit.DAYS.toSeconds( 2 ) ); // 172800

    // nanos -> millis
    long ns = 28734568L;
    System.out.println( TimeUnit.NANOSECONDS.toMillis( ns ) );  // 28
  }
}
