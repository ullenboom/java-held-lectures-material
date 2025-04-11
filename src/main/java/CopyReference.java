public class CopyReference {
  public static void main( String[] args ) {

    int age = 50;
    int dogAge = age;
    System.out.println( dogAge );  // 50

    java.awt.Point p = new java.awt.Point();

    /*
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │
      │  p  ├──────────────►├────────┤
      └─────┘               │ x=0    │
                            │ y=0    │
                            └────────┘
    */

    //    java.awt.Point q = new java.awt.Point();
    java.awt.Point q = p;

    /*
                            ┌────────┐
                            │ :Point │
      ┌─────┐               │ ────── │               ┌─────┐
      │  p  ├──────────────►├────────┤◄──────────────┤  q  │
      └─────┘               │ x=0    │               └─────┘
                            │ y=0    │
                            └────────┘
    */

    p.x = 10;
    System.out.println( q.x );  // 10

    q.y = 20;
    System.out.println( p.y );  // 20

    //

    String s1 = "HELLO";
    String s2 = s1;   // s2 = "HELLO"
    s1 = "WORLD";
  }
}
