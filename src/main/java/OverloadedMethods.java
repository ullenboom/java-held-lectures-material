public class OverloadedMethods {
  public static void main( String[] args ) {

    System.out.println( "Hello" );        // String
    System.out.println( 1234 );           // int
    System.out.println();

    System.out.print( "World" );
    System.out.print( ' ' );
    System.out.print( 5678 );

    System.out.println();   // -> print + ln

    //

    System.out.printf( "Hello %s%n", "World" );

    int a = 12;
    int b = 234;
    System.out.printf( "%s * %s = %s%n", a, b, a * b );
    //                  a    b    a*b

    System.out.printf( "%d * %d =%n %d%n", a, b, a * b );

    /*
      https://docs.oracle.com/en/java/javase/index.html
     */
  }
}
