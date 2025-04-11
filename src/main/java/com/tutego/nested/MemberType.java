package com.tutego.nested;

import java.util.function.Predicate;

public class MemberType {
  public static void main( String[] args ) {
//    StringPredicate stringPredicate1 = new StringPredicate( ".txt" );
//    Predicate<String> endsWithPredicate1 = stringPredicate1.new EndsWithPredicate();
//    Predicate<String> containsPredicate1 = stringPredicate1.new ContainsPredicate();

    Predicate<String> endsWithPredicate2 = new StringPredicate( ".bak" ).new EndsWithPredicate();
    Predicate<String> containsPredicate2 = new StringPredicate( ".bak" ).new ContainsPredicate();
  }
}

record StringPredicate( String string ) {
  // new ContainsPredicate(); compiles

  class ContainsPredicate implements Predicate<String> {
    //  String string;
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

//class OuterRecord {
//  /* static */ record R() {
//
//  }
//}
