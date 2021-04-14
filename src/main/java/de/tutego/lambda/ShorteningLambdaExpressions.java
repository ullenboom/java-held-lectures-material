package de.tutego.lambda;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Lernziel: Lambda-Ausdrücke abkürzen
 * - Abkürzung 1: Typ-Inferenz (impliziter Typ)
 * - Abkürzung 2: Der Lambda-Rumpf ist entweder ein einzelner Ausdruck oder ein Block
 * - Abkürzung 3: Einzelner Identifizierer statt Parameterliste und Klammern
 * - void-kompatibel
 * - Unbenutzte Parameter in Lambda-Ausdrücken
 *
 * @see LambdaScope
 */
public class ShorteningLambdaExpressions {
  public static void main( String[] args ) {
    Predicate<String> isEmpty = ( String s ) -> {return s.isEmpty();};
    Comparator<String> trimmedComparator = ( String s1, String s2 ) -> { return s1.trim().compareTo( s2.trim() ); };
    Consumer<String> consumer = ( String s ) -> { System.out.println( s ); };

    // Typ-Inferenz (impliziter Typ)
    Predicate<String> isEmpty2 = ( s ) -> {return s.isEmpty();};
    Comparator<String> trimmedComparator2 = ( s1, s2 ) -> { return s1.trim().compareTo( s2.trim() ); };
    Consumer<String> consumer2 = ( s ) -> { System.out.println( s ); };

    // Der Lambda-Rumpf ist entweder ein einzelner Ausdruck oder ein Block
    // -> {return Ausdruck; } => -> Ausdruck
    Predicate<String> isEmpty3 = ( s ) -> s.isEmpty();
    Comparator<String> trimmedComparator3 = ( s1, s2 ) -> s1.trim().compareTo( s2.trim() );
    Consumer<String> consumer3 = ( s ) -> System.out.println( s );   // void-kompatibel

    // Einzelner Identifizierer statt Parameterliste und Klammern
    Predicate<String> isEmpty4 = s -> s.isEmpty();
    Comparator<String> trimmedComparator4 = ( s1, s2 ) -> s1.trim().compareTo( s2.trim() );
    Consumer<String> consumer4 = s -> System.out.println( s );   // void-kompatibel

    List<String> names = new ArrayList<>();
    names.removeIf( ( String s ) -> {return s.isEmpty();} );
    names.removeIf( ( s ) -> {return s.isEmpty();} );
    names.removeIf( ( s ) -> s.isEmpty() );
    names.removeIf( s -> s.isEmpty() );

    names.forEach( (__) -> System.out.println( LocalTime.now() ) );
  }
}