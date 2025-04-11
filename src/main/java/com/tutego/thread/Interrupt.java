package com.tutego.thread;

import java.time.LocalTime;

public class Interrupt {
  public static void main( String[] args ) throws InterruptedException {
    Runnable runnable = () -> {
      while ( !Thread.currentThread().isInterrupted() ) {
        try {
          System.out.println( LocalTime.now() );
          Thread.sleep( 1000 /* ms */ );
        }
        catch ( InterruptedException e ) {
          Thread.currentThread().interrupt();
        }
      }
    };
    Thread thread = new Thread( runnable );
    thread.start();
    Thread.sleep( 2000 /* ms */ );
    thread.interrupt();
  }
}
