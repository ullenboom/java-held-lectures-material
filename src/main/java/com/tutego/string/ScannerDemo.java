package com.tutego.string;

import java.util.Scanner;

public class ScannerDemo {
  public static void main( String[] args ) {

    //    Scanner scanner = new Scanner( "12.1234 275643 5234 234" );//.useLocale( Locale.FRENCH );
    //    while ( scanner.hasNextDouble() ) {
    //      System.out.println( scanner.nextDouble() );
    //    }

    String colors = "255 0 0 red 0 255 0 green";
    Scanner colorScanner = new Scanner( colors );
    while ( colorScanner.hasNextInt() ) {
      int red = colorScanner.nextInt();
      int green = colorScanner.nextInt();
      int blue = colorScanner.nextInt();
      String colorName = colorScanner.next();
      System.out.printf( "rgb %d, %d, %d = %s%n", red, green, blue, colorName );
    }

  }
}
