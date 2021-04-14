/**
 * Lernziel: Komplexere `for`-Schleifen
 * - Ineinanergeschachtelte Schleifen
 * - break und continue
 * - Labels
 *
 * @see Methods1
 */
public class ForLoop2 {
  public static void main( String[] args ) {

//    for ( int x = 1; x <= 10; x++ ) {
//      for ( int y = 1; y <= 10; y++ ) {
//        System.out.printf("%3d ", x*y);
//      }
//      System.out.println();
//    }

//    for ( int x = 1; x <= 10; x++ ) {
//      for ( int y = 1; y <= 10; y += x ) {
//        System.out.printf("%3d ", x*y);
//      }
//      System.out.println();
//    }

    end:
    for ( int x = 1; x <= 10; x++ ) {
      for ( int y = 1; y <= 10; y++ ) {
        System.out.printf("%3d ", x*y);
        if ( x*y == 25)
          break end;
      }
      System.out.println();
    }

  }
}
