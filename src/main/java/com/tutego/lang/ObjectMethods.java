package com.tutego.lang;

import java.awt.*;

public class ObjectMethods {
  public static void main( String[] args ) {
    Object o1 = new Point();
    Object o2 = "string";

    // toString()

    String s1 = o1.toString();
    String s2 = o2.toString();
    System.out.println( s1 ); // java.awt.Point[x=0,y=0]
    System.out.println( s2 ); // string
    System.out.println( new StringBuilder( "sb" ) );
    System.out.println( Integer.valueOf( 12 ) );

    // equals(...)

    System.out.println( o1.equals( o1 ) );
    System.out.println( o1.equals( null ) );
    System.out.println( o1.equals( o2 ) );

    // getClass()

    Class<?> o1Class = o1.getClass();
    Class<?> o2Class = o2.getClass();
    System.out.println( o1Class == o2Class );  // false

    System.out.println( o1Class );                  // class java.awt.Point
    System.out.println( o1Class.getName() );        // java.awt.Point
    System.out.println( o1Class.getSimpleName() );  // Point
  }
}
