/**
 * Lernziel: Fallunterscheidungen
 * - `if`-Anweisung
 *
 * @see IfElseStatement
 */
public class IfStatement {
  public static void main( String[] args ) {
    int a = new java.util.Scanner( System.in ).nextInt();
    int b = new java.util.Scanner( System.in ).nextInt();
    int area = a * b;

    if ( area > 1_000 ) {
      System.out.println( area + " größer als 10.000" );
    }
    if ( !(area > 1_000) ) {
      System.out.println( area + " größer als 10.000" );
    }

    System.out.println( area + " größer als 10.000" );
  }
}
