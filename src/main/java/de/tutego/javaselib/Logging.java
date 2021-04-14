package de.tutego.javaselib;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Lernziel: Log-Meldungen schreiben
 * - Log-Bibliotheken
 * - Handler, Log-Level
 */
public class Logging {
  public static void main( String[] args ) {

    //    Logger logger = Logger.getLogger( "" );
    //    FileHandler fileHandler = new FileHandler( "output.log", true );
    //    fileHandler.setFormatter( new SimpleFormatter() );
    //    logger.addHandler( fileHandler );
    //    logger.setLevel( Level.ALL );

    Lines.printLine();
  }
}

class Lines {
  private final static Logger log = Logger.getLogger( Lines.class.getName() );

  //  private final Logger log = Logger.getLogger( getClass().getName() );
  static void printLine() {
    log.log( Level.FINEST, () -> "Print a line of length " + 6 );
    System.out.println( "------" );
  }
}
