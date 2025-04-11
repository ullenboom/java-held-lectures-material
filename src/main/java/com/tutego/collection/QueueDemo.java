package com.tutego.collection;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
  public static void main( String[] args ) {
    /*

    Queue: FIFO

    +---+---+---+---+---+---+---+
    |   |   |   |   |   |   |   | <------
    +---+---+---+---+---+---+---+
      ^
      |
     */

    Queue<String> queue = new LinkedList<>();
    queue.offer( "Heinz" );
    queue.offer( "Eva" );
    queue.offer( "Maria" );
    System.out.println( queue.size() );
    System.out.println( queue );

    for ( String element; (element = queue.poll()) != null; ) {
      System.out.println( element );
    }
  }
}