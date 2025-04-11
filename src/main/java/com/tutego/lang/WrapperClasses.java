package com.tutego.lang;

import java.util.ArrayList;

public class WrapperClasses {
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
      1. Static Utility Methods
      2. Create Instances: valueOf(...), Boxing
     */

    // 1.toString() in JavaScript possible

    System.out.println( Character.isDigit( '0' ) );
    System.out.println( Character.isWhitespace( ' ' ) );
    Character c = Character.valueOf( '#' );
    System.out.println( Boolean.TRUE.booleanValue() );
    System.out.println( Boolean.FALSE.booleanValue() );
    System.out.println( Integer.toUnsignedString( 0xff_ff_ff_ff ) ); // 4294967295
    System.out.println( Integer.MAX_VALUE );  // 2147483647

    /*
     3. Typ / Generics
     */

    // ArrayList<int> list;   // Type argument cannot be of primitive type
    ArrayList<Integer> list = new ArrayList<>();
    list.add( Integer.valueOf( 12 ) );

    /*
      Common for all Wrapper classes

    - valueOf(...)
    - toXXXString(...)
    - parseXXX(...)
    - compare(...)
    - hashCode(...)
     */

    System.out.println( Byte.compare( (byte) 12, (byte) 12 ) );  // 0
    System.out.println(Long.compare( 2345435, 2345345345L ));    // 1
  }
}
