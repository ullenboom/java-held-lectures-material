package com.tutego.io;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.zip.GZIPOutputStream;

public class PrinterWriterPrintStream {
  public static void main( String[] args ) throws IOException {
    //    PrintStream out = System.out;
    //    out.println( "Hello World" );

    //    StringWriter stringWriter = new StringWriter();
    //    PrintWriter printWriter = new PrintWriter( stringWriter );
    //    printWriter.printf( "%d %s%n", 1, "Line 1" );
    //    printWriter.close();
    //    System.out.println( stringWriter );

    Path path = Files.createTempFile( "", ".txt.Z" );
    System.out.println( path );
    try ( OutputStream fos = Files.newOutputStream( path );
          OutputStream bos = new BufferedOutputStream( fos );
          OutputStream gzos = new GZIPOutputStream( bos );
          PrintWriter out = new PrintWriter( gzos, false, StandardCharsets.UTF_8 ) ) {

      for ( int i = 0; i < 1000; i++ ) {
        out.println( "Line: " );
        out.print( ' ' );
        out.println( i );
      }

    }
  }
}