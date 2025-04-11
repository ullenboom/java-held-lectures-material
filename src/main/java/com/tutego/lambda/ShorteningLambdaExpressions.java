package com.tutego.lambda;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class ShorteningLambdaExpressions {
  public static void main( String[] args ) {

    Predicate<String> isEmpty = ( String s ) -> {return s.isEmpty();};
    Comparator<String> trimmedComparator = ( String s1, String s2 ) -> {
      return s1.trim().compareTo( s2 );
    };
    Consumer<String> consumer = ( String s ) -> {System.out.println( s );};

    // Type Inference (Implicit Type)

    Predicate<String> isEmpty2 = ( s ) -> {return s.isEmpty();};
    Comparator<String> trimmedComparator2 = ( s1, s2 ) -> {
      return s1.trim().compareTo( s2 );
    };
    Consumer<String> consumer2 = ( s ) -> {System.out.println( s );};

    // Lambda is a single Expression or a Block
    // -> {return Expression; } => -> Expression

    Predicate<String> isEmpty3 = ( s ) -> s.isEmpty();
    Comparator<String> trimmedComparator3 = ( s1, s2 ) -> s1.trim().compareTo( s2 );
    Consumer<String> consumer3 = ( s ) -> System.out.println( s );  // void compatible

    // Single Identifier

    Predicate<String> isEmpty4 = s -> s.isEmpty();
    Comparator<String> trimmedComparator4 = ( s1, s2 ) -> s1.trim().compareTo( s2 );
    Consumer<String> consumer4 = s -> System.out.println( s );  // void compatible

    // From long to short

    List<String> names = new ArrayList<>();
    names.removeIf( ( String s ) -> {return s.isEmpty();} );
    names.removeIf( ( s ) -> {return s.isEmpty();} );
    names.removeIf( ( s ) -> s.isEmpty() );
    names.removeIf( s -> s.isEmpty() );

    names.forEach( s -> System.out.println( s ) );

    // Unused Lambda Parameters

    names.forEach( _ -> System.out.println( LocalTime.now() ) );
  }
}