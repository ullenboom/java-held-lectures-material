/**
 * Lernziel: Refactoring von Methoden
 * - Extrahieren von Anweisungen in Methoden
 * - Methodensignatur ändern
 * - Inlining von Methodeninhalten
 *
 * @see VarKeyword
 */
public class MethodRefactoring {
  public static void main( String[] args ) {

    int stars = 12;
    for ( int i1 = 0; i1 < stars; i1++ ) {
      System.out.print( '*' );
    }
    for ( int i = 0; i < 34; i++ ) {
      System.out.print( 'o' );
    }

    int a = 12;
    int b = 12;
    int area = a * b;

    int area_ = a * b;
    int perimeter = 2 * a + 2 * b;

    System.out.println( area_ );
    System.out.println( perimeter );
  }

}
