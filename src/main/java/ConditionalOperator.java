/**
 * Lernziel: Bedingungsoperator (`?`-`:`-Operator)
 * - Syntax vom Bedingungsoperator
 * - Verschachtelte Bedingungsoperatoren
 *
 * @see SwitchCaseStatement
 */
public class ConditionalOperator {
  public static void main( String[] args ) {
    int a = 12;
    int b = 3434;
    if ( a > b )
      System.out.println(a);
    else
      System.out.println(b);

    // =>

    double random = Math.random();
    String color = random < 0.3 ? "rot" :
                   random < 0.6 ? "blau" :
                   "grün";
    System.out.println( color );

//    System.out.println( a > b ? a : b );
  }
}
