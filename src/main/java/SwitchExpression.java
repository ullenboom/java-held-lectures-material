public class SwitchExpression {
  public static void main( String[] args ) {
    int x = 12;
    int y = 0;
    String operator = "/";

    //    switch ( operator ) {
    //      case "+" -> System.out.println( "" + (x + y) );
    //      case "-" -> System.out.println( "" + (x - y) );
    //      default -> System.out.println( "Unknown operator" );
    //    }

    //    String result = switch ( operator ) {
    //      case "+" -> "" + (x + y);
    //      case "-" -> "" + (x - y);
    //      default -> "Unknown operator";
    //    };
    //    System.out.println( result );

    System.out.println( switch ( operator ) {
      case "+" -> "" + (x + y);
      case "-" -> "" + (x - y);
      // 'switch' expression does not cover all possible input values
      case "/" -> {
        if ( y == 0 ) {
          System.err.println( "Divisor is zero" );
          yield -1;
        }
        yield "" + x / y;
      }
      default -> "Unknown operator";
    } );

  }
}
