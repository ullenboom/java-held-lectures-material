package com.tutego.game.v6;

public class GamePlay {
  public static void main( String[] args ) {

    Player pillLady = new Player();
    City candyTown = new City( "Candy Town", pillLady );
    // pillLady.travelTo( candyTown );

    System.out.println( pillLady.currentLocation() );
    pillLady.travelTo( new City( "Riesen City", pillLady ) );
    System.out.println( pillLady.currentLocation() );

  }
}
