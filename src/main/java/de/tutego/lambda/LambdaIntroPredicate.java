package de.tutego.lambda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lernziel: Erste Lambda-Ausdrücke
 * - Funktionale Schnittstellen
 * - Grundlegende Lambda-Syntax
 * - Zieltyp
 * - Annotation `@FunctionalInterface`
 * - Konflikte bei bestimmten Parametertypen
 *
 * @see ShorteningLambdaExpressions
 */
public class LambdaIntroPredicate {
  public static void main( String[] args ) {

    //    Predicate<String> isEmpty = new Predicate<String>() {
    //      @Override public boolean test( String s ) { return s.isEmpty(); }
    //    };
    Predicate<String> isEmpty = ( String s ) -> { return s.isEmpty(); };
    List<String> names = new ArrayList<>();
    names.add( "Joe" );
    names.add( "Jill" );
    names.add( "" );
    //    names.removeIf( isEmpty );
    names.removeIf( ( String s ) -> { return s.isEmpty(); } );
    System.out.println( names );

    // Object isEmpty2 = ( String s ) -> { return s.isEmpty(); };   CF

    Callable<String> callable = () -> {return ""; };
    Supplier<String> supplier = () -> {return ""; };

    foo( callable );
    foo( supplier );
    foo( (Supplier<String>) (() -> {return ""; }) );

    /*
     interface Runnable    { void run(); }
     interface ActionListener { void actionPerformed(ActionEvent e); }
     interface Supplier<T>    { T get(); }
     interface Consumer<T>    { void accept(T t); }
     interface Comparator<T>  { int compare(T o1, T o2); }
     */
    Runnable runnable = () -> {};
    ActionListener listener = ( ActionEvent e ) -> {};
    Consumer<Point> consumer = ( Point t ) -> {};
    Comparator<Rectangle> comparator = ( Rectangle o1, Rectangle o2 ) -> {return 0;};
  }

  static void foo( Supplier<String> supplier ) {}

  static void foo( Callable<String> supplier ) {}
}
