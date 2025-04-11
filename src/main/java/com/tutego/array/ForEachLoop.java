package com.tutego.array;

public class ForEachLoop {
  public static void main( String[] args ) {

    String[] names = { "Cora", "Chris" };

    for ( int i = 0; i < names.length; i++ ) {
      System.out.println( names[ i ] );
    }

    for ( String name : names )
      System.out.println( name );

    int cnt = 1;
    for ( String name : new String[]{ "Cora", "Chris", null, "Madelaine" } ) {
      if ( name == null )
//        break;
        continue;

      System.out.println( cnt + ". " + name );
      cnt++;
    }
  }
}
