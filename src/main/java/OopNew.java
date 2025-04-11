public class OopNew {
  public static void main( String[] args ) {

    new java.awt.Point();    // Constructor call

    System.out.println( new java.awt.Point() );   // java.awt.Point[x=0,y=0]

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

    String s = "";

    /*
    Reference Type             Object Type
     */
    java.awt.Polygon polygon = new java.awt.Polygon();

    // java.awt.Point a = new java.awt.Polygon();
    // long a = new java.awt.Polygon();
    // boolean b = 234234;
  }
}
