package de.tutego.generics;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Generics verstehen
 * - Terminologie
 * - parametrisierten Typ nutzen
 * - generischer Typ bzw. generische Methode schreiben
 * - Wo Generics nicht funktionieren
 *
 * @see BoundedTypeParameters
 */
public class GenericsTypesGenericMethods {

  static <T> T firstOrElse( List<T> list, T defaultValue ) {
    if ( list == null || list.isEmpty() )
      return defaultValue;
    return list.get( 0 );
  }

  static class Pair<T, U> {
    public final T first;
    public final U second;

    public Pair( T first, U second ) {
      this.first = first;
      this.second = second;
    }
  }

  public static void main( String[] args ) {

    int age;
    double income;
    String name;
    ArrayList<String> names;
    ArrayList<LocalDate> birthdays;

    /*
    Originaltyp (engl. raw type)	Rocket
    parametrisierter Typ (engl. parameterized type)	  List<String>, List<LocalDate>
    Typargument (engl. actual type parameter)	        String, LocalDate
    */

    names = new ArrayList<>();
    names.add( "asdasdf" );
    String s = names.get( 0 );

    birthdays = new ArrayList<>();
    birthdays.add( LocalDate.now() );
    LocalDate localDate = birthdays.get( 0 );

    ArrayList list = new ArrayList();
    list.add( new Point() );
    list.add( "" );
    Object o = list.get( 0 );

    /*
      generischer Typ (engl. generic type)	        Pair<T>
      generische Methode (engl. generic method)     <T> firstOrElse
      Typparameter (engl. formal type parameter)	  T
     */

    Pair<String, Double> pair1 = new Pair<>( "Hallo", 12.33 );
    Pair<Double, String> pair2 = new Pair<>( 12.33, "Hallo" );

    // System.out.println( pair1.getClass() == Pair.class );
    // System.out.println( pair1 instanceof Pair );
    //    Pair temp = pair1;
    //    Pair<String, String> temp2 = temp;
    //    Pair<String, Double>[] pairs = new Pair[ 10 ];
  }
}
