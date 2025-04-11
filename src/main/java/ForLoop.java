public class ForLoop {
  public static void main( String[] args ) {

  /*
    do {
     StatementBlock
    } while ( Expression );

    =>

    StatementBlock
    while ( Expression ) {
      StatementBlock
    }
  */

    //    int counter = 1;
    //    while ( counter < 11 ) {
    //      System.out.println( counter );
    //      counter++;
    //    }

  /*
     for ( ForInit ; Expression ; ForUpdate ) Statement
   */

    //    for ( int counter = 1; counter < 11; counter++ ) {
    //      System.out.println( counter );
    //    }
    //
    //    int counter = 1;
    //    for ( ; counter < 11; counter++ ) {
    //      System.out.println( counter );
    //    }
    //    System.out.println( counter );  // 11

    // Comma in for loops

    for ( int x = 0, y = 0;
          Math.random() > 0.1;
          x++, y += (int) (Math.random() * 100) ) {
      System.out.println( x + " " + y );
    }

  }
}
