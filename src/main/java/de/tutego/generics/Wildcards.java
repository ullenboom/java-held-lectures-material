package de.tutego.generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Wildcards
 * - Bounded Wildcards
 * - invariant
 * - PECS/LESS-Prinzip
 *
 * @see de.tutego.lambda.LambdaIntroPredicate
 */
public class Wildcards {
  public static void main( String[] args ) {
    List<Double> numbers = new ArrayList<>();
    numbers.add( 2345.345 );
    numbers.add( 25.35 );
    numbers.add( 2.34 );
    System.out.println(sum( numbers ));

//    List<Number> list = numbers;  // List<Double> ist kein Untertyp von List<Number>
//    list.add( 12 );

    // Generics sind nicht kovariant, sondern invariant

    // void shuffle(List<?> list)

    // public static <T>     T min(Collection<? extends T> coll, Comparator<? super T> comp)

    // <T> boolean addAll(Collection<? super T> c, T... elements)

    // PECS = Producer extends / consumer super
    // LESS = Lesen = extends / schreiben = super

  }

//  static <T extends Number> double sum( List<T> numbers ) {
//    double sum = 0;
//    for ( T number : numbers ) {
//      sum += number.doubleValue();
//    }
//    return sum;
//  }

  static double sum( List<? extends Number> numbers ) {
    double sum = 0;
    for ( Number number : numbers ) {
      sum += number.doubleValue();
    }
    return sum;
  }

}
