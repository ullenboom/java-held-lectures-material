package com.tutego.game.v2;

public class Candy {
  public String name;
  public int price;
  public int quantity;

  public boolean isUnavailable() {
    return quantity == 0;
  }

  public int totalPrice() {
    return price * quantity;
  }

  public void changeQuantity( int quantityChange ) {
    quantity = Math.max( quantity + quantityChange, 0 );
  }
}
