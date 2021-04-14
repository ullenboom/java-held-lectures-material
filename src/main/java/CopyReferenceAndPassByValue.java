/**
 * Lernziel: Objektverweise an Methoden übergeben
 * - Zuweisung und Kopien
 * - Referenzen als Argumente übergeben
 *
 * @see ReferenceIdentityEquals
 */
public class CopyReferenceAndPassByValue {
  public static void main( String[] args ) {

    int age = 50;
    int dogAge = age;
    System.out.println( dogAge );

    java.awt.Point p = new java.awt.Point();

    /*
                            +-------+
                            | Point |
      +-----+               | ----- |
      |  p  +-------------->+-------+
      +-----+               | x=0   |
                            | y=0   |
                            +-------+
    */

    java.awt.Point q = p;

    /*
                            +-------+
                            | Point |
      +-----+               | ----- |               +-----+
      |  p  +-------------->+-------+<--------------+  q  |
      +-----+               | x=0   |               +-----+
                            | y=0   |
                            +-------+
    */

    p.x = 10;
    System.out.println( q.x );
    q.y = 20;
    System.out.println( p.y );

    System.out.println( p );
    printPoint( p );
    System.out.println( p );
    clearPoint( p );
    System.out.println( p );

    System.out.println(randomPoint());

    System.out.println(clearPoint2( p ));
    System.out.println( p );
  }

  static void printPoint( java.awt.Point p ) {
    System.out.println( p.x );
    System.out.println( p.y );
    int swap = p.x;
    p.x = p.y;
    p.y = swap;
  }

  static void clearPoint( java.awt.Point p ) {
    p = null;
  }

  static java.awt.Point randomPoint() {
    java.awt.Point point = new java.awt.Point();
    point.setLocation( Math.random() * 10, Math.random() * 20 );
    return point;
  }

  static java.awt.Point clearPoint2( java.awt.Point p ) {
    p.x = p.y = 0;
    return p;
  }

}
