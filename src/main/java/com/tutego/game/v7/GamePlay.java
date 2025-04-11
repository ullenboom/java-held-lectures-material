package com.tutego.game.v7;

import com.tutego.game.v7.Candy.CandyType;

public class GamePlay {

  public static void main( String[] args ) {
    Player bonbonBob = new Player();

    // Buy various candies
    bonbonBob.buyCandy( CandyType.CHOCOLATE, 10 );
    bonbonBob.buyCandy( CandyType.CARAMELS, 5 + 15 );
    bonbonBob.buyCandy( CandyType.CHEWING_GUMS, 14 );
    bonbonBob.buyCandy( CandyType.CHEWING_GUMS, 1 );

    System.out.println( "Current candy stash:" );
    bonbonBob.displayCandies();

    // Sell some candies
    if ( bonbonBob.sellCandy( CandyType.CARAMELS, 5 ) )
      System.out.println( "Successfully sold 5 Caramels." );

    if ( ! bonbonBob.sellCandy( CandyType.CARAMELS, 50000 ) )
      System.out.println( "Doesn't have enough Caramels to sell." );

    System.out.println( "Candy stash after selling Caramels:" );
    bonbonBob.displayCandies();

    // Sell remaining Caramels (handles empty stock case)
    if ( bonbonBob.sellCandy( CandyType.CARAMELS, 15 ) )
      System.out.println( "Sold the remaining 15 Caramels." );

    System.out.println( "Final candy stash:" );
    bonbonBob.displayCandies();
  }
}