package com.tutego.game.v3;

public class Gameplay {
  public static void main( String[] args ) {
    Candy lollipop = new Candy();
    lollipop.setName( "Lollipop" );
    lollipop.setPrice( 12 );
    lollipop.changeQuantity( 2 );

    System.out.println( lollipop.getName() );
    lollipop.setName( null );
    System.out.println( lollipop.getName() );
  }
}
