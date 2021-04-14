package de.tutego.javaselib;

import de.tutego.lang.JavaUtilObjects;

import java.util.Base64;

/**
 * Lernziel: Base64-Encoding
 * - `Base64`-Klasse Encoder/Decoder
 *
 * @see DateTimeAPI
 */
public class Base64Demo {
  public static void main( String[] args ) {
    // 3 Byte -> vier 6-Bit-Blöcke für ASCII-Zeichen A–Z, a–z, 0–9, +, / und am Ende optional = (Padding)

    byte[] bytes = { 10, 100, (byte) 200, 12 };
    System.out.println( Base64.getEncoder().encodeToString( bytes ) );
    System.out.println( Base64.getEncoder().withoutPadding().encodeToString( bytes ) );

    for ( byte b : Base64.getDecoder().decode( "CmTIDA" ) ) {
      System.out.println( b );
    }
  }
}

