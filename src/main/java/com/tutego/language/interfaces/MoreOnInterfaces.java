package com.tutego.language.interfaces;

public class MoreOnInterfaces {

  MoreOnInterfaces() {
    Circle circle = new Circle();
    if ( circle instanceof IsRound ) {
      // ...
    }
  }

  interface HasArea {

    /*static final*/ int MAX = 1000;

    double area();

    private static double max() {
      return MAX;
    }

    default boolean isBig() {
      return area() > max();
    }
  }

  interface HasPerimeter {
    double perimeter();

    boolean isBig();
  }

  interface HasAreaAndPerimeter extends HasArea, HasPerimeter {
    // abstract boolean isBig();

    @Override default boolean isBig() {
      return HasArea.super.isBig();
    }
  }

  // Marker Interface
  interface IsRound {

  }

  class BaseCoordinates {
    double x, y;
  }

  class Circle extends BaseCoordinates implements HasAreaAndPerimeter, IsRound {
    double radius;

    @Override public double area() {
      return radius * radius * Math.PI;
    }

    @Override public boolean isBig() {
      return false;
    }

    @Override public double perimeter() {
      return 2 * Math.PI * radius;
    }
  }

  class Rectangle implements HasArea {
    @Override public double area() {
      return 0;
    }
  }
}
