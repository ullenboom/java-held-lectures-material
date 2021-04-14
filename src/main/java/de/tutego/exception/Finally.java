package de.tutego.exception;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.*;
import java.nio.charset.StandardCharsets;

/**
 * Lernziel: Abschlussarbeiten mit `finally`
 * - `try`-`finally`
 * - `try`-`catch`-`finally`
 * - Verschwundene Rückgaben
 *
 * @see TryWithResources
 */
public class Finally {
  public static void main( String[] args ) {
    long start = System.nanoTime();
    //    try {
    //      //
    //      new BigInteger( "3894579038578937590834759802375902834579023845723905782390578239085027" ).isProbablePrime( 1000000 );
    //      //      System.out.println(1/0);
    //      //      return;
    //    }
    //    finally {
    //      long end = System.nanoTime();
    //      System.out.println( TimeUnit.NANOSECONDS.toMillis( end - start ) + " ms" );
    //    }

//    try {
//      writeXmlFile();
//    }
//    catch ( XMLStreamException e ) {
//      e.printStackTrace();
//    }

    System.out.println(foo());
  }

  private static void writeXmlFile() throws XMLStreamException {
    XMLStreamWriter xmlStreamWriter = null;
    try {
      PrintWriter printWriter = new PrintWriter( "persons.xml", StandardCharsets.UTF_8 );
      xmlStreamWriter = XMLOutputFactory.newInstance().createXMLStreamWriter( printWriter );
      xmlStreamWriter.writeStartDocument();
      xmlStreamWriter.writeStartElement( "persons" );
      xmlStreamWriter.writeCharacters( "Christian" + 1 / 0 );
      xmlStreamWriter.writeEndElement();
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    finally {
      if ( xmlStreamWriter != null ) {
        xmlStreamWriter.close();
      }
    }
  }

  static int foo() {
    try {
      return 0;
    }
    finally {
//      return -1;
      System.out.println(1/0);
    }
  }
}