package de.tutego.appliances;

import java.util.ArrayList;

/**
 * Lernziel: Objektbeziehungen (Assoziationen)
 * - 1:1
 * - 1:n (n klein und fest, n ist fest, n ist frei)
 * - Unidirektionale Beziehungen
 * - Bidirektionale Beziehungen
 *
 * @see Inheritance
 */
public class Associations {
  public static void main( String[] args ) {
    ArrayList<String> list = new ArrayList<String>();
    list.add( "Hallo" );
    list.add( "Hallo 2" );
    // System.out.println( list.get( 0 ) );
    for ( String string : list ) {
      System.out.println(string);
    }
  }
}

class Cell {
  String value;
}

class Chessboard {
  Cell[] cells = new Cell[ 8 * 8 ];
}