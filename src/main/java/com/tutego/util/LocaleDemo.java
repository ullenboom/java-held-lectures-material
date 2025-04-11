package com.tutego.util;

import java.util.Locale;
import java.util.Scanner;

public class LocaleDemo {
  public static void main( String[] args ) {

    Locale french = Locale.FRENCH;
    System.out.println( french.getLanguage() );      // fr
    System.out.println( french.getDisplayCountry() );
    System.out.println( french.getCountry() );
    System.out.println( french.getDisplayName() );   // French

    Locale france = Locale.FRANCE;
    System.out.println( france.getLanguage() );       // fr
    System.out.println( france.getDisplayCountry() ); // France
    System.out.println( france.getDisplayCountry( Locale.CHINESE ) ); // 法国
    System.out.println( france.getCountry() );        // FR
    System.out.println( france.getDisplayName() );    // French (France)
    System.out.println( france.getDisplayName( Locale.CHINESE ) );    // 法语 (法国)

    for ( Locale locale : Locale.getAvailableLocales() ) {
      System.out.println(
          locale + " " + locale.getDisplayCountry() + " " + locale.getDisplayLanguage() );
    }

    // Locale.setDefault( Locale.GERMANY );
    System.out.println( Locale.getDefault() );

    double rnd = Math.random() * 1000;
    System.out.println( rnd );
    System.out.printf( "%f%n", rnd );
    System.out.printf( Locale.CHINESE, "%f%n", rnd );
    System.out.printf( Locale.FRENCH, "%f%n", rnd );
    System.out.printf( Locale.GERMAN, "%f%n", rnd );

    double v = new Scanner( "12,3" ).useLocale( Locale.GERMAN ).nextDouble();
    System.out.println( v );
  }
}