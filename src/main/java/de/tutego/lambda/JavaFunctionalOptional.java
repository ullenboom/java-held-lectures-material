package de.tutego.lambda;

import java.util.Optional;

/**
 * Lernziel: Funktionale Programmierung mit `Optional`
 * - `ifPresent(...)`
 * - Oder-Alternativen
 * - `map(...)` und `flatMap(...)`
 *
 * @see JavaFunctionalComparator
 */
public class JavaFunctionalOptional {
  public static void main( String[] args ) {
    Company company = new Company();
    //    String entry = company.boss().secretary().calendar().firstEntryOfDay();
    //    if ( company.boss() != null ) {
    //      if ( company.boss().secretary() != null ) {
    ////        ....
    //      }
    //    }
    // Welchen ersten Termin hat der Boss?

    //    if ( company.boss().isPresent() ) {
    //      if ( company.boss().get().secretary().isPresent() ) {
    //
    //      }
    //    }

    // Optional<empty> --> Optional<empty>
    // Optional<X>     --> Optional<Y>
    // Optional<X>     --> Optional<empty>

    // Optional<Boss> -> Optional<Secretary>
    String maybeFirstEntryOfDay =
        company.boss().flatMap( Boss::secretary )
            .flatMap( Secretary::calendar )
            .flatMap( Calendar::firstEntryOfDay )
            .filter( s -> !s.isEmpty() )
            //            .or( () -> Optional.of( "Yoga" ) );
            // .orElse( "Yoga" );
            // .orElseGet( () -> "Yoga" );
            .orElseThrow( () -> new IllegalStateException( "Fehlender Kalendereintrag" ) );
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

  public Optional<Calendar> calendar() {
    return Optional.ofNullable( calendar );
  }
}

class Calendar {
  private String firstEntryOfDay = "";

  Optional<String> firstEntryOfDay() {
    return Optional.ofNullable( firstEntryOfDay );
  }
}
