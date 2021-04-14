package de.tutego.nested;

import java.util.function.Predicate;

/**
 * Lernziel: Statischer geschachtelter Typ
 * - Deklaration und Voraussetzungen
 *
 * @see NestedInnerType
 */
public class StaticNestedTypes {
  static String PATTERN = "%s%n";
  public static class NonNull implements Predicate<Object> {

//    interface C {}

    @Override public boolean test( Object o ) {
      System.out.printf( PATTERN, o );
      return o != null;
    }
  }

  public static void main( String[] args ) {
    de.tutego.nested.StaticNestedTypes.NonNull predicate = new NonNull();
  }
}

class Database {
  static enum Status {
    OK, FAILURE
  }
}

class Network {
  enum Status {
    OK, FAILURE, TIMEOUT
  }
}