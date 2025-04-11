package com.tutego.generics;

import java.io.Serializable;

public class BoundedTypeParameters {
  public static void main( String[] args ) {
    System.out.println( random( "Hello", "World" ) );
    System.out.println( random( "Hello", "World" ) );
    System.out.println( random( "Hello", "World" ) );
    System.out.println( random( "Hello", "12.2" ) );
    System.out.println( random( "Hello", new StringBuilder( "12.2" ) ) );
  }

  //  static <T> T random( T m, T n ) {
  //    return Math.random() > 0.5 ? m : n;
  //  }

  //  static <T extends CharSequence> int random( T m, T n ) {
  //    return Math.random() > 0.5 ? m.length() : n.length();
  //  }

  //  static <T extends CharSequence & Serializable> int random( T m, T n ) {
  //    return Math.random() > 0.5 ? m.length() : n.length();
  //  }

  static <T extends Object & CharSequence & Serializable> int random( T m, T n ) {
    return Math.random() > 0.5 ? m.length() : n.length();
  }

}
