/**
 * Lernziel: `switch`-Ausdrücke (Java 14)
 *
 * @see OopNew
 */
public class SwitchExpression {
  public static void main( String[] args ) {

    String operator = "+";

    //    switch ( operator ) {
    //      case "+" -> System.out.println( "Plus" );
    //      case "-" -> System.out.println( "Minus" );
    //      case "x", "*" -> System.out.println( "Mal" );
    //      default -> System.out.println( "Unbekannter Operator" );
    //    }

    String s = switch ( operator ) {
      case "+" -> {
        System.out.println( "Hier bin ich" );
        yield "Plus";
      }
      case "-" -> "Minus";
      case "x", "*" -> "Mal";
      default -> "Unbekannter Operator";
    };
    System.out.println( s );
  }
}
