package de.tutego.appliances;

import java.awt.*;
import java.util.Objects;

/**
 * Lernziel: Records deklarieren und nutzen (Java 16)
 *
 * @see de.tutego.exception.Exceptions
 */
public class RecordDemo {
  public static void main( String[] args ) {
    City city = new City( "Gothic", 234534, 8374, new Location( 324, 34 ) );
    System.out.println( city.area() );
  }
}

record City(
    String name,
    double population,
    int area,
    Location center
) {
  City {
    Objects.requireNonNull( name );
    Objects.requireNonNull( center );
  }
}

record Location(int x, int y) {
  @Override public String toString() {
    return x + "," + y;
  }

  @Override public int x() {
    System.out.println( "Access" + x );
    return x;
  }

  java.awt.Point toPoint() {
    return new Point( x, y );
  }

  static void foo() {
  }

}