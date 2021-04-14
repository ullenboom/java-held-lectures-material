package de.tutego.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Serialisierung und Deserialisierung
 * - `ObjectOutputStream` und `ObjectInputStream`
 * - Schnittstelle `Serializable`
 * - Schlüsselwort `transient`
 * - `private static final long serialVersionUID`
 * - Methoden `readObject(...)` und `writeObject(...)`
 *
 * @see GetResource
 */
public class SerializationDeserialization {
  public static void main( String[] args ) {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try ( ObjectOutputStream oos = new ObjectOutputStream( baos ) ) {
      ArrayList<String> names = new ArrayList<>();
      names.add( "Willi" );
      names.add( "Wumsi" );
      oos.writeObject( names );
      oos.writeObject( new Location() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    byte[] bytes = baos.toByteArray();
    for ( byte aByte : bytes ) {
      System.out.printf( "%02x ", aByte );
    }
    System.out.println();
    for ( byte aByte : bytes ) {
      System.out.printf( "%c ", (char) aByte );
    }
    System.out.println();

    // Deserialisierung

    ByteArrayInputStream bais = new ByteArrayInputStream( bytes );
    try ( ObjectInputStream ois = new ObjectInputStream( bais ) ) {
      @SuppressWarnings( "unchecked" )
      List<String> list = (List<String>) ois.readObject();
      System.out.println( list );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
    catch ( ClassNotFoundException e ) {
      e.printStackTrace();
    }
  }
}

class Location implements Serializable {
  transient Thread thread = Thread.currentThread();
  int x, y;
}