package de.tutego.appliances;

/**
 * Lernziel: Schnittstellen (Interfaces)
 * - Möglichkeiten von abstrakten Klassen und Schnittstellen im Vergleich
 * - Deklaration von Schnittstellen, Schlüsselwort `interface`
 * - Implementierung von Schnittstellen
 * - "Mehrfachvererbung" bei Schnittstellen
 * - Markierungsschnittstellen
 * - Erweitern von Schnittstellen
 * - Statische Methoden in Schnittstellen
 * - Default-Methoden
 *
 * @see SealedClasses
 */
public class Interfaces {
  public static void main( String[] args ) {
    // class Circle2 extends BaseCoordinates implements HasArea, HasPerimeter
    Circle2 circle1 = new Circle2();
    BaseCoordinates circle2 = new Circle2();
    HasArea circle3 = new Circle2();
    HasPerimeter circle4 = new Circle2();
    Object circle5 = new Circle2();

    if ( circle1 instanceof IsRound ) {

    }

    CharSequence x = new RepeatingCharacters( 10, 'x' );
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append( "Hallo" );
    stringBuilder.append( x );
    stringBuilder.append( "Welt" );
    System.out.println( stringBuilder );

    /*
    Gemeinsamkeit Schnittstelle und (abstrakte) Klasse:
    	abstrakte Methoden
    	private sowie öffentliche konkrete Methoden (sogenannte Default-Methoden)
    	private sowie öffentliche statische Methoden
    	Konstanten
    	geschachtelte Typen, wie Aufzählungen
    */
    /*
    Was Schnittstellen nicht haben/können:
    	Objektattribute
    	Konstruktoren
    	Alle Sichtbarkeiten
     */
  }
}

//abstract class HasArea {
//  abstract double area();
//}

interface HasArea {
  double area();

  private static double max() {
    return 1000;
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
  // 1. abstract boolean isBig();

  @Override default boolean isBig() {
    return HasArea.super.isBig();
  }
}

interface IsRound {

}

class BaseCoordinates {
  double x, y;
}

class Circle2 extends BaseCoordinates implements HasAreaAndPerimeter, IsRound {
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

class Rectangle2 implements HasArea {

  @Override public double area() {
    return 0;
  }
}

class RepeatingCharacters implements CharSequence {

  private final int length;
  private final char c;

  public RepeatingCharacters( int length, char c ) {
    this.length = length;
    this.c = c;
  }

  @Override public int length() {
    return length;
  }

  @Override public char charAt( int index ) {
    return c;
  }

  @Override public CharSequence subSequence( int start, int end ) {
    return null;
  }

  @Override public String toString() {
    return super.toString();
  }
}