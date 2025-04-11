public class RecursiveMethods {
  public static void main( String[] args ) {
    // decrement( 10 );
    int value = faculty( 10 );  // 10 * 9 * 8 * 7 .. 2
    System.out.println( value );
  }

  private static int faculty( int value ) {
    if ( value <= 1 )
      return 1;

    return value * faculty( value - 1 );
  }

  static void decrement( int i ) {
    if ( i < 0 )
      return;
    System.out.println( i );
    decrement( i - 1 );
  }
}
