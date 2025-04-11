package com.tutego.reflection;

import jdk.jshell.SourceCodeAnalysis;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class ClassObjectMetaData {
  public static void main( String[] args ) {
    List<Class<?>> classes = List.of(
        String.class, int.class, CharSequence.class, TimeUnit.class,
        SourceCodeAnalysis.Highlight.class, Map.Entry.class
    );
    for ( Class<?> aClass : classes ) {
      System.out.println( aClass.toString() );
      System.out.println( aClass.getSimpleName() );
      System.out.println( aClass.getName() );
      System.out.println( aClass.getCanonicalName() );
    }
  }
}
