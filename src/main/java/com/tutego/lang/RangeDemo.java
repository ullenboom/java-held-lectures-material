package com.tutego.lang;

import java.util.Iterator;
import java.util.NoSuchElementException;

import static com.tutego.lang.Range.range;

public class RangeDemo {
  public static void main( String[] args ) {
    for ( int i : range( 10, 20 ) )
      System.out.println( i );

    //    for ( int i : range( 100, 20 ) ) {
    //      System.out.println( i );
    //    }
  }
}

class Range implements Iterable<Integer> {
  private int start;
  private final int end;

  private Range( int start, int end ) {
    this.start = start;
    this.end = end;
  }

  static Iterable<Integer> range( int start, int end ) {
    if ( start > end )
      throw new IllegalArgumentException( "Start %d must be <= end %d".formatted( start, end ) );
    return new Range( start, end );
  }

  @Override public Iterator<Integer> iterator() {

    class RangeIterator implements Iterator<Integer> {

      @Override public boolean hasNext() {
        return start < end;
      }

      @Override public Integer next() {
        if ( !hasNext() )
          throw new NoSuchElementException( "No more values" );
        return start++;
      }
    }

    return new RangeIterator();
  }
}
