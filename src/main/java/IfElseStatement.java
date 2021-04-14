/**
 * Lernziel: Fallunterscheidungen mit Alternative
 * - `if`-`else`
 * - Dangling-else-Problem
 *
 * @see ConditionalOperator
 */
public class IfElseStatement {
  public static void main( String[] args ) {
    double random = Math.random();
    if ( random < 0.3 )
      System.out.println( "rot" );
    else if ( random < 0.6 )
      System.out.println( "grün" );
    else
      System.out.println( "blau" );
  }
}
