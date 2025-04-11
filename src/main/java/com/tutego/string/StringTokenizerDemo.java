package com.tutego.string;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
  public static void main( String[] args ) {

    StringTokenizer stringTokenizer1 = new StringTokenizer( "Hello \t    World" );
    while ( stringTokenizer1.hasMoreTokens() )
      System.out.println( stringTokenizer1.nextToken() );

    StringTokenizer stringTokenizer2 = new StringTokenizer( "key = value", " =" );
    System.out.println( stringTokenizer2.countTokens() );
    while ( stringTokenizer2.hasMoreTokens() )
      System.out.println( stringTokenizer2.nextToken() );

    double sum = 0;
    StringTokenizer stringTokenizer3 = new StringTokenizer( "345.345345 345345.54554" );
    while ( stringTokenizer3.hasMoreTokens() ) {
      String number = stringTokenizer3.nextToken();
      sum += Double.parseDouble( number);
    }
    System.out.println( sum );
  }
}
