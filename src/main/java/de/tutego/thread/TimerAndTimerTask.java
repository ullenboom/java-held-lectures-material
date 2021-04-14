package de.tutego.thread;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Lernziel: `Timer` und `TimerTask`
 * - Klasse `Timer`
 * - abstrakte Klasse `TimerTask`
 *
 * @see RunnableAndThread
 */
public class TimerAndTimerTask {
  public static void main( String[] args ) {
    class MyTimerTask extends TimerTask {
      @Override public void run() {
        System.out.println( "TimerTask " + LocalTime.now() );
      }
    }
    Timer timer = new Timer();
    timer.scheduleAtFixedRate( new MyTimerTask(), 0 /* ms */, 2000 /* ms */ );
    System.out.println( "main() " + LocalTime.now() );
  }
}
