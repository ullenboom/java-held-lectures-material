package de.tutego.array;

/**
 * Lernziel: Array-Initialisierung
 * - Kompakte Array-Initialisierung
 * - "Kosten" einschätzen können
 *
 * @see ForEachLoop
 */
public class ArrayInitializer {
  public static void main( String[] args ) {

    String[] names = new String[ 2 ];
    names[ 0 ] = "Christian";
    names[ 1 ] = "Cora";

    //    String[] names2 = {};         // -> String[] names2 = new String[0];
    String[] names2 = { "Christian", "Cora" };         // -> String[] names2 = new String[0];

    // names2 = {}; // Compilerfehler
    names2 = new String[]{};
    names2 = new String[]{ "Christian", "Cora", "Geli" };
//    String[] tempNames = { "Christian", "Cora", "Geli" };
//    names2 = tempNames;
    System.out.println( names2.length );

    length( names2 );
    length( new String[]{"Thomas", "Georg"} );
  }

  static void length( String[] names ) {
    int sum = 0;
    for ( int i = 0; i < names.length; i++ ) {
      sum += names[i].length();
    }
    System.out.println(sum);
  }
}
