package de.tutego.thread;

import java.util.concurrent.*;

/**
 * Lernziel: Executor, Thread-Pools und zeitliche Steuerung
 * - `Executor`
 * - `Executors`
 * - `ExecutorService`
 * - Thread-Pool
 *
 * @see CallableDemo
 */
public class ExecutorDemo {
  public static void main( String[] args ) throws InterruptedException {
    // newCachedThreadPool
    ExecutorService executor = Executors.newCachedThreadPool();
    Runnable runnable = () -> {
      System.out.println( "Hallo von " + Thread.currentThread() );
    };
    executor.execute( runnable );
    executor.execute( runnable );
    Thread.sleep( 100 );
    executor.execute( runnable );
    executor.execute( runnable );
    executor.shutdown();

    ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool( 0 );
    ScheduledFuture<?> scheduledFuture = scheduledExecutorService.scheduleAtFixedRate( runnable, 0, 1, TimeUnit.SECONDS );
    Thread.sleep( 1000 );
    scheduledFuture.cancel( false );
  }
}

class MyExecutor implements Executor {
  @Override public void execute( Runnable command ) {
    new Thread( command ).start();
  }
}