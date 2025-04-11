package com.tutego.collection;

import java.util.concurrent.*;

public class BlockingQueueDemo {
  public static void main( String[] args ) {

    BlockingQueue<Integer> integers = new LinkedBlockingQueue<>( 2 );
    Runnable producer = () -> {
      while ( true ) {
        try {
          integers.put( ThreadLocalRandom.current().nextInt( 100 ) );
        }
        catch ( InterruptedException e ) {
          throw new RuntimeException( e );
        }
      }
    };
    Runnable consumer = () -> {
      while ( true ) {
        try {
          System.out.println( integers.take() );
          Thread.sleep( 100 );
        }
        catch ( InterruptedException e ) {
          throw new RuntimeException( e );
        }
      }
    };
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( consumer );
    executorService.submit( consumer );
    executorService.submit( consumer );
  }
}
