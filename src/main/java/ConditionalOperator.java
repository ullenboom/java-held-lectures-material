public class ConditionalOperator {
  public static void main( String[] args ) {
    /*
      Syntax:

      Condition ? Expression1 : Expression2
     */

    int a = 12;
    int b = 3434;

    //    if ( a > b )
    //      System.out.println( a );
    //    else
    //      System.out.println( b );

    // =>

    System.out.println( a > b ? a : b );

    // -------------------

    double random = Math.random();
    String color = random < 0.3 ? "red" :
                   random < 0.6 ? "blue" :
                   "green";
    System.out.println( color );
  }
}
