package de.tutego.string;

import java.util.Scanner;

/**
 * Lernziel: Klasse `StringBuilder`
 * - Kaskadieren der `StringBuilder`-Methoden
 * - Kapazität
 *
 * @see FormatAndParse
 */
public class StringBuilderClass {
  public static void main( String[] args ) {
//
//    String string = new StringBuilder().append( "Hallo Welt " ).append( 23 ).append( "." ).toString();
//    System.out.println( string );

    // Kapazität
//    StringBuilder stringBuilder = new StringBuilder();
//    System.out.println(stringBuilder.length());    // 0
//    System.out.println(stringBuilder.capacity());  // 16
//    stringBuilder.append( "Hallo" );
//    System.out.println(stringBuilder.length());    // 5
//    System.out.println(stringBuilder.capacity());  // 16
//    stringBuilder.append( "Hallo Hallo Hallo Hallo Hallo Hallo" );
//    System.out.println(stringBuilder.length());    // 40
//    System.out.println(stringBuilder.capacity());  // 40        length <= capacity
//    stringBuilder.append( '1' );
//    System.out.println(stringBuilder.length());    // 41
//    System.out.println(stringBuilder.capacity());  // 81
//    stringBuilder.delete( 0, stringBuilder.length()/2 );
//    System.out.println(stringBuilder);
//    System.out.println(stringBuilder.length());    // 21
//    System.out.println(stringBuilder.capacity());  // 82
//    stringBuilder.trimToSize();
//    System.out.println(stringBuilder.length());    // 21
//    System.out.println(stringBuilder.capacity());  // 21

    StringBuilder string = new StringBuilder();

    String line;
    do {
      line = new Scanner( System.in ).nextLine();
      string.append( line ).append( '\n' );
    } while (! line.isEmpty());

    System.out.println(string);
  }
}
