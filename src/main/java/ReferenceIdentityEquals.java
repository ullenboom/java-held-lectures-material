/**
 * Lernziel: Identität und Gleichwertigkeit
 * - Operatoren `==` und `!=`
 * - Methoden `equals(Object)`
 *
 * @see ImportDeclaration
 */
public class ReferenceIdentityEquals {
  public static void main( String[] args ) {

    java.awt.Point p = new java.awt.Point();
    java.awt.Point q = new java.awt.Point();
    java.awt.Point r = p;

    System.out.println( p );
    System.out.println( q );
    System.out.println( r );

    System.out.println( p == q );  // false
    System.out.println( p != q );  // true
    System.out.println( p == r );  // true
    System.out.println( q == r );  // false

    // Gleichwertigkeit
    System.out.println( p.equals( q ) );
    System.out.println( q.equals( p ) );

    System.out.println( p.equals( "asdfaklshdfklsa" ) );
    System.out.println( "asdfasdfasdf".equals( p ) );
    System.out.println( p.equals( null ) );
//    p = null;
//    System.out.println( p.equals( null ) );

    // == !=
    // equals(obj)  !equals(obj)

    String input1 = new java.util.Scanner( System.in ).nextLine();
    String input2 = new java.util.Scanner( System.in ).nextLine();
    //    System.out.println(input1==input2); // FALSCH!!
    System.out.println( input1.equals( input2 ) );
    System.out.println( input2.equals( input1 ) );
  }
}
