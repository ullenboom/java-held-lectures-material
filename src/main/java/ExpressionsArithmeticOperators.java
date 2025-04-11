public class ExpressionsArithmeticOperators {
  public static void main( String[] args ) {

    // Prices of the sweets
    double priceOfChocolate = 1.50;
    double priceOfLicorice = 2.00;

    // Quantity of sweets bought
    int quantityOfChocolate = 3;
    int quantityOfLicorice = 2;

    /*
     Arithmetic Operators:

      +   Addition
      -   Subtraction
      *   Multiplication
      /   Division
      %   Modulo (Remainder of a division)   a % b = a − (b * floor(a/b))
    */

    // Multiplication: Total cost of the chocolate
    double totalCostOfChocolate = priceOfChocolate * quantityOfChocolate;
    System.out.println( totalCostOfChocolate );

    // Addition: Total cost of all purchased sweets
    double totalCost = totalCostOfChocolate + priceOfLicorice * quantityOfLicorice;
    //                                         ----------------- 1 ----------------
    System.out.println( totalCost );

    // Subtraction: Remaining money after buying chocolate
    double budget = 10;
    System.out.println( budget - totalCost );

    // Division: Average cost per item
    int totalItems = quantityOfChocolate + quantityOfLicorice;
    System.out.println( totalCost / totalItems );

    // Remainder

    System.out.println( 20 / 6 );   // 3
    System.out.println( 20 % 6 );   // 2         20-6*3
    System.out.println( 20 / 2 );   // 10
    System.out.println( 20 % 2 );   // 0

    //

    double totalMinutes = 125.33;
    System.out.println( Math.floor( totalMinutes / 60 ) );
    System.out.println( totalMinutes % 60 );

    /*
      Rule: The modulo operator in Java has the same sign as the dividend (the first number).
     */
    System.out.println( +10 % +3 ); // 1
    System.out.println( -10 % +3 ); // -1
    System.out.println( +10 % -3 ); // 1
    System.out.println( -10 % -3 ); // -1
    System.out.println( -10 / -3 ); // 3

    /*
     Automatic Type Promotion
     */

    double a = 111.1111;
    int b = 200;
    System.out.println( a * b );    // -> double

    char c = 'C';
    // char d = c + 1;
    //          -int-

    /*
     Grouping:

     ( )
    */

    System.out.println( 1 + 1 * 10 );   // 11
    System.out.println( 1 + (1 * 10) ); // 11
    System.out.println( (1 + 1) * 10 ); // 20

  }
}
