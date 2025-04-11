package com.tutego.lang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class IterableAndIteratorDemo {
  public static void main( String[] args ) {

    //    // For-each with Array
    //
    //    String[] names = { "Jill", "Jo" };
    //    for ( String name : names ) {
    //      System.out.println( name );
    //    }
    //
    //    // For-each with Iterable
    //
    //    List<String> places = List.of( "Sonsbeck", "Dortmund" );
    //    for ( String place : places ) {
    //      System.out.println( place );
    //    }

     /*
     https://jdec.app/
     */

    //    String[] names = new String[]{ "Jill", "Jo" };
    //    String[] var2 = names;
    //    int var3 = names.length;
    //
    //    for ( int i = 0; i < var3; ++i ) {
    //      String name = var2[ i ];
    //      System.out.println( name );
    //    }
    //
    //    List<String> places = List.of( "Sonsbeck", "Dortmund" );
    //    Iterator var7 = places.iterator();
    //
    //    while ( var7.hasNext() ) {
    //      String place = (String) var7.next();
    //      System.out.println( place );
    //    }

    Toaster toaster1 = new Toaster();
    Toaster toaster2 = new Toaster();
    Toasters toasters = new Toasters();
    toasters.add( toaster1 );
    toasters.add( toaster2 );
    // toasters.getToasters().clear();

    for ( Iterator<Toaster> iterator = toasters.iterator(); iterator.hasNext(); ) {
      Toaster toaster = iterator.next();
      System.out.println( toaster );
      // iterator.remove();
    }
    System.out.println( toasters.iterator().hasNext() );
  }
}

class Toaster {

}

class Toasters implements Iterable<Toaster> {
  private final List<Toaster> toasters = new ArrayList<>();

  void add( Toaster toaster ) {
    toasters.add( toaster );
  }

  @Override public Iterator<Toaster> iterator() {
    return Collections.unmodifiableCollection( toasters ).iterator();
  }

  public List<Toaster> getToasters() {
    return Collections.unmodifiableList( toasters );
  }

  //  public List<Toaster> getToasters() {
  //    return toasters;
  //  }
}