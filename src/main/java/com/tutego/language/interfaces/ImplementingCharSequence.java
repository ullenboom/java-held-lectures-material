package com.tutego.language.interfaces;

public class ImplementingCharSequence {
  public static void main( String[] args ) {
    CharSequence x = new RepeatingCharacters( 10, 'x' );
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append( "Hello" );
    stringBuilder.append( x );
    stringBuilder.append( "World" );
    System.out.println( stringBuilder ); // HelloxxxxxxxxxxWorld

    System.out.println( x );  // xxxxxxxxxx

    System.out.println( x.subSequence( 0, 2 ) );  // xx
  }
}

//class RepeatingCharacters implements CharSequence {
//
//  private final int length;
//  private final char c;
//
//  public RepeatingCharacters( int length, char c ) {
//    this.length = length;
//    this.c = c;
//  }
//
//  @Override public int length() {
//    return length;
//  }
//
//  @Override public char charAt( int index ) {
//    return c;
//  }
//
//  @Override public CharSequence subSequence( int start, int end ) {
//    return new RepeatingCharacters( end - start, c );
//  }
//
//  @Override public String toString() {
//    return Character.toString( c ).repeat( length );
//  }
//}

record RepeatingCharacters( int length, char c ) implements CharSequence {

  @Override public int length() {
    return length;
  }

  @Override public char charAt( int index ) {
    return c;
  }

  @Override public CharSequence subSequence( int start, int end ) {
    return new RepeatingCharacters( end - start, c );
  }

  @Override public String toString() {
    return Character.toString( c ).repeat( length );
  }
}