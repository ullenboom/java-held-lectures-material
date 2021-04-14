import java.util.ArrayList;

/**
 * Lernziel: Einsatzorte vom Schlüsselwort `var`
 * - local variable type inference
 *
 * @see SwitchExpression
 */
public class VarKeyword {
  // var name = "chris";    CF
  public static void main( String[] args ) {
    int i = 12;
    var s = "Hallo";
    var d = 12334.334;
    var b = 12;
    var c = 'a';

//    var j = i;
//    var name;
//    name = "Chris";
//    var email = null;

    var string = "Hallo Welt";
    var list = new ArrayList<ArrayList<String>>();
  }
}

