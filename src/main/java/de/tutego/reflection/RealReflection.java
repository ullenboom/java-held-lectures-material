package de.tutego.reflection;

import java.awt.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * Lernziel: Reflection anwenden
 * - Konstruktoren aufrufen und Objekte aufbauen
 * - Methoden erfragen und aufrufen
 * - Variablen erfragen, auslesen und setzen
 *
 * @see ReadAnnotations
 */
public class RealReflection {
  public static void main( String[] args ) {

    Class<Point> pointClass = Point.class;
    Constructor<?>[] declaredConstructors = pointClass.getDeclaredConstructors();
    Method[] methods = pointClass.getMethods();
    Field[] declaredFields = pointClass.getDeclaredFields();

    System.out.println( Arrays.toString( declaredConstructors ) );
    System.out.println( Arrays.toString( declaredFields ) );
    System.out.println( Arrays.toString( methods ) );

    try {
      Constructor<Point> constructor = pointClass.getConstructor();
      Point point = constructor.newInstance();
      System.out.println( point );

      Field x = pointClass.getField( "x" );
      x.setInt( point, 100 );

      Method translate = pointClass.getMethod( "translate", int.class, int.class );
      translate.invoke( point, 10, 10 );

      System.out.println( point );
    }
    catch ( NoSuchMethodException e ) {
      e.printStackTrace();
    }
    catch ( IllegalAccessException e ) {
      e.printStackTrace();
    }
    catch ( InstantiationException e ) {
      e.printStackTrace();
    }
    catch ( InvocationTargetException e ) {
      e.printStackTrace();
    }
    catch ( NoSuchFieldException e ) {
      e.printStackTrace();
    }
  }
}
