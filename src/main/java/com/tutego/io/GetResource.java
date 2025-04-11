package com.tutego.io;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class GetResource {

  static class Version {
    final String version;
    Version() {
      try ( InputStream stream = getClass().getResourceAsStream( "version.txt" ) ) {
        byte[] bytes = stream.readAllBytes();
        version = new String( bytes, StandardCharsets.UTF_8 );
      }
      catch ( IOException e ) {
        throw new RuntimeException( e );
      }
    }
  }

  public static void main( String[] args ) {

    //    System.out.println( Paths.get( "." ).toAbsolutePath() );
    //
    //    URL resource1 = GetResource.class.getResource( "version.txt" );
    //    System.out.println( resource1 );
    //    URL resource2 = GetResource.class.getResource( "/version.txt" );
    //    System.out.println( resource2 );

    System.out.println( new Version().version );
  }
}
