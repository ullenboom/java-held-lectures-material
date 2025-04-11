package com.tutego.oop;

import java.awt.*;
import java.util.ArrayList;

public class OneToMany {

  class Player {
    //    Candy candyLeftPocket;
    //    Candy candyRightPocket;
    //    // ...
    //    Candy pocketCandy3;
    //    Candy pocketCandy4;
    Candy[] candies = new Candy[ 10 ];
    // candies[0]   .. candies[9]
  }

  class Candy {

  }

  public static void main( String[] args ) {

    //    ArrayList list = new ArrayList();
    //    list.add( "Hello" );
    //    list.add( "World" );
    //    System.out.println( list.size() );  // 2
    //    System.out.println( list.get( 0 ) );  // Hello
    //    System.out.println( list.get( 1 ) );  // World
    //    System.out.println( list );
    //    for ( Object o : list ) {
    //      System.out.println( o );
    //    }
    //    list.remove( 0 );
    //    System.out.println( list );  // [World]
    //    list.remove( "World" );
    //    System.out.println( list );  // []

    ArrayList<String> list = new ArrayList<String>();
    list.add( "Hello" );
    list.add( "World" );
    // list.add( new Point() );
    System.out.println( list.size() );  // 2
    String firstElement = list.get( 0 );
    System.out.println( firstElement );  // Hello
    System.out.println( list.get( 1 ) );  // World
    System.out.println( list );
    for ( String o : list ) {
      System.out.println( o );
    }
    list.remove( 0 );
    System.out.println( list );  // [World]
    list.remove( "World" );
    System.out.println( list );  // []
  }
}
