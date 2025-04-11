package com.tutego.generics;

import java.util.List;

public class CreatingGenericsTypesGenericMethods {

  static <T> T firstOrElse( List<T> list, T defaultValue ) {
    if ( list == null || list.isEmpty() )
      return defaultValue;
    return list.getFirst();
  }
  //  static Object firstOrElse( List list, Object defaultValue ) {
  //    if ( list == null || list.isEmpty() )
  //      return defaultValue;
  //    return list.getFirst();
  //  }

  //  static String firstOrElse( List<String> list, String defaultValue ) {
  //    if ( list == null || list.isEmpty() )
  //      return defaultValue;
  //    return list.getFirst();
  //  }
  //
  //  static Point firstOrElse( List<Point> list, Point defaultValue ) {
  //    if ( list == null || list.isEmpty() )
  //      return defaultValue;
  //    return list.getFirst();
  //  }

  record Pair<T, U>( T first, U second ) {
  }

  public static void main( String[] args ) {

    /*
    raw type                            List, Predicate, Comparator
    parameterized type              	  List<String>, List<LocalDate>, Comparator<String>, Predicate<String>
    type argument               	      String, LocalDate

    generic type                        Pair<T>
    generic method                      <T> firstOrElse
    type parameter (aka type variable)  T
    */

    Pair<String, Double> pair1 = new Pair<>( "Hello", 12.3 );
    String first1 = pair1.first;
    Double second1 = pair1.second;
    Pair<Double, String> pair2 = new Pair<>( 12.3, "Hello" );
    Double first2 = pair2.first;
    String second2 = pair2.second;
  }
}
