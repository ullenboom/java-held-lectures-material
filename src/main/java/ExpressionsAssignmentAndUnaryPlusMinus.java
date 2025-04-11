public class ExpressionsAssignmentAndUnaryPlusMinus {
  public static void main( String[] args ) {

    // An expression yields a result when evaluated.

    /*
    . Unary operators are those that take only one operand.
    . Binary operators are those that take two operands.
    . Ternary operators are those that take three operands.
     */

    double priceOfChocolate = 1.50;
    double priceOfLicorice = 2.00;

    /*
      Assignment Operators:

       =  Assignment
       ...
    */

    System.out.println( priceOfChocolate = 1.60 );
    System.out.println( priceOfChocolate );

    priceOfChocolate = priceOfLicorice = 2.00;
    //                 --------- 1 ----------
    // ----- 2 -------

    /*
      Unary Operators:

       +  Unary plus
       -  Unary minus (negates an expression)
    */

    System.out.println( priceOfChocolate );
    System.out.println( -(priceOfChocolate) );
    System.out.println( +priceOfChocolate );
    System.out.println( -(-(priceOfChocolate)) );

    double random = Math.random();    // 0.0 <= random() < 1
    System.out.println( random );
    System.out.println( -random + 0.5 );
    System.out.println( -Math.random() + 0.5 );
    System.out.println( -Math.random() + 0.5 );
    System.out.println( -Math.random() + 0.5 );
    System.out.println( -Math.random() + 0.5 );
    System.out.println( -Math.random() + 0.5 );
  }
}
