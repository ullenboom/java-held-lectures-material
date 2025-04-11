package com.tutego.line;

/* package visible */
class Line {
  /* package visible */
  static void line() {
    line( 10 );
  }

  private static void line( int length ) {
    System.out.println( "-".repeat( length ) );
  }

}
