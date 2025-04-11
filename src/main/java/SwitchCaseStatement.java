public class SwitchCaseStatement {
  public static void main( String[] args ) {
    double x = new java.util.Scanner( System.in ).nextDouble();
    String operator = new java.util.Scanner( System.in ).next();
    double y = new java.util.Scanner( System.in ).nextDouble();

    //    if ( operator.equals( "+" ) )
    //      System.out.println( x + y );
    //    else if ( operator.equals( "-" ) )
    //      System.out.println( x - y );
    //    else if ( operator.equals( "*" ) )
    //      System.out.println( x * y );
    //    else if ( operator.equals( "/" ) )
    //      System.out.println( x / y );

    //       v v v v         Selector Expression
    switch ( operator ) {  // char, byte, short, **int**, Character, Byte, Short, Integer, String, enum
      case "+" -> System.out.println( x + y );
      case "-" -> System.out.println( x - y );
      case "*", "×" -> System.out.println( x * y );
      case "/" -> {
        if ( y != 0 )
          System.out.println( x / y );
        else
          System.out.println( "I will not try to divide by zero" );
      }
      case null, default -> System.out.println( "Unknown operator " + operator );
    }
  }
}
