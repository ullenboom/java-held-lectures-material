package de.tutego.io;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.nio.charset.StandardCharsets.UTF_8;

/**
 * Lernziel: Umwandlung `Reader`/`Writer` in `InputStream`/`OutputStream`
 * - Kodieren (Unicode-Zeichen → Bytefolge), Dekodieren (Bytefolge → Unicode-Zeichen)
 * - `InputStreamReader`
 * - `OutputStreamWriter`
 * - `StandardCharsets`
 *
 * @see PrinterWriterPrintStream
 */
public class InputStreamReaderOutputStreamWriter {
  public static void main( String[] args ) {
    // InputStream -> InputStream -> InputStream -> R.InputStream
    // OutputStream -> OutputStream -> OutputStream -> R.OutputStream
    // Writer -> Writer -> Writer -> Writer -> R.Writer
    // Reader -> Reader -> Reader -> Reader -> R.Reader

    try ( OutputStream out = Files.newOutputStream( Paths.get( "text.txt" ) );
          Writer osw = new OutputStreamWriter( out, UTF_8 ) ) {
      osw.write( "Hallo →" );
      osw.write( " Welt!" );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    try ( InputStream is = Files.newInputStream( Paths.get( "text.txt" ) );
          Reader osw = new InputStreamReader( is, UTF_8 );
          BufferedReader br = new BufferedReader( osw ) ) {
      System.out.println( br.readLine() );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}