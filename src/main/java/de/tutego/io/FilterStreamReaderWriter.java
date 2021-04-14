package de.tutego.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

/**
 * Lernziel: Filter-Ein-/Ausgabeströme
 * - `BufferedXXX`
 * - `GZIPXXXStream`
 * - `CipherXXXStream`
 * - `DigestXXXStream`
 * - `DataXXXStream`
 * - `PipedXXX`
 * - `LineNumberReader`
 *
 * @see InputStreamReaderOutputStreamWriter
 */
public class FilterStreamReaderWriter {
  public static void main( String[] args ) {
    /*
                  Ein-/Ausgabe-Ressource

                            |
            op() +--------->#
                            #
                            #
                            |
     */
    /*
                          Filter      Ein-/Ausgabe-Ressource

                            |                   |
            op() +--------->#                   |
                            #------------------>#
                            #                   #
                            #                   |
                            |                   |

     */
    try ( OutputStream fos = Files.newOutputStream( Paths.get( "compress.txt.Z" ) );
          OutputStream bos = new BufferedOutputStream( fos );
          OutputStream gzos = new GZIPOutputStream( bos );
          DataOutputStream dos = new DataOutputStream( gzos ) ) {

      // dos -> gzos -> bos -> fos
      for ( int i = 0; i < 100; i++ ) {
        dos.writeUTF( "Christian" );  // 9 byte
        dos.writeInt( 40 );            // 4 byte
        dos.writeUTF( "Cora" );       // 4 byte
        dos.writeInt( 40 );            // 4 byte  -> sum 21 * 100 = 2100
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    try ( InputStream fis = Files.newInputStream( Paths.get( "compress.txt.Z" ) );
          InputStream bis = new BufferedInputStream( fis );
          InputStream gzis = new GZIPInputStream( bis );
          DataInputStream dis = new DataInputStream( gzis ) ) {
      while ( dis.available() > 0 ) {
        System.out.println( dis.readUTF() );
        System.out.println( dis.readInt() );
        System.out.println( dis.readUTF() );
        System.out.println( dis.readInt() );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
