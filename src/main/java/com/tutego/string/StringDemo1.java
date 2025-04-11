package com.tutego.string;

public class StringDemo1 {
  public static void main( String[] args ) {

    /*
     Character Access and Array creation, Length
    */

    String name = "Chris";
    System.out.println( name.charAt( 0 ) );
    System.out.println( name.length() );
    System.out.println( name.length() == 0 );
    System.out.println( name.isEmpty() );
    System.out.println( name.charAt( name.length() - 1 ) );

    System.out.println( isAllDigits( "abd" ) );
    System.out.println( isAllDigits( "123" ) );
    System.out.println( isAllDigits( "123ddd" ) );

    // name.getBytes()
    // name.getChars(  );

    // name.codePointAt(  )

    // new String()
  }

  static boolean isAllDigits( String s ) {
    for ( int i = 0; i < s.length(); i++ ) {
      if ( !Character.isDigit( s.charAt( i ) ) ) {
        return false;
      }
    }
    return true;
  }

}
