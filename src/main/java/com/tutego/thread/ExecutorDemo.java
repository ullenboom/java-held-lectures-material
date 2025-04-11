package com.tutego.thread;

import java.time.LocalTime;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
  public static void main( String[] args ) {
//    Executor simpleExecutor = new SimpleExecutor();
//    simpleExecutor.execute( () -> System.out.println( LocalTime.now() ) );
//    simpleExecutor.execute( () -> System.out.println( LocalTime.now() ) );
//    simpleExecutor.execute( () -> System.out.println( LocalTime.now() ) );

    try ( ExecutorService executorService = Executors.newCachedThreadPool() ) {
      executorService.execute( () -> System.out.println( LocalTime.now() ) );
    }

//    ExecutorService executorService = Executors.newCachedThreadPool();
//    executorService.shutdownNow();

  }
}

class SimpleExecutor implements Executor {
  @Override public void execute( Runnable command ) {
    new Thread( command ).start();
  }
}