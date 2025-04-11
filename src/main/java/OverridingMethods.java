public class OverridingMethods {
  public static void main( String[] args ) {
    System.out.println( random() );
    System.out.println( random( 10. ) );
    System.out.println( random( 100, 200 ) );

    lines( 10 );
    lines( 10, '#' );
  }

  static double random() {
    return Math.random();
  }

  //  // 'random()' is already defined in 'OverridingMethods'
  //  static int random() {
  //    return Math.random();
  //  }

  static double random( double max ) {
    return Math.random() * max;
  }

  static int random( int max ) {
    return (int) (Math.random() * max);
  }

  static double random( double min, double max ) {
    return min + (Math.random() * (max - min));
  }

  // Optional Parameter

  static void lines( int len ) {
    lines( len, '#' );
  }

  static void lines( int len, char c ) {
    System.out.println( ("" + c).repeat( len ) );
  }
}
