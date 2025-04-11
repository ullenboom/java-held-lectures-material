package com.tutego.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaExceptions {
  public static void main( String[] args ) {
    // Unchecked Exceptions, Subclass of RuntimeException

    //    Object o = null;
    //    o.toString();
    // ->
    // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "Object.toString()" because "o" is null
    //	at com.tutego.exception.JavaExceptions.main(JavaExceptions.java:8)

    // ----

    // System.out.println( args[ -1 ] );
    // ->
    // Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index -1 out of bounds for length 0
    //	at com.tutego.exception.JavaExceptions.main(JavaExceptions.java:16)

    // ----

    // Integer.parseInt( "hhhh" );
    // ->
    // Exception in thread "main" java.lang.NumberFormatException: For input string: "hhhh"

    try {
      Integer.parseInt( "hhhh" );
    }
    catch ( NumberFormatException e ) {
      System.err.println( "Number was not a number" );
    }

    // Checked Exceptions, not Subclass of RuntimeException

    Path path = Paths.get( "filename.txt" );
    try {
      Files.writeString( path, "hello world" );
      System.out.println( "Done" );
    }
    catch ( IOException e ) {
      System.err.println( "Error writing file" );
    }
    ;
  }
}