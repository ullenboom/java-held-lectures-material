package com.tutego.time;

import java.time.*;

public class DateTimeAPI {
  public static void main( String[] args ) {
    /*
    Type             	  Year   Month	Day  Hours	Min.	Sec.	Zone Offset	  Zone ID
    ====================================================================================
    LocalDate						 ✔      ✔     ✔
    LocalTime                                ✔     ✔    ✔
    LocalDateTime        ✔      ✔     ✔     ✔     ✔    ✔

    OffsetTime                               ✔     ✔    ✔        ✔
    OffsetDateTime       ✔      ✔     ✔     ✔     ✔    ✔        ✔
    ZonedDateTime        ✔      ✔     ✔     ✔     ✔    ✔        ✔          ✔
    */

    //    System.out.println( LocalDate.now() );
    //    System.out.println( LocalTime.now() );
    //    System.out.println( LocalDateTime.now() );

    LocalDate bdayJamesTKirk = LocalDate.of( 2233, Month.MARCH, 22 );
    System.out.println( bdayJamesTKirk );
    System.out.println( bdayJamesTKirk.getDayOfMonth() );
    System.out.println( bdayJamesTKirk.getDayOfWeek() );
    System.out.println( bdayJamesTKirk.getMonthValue() );
    System.out.println( bdayJamesTKirk.getYear() );

    System.out.println( bdayJamesTKirk.withMonth( 2 ) );

    System.out.println( LocalDate.now() );
    System.out.println( LocalDate.now().plusYears( 1 ) );

    LocalDateTime localDateTime = bdayJamesTKirk.atTime( 0, 0 );
    System.out.println( localDateTime );

    OffsetDateTime offsetDateTime = localDateTime.atOffset( ZoneOffset.ofHours( +2 ) );
    System.out.println(offsetDateTime);

    ZonedDateTime zonedDateTime = localDateTime.atZone( ZoneId.of( "Europe/Berlin" ) );
    System.out.println(zonedDateTime);
  }
}
