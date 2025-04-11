package com.tutego.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class DateTimeFormatterDemo {
  public static void main( String[] args ) {

    // format

    LocalDate bdayJamesTKirk = LocalDate.of( 2233, Month.MARCH, 22 );
    System.out.println( bdayJamesTKirk.format( DateTimeFormatter.ISO_DATE ) ); // 2233-03-22

    // System.out.println( bdayJamesTKirk.format( DateTimeFormatter.ISO_LOCAL_DATE_TIME ) );
    // -> Exception in thread "main" java.time.temporal.UnsupportedTemporalTypeException: Unsupported field: HourOfDay

    System.out.println(
        bdayJamesTKirk.format( DateTimeFormatter.ofLocalizedDate( FormatStyle.SHORT ) )
    ); // 3/22/33

    System.out.println(
        bdayJamesTKirk.format( DateTimeFormatter.ofLocalizedDate( FormatStyle.MEDIUM ) )
    ); // Mar 22, 2233

    System.out.println(
        bdayJamesTKirk.format( DateTimeFormatter.ofLocalizedDate( FormatStyle.LONG ) )
    ); // March 22, 2233

    System.out.println(
        bdayJamesTKirk.format( DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL ) )
    );  // Friday, March 22, 2233

    System.out.println(
        bdayJamesTKirk.format( DateTimeFormatter.ofLocalizedDate( FormatStyle.FULL )
                                                .withLocale( Locale.FRENCH ) )
    );  // vendredi 22 mars 2233

    LocalDateTime localDateTime = bdayJamesTKirk.atStartOfDay();
    System.out.println( localDateTime.format(
        DateTimeFormatter.ofLocalizedDateTime( FormatStyle.FULL, FormatStyle.SHORT ) ) );
    // Friday, March 22, 2233, 12:00 AM

    for ( Locale locale : Locale.getAvailableLocales() ) {
      System.out.printf( "%s %s%n",
                         locale,
                         localDateTime.atZone( ZoneId.systemDefault() ).format(
                             DateTimeFormatter.ofLocalizedDateTime( FormatStyle.FULL )
                                              .withLocale( locale ) )
      );
    }

    // static parse(...)

    System.out.println( LocalDate.parse( "2233-03-22" ) );  // 2233-03-22

  }
}
