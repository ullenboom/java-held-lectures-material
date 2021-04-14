package de.tutego.nested;

import java.util.Locale;
import java.util.function.Predicate;

/**
 * Lernziel: Lokaler (innerer) Typ
 * - Variablenzugriffe
 * - effective final
 *
 * @see AnonymousInnerClass
 */
public class LocalInnerType {
  public static void main( String[] args ) {
    class EmptyPredicate implements Predicate<String> {
      @Override public boolean test( String s ) {
        return s.isEmpty();
      }
    }
    Predicate<String> foo = foo( ".txt" );
  }

  static public Predicate<String> foo( String string ) {
    String string2 = string.toLowerCase( Locale.ROOT );
    class ContainsPredicate implements Predicate<String> {
      @Override public boolean test( String s ) {
        return s.toLowerCase( Locale.ROOT ).contains( string2 );
      }
    }
    return new ContainsPredicate();
  }
}
