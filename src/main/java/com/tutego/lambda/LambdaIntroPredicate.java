package com.tutego.lambda;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaIntroPredicate {

  // static nested class
  //  static class StringEmptyPredicate implements Predicate<String> {
  //    @Override public boolean test( String s ) {
  //      return s.isEmpty();
  //    }
  //  }

  public static void main( String[] args ) {
    // local inner class
    //    class StringEmptyPredicate implements Predicate<String> {
    //      @Override public boolean test( String s ) {
    //        return s.isEmpty();
    //      }
    //    }

    //    Predicate<String> isEmpty = new Predicate<String>() {
    //      @Override public boolean test( String s ) {
    //        return s.isEmpty();
    //      }
    //    };

    //                                        v  Lambda Expression
    Predicate<String> isEmpty = ( String s ) -> {return s.isEmpty();};

    List<String> names = new ArrayList<>();
    names.add( "Joe" );
    names.add( "Jill" );
    names.add( "" );
    //    names.removeIf( isEmpty );
    names.removeIf( ( String s ) -> {return s.isEmpty();} );
    System.out.println( names );   // [Joe, Jill]

    // interface Runnable { void run(); }
    // interface ActionListener { void actionPerformed(ActionEvent event); }
    // interface Supplier<T> { T get(); }
    // interface Consumer<T> { void accept(T t); }
    // interface Comparator<T> { int compare(T o1, T o2); }

    Runnable runnable = () -> {};
    ActionListener actionListener = ( ActionEvent event ) -> {};
    Supplier<String> supplier = () -> {return "";};
    Consumer<Point> consumer = ( Point t ) -> {};
    Comparator<Rectangle> comparator = ( Rectangle o1, Rectangle o2 ) -> {return 0;};

  }
}

// Top level class
//class StringEmptyPredicate implements Predicate<String> {
//  @Override public boolean test( String s ) {
//    return s.isEmpty();
//  }
//}
