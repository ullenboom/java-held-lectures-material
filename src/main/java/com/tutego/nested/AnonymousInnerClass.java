package com.tutego.nested;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class AnonymousInnerClass {
  public static void main( String[] args ) {

    //    class EmptyPredicate implements Predicate<String> {
    //      @Override public boolean test( String s ) {
    //        return s.isEmpty();
    //      }
    //    }
    //
    //    EmptyPredicate emptyPredicate = new EmptyPredicate();

    /*
     1. Implement Interfaces: new INTERFACENAME() {...}
     */

    Predicate<String> emptyPredicate = new Predicate<String>() {
      @Override public boolean test( String s ) {
        return s.isEmpty();
      }

      //      @Override public Predicate<String> and( Predicate<? super String> other ) {
      //        System.out.println( other );
      //        return Predicate.super.and( other );
      //      }
    };

    ArrayList<String> list = new ArrayList<>();
    list.removeIf( emptyPredicate );

    ArrayList<String> list2 = new ArrayList<>();
    list2.removeIf( emptyPredicate );

    System.out.println(
        emptyPredicate.getClass() );  // class com.tutego.nested.AnonymousInnerClass$1

    /*
     2. Create Subclass: new CLASSNAME() {...}
     */

    BigInteger bigInteger = new BigInteger( "2345234545" ) {
      @Override public String toString() {
        return super.toString() + " €";
      }
    };
    System.out.println( bigInteger.getClass() );  // class com.tutego.nested.AnonymousInnerClass$2
    System.out.println( bigInteger );             // 2345234545 €

    // new String(){};  // Cannot inherit from final 'java.lang.String'

    List<String> objects = new ArrayList<>() {
      @Override public String get( int index ) {
        if ( index >= 0 && index < size() )
          return super.get( index );
        else
          return null;
      }
    };

    System.out.println( objects.get( -1 ) );
    System.out.println( objects.get( 0 ) );
    objects.add( "Hello world" );
    System.out.println( objects.get( 0 ) );
    System.out.println( objects.get( 1 ) );

  }
}