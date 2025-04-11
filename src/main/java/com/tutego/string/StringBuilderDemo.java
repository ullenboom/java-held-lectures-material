package com.tutego.string;

import java.util.Scanner;

public class StringBuilderDemo {
  public static void main( String[] args ) {

    //    String helloWorld = new StringBuilder().append( "Hello World " )
    //                                           .append( 23 )
    //                                           .append( "." ).toString();
    //    System.out.println( helloWorld );

    // Capacity

    //    StringBuilder stringBuilder = new StringBuilder();
    //    System.out.println( stringBuilder.length() );     // 0
    //    System.out.println( stringBuilder.capacity() );   // 16
    //    stringBuilder.append( "Hello" );
    //    System.out.println( stringBuilder.length() );     // 5
    //    System.out.println( stringBuilder.capacity() );   // 16
    //    stringBuilder.append( "Hello Hello Hello Hello Hello Hello" );
    //    System.out.println( stringBuilder.length() );     // 40
    //    System.out.println( stringBuilder.capacity() );   // 40   length <= capacity
    //
    //    stringBuilder.append( '1' );
    //    System.out.println( stringBuilder.length() );     // 41
    //    System.out.println( stringBuilder.capacity() );   // 82
    //
    //    stringBuilder.delete( 0, stringBuilder.length() / 2 );
    //    System.out.println( stringBuilder );
    //    System.out.println( stringBuilder.length() );     // 21
    //    System.out.println( stringBuilder.capacity() );   // 82
    //
    //    stringBuilder.trimToSize();
    //    System.out.println( stringBuilder.length() );     // 21
    //    System.out.println( stringBuilder.capacity() );   // 21

    // new StringBuilder(int)

    // --------------

    String string = "";
    String line;
    do {
      line = new Scanner( System.in ).nextLine();
      string += line + "\n";
    } while ( !line.isEmpty() );

    //    StringBuilder string = new StringBuilder( 32 );
    //    String line;
    //    do {
    //      line = new Scanner( System.in ).nextLine();
    //      string.append( line ).append( '\n' );
    //    } while ( !line.isEmpty() );

    System.out.println( string );
  }
}
