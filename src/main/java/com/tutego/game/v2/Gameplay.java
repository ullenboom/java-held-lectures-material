package com.tutego.game.v2;

public class Gameplay {
  public static void main( String[] args ) {
    Candy lollipop = new Candy();
    lollipop.name = "Lollipop";
    lollipop.price = 12;
    lollipop.quantity = 2;

    boolean isUnavailable = lollipop.isUnavailable();
    System.out.println( isUnavailable );

    System.out.println( lollipop.totalPrice() );

    lollipop.changeQuantity( -1 );
    System.out.println( lollipop.quantity );

    lollipop.changeQuantity( 10 );
    System.out.println( lollipop.quantity );

    lollipop.changeQuantity( -100 );
    System.out.println( lollipop.quantity );

  }
}
