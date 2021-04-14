package de.tutego.javaselib;

import java.util.Currency;
import java.util.Locale;

/**
 * Lernziel: Sprachen, Länder, Währungen
 * - `Locale`
 * - `Currency`
 *
 * @see Base64Demo
 */
public class LocaleCurrency {
  public static void main( String[] args ) {
    Locale german = Locale.GERMAN;
    System.out.println( german.getLanguage() );
    System.out.println( german.getCountry() );
    System.out.println( german.getDisplayName() );
    System.out.println( german.getDisplayCountry() );

    for ( Locale locale : Locale.getAvailableLocales() ) {
      System.out.printf( "%s %s %s %s%n", locale, locale.getLanguage(),
                         locale.getDisplayLanguage( Locale.CANADA_FRENCH ), locale.getDisplayCountry( Locale.CHINA ) );
    }

    System.out.println( Locale.getDefault() );

    System.out.printf( Locale.CANADA, "%,f%n", Math.random() * 100000 );
    System.out.printf( Locale.CHINA, "%,f%n", Math.random() * 100000 );
    System.out.printf( Locale.GERMANY, "%,f%n", Math.random() * 100000 );

    // Currency

    for ( Currency availableCurrency : Currency.getAvailableCurrencies() ) {
      System.out.println( availableCurrency.getCurrencyCode() );
      System.out.println( availableCurrency.getDisplayName() );
    }
  }
}