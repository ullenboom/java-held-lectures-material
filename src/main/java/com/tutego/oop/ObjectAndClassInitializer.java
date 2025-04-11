package com.tutego.oop;

import java.time.LocalDate;

//class Game {
//
//  LocalDate startDate = LocalDate.now();
//  int remainingDays = 30;
//
//  Game() {
//  }
//
//  Game( int initialDays ) {
//    remainingDays = initialDays;
//  }
//}

class Game {

  LocalDate startDate;
  int remainingDays;

  {
    startDate = LocalDate.now();
  }

  Game() {
    remainingDays = 30;
  }

  Game( int initialDays ) {
    // remainingDays = 30;
    remainingDays = initialDays;
  }
}

class StaticBlock {
  // static int C = 12;
  final static int C;
  static String S = "A" + "B" + 12;  // AB12

  static {
    C = 6 * 2;
    // System.out.println( 1 / 0 );
  }

  static {
    System.out.println( 1 );
  }

  static {
    System.out.println( 2 );
  }
}

public class ObjectAndClassInitializer {
  public static void main( String[] args ) {
    System.out.println( StaticBlock.C );
    //    System.out.println( StaticBlock.S );
    System.out.println( "AB12" );
  }
}
