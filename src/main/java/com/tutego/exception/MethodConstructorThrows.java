package com.tutego.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class MethodConstructorThrows {
  public static void main( String[] args ) throws IOException {
    // Unchecked Exceptions, Subclasses of RuntimeException
    //    try {
    new ChessProgram();
    //    }
    //    catch ( NullPointerException e ) {
    //      System.err.println( "NPE" );
    //    }

    // Checked Exceptions
  }
}

class ChessProgram {
  Configuration configuration;

  public ChessProgram() throws IOException {
    try {
      configuration = new Configuration();
    }
    catch ( NullPointerException e ) {
      System.err.println( "NPE" );
      // configuration = ...
    }
  }
}

class Configuration {

  String filename; // = null

  /**
   *
   * @throws IOException
   * @throws NullPointerException
   */
  public Configuration() throws IOException {
    Path path = Paths.get( filename );
    List<String> strings = Files.readAllLines( path );
  }
}