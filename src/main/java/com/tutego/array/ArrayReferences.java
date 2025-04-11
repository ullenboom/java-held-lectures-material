package com.tutego.array;

import java.util.concurrent.ThreadLocalRandom;

public class ArrayReferences {
  public static void main( String[] args ) {

    String[] emails = new String[ 3 ];
    emails[ 0 ] = "abc@def.com";
    emails[ 1 ] = "abc@def.de";
    emails[ 2 ] = "abc@def.fi";

    // emails = new String[ 3 ];
    //    emails = null;
    //    System.out.println(emails[0]);
    // Exception in thread "main" java.lang.NullPointerException: Cannot load from object array because "emails" is null

    System.out.println( containsAtSign( emails ) );

    int[] randoms = createRandomIntArray( 10 );
    System.out.println( randoms.length );
    System.out.println( randoms[ 0 ] );
  }

  static int[] abs( int[] array ) {
    return array;
  }

  private static int[] createRandomIntArray( int length ) {
    int[] result = new int[ length ];
    for ( int i = 0; i < length; i++ ) {
      result[ i ] = ThreadLocalRandom.current().nextInt( 100 );
    }
    return result;
  }

  static int containsAtSign( String[] emails ) {
    for ( int i = 0; i < emails.length; i++ ) {
      String email = emails[ i ];
      boolean containsAtSign = email.contains( "@" );
      if ( !containsAtSign )
        return i;
    }
    return -1;
  }
}
