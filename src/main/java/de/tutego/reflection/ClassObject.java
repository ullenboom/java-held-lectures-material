package de.tutego.reflection;

import java.awt.*;

/**
 * Lernziel: `Class`-Objekt
 * - Verschiedene Möglichkeiten ein `Class`-Objekt zu erfragen
 * - `Class`-Objekte vergleichen
 *
 * @see ClassTypeHierarchies
 */
public class ClassObject {
  public static void main( String[] args ) {
    // 1.
    Class<String> x = String.class;
    System.out.println( x );
    System.out.println( int.class );
    System.out.println( String[].class );
    System.out.println( int[].class );

    // 2.
    System.out.println( "".getClass() );
    System.out.println( new Point().getClass() );

    // 3.
    try {
      Class<?> aClass = Class.forName( "java.lang.String" );

    }
    catch ( ClassNotFoundException e ) {
      e.printStackTrace();
    }

    //

    Object o1 = "";
    Object o2 = new Point();

    System.out.println( o1.getClass() == o2.getClass() );

    System.out.println( o1.getClass().getClassLoader() );
  }
}
