package com.tutego.oop;

import java.time.LocalTime;
import java.util.Scanner;

class Product {
  public int price;
  public int quantity;

  private Product() {}

  static Product ofPrice( int price ) {
    Product result = new Product();
    result.price = price;
    return result;
  }

  static Product ofQuantity( int quantity ) {
    Product result = new Product();
    result.quantity = quantity;
    return result;
  }

}

public class FactoryPattern {
  public static void main( String[] args ) {

    Scanner scanner = new Scanner( System.in );

    LocalTime localTime = LocalTime.of( 10, 40 );

    Item.createItem( 12, 12 );
  }
}

class Item {
  public int price;
  public int quantity;

  private Item( int price, int quantity ) {
    this.price = price;
    this.quantity = quantity;
  }

  public static Item createItem( int price, int quantity ) {
    return new Item( price, quantity );
  }
}