package com.tutego.language;

public class SealedClasses {
  static Result bake() {
    return new Success();
  }

  public static void main( String[] args ) {
    /*
    Types in Java and purposes:

     int, double ...
     classes, unlimited instances, unlimited subclasses
     enum
     interfaces, unlimited implementations
     abstract class must have subclass
     final classes does not have a subclass
     records have no subclasses
*/
    Result result = bake();
    //    if ( result instanceof Success success ) {
    //    }
    //    else if ( result instanceof Failure failure ) {
    //      // failure.failureCode
    //    }
    // https://openjdk.org/jeps/441 (JEP 441: Pattern Matching for switch) since Java 21
    switch ( result ) {
      case Success success -> {
      }
      case Failure failure -> {
      }
      // default -> {}
    }
  }
}

abstract sealed class Result /*permits Failure, Success*/ {
  Object body;
}

final class Success extends Result {
}

/*final*/ non-sealed class Failure extends Result {
  int failureCode;
}

sealed interface Happy {
  void smile();

  //  final class SuperHappy implements Happy {
  //    @Override public void smile() {
  //    }
  //  }
  record SupperHappy( ) implements Happy {

    @Override public void smile() {

    }
  }
}