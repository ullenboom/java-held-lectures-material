/**
 * Lernziel: `for`-Schleife
 * - Schleifenzähler
 * - Komma
 *
 * @see ForLoop2
 */
public class ForLoop1 {
  public static void main( String[] args ) {

    /*

    do {
    Anweisungen;
    } while ( Bed. );

    ->

    Anweisungen
    while ( Bed. ) {
      Anweisungen
    }
     */

//    int counter = 1;
//    while ( counter < 11 ) {
//      System.out.println(counter);
//      counter++;
//    }

    // ->

    // for ( Initialisierung ; Bedingung ; Fortschaltausdruck ) Anweisung

//    for ( int counter = 1; counter < 11;counter++) {
//      System.out.println(counter);
//    }
//
//    int counter = 1;
//    for ( ; counter < 11;counter++) {
//      System.out.println(counter);
//    }
//
//    System.out.println(counter);

    for ( int x = 0, y = 0;
          Math.random() > 0.1;
          x++, y += (int) (Math.random() * 100) )
      System.out.println( x + " " + y );
  }
}
