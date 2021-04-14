package de.tutego.io;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;
import java.util.Collections;

/**
 * Lernziel: Klassen `File` und `Desktop`
 * - `java.io.File`-Klasse und Nutzer
 * - Mit Dateiendungen assoziierte Programme öffnen
 *
 * @see JavaIoRandomAccessFile
 */
public class JavaIoFileAndJavaAwtDesktop {
  public static void main( String[] args ) throws IOException {

    String html = "<body><strong>" + LocalDateTime.now() + "</strong></body>";
    Path path = Files.createTempFile( "", ".html" );
    System.out.println( path );
    Files.write( path, Collections.singletonList( html ) );

    //

    Desktop desktop = Desktop.getDesktop();
    if ( desktop != null ) {
      desktop.open( path.toFile() );
    }
  }
}