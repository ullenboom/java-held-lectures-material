package com.tutego.game.v7;

class Candy {

  enum CandyType {
    CARAMELS, CHOCOLATE, GUMMIES,
    LICORICE, LOLLIPOPS, CHEWING_GUMS, COTTON_CANDY
  }

  CandyType type;
  int quantity;

  Candy( CandyType type, int quantity ) {
    this.type = type;
    this.quantity = quantity;
  }
}
