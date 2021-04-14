package de.tutego.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Lernziel: Ausnahmen (Exceptions) auffangen
 * - Motivation von Ausnahmen
 * - Auslöseorte (JVM-intern, händisch)
 * - try-catch-Blöcke
 * - Mehrere catch-Blöcke
 * - Multi-Catch
 *
 * @see MethodConstructorThrows
 */
public class Exceptions {
  public static void main( String[] args ) {
    /*
    - https://git.savannah.gnu.org/cgit/coreutils.git/tree/src/whoami.c
    - https://github.com/mysql/mysql-server/blob/8.0/storage/csv/ha_tina.cc
    - https://github.com/openssl/openssl/blob/master/ssl/ssl_lib.c
     */

    // ungeprüfte Ausnahmen, unchecked exception, RuntimeException

    //    Object o = null;
    //    o.toString();

    //    System.out.println( args[ -1 ] );

    try {
      Integer.parseInt( "hhhhh" );
    }
    catch ( NumberFormatException e ) {
      System.err.println( "Zahl war keine Zahl" );
    }

    // geprüfte Ausnahmen, checked exception

    //    Path path = Paths.get( "dateiname.txt" );
    //    List<String> list = new ArrayList<>();
    //    try {
    //      Integer.parseInt( "hhhhh" );
    //      Files.write( path, list );
    //      System.out.println( "Fertig" );
    //    }
    //    catch ( NumberFormatException | IOException e ) {
    //      System.err.println( "Fehler!" );
    //    }

    try {
      Path path = Paths.get( "numbers.txt" );
      List<String> lines = Files.readAllLines( path );
      for ( String line : lines ) {
        int number = Integer.parseInt( line );
        System.out.println( Integer.toBinaryString( number ) );
      }
    }
    catch ( IOException | NumberFormatException e ) {
      System.err.println( "Fehler beim Lesen der Datei!" );
    }
  }
}