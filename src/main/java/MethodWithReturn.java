import java.util.Scanner;

public class MethodWithReturn {
  public static void main( String[] args ) {
    System.out.println( Math.random() );
    Math.random();
    double random = random();
    System.out.println( random );
    System.out.println( random() );

    String name = readLine( "Provide a name" );
    System.out.println( name );
  }

  static double random() {
    return Math.random() * 10;
  }

  static String readLine( String message ) {
    System.out.println( message );
    return new Scanner( System.in ).nextLine();
  }

  static boolean isEven( int value ) {

    // 1.
    //    if ( value % 2 == 0 )
    //      return true;
    //    else
    //      return false;

    // 2.
//    if ( value % 2 == 0 )
//      return true;
//
//    return false;

    // 3.

    return value % 2 == 0;

  }
}
