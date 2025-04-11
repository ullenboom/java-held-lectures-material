public class ExpressionsAssignmentOperators {
  public static void main( String[] args ) {
    int a;
    a = 12;
    String s;
    s = "Hello";

    int counter = 0;
    counter = counter + 2;

    /*
      =  *=  /=  %=  +=  -=  <<=  >>=  >>>=  &=  ^=  |=
     */

    counter += 2;
    counter /= 2;

    // var = var OP (expression)    =>   var OP= expression

    int b = 2;
    b *= (2 + 3);   // ~~~~~~b = b * 2 + 3;~~~~~~   !=   b = b * (2 + 3)
    System.out.println( b );  // 10

    //

    int c = 10;
    c *= 3.1415;   // c = c * 3.1415;
    System.out.println( c );   // 31
  }
}
