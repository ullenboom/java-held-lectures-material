package com.tutego.reflection;

import java.awt.*;

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
      throw new RuntimeException( e );
    }

    //

    Object o1 = "";
    Object o2 = new Point();
    System.out.println( o1.getClass() == o2.getClass() ); // false

    System.out.println( o1.getClass().getClassLoader() );  // null
  }
}
