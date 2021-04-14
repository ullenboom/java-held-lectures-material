package de.tutego.string;

import java.util.*;

/**
 * Lernziel: Formatieren und Parsen von Zeichenfolgen
 * - Formatieren (Typ `XXX` -> `String`)
 * ► String.valueOf(...)
 * ► Wrapper-Methoden toXXXString(...)
 * ► String.format(...)
 * ► Formatter
 * ► StringJoiner
 * - Parsen und Zerlegen (`String` -> Typ `XXX`):
 * ► StringTokenizer
 * ► parseXXX(...)
 * ► Scanner
 *
 * @see TextBlocks
 */
public class FormatAndParse {
  public static void main( String[] args ) {
    //    String s = "" + 'a';
    //    System.out.println( s );
    //    String t = String.valueOf( 34.3434 );
    //    String s = Integer.toString( 12 );
    //    String t = Double.toString( 34.3434 );
    //    String u = Character.toString( 'd' );
    //    System.out.println(Integer.toString( 100 ));
    //    System.out.println(Integer.toString( 100, 2 ));
    //    System.out.println(Integer.toString( 106, 16 ));
    //    Long.toBinaryString( 100 );
    //    Long.toHexString( 100 );

    //    System.out.printf( "%d %g %s%n", 12, 12.3333, "Hallo" );
    //    String format = String.format( "%d %g %s%n", 12, 12.3333, "Hallo" );
    //    System.out.println( format );

    System.out.printf( "%d|%d%n", 12, -12 );
    System.out.printf( "%05d|%05d%n", 12, -12 );
    System.out.printf( "%+05d|%05d%n", 12, -12 );
    System.out.printf( "%+-5d|%-5d%n", 12, -12 );

    System.out.printf( "%f|%f%n", 999.9999, -999.9999 );
    System.out.printf( "%.2f|%.0f%n", 999.9999, -999.9999 );
    System.out.printf( "%010.2f|%010.0f%n", 999.9999, -999.9999 );
    System.out.printf( Locale.CANADA_FRENCH, "%10.2f|%10.0f%n", 999.9999, -999.9999 );

    String xmas = "Weihnachten";
    System.out.printf( "|%s|%n", xmas );
    System.out.printf( "|%S|%n", xmas );
    System.out.printf( "|%20S|%n", xmas );
    System.out.printf( "|%-20S|%n", xmas );
    System.out.printf( "|%20.9S|%n", xmas );
    System.out.printf( "|%-20.9S|%n", xmas );

    System.out.printf( "%1$s %2$s %1$s%n", "%", "INHALT" );

    // Formatter
    Formatter formatter = new Formatter();
    formatter.format( "%1$s %2$s %1$s", "%", "INHALT" );
    formatter.format( "|%-20.9S|%n", xmas );
    System.out.println( formatter );

    // StringJoiner
    StringJoiner stringJoiner = new StringJoiner( ".", "[", "]" );
    stringJoiner.add( "192" );
    stringJoiner.add( "168" );
    stringJoiner.add( "1" );
    stringJoiner.add( "1" );
    System.out.println( stringJoiner );

    // StringTokenizer
    StringTokenizer stringTokenizer = new StringTokenizer( "Hallo \t  Welt." );
    while ( stringTokenizer.hasMoreTokens() ) {
      System.out.println( stringTokenizer.nextToken() );
    }

    StringTokenizer stringTokenizer2 = new StringTokenizer( "key = value", "= " );
    System.out.println( stringTokenizer2.countTokens() );
    while ( stringTokenizer2.hasMoreTokens() ) {
      System.out.println( stringTokenizer2.nextToken() );
    }

    // parseXXX
    double sum = 0;
    StringTokenizer stringTokenizer3 = new StringTokenizer( "11.34345 1010.45456" );
    while ( stringTokenizer3.hasMoreTokens() ) {
      String number = stringTokenizer3.nextToken();
      sum += Double.parseDouble( number );
    }
    System.out.println( sum );

    // Scanner
    Scanner scanner = new Scanner( "12,1234 234 2354 45" );
//    scanner.useLocale( Locale.ENGLISH );
    while ( scanner.hasNextDouble() ) {
      System.out.println(scanner.nextDouble());
    }

    String colors = "255 0 0 rot 0 255 0 grün";
    Scanner colorScanner = new Scanner( colors );
    while ( colorScanner.hasNextInt() ) {
      int red = colorScanner.nextInt();
      int green = colorScanner.nextInt();
      int blue = colorScanner.nextInt();
      String colorName = colorScanner.next();
      System.out.printf( "rgb(%d, %d, %d)=%s%n", red, green, blue, colorName );
    }
  }
}
