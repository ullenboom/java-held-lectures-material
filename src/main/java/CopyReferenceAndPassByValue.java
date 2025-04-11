public class CopyReferenceAndPassByValue {
  public static void main( String[] args ) {
    java.awt.Point p = new java.awt.Point( 10, 20 );
    System.out.println( p );
    printPoint( p );
    System.out.println( p );
    clearPoint( p );
    System.out.println( p );

    System.out.println( randomPoint() );

    System.out.println( clearPoint2( p ) );  // java.awt.Point[x=0,y=0]
    System.out.println( p );                 // java.awt.Point[x=0,y=0]
  }

  static void printPoint( java.awt.Point p ) {
    System.out.println( p.x );
    System.out.println( p.y );
    int swap = p.x;
    p.x = p.y;
    p.y = swap;
  }

  static void clearPoint( java.awt.Point p ) {
    // p = new java.awt.Point();
    p = null;
  }
  // <- p from method is gone

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
