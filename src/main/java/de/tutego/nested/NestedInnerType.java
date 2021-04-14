package de.tutego.nested;

import java.util.function.Predicate;

/**
 * Lernziel: Innere Mitgliedsklasse
 * - Deklaration und Voraussetzungen
 * - `this`
 *
 * @see LocalInnerType
 */
public class NestedInnerType {
  public static void main( String[] args ) {
//    StringPredicate stringPredicate1 = new StringPredicate( ".txt" );
//    Predicate<String> endsWithPredicate1 = stringPredicate1.new EndsWithPredicate();
//    Predicate<String> containsPredicate1 = stringPredicate1.new ContainsPredicate();

    Predicate<String> endsWithPredicate2 = new StringPredicate( ".bak" ).new EndsWithPredicate();
    Predicate<String> containsPredicate2 = new StringPredicate( ".bak" ).new ContainsPredicate();
  }
}

class StringPredicate {
  final String string;
  public StringPredicate( String string ) {
    this.string = string;
    // new ContainsPredicate();
  }
  class ContainsPredicate implements Predicate<String> {
    @Override public boolean test( String string ) {
      return string.contains( StringPredicate.this.string );
    }
  }
  class EndsWithPredicate implements Predicate<String> {
    @Override public boolean test( String s ) {
      return s.endsWith( string );
    }
  }
}