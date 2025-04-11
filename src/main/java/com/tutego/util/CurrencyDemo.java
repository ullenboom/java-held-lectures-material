package com.tutego.util;

import java.util.Currency;
import java.util.Locale;
import java.util.Set;

public class CurrencyDemo {
  public static void main( String[] args ) {

    Set<Currency> currencies = Currency.getAvailableCurrencies();
    for ( Currency currency : currencies ) {
      System.out.println(
          currency.getCurrencyCode() + " " + currency.getDisplayName() + " " + currency.getSymbol()
      );

      System.out.println(
          currency.getCurrencyCode() + " " + currency.getDisplayName(
              Locale.FRENCH ) + " " + currency.getSymbol( Locale.FRENCH )
      );
      System.out.println("-----------------------");
    }

  }
}