package com.tutego.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchBlocks {
  public static void main( String[] args ) {

    //    try {
    //      int number = new Scanner( System.in ).nextInt();
    //      Files.writeString( Paths.get( "filename.txt" ), number + "\n" );
    //    }
    //    catch ( InputMismatchException | IOException e ) {  // multi-catch
    //      System.err.println( "Error" );
    //    }

    try {
      Files.deleteIfExists( Paths.get( "filename.txt" ) );
    }
    catch ( IOException e ) {
      System.err.println( "Could not delete file" );
    }

    int number = getNumber();
    System.out.println( number );

  }

  private static int getNumber() {
    while ( true ) {
      try {
        return new Scanner( System.in ).nextInt();
      }
      catch ( InputMismatchException e ) {
        System.err.println( "Was not a number" );
      }
    }
  }
}
