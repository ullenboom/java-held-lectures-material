package com.tutego.game.v3;

public class Candy {
  private String name;
  private int price;
  public int quantity;

  public boolean isUnavailable() {
    return quantity == 0;
  }

  public int totalPrice() {
    return getPrice() * quantity;
  }

  public void changeQuantity( int quantityChange ) {
    quantity = Math.max( quantity + quantityChange, 0 );
  }

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    if ( name != null && !name.isBlank() )
      this.name = name;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice( int price ) {
    if ( price > 0 )
      this.price = price;
  }
}
