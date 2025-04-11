package com.tutego.nested;

import java.util.function.Predicate;

public class NestedStaticTypes {
  public static void main( String[] args ) {
    com.tutego.nested.NestedStaticTypes.NonNullPredicate predicate = new NonNullPredicate();
    // com.tutego.nested
    // Math.sin
    // "hello world".length()
  }

  static String PATTERN = "%s%n";

  public static class NonNullPredicate implements Predicate<Object> {

    //    static class C {}
    //    /* static */ interface I {}
    //    /* static */ record R() {}

    @Override public boolean test( Object o ) {
      System.out.printf( PATTERN, o );
      return o != null;
    }
  }
}

class Database {
  /* static */ enum Status {  // Modifier 'static' is redundant for inner enums
    OK, FAILURE
  }

}

class Network {
  enum Status {
    OK, FAILURE, TIMEOUT
  }
}