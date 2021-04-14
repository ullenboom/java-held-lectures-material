/**
 * Lernziel: Methoden deklarieren
 * - Bedeutung von Methoden verstehen
 * - Statische Methoden deklarieren
 * - Methoden aufrufen
 * - Deklarierte Methode und Aufruf in verschiedenen Klassen haben
 *
 * @see Methods2
 */
public class Methods1 {
  public static void main( String[] args ) {
    Lines.lines();
    System.out.println();
    Lines.lines();
  }
}

class Lines {
  static void lines() {
    for ( int i = 0; i < 10; i++ ) {
      printHeart();
    }
  }

  static void printHeart() {
    System.out.print( "♥️" );
  }
}
