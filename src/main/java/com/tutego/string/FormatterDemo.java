package com.tutego.string;

import java.util.Formatter;
import java.util.Locale;

public class FormatterDemo {
  public static void main( String[] args ) {

    // System.[out|err].printf

    //    System.out.printf( "%d %g %s%n", 12, 12.3333, 12 );
    //    System.out.printf( "%d %g %s%n", 12, 12.3333, "asdfasdf" );
    //    System.out.printf( "%d %g %s%n", 12, 12.3333, new Point() );

    // String.format

    //    String format = String.format( "%d %g %s%n", 12, 12.3333, 12 );
    //    System.out.println( format );

    // String formatted

    //    System.out.println( "%d %g %s%n".formatted( 12, 12.3333, 12 ) );

    System.out.printf( "%d|%d%n", 12, -12 );
    System.out.printf( "%5d|%5d%n", 12, -12 );
    System.out.printf( "%05d|%05d%n", 12, -12 );
    System.out.printf( "%+05d|%05d%n", 12, -12 );
    System.out.printf( "%+-5d|%-5d%n", 12, -12 );

    //    System.out.printf( "%f|%f%n", Math.random() * 10_000, Math.random() * 10_000 );
    //    System.out.printf( "%.2f|%.0f%n", Math.random() * 10_000, Math.random() * 10_000 );
    System.out.printf( "%f|%f%n", 999.999999, -999.999999 );
    System.out.printf( "%.2f|%.0f%n", 999.999999, -999.999999 );
    System.out.printf( "%010.2f|%010.0f%n", 999.999999, -999.999999 );
    System.out.printf( "%10.2f|%10.0f%n", 999.999999, -999.999999 );

    System.out.printf( Locale.CANADA, "%10.2f|%10.0f%n", 999.999999, -999.999999 );
    System.out.printf( Locale.CANADA_FRENCH, "%10.2f|%10.0f%n", 999.999999, -999.999999 );

    String xmas = "Happy Xmas!";
    System.out.printf( "|%s|%n", xmas );
    System.out.printf( "|%S|%n", xmas );
    System.out.printf( "|%20s|%n", xmas );
    System.out.printf( "|%-20s|%n", xmas );
    System.out.printf( "|%20.9s|%n", xmas );
    System.out.printf( "|%-20.9s|%n", xmas );

    //    System.out.printf( "%s <> %s%n", "'", "'" );
    System.out.printf( "%1$s %2$s %1$s%n", "%", "<>" );

    // Formatter

    // String.format( "" );  -> using Formatter internally

    Formatter formatter = new Formatter();
    formatter.format( "%1$s %2$s %1$s", "%", "<>" );
    formatter.format( "|%-20.9s|%n", xmas );
    //    Appendable out = formatter.out();
    System.out.println( formatter );

  }
}
