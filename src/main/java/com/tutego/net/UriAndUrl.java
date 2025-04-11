package com.tutego.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class UriAndUrl {
  public static void main( String[] args ) throws MalformedURLException {

    // ------------------------- URI ------------------------------------------------

    /*
     URI = Uniform Resource Identifier
     isbn:478747474:ullenboom
    */

    URI uri = URI.create( "urn:isbn:096139210x" );
    System.out.println( uri.getScheme() );
    System.out.println( uri.getPath() );

    // ------------------------- URL ------------------------------------------------

     /*
      URL = Uniform Resource Locator
      https://en.wikipedia.org/wiki/Portal:Current_events
     */

    URL url = URI.create( "https://en.wikipedia.org/wiki/Portal:Current_events" ).toURL();
    try ( InputStream inputStream = url.openStream() ) {
      Scanner scanner = new Scanner( inputStream, StandardCharsets.UTF_8 );
      while ( scanner.hasNextLine() ) {
        System.out.println( scanner.nextLine() );
      }
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}
