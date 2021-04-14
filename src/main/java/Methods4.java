/**
 * Lernziel: Methoden überladen
 * - Default-Werte
 *
 * @see Methods5
 */
public class Methods4 {
  public static void main( String[] args ) {
//    System.out.println( random() );
//    System.out.println( random( 10 ) );
//    System.out.println( random( 100, 200 ) );

    lines( 10 );
    lines( 10, '#' );
  }

  static double random() {
    return Math.random();
  }

  static double random( double max ) {
    return Math.random() * max;
  }

  static double random( double min, double max ) {
    return min + (Math.random() * (max - min));
  }

  // Optionale Parameters

  static void lines( int len ) {
    lines( len, '-' );
  }

  static void lines( int len, char c ) {
    for ( int i = 0; i < len; i++ ) {
      System.out.print( c );
    }
  }

}
