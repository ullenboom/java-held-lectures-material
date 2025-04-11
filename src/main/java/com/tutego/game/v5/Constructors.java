package com.tutego.game.v5;

import java.awt.*;

public class Constructors {
  public static void main( String[] args ) {
    //    Point point = new Point();
    //    Point point1 = new Point( 1, 2 );

    System.out.println( 0 );
    Player player = new Player();
    System.out.println( player );
    player.buyCandy();
    System.out.println( 3 );
    System.out.println( player.getMoney() );

    System.out.println( new Player().getMoney() );

    new Player();
    new Player( "" );
    Player lollipop = new Player( "Lollipop", 100 );

    new Color( 255, 0, 0 );
    // Immutable

    Player player1 = new Player( lollipop );
    System.out.println( player1.getMoney() );
    System.out.println( player1.getName() );
  }
}

class Border {
  final int borderType;

//  public Border() {
//  }

  public Border( int borderType ) {
    this.borderType = borderType;
  }
}