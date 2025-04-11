package com.tutego.reflection;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Field;
import java.util.StringJoiner;

public class DeclareNewAnnotationTypes {

  static class Song {
    @CsvColumn( "header" ) String title;
    @CsvColumn
    int duration;
  }

  static String csvHeader( Object o ) {
    StringJoiner stringJoiner = new StringJoiner( ";" );
    for ( Field field : o.getClass().getDeclaredFields() ) {
      CsvColumn annotation = field.getAnnotation( CsvColumn.class );
      if ( annotation != null ) {
        String fieldName = annotation.value().isEmpty() ? field.getName() : annotation.value();
        stringJoiner.add( fieldName );
      }
    }

    return stringJoiner.toString();
  }

  static String csvRow( Object o ) throws IllegalAccessException {
    StringJoiner stringJoiner = new StringJoiner( ";" );
    for ( Field field : o.getClass().getDeclaredFields() ) {
      if ( field.isAnnotationPresent( CsvColumn.class ) ) {
        Object value = field.get( o );
        stringJoiner.add( String.valueOf( value ) );
      }
    }

    return stringJoiner.toString();
  }

  public static void main( String[] args ) throws IllegalAccessException {
    Song song = new Song();
    song.title = "Sunny";
    song.duration = 200;
    System.out.println( csvHeader( song ) );
    System.out.println( csvRow( song ) );
  }

}

@Retention( RetentionPolicy.RUNTIME )
@Target( ElementType.FIELD ) @interface CsvColumn {
  String value() default "";
}
