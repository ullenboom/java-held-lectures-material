package de.tutego.appliances;

import java.awt.*;
import java.time.LocalDate;

/**
 * Lernziel: Konstruktoren schreiben
 * - Standard-Konstruktor
 * - Ordnung der Aufrufe
 * - Parametrisierte Konstruktoren
 * - `this(...)`-Weiterleitung
 * - Copy-Konstruktor
 * - Fabrikmethoden
 *
 * @see ObjectAndClassInitializer
 */
public class Constructors {
  public static void main( String[] args ) {
    Point point = new Point();
    Point point2 = new Point( 10, 20 );
    // new Math();
    TV tv = new TV();
    tv.on();

    Color c = new Color( 255, 0, 0 );

    LocalDate.of( 2022, 2, 22 );
  }
}
