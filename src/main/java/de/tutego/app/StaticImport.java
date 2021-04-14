package de.tutego.app;

import java.awt.*;

import static java.lang.Math.PI;
import static java.lang.Math.random;
import static java.lang.System.out;

/**
 * Lernziel: Statische Imports
 * - `import static`
 *
 * @see de.tutego.array.FirstArray
 */
public class StaticImport {

//  static void random(int l) {
//
//  }

  public static void main( String[] args ) {

    // java.awt.Point p;
    Point p;

    out.println( PI * random() );
  }
}
