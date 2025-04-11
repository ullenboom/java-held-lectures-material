package com.tutego.lang;

import java.util.ArrayList;
import java.util.List;

public class Autoboxing {

  public static void main( String[] args ) {

    // Create:       Wrapper.valueOf(...)
    // Access value: wrapper.xxxValue()

    // Autoboxing = Boxing + Unboxing

    // Boxing
    Character c1 = 'a';   // Character.valueOf('a')
    Integer i1 = 12;
    Long l1 = 12L;

    // Unboxing
    char c2 = c1;        // c1.charValue()

    List<Integer> list = new ArrayList<>();
    // list.add( Integer.valueOf( 12 ) );
    list.add( 12 );
    // Integer i = list.get( 0 );
    int i = list.get( 0 );

    int i2 = i1 + 1;
    i1++;

    // Issues

    Byte b1 = null;
    // System.out.println( b1 == 0 );
    // java.lang.NullPointerException: Cannot invoke "java.lang.Byte.byteValue()" because "b1" is null

    //    switch ( b1 ){ // Cannot invoke "java.lang.Byte.byteValue()" because "b1" is null
    //    }

    Integer number1 = 1;       // Integer.valueOf(1)
    Integer number2 = 1;       // Integer.valueOf(1)
    Integer number3 = 1000;    // Integer.valueOf(1000)
    Integer number4 = 1000;    // Integer.valueOf(1000)

    System.out.println( number1 == number2 );      // true     => NO Unboxing!
    System.out.println( number3 == number4 );      // false    => NO Unboxing!
    System.out.println( number3 <= number4 );      // true     => Unboxing
    System.out.println( number3 >= number4 );      // true     => Unboxing
    System.out.println( number3 == number4 - 0 );   // true     => Unboxing

    // Performance issues

    for ( Integer j = 0; j < 1000; j++ ) {

    }

    boolean bool1;
    Boolean bool2;

    double double1;
    Double double2;

    // Number + Object base class

    Object double3 = (Double) (double) 12;
    print( double3 );    // 12.0
    print( 12 );         // 12
    print( 12.2 );       // 12.2

    for ( int j = 0; j < 1000; j++ ) {
      // System.out.printf( "", j, 2., '3' );
      Object[] array = new Object[ 3 ];
      array[ 0 ] = Integer.valueOf( j );
      array[ 1 ] = Double.valueOf( 2. );
      array[ 2 ] = Character.valueOf( '3' );
      System.out.printf( "", array );
    }
  }

  static void print( Object o ) {
    System.out.println( o );
    System.out.println( o.getClass() );
  }
}
