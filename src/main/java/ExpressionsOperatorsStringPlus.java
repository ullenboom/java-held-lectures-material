public class ExpressionsOperatorsStringPlus {
  public static void main( String[] args ) {
    int age = 60;
    //    System.out.print( "Age: " );
    //    System.out.print( age );
    //    System.out.print( ", Weight: " );
    //    System.out.print( 150 );
    //    System.out.println();

    String s = "Age: " + age + ", Weight: " + 150 + '.' + "\n" + "Name: " + "Christian";
    System.out.println( s );

    System.out.println( "Boolean: " + true + ", " + false + ", " + (1 < 2) );
    System.out.println( "Double: " + 1.11111 );

    // ... -> String

    String number = "" + age;

    //

    System.out.println( 1 + 2 + "ABC" );   // 3ABC
    System.out.println( "ABC" + 1 + 2 );   // ABC12
    System.out.println( 1 + 2 + "ABC" + 1 + 2 );   // 3ABC12
    System.out.println( 1 + 2 + "ABC" + (1 + 2) );   // 3ABC3

    //

    System.out.println( 'a' + 0 );    // 97
    System.out.println( 'b' + 0 );    // 98
    System.out.println( 'a' + 'b' );    // 195
    System.out.println( "" + 'a' + 'b' );    // ab
  }
}
