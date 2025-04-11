package com.tutego.array;

import java.util.concurrent.ThreadLocalRandom;

public class MainArgs {
  public static void main( String[] args ) {
    //    System.out.println( args.length );
    //    System.out.println( Arrays.toString( args ) );

    System.out.println( switch ( args.length ) {
      case 0 -> Math.random();
      case 1 -> ThreadLocalRandom.current().nextInt( Integer.parseInt( args[ 0 ] ) );
      case 2 -> ThreadLocalRandom.current().nextInt( Integer.parseInt( args[ 0 ] ),
                                                     Integer.parseInt( args[ 1 ] ) );
      default -> "Unknown number of parameters";
    } );

    System.exit( 1 );
  }
}
