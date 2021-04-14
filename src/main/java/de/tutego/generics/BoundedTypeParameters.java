package de.tutego.generics;

import java.io.Serializable;

/**
 * Lernziel: Typeinschränkungen (Bounded Type Parameters)
 * - Mehrere Typeinschränkungen einsetzen
 *
 * @see Wildcards
 */
public class BoundedTypeParameters {

  //  static <T> T random( T m, T n ) {
  //    return Math.random() > 0.5 ? m : n;
  //  }

  static <T extends Object & CharSequence & Serializable> int random( T m, T n ) {
    return Math.random() > 0.5 ? m.length() : n.length();
  }

  public static void main( String[] args ) {
    System.out.println( random( "Hallo", new StringBuffer() ) );
  }
}
