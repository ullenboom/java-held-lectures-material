package com.tutego.thread;

import java.io.File;
import java.math.BigInteger;
import java.util.concurrent.ThreadLocalRandom;

public class RunnableAndThread {
  public static void main( String[] args ) {

    //    System.out.println( Thread.currentThread() );

    Runnable printPrimeCommand = () -> {
      System.out.println( Thread.currentThread() );
      System.out.println( new BigInteger( 128, 10, ThreadLocalRandom.current() ) );
    };

    Thread thread1 = new Thread( new ListDirectoryCommand() );
    thread1.setName( "ListDirectoryCommand" );
    thread1.start();

    //    Thread thread2 = new Thread( printPrimeCommand );
//    thread2.start();
    Thread thread2 = Thread.ofPlatform().name( "printPrimeCommand" ).start( printPrimeCommand );
  }

  static class ListDirectoryCommand implements Runnable {
    @Override public void run() {
      System.out.println( Thread.currentThread() );
      for ( File file : new File( "c:/" ).listFiles() ) {
        System.out.println( file );
      }
    }
  }
}
