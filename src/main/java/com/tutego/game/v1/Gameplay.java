package com.tutego.game.v1;

import java.util.Locale;

public class Gameplay {

  public static void main( String[] args ) {
    Candy lollipop = new Candy();
    lollipop.name = "Lollipop";
    lollipop.price = 12;
    lollipop.quantity = 2;

    Candy licorice = new Candy();
    //    licorice.name = "Licorice";
    //    licorice.price = 22;

    System.out.println( lollipop.name );
    System.out.println( lollipop.price );
    System.out.println( lollipop.quantity );

    System.out.println( licorice.name.toUpperCase( Locale.ROOT ) );
    System.out.println( licorice.price );
    System.out.println( licorice.quantity );

    System.out.println( lollipop.price * lollipop.quantity );

  }

}
