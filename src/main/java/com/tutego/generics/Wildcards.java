package com.tutego.generics;

import java.util.List;

public class Wildcards {
  public static void main( String[] args ) {
    List<Double> numbers = List.of( 2345.34, 52345.2435, 345624. );
    System.out.println( sum( numbers ) );  // List<Double> != List<Number>

    // Generics are invariant not covariant
    //    List<Number> list = numbers;  // List<Double> not a subtype of List<Number>
    //    list.add( 12 );

    // Collections.shuffle(List<?> list)
    // Collections.shuffle( numbers );

    // <T> T min(Collection<? extends T> coll, Comparator<? super T> comp)
    // Collection<Point>  -> Comparator<Point>, Comparator<Object>

    // <T> boolean addAll(Collection<? super T> c, T... elements)
    //  Point1, Point2  -> Collection<Point>, Collection<Object>

    // PECS => Producer = extends, Consumer = super
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
