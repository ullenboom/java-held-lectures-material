/**
 * Lernziel: `System.out` und `System.err`
 * - Zwei Ausgabekanäle kennenlernen, für normale und Ausgaben und Fehlerausgaben
 *
 * @see ExpressionsOperators
 */
public class PrintSystemOutSystemErr {
  /*
   * Quiz: Warum heißt es System.out.println(...), nicht println(...)?
   */
  public static void main( String[] args ) {
    System.out.println("Hallo Welt");
    System.err.println("Hallo Welt");
  }
}
