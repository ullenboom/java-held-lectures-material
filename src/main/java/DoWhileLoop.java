/**
 * Lernziel: Fußgesteuerte Schleife
 * - `do`-`while`-Schleife
 *
 * @see WhileLoop
 */
public class DoWhileLoop {
  public static void main( String[] args ) {
//    do {
//      System.out.println("Rumpf");
//    } while ( Math.random() > 0.1 );

//    int input;
//    do {
//      input = new java.util.Scanner( System.in ).nextInt();
//      System.out.println( input * 2 );
//    } while ( input != 0 );

    int input;
    int sum = 0;
    do {
      input = new java.util.Scanner( System.in ).nextInt();
      sum += input;
    } while ( input != 0 );
    System.out.println(sum);
  }
}
