public class ExpressionNumericEdgeCases {
  public static void main( String[] args ) {

    /*
      Overflow and Underflow
     */

    System.out.println( Integer.MAX_VALUE );  // 2^31 - 1
    System.out.println( Integer.MAX_VALUE + 1 ); // -2147483648

    System.out.println( Integer.MIN_VALUE );  // -2147483648
    System.out.println( Integer.MIN_VALUE - 1 ); // 2147483647

    System.out.println( Float.MIN_VALUE );    // 1.4E-45
    System.out.println( Float.MIN_VALUE / 2 ); // 0.0

    /*
      Precision issues.
     */

    // 0.9999999999999999
    System.out.println( 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 );

    System.out.println( 1.23456789123f );
    //                  1.2345679
    System.out.println( 1.23456789123456789012345 );
    //                  1.234567891234568

    /*
      Infinity
     */

    System.out.println( Float.MAX_VALUE * 2 );   // Infinity
    System.out.println( Float.POSITIVE_INFINITY );
    System.out.println( Double.MAX_VALUE * 2 );
    System.out.println( Double.POSITIVE_INFINITY );
    System.out.println( 1. / 0. );
    System.out.println( -1. / 0. );

    // Exception in thread "main" java.lang.ArithmeticException: / by zero
    // System.out.println( 1 / 0 );

    /*
     NaN (Not a Number)
     */

    System.out.println( Math.sqrt( +4 ) ); // 2
    System.out.println( Math.sqrt( -4 ) ); // NaN
    System.out.println( 0.0 / 0.0 );
    System.out.println( -0.0 / 0.0 );

    double a = Double.NaN;
    double b = Double.NaN;
    System.out.println( a == b );  // false
    System.out.println( Double.isNaN( a ) == Double.isNaN( b ) );  // true

    //

    // Exception in thread "main" java.lang.ArithmeticException: integer overflow
    // Math.addExact( Integer.MAX_VALUE, 1 );
  }
}