package de.tutego.lang;

import java.util.ArrayList;

/**
 * Lernziel: Wrapper-Klassen / Autoboxing
 * - Aufgaben von Wrapper-Klassen
 * - Wrapper-Instanzen erfragen
 * - Oberklasse `Number`
 * - Gemeinsamkeiten und Unterschiede
 * - Autoboxing
 *
 * @see JavaUtilOptional
 */
public class WrapperClassesAutoboxing {
  public static void main( String[] args ) {
    /*
    byte 	    Byte
    short   	Short
    int     	Integer
    long 	    Long
    float 	  Float
    double 	  Double
    char 	    Character
    boolean 	Boolean
     */
    /*
      1. Utility-Methoden
      2. Instanzen
      3. Typ / Generics
     */
    /*
     1. valueOf(...)
     2. Boxing
     3. Konstruktoren / deprecated
     */
    System.out.println( Character.isDigit( '0' ) );
    System.out.println( Character.isWhitespace( ' ' ) );
    Character c = Character.valueOf( '#' );
    System.out.println( Boolean.TRUE.booleanValue() );
    System.out.println( Integer.toUnsignedString( 0xff_ff_ff_ff ) );
    System.out.println( Integer.MAX_VALUE );

    ArrayList<Integer> list = new ArrayList<>();
    list.add( Integer.valueOf( 12 ) );
    list.add( 12 );
    int integer = list.get( 0 );

    /*
    - valueOf(...)
    - toString(...)
    - parseXXX(...)
    - compare(...)
    - hashCode(...)
     */

    System.out.println( Byte.compare( (byte) 12, (byte) 12 ) );
    System.out.println( Long.compare( 345354, 2345234525L ) );

    // Autoboxing = Boxing + Unboxing
    // Boxing
    Character c1 = 'a';  // -> Character.valueOf(...)
    Integer i1 = 12;
    Long l1 = 12L;

    // Unboxing
    char c2 = c1;       // charValue()
    int i2 = i1 + 1;
    i1++;

    Byte b1 = null;
    //    System.out.println(b1==0); // NullPointerException
    //    switch ( b1 ) {
    //
    //    }

    Integer number1 = 1; // -> Integer.valueOf(1)
    Integer number2 = 1;// -> Integer.valueOf(1)
    Integer number3 = 1000;// -> Integer.valueOf(1000)
    Integer number4 = 1000;// -> Integer.valueOf(1000)
    System.out.println( number1 == number2 );  // true
    System.out.println( number3 == number4 );  // false -> kein Unboxing!! == Refe. Vergleich
    System.out.println( number3 <= number4 || number3 >= number4 );  // true -> Unboxing
    System.out.println( number3 == number4 - 0 );  // true -> Unboxing

    for ( Integer i = 0; i < 1000; i++ ) {

    }

    boolean b;
    Boolean b2;
    double d;
    Double d2;

    Object double3 = (Double) (double) 12;
    print( double3 );
    print( 12.2 );
    print( 12 );
    for ( int i = 0; i < 1000; i++ ) {
      // System.out.printf( "", i, 2., '3' );
      Object[] array = new Object[ 3 ];
      array[ 0 ] = Integer.valueOf( i );
      array[ 1 ] = Double.valueOf( 2. );
      array[ 2 ] = Character.valueOf( '3' );
      System.out.printf( "", array );
    }
  }

  static void print( Object o ) {
    System.out.println( o.getClass() );
  }
}
