/**
 * Lernziel: Parameter und Argumente
 * - Methoden über Übergaben deklarieren und aufrufen
 * - Methoden mit `return`-Anweisung beenden
 *
 * @see Methods3
 */
public class Methods2 {
  public static void main( String[] args ) {
    int size = 10;
    char symbol = '-';
    lines( size, symbol );
    /*
     println()              Math.random()
     println("Hello")       Math.sin(1)
     */
  }

  static void lines( int len, char c ) {
    switch ( c ) {
      case ' ':
      case '\t':
        return;
    }

    for ( int i = 0; i < len; i++ ) {
      printChar( c );
    }
  }

  static void printChar( char c ) {
    System.out.print( c );
  }

}
