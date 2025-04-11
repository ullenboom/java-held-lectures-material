package com.tutego.collection;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
  public static void main( String[] args ) {

    Map<String, String> colors = new HashMap<>();
    colors.put( "red", "#ff0000" );
    colors.put( "green", "#00ff00" );
    colors.put( "gray", "#bebebe" );
    colors.put( "grey", null );

    System.out.println( colors ); // {red=#ff0000, green=#00ff00, gray=#bebebe, grey=null}
    System.out.println( colors.size() ); // 4

    System.out.println( colors.get( "red" ) );  // #ff0000
    System.out.println( colors.get( "green" ) ); // #00ff00
    System.out.println( colors.get( "gray" ) );  // #bebebe
    System.out.println( colors.get( "grey" ) );  // null
    System.out.println( colors.get( "yellow" ) ); // null

    System.out.println( colors.containsKey( "grey" ) );   // true
    System.out.println( colors.containsKey( "yellow" ) ); // false

    System.out.println( colors.getOrDefault( "yellow", "#ffff00" ) );  // #ffff00

    // LinkedHashMap
    // WeakHashMap
  }
}
