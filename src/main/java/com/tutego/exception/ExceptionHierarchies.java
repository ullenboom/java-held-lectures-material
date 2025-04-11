package com.tutego.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class ExceptionHierarchies {
  public static void main( String[] args ) {
    try {
      List<String> lines = Files.readAllLines( Paths.get( "......" ) );
      for ( String line : lines ) {
        System.out.println( Integer.toBinaryString( Integer.parseInt( line ) ) );
      }
    }
    catch ( IOException e ) {
      System.out.println( e.getMessage() );
      System.out.println( Arrays.toString( e.getStackTrace() ) );
      System.out.println( e.getClass() );
      System.out.println( e.toString() );

      //      if ( e instanceof FileNotFoundException ) {
      //        // ...
      //      }
    }
    catch ( Exception e ) {   // Incl. NPE, NFE
      System.err.println( "Another error type" );
      e.printStackTrace();
    }

    // ---------------------

//    AutoCloseable myAutoCloseable1 = new MyAutoCloseable1();
//    try {
//      myAutoCloseable1.close();
//    }
//    catch ( Exception e ) {
//    }

    AutoCloseable myAutoCloseable2 = new MyAutoCloseable2();
    try {
      myAutoCloseable2.close();
    }
    catch ( Exception e ) {   // also catches IOException
    }
  }
}

class MyAutoCloseable1 implements AutoCloseable {
  @Override public void close() /* throws Exception */ {
  }
}

class MyAutoCloseable2 implements AutoCloseable {
  @Override public void close() throws IOException {  // throw Subclass
  }
}

//class MyAutoCloseable3 implements AutoCloseable {
//  @Override public void close() throws Throwable {
//  }
//}
