package com.tutego.util;

import java.util.Optional;

public class JavaFunctionalOptional {
  public static void main( String[] args ) {
    Company company = new Company();

    // What is the boss' first appointment?

    //    String entry = company.boss().secretary().calendar().firstEntryOfDay();
    //    //             --------------
    //    //                           ------------ ...
    //
    //    if ( company.boss() != null ) {
    //      if ( company.boss().secretary() != null ) {
    ////        ...
    //      }
    //    }

    //    if ( company.boss().isPresent() ) {
    //      if ( company.boss().get().secretary().isPresent() ) {
    //        // ....
    //      }
    //    }

    // Optional<empty> --> Optional<empty>
    // Optional<X>     --> Optional<Y>
    // Optional<X>     --> Optional<empty>

    // Optional<Boss>  --> Optional<Secretary>
    //    Optional<Secretary> secretary = company.boss().flatMap( boss -> boss.secretary() );

//    company.boss().flatMap( Boss::secretary )
//           .flatMap( Secretary::calendar )
//           .flatMap( Calendar::firstEntryOfDay )
//           .filter( s -> !s.isEmpty() )
//           //           .or( () -> Optional.of( "Yoga" ) );
//           //           .orElse( "Y"+"oga" );
//           // .orElseGet( () -> "Y"+"oga" );
//           .orElseThrow( () -> new IllegalStateException( "Missing calender entry" ) );
  }
}

class Company {
  private Boss boss;

  Optional<Boss> boss() {
    return Optional.ofNullable( boss );
  }
}

class Boss {
  private Secretary secretary;

  Optional<Secretary> secretary() {
    return Optional.ofNullable( secretary );
  }
}

class Secretary {
  private Calendar calendar;

  Optional<Calendar> calendar() {
    return Optional.ofNullable( calendar );
  }
}

class Calendar {
  private String firstEntryOfDay = "";

  Optional<String> firstEntryOfDay() {
    return Optional.ofNullable( firstEntryOfDay );
  }
}
