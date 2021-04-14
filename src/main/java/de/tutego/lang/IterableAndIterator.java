package de.tutego.lang;

import java.util.*;

import static de.tutego.lang.Range.range;

/**
 * Lernziel: Schnittstellen `Iterable` und `Iterator`
 * - Wiederholung erweitere `for`-Schleife
 * - Methoden vom `Iterator`
 * - Methoden vom `Iterable`
 * - `Iterable` und `Iterator` implementieren
 *
 * @see de.tutego.nested.NestedTypes
 */
public class IterableAndIterator {
  public static void main( String[] args ) {

    //    // Array
    //    String[] names = { "Jill", "Jo" };
    //    for ( String name : names ) {
    //      System.out.println( name );
    //    }
    //
    //    // Iterable
    //    List<String> places = new ArrayList<>();
    //    places.add( "Sonsbeck" );
    //    places.add( "Dortmund" );
    //    for ( String place : places ) {
    //      System.out.println( place );
    //    }

    // https://jdec.app/

//    String[] names = new String[]{ "Jill", "Jo" };
//    String[] var2 = names;
//    int var3 = names.length;
//
//    for ( int i = 0; i < var3; ++i ) {
//      String name = var2[ i ];
//      System.out.println( name );
//    }
//
//    List<String> places = new ArrayList();
//    places.add( "Sonsbeck" );
//    places.add( "Dortmund" );
//
//    Iterator var7 = places.iterator();
//    while ( var7.hasNext() ) {
//      String place = (String) var7.next();
//      System.out.println( place );
//    }

//    Toaster toaster1 = new Toaster();
//    Toaster toaster2 = new Toaster();
//    Toasters toasters = new Toasters();
//    toasters.add( toaster1 );
//    toasters.add( toaster2 );
//    for ( Iterator<Toaster> iterator = toasters.iterator(); iterator.hasNext(); ) {
//      Toaster toaster = iterator.next();
//      System.out.println( toaster );
////      iterator.remove();
//    }
//    System.out.println( toasters.iterator().hasNext() );

    for ( int i : range( 10, 20 ) ) {
      System.out.println(i);
    }
    for ( int i : range( 100, 100 ) ) {
      System.out.println(i);
    }
  }
}

class Toaster {
}

class Toasters implements Iterable<Toaster> {
  private List<Toaster> toasters = new ArrayList<>();

  void add( Toaster toaster ) {
    toasters.add( toaster );
  }

  List<Toaster> toasters() {
    return Collections.unmodifiableList(toasters);
  }

  @Override public Iterator<Toaster> iterator() {
    return Collections.unmodifiableCollection( toasters ).iterator();
  }
}

class Range implements Iterable<Integer> {
  private int start;
  private final int end;

  private Range( int start, int end ) {
    this.start = start;
    this.end = end;
  }

  static Iterable<Integer> range( int start, int end) {
    if ( start>end )
      throw new IllegalArgumentException(String.format( "start %d must be <= end %d", start, end ));
    return new Range(start, end);
  }

  @Override public Iterator<Integer> iterator() {
    class RangeIterator implements Iterator<Integer> {
      @Override public boolean hasNext() {
        return start<end;
      }

      @Override public Integer next() {
        if ( !hasNext() )
          throw new NoSuchElementException("no more values");
        return start++;
      }
    }
    return new RangeIterator();
  }
}
