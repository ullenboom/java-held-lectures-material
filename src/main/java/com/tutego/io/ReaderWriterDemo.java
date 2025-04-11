package com.tutego.io;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalTime;

public class ReaderWriterDemo {
  public static void main( String[] args ) throws IOException {
    //    StringWriter writer = new StringWriter();
    //    writeNow( writer );
    //    System.out.println( writer.toString() );

    // Write

    Path path = Paths.get( "time.txt" );
    try ( Writer writer = Files.newBufferedWriter( path ) ) {
      writeNow( writer );
    }

    // Read

    try ( Reader reader = Files.newBufferedReader( path ) ) {
      //      while ( reader.ready() ) {
      //        System.out.print( (char)reader.read() );
      //      }

      for ( int c; (c = reader.read()) != -1; )
        System.out.print( (char) c );
    }

    // Delete

    Files.delete( path );
  }

  private static void writeNow( Writer writer ) throws IOException {
    writer.write( LocalTime.now().toString() );
  }
}