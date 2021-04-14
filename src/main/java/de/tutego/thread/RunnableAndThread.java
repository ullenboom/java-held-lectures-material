package de.tutego.thread;

/**
 * Lernziel: Threads laufen lassen
 * - `Runnable`, `run()`-Methode
 * - `Thread` starten
 * - Namen vergeben
 * - Ende eines Threads
 *
 * @see Sleeping
 */
public class RunnableAndThread {
  public static void main( String[] args ) {
    System.out.println( Thread.currentThread() );
    Runnable runnable = new Runnable() {
      @Override public void run() {
        for ( int i = 0; i < 100; i++ ) {
          System.out.println( Thread.currentThread() );
          System.out.println( i );
        }
      }
    };
    Thread thread = new Thread( runnable );
    thread.setName( "Mein Thread 1" );
    thread.start();

    //

    Runnable runnable2 = () -> {
      for ( int i = 0; i < 100; i++ ) {
        System.out.println( Thread.currentThread() );
        System.out.println( i / 0 );
      }
    };

    new Thread( runnable2, "Potenzierer" ).start();

  }
}
