package de.tutego.collection;

import java.util.SortedSet;
import java.util.concurrent.*;

/**
 * Lernziel: Thread-sichere Datenstrukturen
 * - Problem bei nebenläufigem Zugriff
 * - Synchronized-Wrapper aus `Collections`
 * - Datenstrukturen aus `java.util.concurrent`
 *
 * @see Java1_0_Datatype
 */
public class ThreadSafeDataStructures {
  public static void main( String[] args ) throws InterruptedException {
    //    SortedSet<Integer> numbers = Collections.synchronizedSortedSet( new TreeSet<>() );
    SortedSet<Integer> numbers = new ConcurrentSkipListSet<>();
    Runnable runnable1 = () -> {
      for ( int i = 0; i < 99; i++ ) {
        numbers.add( i );
      }
    };
    Runnable runnable2 = () -> {
      for ( int i = 100; i < 199; i++ ) {
        numbers.add( i );
      }
    };
//    Thread thread1 = new Thread( runnable1 );
//    Thread thread2 = new Thread( runnable2 );
//    thread1.start();
//    thread2.start();
//    thread1.join();
//    thread2.join();
//    System.out.println( numbers );
//    System.out.println( numbers.size() );

    // Queue

    BlockingQueue<Integer> integers = new LinkedBlockingQueue<>(2);
    Runnable producer = () -> {
      while ( true ) {
        try {
          integers.put( ThreadLocalRandom.current().nextInt( 100 ) );
        }
        catch ( InterruptedException e ) {
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
        }
      }
    };
    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( producer );
    executorService.submit( consumer );
  }
}