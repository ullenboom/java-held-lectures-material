/**
 * Lernziel: `switch`-`case`-Anweisung
 * - `switch` und `case`-Blöcke
 * - `default`
 * - Durchfallen
 * - Stack-Case-Labels
 *
 * @see DoWhileLoop
 */
public class SwitchCaseStatement {
  public static void main( String[] args ) {
    int random = (int)(Math.random() * 3); // 0, 1, 2
    final int ZERO = 0;
    switch ( random ) {
      case ZERO:
        System.out.println("rot");
        break;
      case 1:
        System.out.println("grün");
        break;
      case 2:
        System.out.println("blau");
        break;
    }

    String input = "Ice";
    switch ( input ) {
      case "Schokolade":
        System.out.println("Schoki");
        break;
      case "Eis" :
      case "Ice" :
        System.out.println("Eis");
        break;
      default:
        System.out.println("Etwas anderes, ist das essbar?");
    }
  }
}
