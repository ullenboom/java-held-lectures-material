package com.tutego.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GzipDataStream {
  public static void main( String[] args ) {
    Path path = Paths.get( "compress.txt.Z" );

    // Part 1: Write

    try ( OutputStream fos = Files.newOutputStream( path );
          OutputStream bos = new BufferedOutputStream( fos );
          OutputStream gzos = new GZIPOutputStream( bos );
          DataOutputStream dos = new DataOutputStream( gzos ) ) {
      //      byte[] bytes = new byte[ 1024 ];
      //      new Random().nextBytes( bytes );
      //      gzos.write( bytes );

      // dos -> gzos -> bos -> fos

      for ( int i = 0; i < 100; i++ ) {
        dos.writeUTF( "Christian" );  // 9 byte
        dos.writeInt( 40 );            // 4
        dos.writeUTF( "Cora" );       // 4 byte
        dos.writeInt( 40 );            // 4       = sum 21 * 100 = 2100 bytes
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    // Part 2: Read

    try ( InputStream fis = Files.newInputStream( path );
          InputStream bis = new BufferedInputStream( fis );
          InputStream gzis = new GZIPInputStream( bis );
          DataInputStream dis = new DataInputStream( gzis ) ) {

      while ( dis.available() > 0) {
        System.out.println( dis.readUTF() );
        System.out.println( dis.readInt() );
        System.out.println( dis.readUTF() );
        System.out.println( dis.readInt() );
      }
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    // Part 3: Delete file

    try {
      Files.delete( path );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }
}
