package de.tutego.os;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

/**
 * Lernziel: Externe Programme aufrufen
 * - `Runtime#exec(...)`
 * - `ProcessBuilder`
 *
 * @see PreferencesDemo
 */
public class ProcessBuilderDemo {
  public static void main( String[] args ) {

    //    try {
    //      ProcessBuilder processBuilder = new ProcessBuilder( "notepad.exe" );
    //      Process process = processBuilder.start();
    //      int statusCode = process.waitFor();
    //      System.out.println( statusCode );
    //    }
    //    catch ( IOException | InterruptedException e ) {
    //      e.printStackTrace();
    //    }

    // dir
    ProcessBuilder processBuilder = new ProcessBuilder( "cmd.exe", "/c", "dir" );
    try {
      Process process = processBuilder.start();
      try ( Stream<String> lines = new BufferedReader( new InputStreamReader( process.getInputStream(), "CP437" ) ).lines() ) {
        lines.forEach( System.out::println );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}