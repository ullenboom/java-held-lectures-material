package com.tutego.util;

import java.util.Base64;
import java.util.HexFormat;

public class Base64Demo {
  public static void main( String[] args ) {
    /*
     3 byte -> four 6 bit blocks
     using 64 ASCII characters: A–Z, a–z, 0–9, +, /
     optional padding with =
    */

    byte[] bytes1 = { 10, 100, (byte) 200 };
    System.out.println( Base64.getEncoder().encodeToString( bytes1 ) ); // CmTI

    byte[] bytes2 = { 10, 100, (byte) 200, 12 };
    System.out.println( Base64.getEncoder().encodeToString( bytes2 ) ); // CmTIDA==
    System.out.println( Base64.getEncoder().withoutPadding().encodeToString( bytes2 ) ); // CmTIDA

    byte[] cmTIDAS = Base64.getDecoder().decode( "CmTIDA" );
    for ( byte b : cmTIDAS ) {
      System.out.println( Byte.toUnsignedInt( b ) );
    }

    System.out.println( HexFormat.of().formatHex( cmTIDAS ) );  // 0a64c80c


  }
}
