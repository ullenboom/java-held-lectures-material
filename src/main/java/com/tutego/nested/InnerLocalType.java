package com.tutego.nested;

import java.util.Locale;
import java.util.function.Predicate;

public class InnerLocalType {

  public static void main( String[] args ) {
    class EmptyPredicate implements Predicate<String> {
      @Override public boolean test( String s ) {
        return s.isEmpty();
      }
    }

    Predicate<String> contains = contains( ".txt" );
    System.out.println( contains.test( "filename.txt" ) );

    //    Predicate<String> emptyPredicate = new EmptyPredicate();
    //    List<String> list = new ArrayList<>();
    //    list.removeIf( emptyPredicate );

    enum E {
      A, B
    }

    record R( ) {}
  }

  public static Predicate<String> contains( String string ) {
    // string is effective final
    String string2 = string.toLowerCase( Locale.ROOT );
    class ContainsPredicate implements Predicate<String> {
      @Override public boolean test( String s ) {
        return s.toLowerCase( Locale.ROOT ).contains( string2 );
      }
    }
    return new ContainsPredicate();
  }
}
