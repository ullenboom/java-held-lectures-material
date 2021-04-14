package de.tutego.thread;

import java.time.LocalTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Lernziel: Kritische Abschnitte sperren
 * - Schnittstelle `Lock`
 * - Implementierung `ReentrantLock`
 */
public class LockObjects {
  public static void main( String[] args ) {

    StringBuilder sb = new StringBuilder();
    Lock lock = new ReentrantLock();

    Runnable runnable = new Runnable() {
      @Override public void run() {
        String now = LocalTime.now().toString();
        /////////////////////////////////////////////
        try {
          lock.lock();
          for ( int i = 0; i < now.length(); i++ ) {
            sb.append( now.charAt( i ) );
            try {
              Thread.sleep( 100 );
            }
            catch ( InterruptedException e ) {
            }
            System.out.println( sb );
          }
        }
        finally {
          lock.unlock();
        }
        /////////////////////////////////////////////
      }
    };

    ExecutorService executorService = Executors.newCachedThreadPool();
    executorService.execute( runnable );
    executorService.execute( runnable );
    executorService.execute( runnable );
    executorService.execute( runnable );
    executorService.shutdown();
  }
}
