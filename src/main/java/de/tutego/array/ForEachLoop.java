package de.tutego.array;

/**
 * Lernziel: Erweiterte `for`-Schleife
 * - Syntax der erweiterten `for`-Schleife kennenlernen
 * - Array-Initialisierung und erweiterte `for`-Schleife
 * - Einschränkungen
 *
 * @see Varargs
 */
public class ForEachLoop {
  public static void main( String[] args ) {

    String[] names = { "Cora", "Chris" };
    for ( int i = 0; i < names.length; i++ ) {
      System.out.println( names[ i ] );
    }

    for ( String name : names ) {
      System.out.println( name );
    }

//    int cnt = 1;
//    for ( String name : new String[]{ "Cora", "Chris", null, "Madi" } ) {
//      if ( name == null )
//        break;
//      System.out.println( cnt + ". " + name );
//      cnt++;
//    }

    int cnt = 1;
    for ( String name : new String[]{ "Cora", "Chris", null, "Madi" } ) {
      if ( name == null )
        continue;
      System.out.println( cnt + ". " + name );
      cnt++;
    }
  }
}
