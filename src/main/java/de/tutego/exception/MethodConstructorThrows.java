package de.tutego.exception;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * Lernziel: Ausnahmen (Exceptions) weiterleiten
 * - Geprüfte und ungeprüfte Ausnahmen
 * - `throws` implementieren
 * - Wenn `main(...)` alles weitergibt
 * - Exceptions in der Javadoc
 *
 * @see ExceptionHierarchies
 */
public class MethodConstructorThrows {
  public static void main( String[] args ) throws IOException {
    // ungeprüfte Ausnahmen, unchecked exceptions, RuntimeException
    new Chessprogram();
  }
  // geprüfte Ausnahmen, checked exceptions
}

class Chessprogram {
  Configuration configuration;

  public Chessprogram() throws IOException {
    try {
      this.configuration = new Configuration();
    }
    catch ( NullPointerException e ) {
      System.err.println("NPE");
    }
  }
}

class Configuration {
  String filename;

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