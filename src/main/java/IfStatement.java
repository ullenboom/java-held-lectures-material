public class IfStatement {
  public static void main( String[] args ) {
    /*
      Syntax:

      if ( Condition ) Statement
     */

    //    //   ...... boolean ....
    //    if ( Math.random() > 0.5 ) {
    //      System.out.println( "TRUE" );
    //      System.out.println( "YES" );
    //    }

    int a = new java.util.Scanner( System.in ).nextInt();
    int b = new java.util.Scanner( System.in ).nextInt();

    int area = a * b;

    if ( area > 1000 ) {
      System.out.println( area + " greater than 10000" );
      //      System.out.println( area + " greater than 10000" );
    }

    if ( !(area > 1000) ) {
      System.out.println( area + " lesser than 10000" );
    }
  }
}
