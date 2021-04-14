package de.tutego.thread;

import java.time.LocalTime;

/**
 * Lernziel: Threads unterbrechen durch Interrupt
 * - Interrupt senden
 * - Interrupt abfragen
 *
 * @see ExecutorDemo
 */
public class Interrupt {
  public static void main( String[] args ) throws InterruptedException {
    Runnable runnable = () -> {
      while ( !Thread.currentThread().isInterrupted() ) {
        try {
          System.out.println( LocalTime.now() );
          Thread.sleep( 1000 );
        }
        catch ( InterruptedException e ) {
          Thread.currentThread().interrupt();
        }
      }
    };
    Thread thread = new Thread( runnable );
    thread.start();
    Thread.sleep( 2000 );
    thread.interrupt();
  }
}
