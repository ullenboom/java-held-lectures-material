package com.tutego.oop;

public class ThisReference {

  /*
   Passing the Current Class Instance as an Argument
   */

  /*
   Cascading Methods
   */

  /*
   Disambiguating Variable References
   */

  public static void main( String[] args ) {

    StringBuilder append = new StringBuilder().append( "Hello " ).append( "World" );
    System.out.println( append );

    CandyOrder lollipop = new CandyOrder().candyName( "Lollipop" ).price( 200 )
                                          .addQuantity( 100 ).addQuantity( 200 );

    // String args; // Variable 'args' is already defined in the scope

    for ( int i = 0; i < 100; i++ ) {
    }
    for ( int i = 0; i < 100; i++ ) {
    }

    /*
     shadowed variable
     */
  }
}

class Candy {
  String name = "Lolli";
  int price = 20;
  int quantity = 3;

  void printCandyDetails() {
    CandyDisplay.displayCandy( this );
    //                         ^^^^
  }
}

class CandyDisplay {
  static void displayCandy( Candy candy ) {
    System.out.println( candy.name );
    System.out.println( candy.price );
    System.out.println( candy.quantity );
  }
}

class CandyOrder {
  private String candyName;
  private int price;
  private int orderQuantity;

  CandyOrder candyName( String newCandyName ) {
    this.candyName = newCandyName;
    return this;
  }

  CandyOrder price( int price ) {
    this.price = price;
    return this;
  }

  CandyOrder addQuantity( int quantity ) {
    this.orderQuantity += quantity;
    return this;
  }
}