package com.tutego.io;

import java.io.*;
import java.util.HexFormat;

public class MoreSerializationDeserialization {
  public static void main( String[] args ) {

    // Serialize

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try ( ObjectOutputStream oos = new ObjectOutputStream( baos ) ) {
      Object object = new Location();
      oos.writeObject( object );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    byte[] bytes = baos.toByteArray();
    System.out.println( HexFormat.ofDelimiter( " " ).formatHex( bytes ) );

    System.out.println( new String( bytes ) );

    // Deserialize

    ByteArrayInputStream bais = new ByteArrayInputStream( bytes );
    try ( ObjectInputStream ois = new ObjectInputStream( bais ) ) {
      Object object = ois.readObject();
      System.out.println( object );

    }
    catch ( IOException | ClassNotFoundException e ) {
      throw new RuntimeException( e );
    }
  }
}

class Location implements Serializable {

  @Serial private static final long serialVersionUID = 1;
  int x, y;
  transient Thread thread = Thread.currentThread();

  @Override public String toString() {
    return "Location{" +
        "x=" + x +
        ", y=" + y +
        ", thread=" + thread +
        '}';
  }
}