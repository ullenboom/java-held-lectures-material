package com.tutego.io;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

public class InputStreamReaderOutputStreamWriter {
  public static void main( String[] args ) {
    // InputStream → InputStream -> InputStream -> *Resource*InputStream
    // OutputStream -> OutputStream -> OutputStream -> *Resource*OutputStream
    // Writer -> Writer -> Writer -> Writer -> *Resource*Writer
    // Reader -> Reader -> Reader -> Reader -> *Resource*Reader

    // https://openjdk.org/jeps/400
    System.out.println( Charset.defaultCharset() );

    // Part 1: Write

    Path path = Paths.get( "output-cs.txt" );

    try ( OutputStream outputStream = Files.newOutputStream( path );
          Writer writer = new OutputStreamWriter( outputStream, UTF_8 ) ) {
      writer.write( "Hello →" );
      writer.write( " World!" );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    // Part 2: Read

    try ( InputStream inputStream = Files.newInputStream( path );
          Reader reader = new InputStreamReader( inputStream, UTF_8 );
          BufferedReader bufferedReader = new BufferedReader( reader ) ) {
      System.out.println( bufferedReader.readLine() );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    // clear up

    try {
      Files.delete( path );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }
}