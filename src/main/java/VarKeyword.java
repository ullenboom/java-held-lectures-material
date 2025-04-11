import java.util.ArrayList;

public class VarKeyword {

  // String name = "Chris";
  // var name = "Chris";  // Cannot resolve symbol 'var'

  public static void main( String[] args ) {

    // int class;  -> Identifier expected

    //    int i = 12;
    //    String s = "HELLO";
    //    double d = 1223434.3434;
    //    byte b = 12;
    //    char c = 'a';

    int i = 12;
    var s = "HELLO";
    var d = 1223434.3434;
    var b = 12;
    var c = 'a';

    // Type inference

    var j = i;  // j is int because i is int, because 12 is int

    //    var name;  // Cannot infer type: 'var' on variable without initializer
    //    name = "Chris";

    // var email = null;  // Cannot infer type: variable initializer is 'null'

    var string = "HELLO WORLD";

    var list = new ArrayList<ArrayList<String>>();

    var var = 12;

    // Unnamed Variables

    int _ = 12;
    // System.out.println( _ );   // Using '_' as a reference is not allowed
  }
}
