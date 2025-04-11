package com.tutego.language.interfaces;

public class Interfaces {
  public static void main( String[] args ) {

    // Circle extends BaseCoordinates implements HasArea, HasPerimeter
    Circle circle1 = new Circle();
    BaseCoordinates circle2 = new Circle();
    HasArea circle3 = new Circle();
    HasPerimeter circle4 = new Circle();
    Object circle5 = new Circle();

    /*
    Shared Characteristics of Interfaces and Abstract Classes:

    - Abstract methods
    - Instance methods in classes and default methods in interfaces
    - Static methods
    - Constants
    - Nested types (e.g., enumerations, records)
     */
    /*
    Characteristics Exclusive to Abstract Classes:

    - Can have instance variables
    - Can have constructors
    - Can have any visibility for members (public, protected, package-private, private)
     */
  }
}

//abstract class HasArea {
//  abstract double area();
//}

interface HasArea {
  /*abstract public*/ double area();
}

interface HasPerimeter {
  double perimeter();
}

class BaseCoordinates {
  double x, y;
}

// class Circle extends HasArea {
class Circle extends BaseCoordinates implements HasArea, HasPerimeter {
  double radius;

  @Override public double area() {
    return radius * radius * Math.PI;
  }

  @Override public double perimeter() {
    return 2 * Math.PI * radius;
  }
}