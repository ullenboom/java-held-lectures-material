public class MethodRefactoring {
  public static void main( String[] args ) {
    // 1. Rename
    line();

    // 2. Change method signature
    line( 12, "-" );

    // 3. Extract to Method
    int size = 10;

    printLine( size );
    System.out.println();
    printLine( size );

    int a = 12;
    int b = 12;
    int area = area( a, b );
    System.out.println( area );

    // 4. Inlining
    System.out.println( 6 );
  }

  static int perimeter( int a, int b ) {
    return 2 * a + 2 * b;
  }

  static int perimeter( int a, int b, int c ) {
    return 2 * a + 2 * b + 2 * c;
  }

  private static int area( int a, int b ) {
    //    int area = a * b;
    //    return area;
    return a * b;
  }

  private static void printLine( int size ) {
    for ( int i = 0; i < size; i++ ) {
      System.out.print( "-" );
    }
  }

  private static void line( int size, String symbol ) {
  }

  static void line() {}

  static void line( int size, char symbol ) {}
}
