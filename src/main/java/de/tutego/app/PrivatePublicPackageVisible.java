package de.tutego.app;

import de.tutego.quote.QuotePrinter;

/**
 * Lernziel: Paketsichtbarkeit
 * - `public`, `private`
 * - Paketsichtbarkeit
 *
 * @see StaticImport
 */
public class PrivatePublicPackageVisible {
  public static void main( String[] args ) {
    //    Line.longLine();

//    Quote.quote();
    QuotePrinter.printQuote();
  }
}

class Line {
  private static void line() {
    System.out.println( "---" );
  }

  public static void longLine() {
    line();
    line();
  }
}