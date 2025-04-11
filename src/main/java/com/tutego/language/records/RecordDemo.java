package com.tutego.language.records;

import java.util.Objects;

public class RecordDemo {
  public static void main( String[] args ) {
    City city = new City( "Gothic", 234234, 34344.3, new Location( 10, 29 ) );
    System.out.println( city.area() );

    // new City( null, 111, 11, null );

    System.out.println( city ); // City[name=Gothic, population=234234, area=34344.3, center=10,29]

    System.out.println( new Location( 10, 10 ).equals( new Location( 10, 10 ) ) );
  }
}

record City(
    // Record Components
    String name,
    int population,
    double area,
    Location center
) {
  // int a;          Instance field is not allowed in record

  // Compact Constructor

  //  City {
  //    Objects.requireNonNull( name );
  //    Objects.requireNonNull( center );
  //  }

  // Canonical Constructor

  City( String name, int population, double area, Location center ) {
    this.name = Objects.requireNonNull( name );
    this.population = population;
    this.area = area;
    this.center = Objects.requireNonNull( center );
  }
}

record Location( int x, int y ) {

  public Location( java.awt.Point point ) {
    this( point.x, point.y );
  }

  java.awt.Point toPoint() {
    return new java.awt.Point( x, y );
  }

  @Override public int x() {
    System.out.println( "Access " + x );
    // x = 12;    Cannot assign a value to final variable 'x'
    return x;
  }

  static Location fromPoint( java.awt.Point point ) {
    return new Location( point.x, point.y );
  }

  @Override public String toString() {
    return x + "," + y;
  }
}