public class WhileLoop {
  public static void main( String[] args ) {

    /*
     Syntax:

     while ( Condition ) Statement
     */

    //    while ( Math.random() > 0.1 )
    //      System.out.println( "BODY" );

    int number = 123456789;
    int digit = 0;
    while ( number > 0 ) {
      digit++;
      number /= 10;
    }
    System.out.println( digit );

  }
}
