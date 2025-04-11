package com.tutego.oop;

import java.awt.*;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;
// import static java.lang.StrictMath.random;

public class StaticImport {

  // static void random() {}

  public static void main( String[] args ) {

    // java.awt.Point p;
    Point p;   // + import java.awt.*;

    // Math.random();
    out.println( PI * random() );
  }
}
