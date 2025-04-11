public class ReferenceIdentityEquals {
  public static void main( String[] args ) {

    /*
     Copy a Reference
     */

    java.awt.Point p = new java.awt.Point( 0, 0 );
    java.awt.Point q = new java.awt.Point( 0, 0 );
    java.awt.Point r = p;

    // 2 Objects
    // 3 Reference Variables

    System.out.println( p );
    System.out.println( q );
    System.out.println( r );

    /*
     Operators == and !=
     */

    System.out.println( p == q );   // false
    System.out.println( p != q );   // true
    System.out.println( p == r );   // true
    System.out.println( q == r );   // false

    /*
     Testing equality
     */

    System.out.println( p.equals( q ) );  // true
    System.out.println( q.equals( p ) );  // true

    System.out.println( p.equals( "HELLO" ) );  // false
    System.out.println( "HELLO".equals( p ) );  // false

    System.out.println( p.equals( null ) );   // false
    System.out.println( p.equals( null ) );   // false

    //    p = null;
    //    System.out.println( p.equals( null ) );   // false
    //    -> Exception in thread "main" java.lang.NullPointerException: Cannot invoke "java.awt.Point.equals(Object)" because "p" is null

    /*
     Using Build-in Operators:    ==               !=
     Calling Method:              equals(obj)      !equals(obj)
     */

    String input1 = new java.util.Scanner( System.in ).nextLine();
    String input2 = new java.util.Scanner( System.in ).nextLine();
    System.out.println( input1 == input2 );   // WRONG

    System.out.println( input1.equals( input2 ) );
    System.out.println( input2.equals( input1 ) );

  }
}
