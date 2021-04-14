package de.tutego.net;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Lernziel: IP-Adressen, Namensauflösung, Erreichbarkeit
 * - `InetAddress` und Unterklassen
 *
 * @see URIandURL
 */
public class IpAddress {
  public static void main( String[] args ) throws IOException {
    InetAddress inetAddress = InetAddress.getByName( "200.190.9.30" );
    System.out.println( inetAddress );
    System.out.println( inetAddress.isReachable( 1000 ) );
  }
}