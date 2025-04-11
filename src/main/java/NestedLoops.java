public class NestedLoops {
  public static void main( String[] args ) {

    //    for ( int x = 1; x <= 10; x++ ) {
    //      for ( int y = 1; y <= 10; y++ ) {
    //        //        System.out.println( "x=" + x + " y=" + y );
    //        System.out.printf( "%3d ", x * y);
    //      }
    //      System.out.println();
    //    }

    //    for ( int x = 1; x <= 10; x++ ) {
    //      for ( int y = 1; y <= 10; y += x ) {
    //        // for ( int y = 1; y <= 10 + x; y++ ) {
    //        //      for ( int y = x; y <= 10; y++ ) {
    //        System.out.printf( "%3d ", x * y );
    //      }
    //      System.out.println();
    //    }

    end:
    for ( int x = 1; x <= 10; x++ ) {
      for ( int y = 1; y <= 10; y++ ) {
        System.out.printf( "%3d ", x * y );
        if ( x * y == 25 )
          break end;
      }
      System.out.println();
    }

  }
}
