public class MethodWithParameter {
  public static void main( String[] args ) {

    /*
     println()              Math.random()
     println("Hello")       Math.sin(1)
     */

    printChar( '*' );
    System.out.println();
    lines( 10, '#' );   // 10 and '#' are arguments

    int size = 10;
    char symbol = '-';
    lines( size, symbol );    // lines(10, '-')    call by value
  }

  static void printChar( char c ) {
    System.out.print( c );
  }

  static void lines( int len, char c ) {
    //               ^^^^^^^ Parameter

    switch ( c ) {
      case ' ', '\t':
        return;
    }

    for ( int i = 0; i < len; i++ ) {
      printChar( c );
    }
  }

}
