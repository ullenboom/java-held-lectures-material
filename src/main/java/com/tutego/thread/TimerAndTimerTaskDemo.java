package com.tutego.thread;

import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class TimerAndTimerTaskDemo {
  public static void main( String[] args ) {
    class MyTimerTask extends TimerTask {
      @Override public void run() {
        System.out.println( "TimerTask " + LocalTime.now() );  // Timer Thread
      }
    }
    Timer timer = new Timer();
//    timer.schedule( new MyTimerTask(), 2000 /* ms */ );
//    timer.schedule( new MyTimerTask(), 0 /* ms */, 2000 /* ms */ );
    timer.scheduleAtFixedRate( new MyTimerTask(), 0 /* ms */, 2000 /* ms */ );
    System.out.println( "main() " + LocalTime.now() );  // main-Thread
  }
}
