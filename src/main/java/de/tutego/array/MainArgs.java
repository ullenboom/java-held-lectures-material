package de.tutego.array;

import java.math.BigInteger;

/**
 * Lernziel: main(String[] args)
 * - Parameter von der Kommandozeile entgegennehmen
 *
 * @see de.tutego.string.CharCharacterStringStringBuilder
 */
public class MainArgs {
  public static void main( String[] args ) {
    System.out.println( args.length );
    for ( String arg : args ) {
      BigInteger prime = new BigInteger( arg );
      System.out.println( prime.isProbablePrime( 100 ) );
    }
  }
}
