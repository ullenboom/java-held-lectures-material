package de.tutego.appliances;

/**
 * Lernziel: Versiegelte Klassen und Schnittstellen (Sealed Classes/Interfaces)
 * - Zusammenfassung verschiedener Typen
 * - Schlüsselwörter `sealed` und `permits`
 * - Anforderungen an die Unterklassen/implementierende Klassen
 * - Kontextuelles Schlüsselwort `non-sealed`
 *
 * @see RecordDemo für nächsten Abschnitt
 */
public class SealedClasses {
  static Result bake() {return new Success();}

  public static void main( String[] args ) {
    Result result = bake();
    //    if ( result instanceof Success success ) { }
    //    else if ( result instanceof Failure failure) {}

    // JEP 406
    //    switch ( result ) {
    //      case Success success ->  {}
    //      case Failure failure -> {}
    //    }
  }
}

abstract sealed class Result permits Failure, Success {
  Object body;
}

final class Success extends Result {

}

non-sealed class Failure extends Result {
  int failureCode;
}

sealed interface Happy {
  void smile();
  public static final class SuperHappy implements Happy {
    @Override public void smile() {

    }
  }
}