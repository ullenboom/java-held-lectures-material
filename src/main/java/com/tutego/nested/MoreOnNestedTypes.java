package com.tutego.nested;

import java.math.BigInteger;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class MoreOnNestedTypes {
  public static void main( String[] args ) {

    /*
     Initializer Blocks / Instance Initializer
     */

    BigInteger bigInteger = new BigInteger( "87234659872634978" ) {
      {
        if ( signum() == -1 )
          throw new IllegalArgumentException( "Value was negative" );
      }
    };
    System.out.println( bigInteger );

    /*
     Double Brace Initialization
     */

    ArrayList<String> list = new ArrayList<>() {{
      add( "Hello" );
      add( "World" );
    }};
    System.out.println( list );   // [Hello, World]

    /*
     Scope
     */

    boolean compareIgnoreCase = true;

    Comparator<String> comparator = new Comparator<String>() {
      @Override public int compare( String s1, String s2 ) {
        if ( compareIgnoreCase )
          return String.CASE_INSENSITIVE_ORDER.compare( s1, s2 );
        else
          return s1.compareTo( s2 );
      }
    };
    System.out.println( comparator.compare( "abc", "ABC" ) );  // 32  > 0

    //    compareIgnoreCase = false;
  }

  /*
  Multiple Inheritance
  */

  static class Place {
    String location;
  }

  static class Business {
    LocalDate foundingDate;
  }

  static class Restaurant extends Place {
    final Business business = new Business() {
      {
        foundingDate = LocalDate.now();
        location = "Here";
      }
    };
  }

  static class Order {
    static void takeBusiness( Business business ) {}

    static void takePlace( Place place ) {}

    public static void main( String[] args ) {
      Restaurant restaurant = new Restaurant();
      takePlace( restaurant );
      takeBusiness( restaurant.business );
    }
  }
}
