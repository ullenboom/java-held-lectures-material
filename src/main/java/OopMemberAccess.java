public class OopMemberAccess {
  public static void main( String[] args ) {

    java.awt.Point p = new java.awt.Point();
    java.awt.Point q = new java.awt.Point();

    /*
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  p  ├──────────────►├────────┤
      └─────┘               │ x=0    │
                            │ y=0    │
                            └────────┘
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  q  ├──────────────►├────────┤
      └─────┘               │ x=0    │
                            │ y=0    │
                            └────────┘
    */

    p.x = 10;
    System.out.println( p.x );

    /*
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  p  ├──────────────►├────────┤
      └─────┘               │ x=10   │
                            │ y=0    │
                            └────────┘
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  q  ├──────────────►├────────┤
      └─────┘               │ x=0    │
                            │ y=0    │
                            └────────┘
    */

    // Access a field

    System.out.println( p.y );
    System.out.println( q.x );
    System.out.println( q.y );

    // Call a method

    p.setLocation( 11, 22 );
    System.out.println( p.toString() );  // java.awt.Point[x=11,y=22]

    /*
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  p  ├──────────────►├────────┤
      └─────┘               │ x=11   │
                            │ y=22   │
                            └────────┘
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  q  ├──────────────►├────────┤
      └─────┘               │ x=0    │
                            │ y=0    │
                            └────────┘
    */

    System.out.println( q.toString() );  // java.awt.Point[x=0,y=0]

    System.out.println( p );  // java.awt.Point[x=11,y=22]   calls toString()
    System.out.println( q );  // java.awt.Point[x=0,y=0]

    // Fluent API

    String s = p.toString();
    System.out.println( s.length() );  // 25        Point -> String -> int

    // ->

    System.out.println( p.toString().length() );
    //                  ^^^String^^^

    System.out.println( new java.awt.Point().toString().length() );   // 23
    //                  ^^^^ Point ^^^^^^^^^
    //                  ^^^^^^^^^^^^^^^^^^ String ^^^^^
  }
}
