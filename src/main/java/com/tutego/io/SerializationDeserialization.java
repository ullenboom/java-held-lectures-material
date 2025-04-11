package com.tutego.io;

import java.io.*;
import java.util.ArrayList;
import java.util.HexFormat;
import java.util.List;

public class SerializationDeserialization {
  public static void main( String[] args ) {

    // Serialize

    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    try ( ObjectOutputStream oos = new ObjectOutputStream( baos ) ) {
      ArrayList<String> names = new ArrayList<>();
      names.add( "Willi" );
      names.add( "Wampee" );
      oos.writeObject( names );
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
      @SuppressWarnings( "unchecked" )
      List<String> list = ((List<String>) ois.readObject());
      System.out.println( list );

    }
    catch ( IOException | ClassNotFoundException e ) {
      throw new RuntimeException( e );
    }
  }
}
