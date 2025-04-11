package com.tutego.game.v5;

import java.util.concurrent.ThreadLocalRandom;

public class Player {

  private String name;
  private int money;

  // Default Constructor

  Player() {
    money = ThreadLocalRandom.current().nextInt( 100, 500 );
  }

  Player( String name ) {
    // this.name = name.trim();
    // setName( name );
    this( name, 0 );
  }

  Player( String name, int startingMoney ) {
    setName( name );
    setMoney( startingMoney );
  }

  Player( Player other ) {
//    setName( other.getName() );
//    setMoney( other.getMoney() );
    this( other.getName(), other.getMoney() );
  }

  void buyCandy() {
    System.out.println( 2 );
  }

  public int getMoney() {
    return money;
  }

  public void setMoney( int money ) {
    if ( money >= 0 )
      this.money = money;
  }

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name.trim();
  }
}
