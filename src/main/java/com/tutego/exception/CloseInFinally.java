package com.tutego.exception;

import javax.xml.stream.XMLOutputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class CloseInFinally {
  public static void main( String[] args ) {
    try {
      writeXmlFile();
    }
    catch ( XMLStreamException | ArithmeticException e ) {
      System.err.println( e );
    }

    //

    try {
      Files.deleteIfExists( Paths.get( "persons.xml" ) );
    }
    catch ( IOException e ) {
      System.err.println( e );
    }
  }

  private static void writeXmlFile() throws XMLStreamException {
    XMLStreamWriter xmlStreamWriter = null;
    PrintWriter printWriter = null;
    try {
      printWriter = new PrintWriter( "persons.xml", StandardCharsets.UTF_8 );
      xmlStreamWriter = XMLOutputFactory.newInstance()
                                        .createXMLStreamWriter( printWriter );
      xmlStreamWriter.writeStartDocument();
      xmlStreamWriter.writeStartElement( "persons" );
      xmlStreamWriter.writeCharacters( "Christian" + 1 / 0 );
      xmlStreamWriter.writeEndElement();
      // xmlStreamWriter.close();  // 1. flush, 2. close resource
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }
    finally {
      if ( xmlStreamWriter != null ) {
        System.out.println( "Closing xmlStreamWriter" );
        xmlStreamWriter.close();
      }

      if ( printWriter != null ) {
        System.out.println( "Closing printWriter" );
        printWriter.close();
      }
    }
  }
}
