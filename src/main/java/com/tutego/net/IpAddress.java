package com.tutego.net;

import java.io.IOException;
import java.net.InetAddress;

public class IpAddress {
  public static void main( String[] args ) throws IOException {
//    InetAddress inetAddress = InetAddress.getByName( "tutego.com" );
    InetAddress inetAddress = InetAddress.getByName( "200.190.9.30" );
    System.out.println( inetAddress.isReachable( 1000 ) );
    System.out.println( inetAddress );
  }
}