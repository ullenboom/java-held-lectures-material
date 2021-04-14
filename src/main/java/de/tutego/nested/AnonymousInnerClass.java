package de.tutego.nested;

import de.tutego.generics.GenericsTypesGenericMethods;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Lernziel: Anonyme innere Klasse
 * - Syntax
 * - Exemplarinitialisierer (Doppelklammer-Initialisierung/double brace initialization)
 * - Umsetzung geschachtelter Klassen
 * - "Mehrfachvererbung" nachbilden
 *
 * @see GenericsTypesGenericMethods
 */
public class AnonymousInnerClass {
  public static void main( String[] args ) {
    //    class EmptyPredicate implements Predicate<String> {
    //      @Override public boolean test( String s ) {
    //        return s.isEmpty();
    //      }
    //    }
    //    EmptyPredicate emptyPredicate = new EmptyPredicate();

    // 1. implementieren von Schnittstellen, new Schnittstellenname() {...}

    Predicate<String> emptyPredicate = new Predicate<String>() {
      @Override public boolean test( String s ) {
        return s.isEmpty();
      }

      //      @Override public Predicate<String> and( Predicate<? super String> other ) {
      //        System.out.println(other);
      //        return Predicate.super.and( other );
      //      }
    };
    System.out.println( emptyPredicate.getClass() );
    List<String> list = new ArrayList<>();
    list.removeIf( emptyPredicate );

    List<String> list2 = new ArrayList<>();
    list2.removeIf( emptyPredicate );

    // 2. Bilden von Unterklassen, new Klassenname() {...}

    BigInteger bigInteger = new BigInteger( "3456528956" ) {
      @Override public String toString() {
        return super.toString() + " €";
      }
    };

    System.out.println( bigInteger.getClass() );
    System.out.println( bigInteger );

    // new String(){};

    List<String> objects = new ArrayList<>() {
      @Override public String get( int index ) {
        if ( index >= 0 && index < size() )
          return super.get( index );
        else
          return null;
      }
    };
    System.out.println( objects.get( -1 ) );
    System.out.println( objects.get( 0 ) );
    objects.add( "Hallo Welt" );
    System.out.println( objects.get( 0 ) );
    System.out.println( objects.get( 1 ) );

    BigInteger bigInteger2 = new BigInteger( "234534534534534345" ) {
      {
        if ( signum() == -1 )
          throw new IllegalArgumentException( "value was negative" );
      }
    };
    System.out.println( bigInteger2 );

    // Doppelklammer-Initialisierung/double brace initialization

    List<String> list1 = new ArrayList<>() {{
      add( "Hallo" );
      add( "Welt" );
    }};
    System.out.println( list1 );

    boolean compareIgnoreCase = true;
    Comparator<String> comparator = new Comparator<String>() {
      @Override public int compare( String s1, String s2 ) {
        if ( compareIgnoreCase )
          return String.CASE_INSENSITIVE_ORDER.compare( s1, s2 );
        else
          return s1.compareTo( s2 );
      }
    };
    System.out.println( comparator.compare( "abc", "ABC" ) );
    //    compareIgnoreCase=false;
    System.out.println( comparator.compare( "abc", "ABC" ) );

    List<String> list3 = new ArrayList<>();
    list3.removeIf( new Predicate<String>() {
      public boolean test( String s ) {
        return s.isEmpty();
      }
    } );
  }
}

class Place {
  String location;
}

class Business {
  LocalDate foundingDate;
}

class Restaurant extends Place {
  final Business business = new Business() {
    {
      foundingDate = LocalDate.now();
      location = "Hier";
    }
  };
}

class Order {
  static void takeBusiness(Business business){}
  static void takePlace(Place place){}

  public static void main( String[] args ) {
    Restaurant restaurant = new Restaurant();
    takePlace( restaurant );
    takeBusiness( restaurant.business );
  }
}
