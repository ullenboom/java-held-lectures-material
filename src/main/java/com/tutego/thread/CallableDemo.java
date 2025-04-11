package com.tutego.thread;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.*;

public class CallableDemo {
  public static void main( String[] args ) {
    ListDirectoryCommand callable = new ListDirectoryCommand( "c:/" );
    // new Thread( callable ).start();
    ExecutorService executorService = Executors.newSingleThreadExecutor();
    Future<String[]> future = executorService.submit( callable );// 2. background thread
    // main thread
    try {
      String[] paths = future.get();
      //      String[] paths = future.get(1, TimeUnit.NANOSECONDS);
      System.out.println( Arrays.toString( paths ) );
    }
    catch ( InterruptedException | ExecutionException e ) {
      System.out.println( e.getCause() );
    }
  }

  static class ListDirectoryCommand implements Callable<String[]> {

    private final String path;

    public ListDirectoryCommand( String path ) {
      this.path = path;
    }

    @Override public String[] call() throws Exception {
      TimeUnit.SECONDS.sleep( 1 );
      String[] list = new File( path ).list();
      throw new IOException( "IO ERROR" );
      //return list;
    }
  }

}