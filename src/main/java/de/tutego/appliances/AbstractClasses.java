package de.tutego.appliances;

/**
 * Lernziel: Abstrakte und Methoden
 * - Modifizierer `abstract`
 * - Abstrakte Klassen
 * - Abstrakte Methoden
 *
 * @see Interfaces
 */
public class AbstractClasses {
  public static void main( String[] args ) {
    /*
     finale Klasse  ⮜  normale Klasse  ⮞  abstrakte Klasse
     */
    Appliance appliance = Math.random() > 0.5 ? new Radio() : new FireAlarm();
    appliance.getType();

    Circle c = new Circle();
    c.radius = 12;
    Rectangle rectangle = new Rectangle();
    rectangle.height = 12;
    rectangle.width = 120;

    System.out.println(Form.sum( c, rectangle ));
  }
}

abstract class Form {
  abstract double area();

  static double sum( Form... forms ) {
    double result = 0;
    for ( Form form : forms ) {
      result += form.area();
    }
    return result;
  }
}

class Circle extends Form {
  double radius;

  @Override double area() {
    return radius * radius * Math.PI;
  }
}

class Rectangle extends Form {
  double width, height;

  @Override double area() {
    return width * height;
  }
}