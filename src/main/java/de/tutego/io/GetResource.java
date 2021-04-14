package de.tutego.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.file.Paths;

/**
 * Lernziel: Dateien aus dem Klassenpfad lesen
 * - Verzeichnisstruktur eines Maven-Projekts
 * - Wo ist die Wurzel?
 * - Klassenpfad
 * - `Class`-Objekte
 *
 * @see JavaIoFileAndJavaAwtDesktop
 */
public class GetResource {
  public void main() {
    URL resource = getClass().getResource( "/" );
  }

  public static void main( String[] args ) {
    System.out.println( Paths.get( "." ).toAbsolutePath() );
    URL resource = GetResource.class.getResource( "test.txt" );
    System.out.println( resource ); // file:/D:/Dropbox/Eigene_Dokumente/Java-Held/target/classes/de/tutego/io/

    URL resource2 = GetResource.class.getResource( "/de/tutego/io/test.txt" );
    System.out.println( resource2 ); // file:/D:/Dropbox/Eigene_Dokumente/Java-Held/target/classes/

    InputStream inputStream = GetResource.class.getResourceAsStream( "/de/tutego/io/test.txt" );
    if ( inputStream != null ) {
      try ( InputStreamReader inputStreamReader = new InputStreamReader( inputStream );
            BufferedReader bufferedReader = new BufferedReader( inputStreamReader ) ) {
        bufferedReader.lines().forEach( System.out::println );
      }
      catch ( IOException e ) {
        e.printStackTrace();
      }
    }
  }
}
