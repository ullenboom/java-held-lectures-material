package de.tutego.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Lernziel: Vererbungsbeziehung der Ausnahmeklassen
 * - `Throwable`, `Exception`, `RuntimeException`
 * - Gemeinsame Methoden
 * - Basistyp abfangen
 * - Reihenfolge mehrerer `catch`-Blöcke
 * - Variationen von `throws` bei überschriebenen Methoden
 * - Bei beliebigen Ausnahmen Block wiederholen
 *
 * @see Finally
 */
public class ExceptionHierarchies {
  public static void main( String[] args ) {
    //    try {
    //      List<String> lines = Files.readAllLines( Path.of( "dateiname.txt" ) );
    //      for ( String line : lines ) {
    //        System.out.println( Integer.toBinaryString( Integer.parseInt( line ) ) );
    //      }
    //    }
    //    catch ( IOException e ) {
    //      System.out.println( e.getMessage() );
    //      System.out.println( Arrays.toString( e.getStackTrace() ) );
    //      System.out.println( e.getClass() );
    //      System.out.println( e.toString() );
    //
    ////      if ( e instanceof IOException ) {
    ////
    ////      }
    //    }
    //    catch ( Exception e ) { // inkl. NPE
    //      System.err.println("Anderer Fehler!");
    //      e.printStackTrace();
    //    }
    //
    //    AutoCloseable autoCloseable1 = new MyAutocloseable1();
    //    try {
    //      autoCloseable1.close();
    //    }
    //    catch ( Exception e ) {
    //      e.printStackTrace();
    //    }
    //
    //    AutoCloseable autoCloseable2 = new MyAutocloseable2();
    //    try {
    //      autoCloseable2.close();
    //    }
    //    catch ( Exception e ) {
    //      e.printStackTrace();
    //    }

    while ( true ) {
      String line = null;
      try {
        line = new Scanner( System.in ).nextLine();
        double v = new Scanner( line ).nextDouble();
        System.out.println( v );
        break;
      }
      catch ( InputMismatchException e ) {
        System.err.println( line + " war keine gültige Fließkommazahl" );
        // e.printStackTrace();
      }
      catch ( Exception e ) {
        System.err.println( "Allgemeiner Fehler" );
      }
    }
    System.out.println( "Nach der Eingabe" );
  }
}

class MyAutocloseable1 implements AutoCloseable {

  @Override public void close() {

  }
}

class MyAutocloseable2 implements AutoCloseable {
  @Override public void close() throws IOException {

  }
}

class MyAutocloseable3 implements AutoCloseable {
  @Override public void close() throws IOException {

  }
}