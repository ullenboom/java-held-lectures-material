package com.tutego.lambda;

import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.concurrent.Callable;
import java.util.function.Predicate;

public class LambdaExceptions {
  public static void main( String[] args ) {

    // Unchecked Exceptions / RuntimeException

    Predicate<String> isNumber = s -> {
      return s.matches( "\\d+" );
    };

    System.out.println( isNumber.test( "8374568376458" ) );  // true

    try {
      isNumber.test( null );
    }
    catch ( Exception e ) {
      System.err.println( "NPE" );
    }

    // Checked Exceptions

    // Predicate
    Predicate<Path> isEmptyFile = path -> {
      try {
        return Files.size( path ) == 0;
      }
      catch ( IOException e ) {
        throw new UncheckedIOException( e );
      }
    };

    // Callable

    Callable<String> callable = () -> {
      Files.size( Paths.get( "" ) );
      return "";
    };


  }
}