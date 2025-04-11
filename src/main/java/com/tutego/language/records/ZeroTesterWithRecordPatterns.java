package com.tutego.language.records;

public class ZeroTesterWithRecordPatterns {

  static boolean isZeroPoint( Object object ) {
    // return object instanceof Point point && (point.x() | point.y()) == 0;
    return object instanceof Point( int a, int b ) && (a | b) == 0;
  }

  static boolean isZeroLine( Object object ) {
    //    return object instanceof Line line
    //        && (line.start().x() | line.start().y() | line.end().x() | line.end().y()) == 0;
    //    return object instanceof Line( var start, var end )
    //        && (start.x() | start.y() | end.x() | end.y()) == 0;
    return object instanceof Line( Point( int x1, int y1 ), Point( int x2, int y2 ) )
        && (x1 | y1 | x2 | y2) == 0;
  }

  static boolean isZero( Object object ) {
    return switch ( object ) {
      // case Point point -> (point.x() | point.y()) == 0;
      case Point( int x, int y ) -> (x | y) == 0;
      // case Line( Point start, Point end ) -> (start.x() | start.y() | end.x() | end.y()) == 0;
      // case Line( Point( int x1, int y1 ), Point( int x2, int y2 ) ) -> (x1 | y1 | x2 | y2) == 0;
      case Line( Point( int x1, int y1 ), Point( int x2, int y2 ) )
          when (x1 | y1 | x2 | y2) == 0 -> true;
      default -> false;
    };
  }

  static boolean isStartingWithZero( Object object ) {
    return switch ( object ) {
      case Line( Point( int x1, int y1 ), _ ) -> (x1 | y1) == 0;
      default -> false;
    };
  }

  public static void main( String[] args ) {
    Point zero = new Point( 0, 0 );
    System.out.println( isZeroPoint( zero ) );
    System.out.println( isZeroLine( new Line( zero, zero ) ) );
    System.out.println( isZero( zero ) );
    System.out.println( isZero( new Line( zero, zero ) ) );
  }
}

record Point( int x, int y ) {}

record Line( Point start, Point end ) {}
