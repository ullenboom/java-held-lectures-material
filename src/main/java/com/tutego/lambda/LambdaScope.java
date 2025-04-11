package com.tutego.lambda;

import java.util.function.Predicate;

public class LambdaScope {
  public static void main( String[] args ) {
    //    String s = "";
    //    {
    //      String s = ""; // Variable 's' is already defined in the scope
    //    }

    /*final*/
    boolean shouldTrim = true;
    // shouldTrim = false;

    Predicate<String> isEmpty = s -> {
      System.out.println( 1 / 0 );
      // System.out.println( this );   -> 'com.tutego.lambda.LambdaScope.this' cannot be referenced from a static context
      return shouldTrim ? s.trim().isEmpty() : s.isEmpty();
    };

    Predicate<String> isEmpty2 = new Predicate<String>() {
      @Override public boolean test( String s ) {
        System.out.println( this );
        return shouldTrim ? s.trim().isEmpty() : s.isEmpty();
      }
    };

    isEmpty.test( "" );

  }

//  ... lambda$main$0(boolean shouldTrim) {
//    ...
//  }
}