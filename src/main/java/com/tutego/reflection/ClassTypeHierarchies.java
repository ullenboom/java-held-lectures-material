package com.tutego.reflection;

public class ClassTypeHierarchies {
  public static void main( String[] args ) {

    Class<String> stringClass = String.class;
    Class<?>[] interfaces = stringClass.getInterfaces();

    for ( Class<?> anInterface : interfaces ) {
      System.out.println( anInterface );
    }

    System.out.println( stringClass.getSuperclass() );
  }
}
