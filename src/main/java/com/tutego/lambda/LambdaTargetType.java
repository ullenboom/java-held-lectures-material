package com.tutego.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaTargetType {
  public static void main( String[] args ) {

    // Object isEmpty = s -> s.isEmpty();
    Predicate<String> isEmpty = s -> s.isEmpty();

    List<String> names = new ArrayList<>();
    names.removeIf( s -> s.isEmpty() );

    Callable<String> callable = () -> {return "";};
    Supplier<String> supplier = () -> {return "";};

    foo( callable );
    foo( supplier );
    foo( (Supplier<String>) (() -> {return "";}) );
  }

  static void foo( Supplier<String> supplier ) {}

  static void foo( Callable<String> callable ) {}
}
