package com.tutego.exception;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Locale;
import java.util.Scanner;

public class TryWithResources {
  public static void main( String[] args ) {
    try ( Scanner scanner = new Scanner( Paths.get( "pom.xml" ) );
          PrintWriter writer = new PrintWriter( "output.txt" ) ) {
      //      writer.println( "Hello World" );
      //      writer.println( "Hello Captain Tom" );
      while ( scanner.hasNextLine() ) {
        String line = scanner.nextLine();
        writer.println( line.toUpperCase( Locale.ROOT ) );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    try {
      Files.delete(Paths.get( "output.txt" ));
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }
    // finally {
    // writer.close();
    // scanner.close();
    // }
  }
}
