package com.tutego.logging;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LoggerDemo {
  public static void main( String[] args ) throws IOException {

    //    Logger logger = Logger.getLogger( "" );
    //    FileHandler fileHandler = new FileHandler( "logfile.log", true );
    //    fileHandler.setFormatter( new SimpleFormatter() );
    //    logger.addHandler( fileHandler );
    //    logger.setLevel( Level.ALL );
    Lines.printLine( 6 );
  }
}

class Lines {
  private static final Logger log = Logger.getLogger( Lines.class.getName() );
  //  private final Logger log = Logger.getLogger( getClass().getName() );

  static void printLine( int length ) {
    //    log.log( Level.FINEST, "Print a line of length {0}", length );
    log.log( Level.INFO, () -> "Print a line of length " + length );
    // log.finest( "" );
    System.out.println( "-".repeat( length ) );
  }
}