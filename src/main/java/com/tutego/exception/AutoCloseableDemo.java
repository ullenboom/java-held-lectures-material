package com.tutego.exception;

public class AutoCloseableDemo {
  public static void main( String[] args ) {
    try ( OutputResource output = new OutputResource();   // 2. close()
          InputResource input = new InputResource() ) {   // 1. close()
      System.out.println( "Body inside try-with-resources" );
      // System.out.println( 1 / 0 );
    }
    catch ( ArithmeticException e ) {
      System.out.println( "There was an exception" );
      e.printStackTrace();
    }
  }
}

class OutputResource implements AutoCloseable {
  public OutputResource() {
    // System.out.println( 1 / 0 );
  }

  @Override public void close() {
    System.out.println( "Output close" );
    System.out.println( 1 / 0 );
  }
}

class InputResource implements AutoCloseable {
  public InputResource() {
    // System.out.println( 1 / 0 );
  }

  @Override public void close() {
    System.out.println( "Input close" );
    System.out.println( 1 / 0 );
  }
}