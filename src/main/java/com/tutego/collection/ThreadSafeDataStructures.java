package com.tutego.collection;

import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class ThreadSafeDataStructures {
  public static void main( String[] args ) throws InterruptedException {
//    SortedSet<Integer> numbers = Collections.synchronizedSortedSet( new TreeSet<>() );
    SortedSet<Integer> numbers = new ConcurrentSkipListSet<>();
    Runnable runnable1 = () -> {
      for ( int i = 0; i < 1000; i++ ) {
        numbers.add( i );
      }
    };
    Runnable runnable2 = () -> {
      for ( int i = 1000; i < 2000; i++ ) {
        numbers.add( i );
      }
    };
    Thread thread1 = Thread.startVirtualThread( runnable1 );
    Thread thread2 = Thread.startVirtualThread( runnable2 );
    thread1.join();
    thread2.join();
    //    System.out.println( numbers );
    System.out.println( numbers.size() );
  }
}