package com.tutego.thread;

import java.util.Scanner;

public class VirtualThreads {

    /*
    Traditional Threads: One Java Thread = One Platform Thread (OS-Thread)

                   ┌──┐                   ┌──┐           ┌────┐
    Thread 1       │R1│                   │R1│           │ R1 │
              ─────┴──┴───────────────────┴──┴───────────┴────┴───────────

                       ┌───────────────┐      ┌────┐
    Thread 2           │      R2       │      │ R2 │
              ─────────┴───────────────┴──────┴────┴──────────────────────

                ┌─────────┐        ┌──────┐           ┌──────────────┐
    Thread 3    │   R3    │        │  R3  │           │     R3       │
              ──┴─────────┴────────┴──────┴───────────┴──────────────┴────
    */

    /*
    Virtual Threads are mounted to Platform Threads (Carrier)

                   ┌──┬┬───────────────┐  ┌──┐           ┌────┐
    Thread 1       │R1││      R2       │  │R1│           │ R1 │
              ─────┴──┴┴───────────────┴──┴──┴───────────┴────┴───────────

                ┌─────────┐        ┌──────┐   ┌────┐  ┌──────────────┐
    Thread 2    │   R3    │        │  R3  │   │ R2 │  │     R3       │
              ──┴─────────┴────────┴──────┴───┴────┴──┴──────────────┴────
    */

  public static void main( String[] args ) throws InterruptedException {

    // new Thread( () -> {} ).start();
    // Thread.ofPlatform().start( () -> {} );

//    Thread thread = Thread.startVirtualThread( () -> {
//      System.out.println( "Here I am" );
//    } );

    Thread thread = Thread.ofVirtual().start( () -> {
      System.out.println( "Here I am" );
    } );

    // thread.join();

    new Scanner( System.in ).next();

    // 1. No Priority
    // 2. Virtual Threads are always Daemon Threads
  }
}
