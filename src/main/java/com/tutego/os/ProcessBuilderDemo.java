package com.tutego.os;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ProcessBuilderDemo {
  public static void main( String[] args ) {

    //    try {
    //      ProcessBuilder processBuilder = new ProcessBuilder( "notepad.exe" );
    //      Process process = processBuilder.start();
    //      int statusCode = process.waitFor();
    //      System.out.println( statusCode );
    //    }
    //    catch ( IOException | InterruptedException e ) {
    //      throw new RuntimeException( e );
    //    }

    // dir
    try {
      ProcessBuilder processBuilder = new ProcessBuilder( "cmd.exe", "/c", "dir" );
      Process process = processBuilder.start();
      try ( Stream<String> lines = new BufferedReader(
          new InputStreamReader( process.getInputStream(), "CP437" ) ).lines() ) {
        lines.forEach( System.out::println );
      }
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

  }
}