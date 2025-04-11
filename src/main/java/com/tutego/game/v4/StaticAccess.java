package com.tutego.game.v4;

public class StaticAccess {
  public static void main( String[] args ) {

    System.out.println( Math.random() );
    System.out.println( Math.max( 1, 22 ) );
    System.out.println( Math.PI );

    System.out.println( City.COST_HERSHEY_TO_KANDY );                         // 1240
    City.COST_HERSHEY_TO_KANDY = 120;

    System.out.println( City.calculateTravelCost( "Hershey", "Kandy" ) );     // 120
    System.out.println( City.calculateTravelCost( "Kandy", "Hershey" ) );     // 1330
    System.out.println( City.calculateTravelCost( "kandy", "giggles" ) );     // 990
    System.out.println( City.calculateTravelCost( "Neijiangs", "hershey" ) ); // -1
    System.out.println( City.calculateTravelCost( "kandy", "kandy" ) );       // 0

    //

    System.out.println( City.COST_HERSHEY_TO_KANDY );                         // 1240
    // City city = new City();
    // System.out.println( city.COST_HERSHEY_TO_KANDY );

    // System.out.println( ((City)null).COST_HERSHEY_TO_KANDY );

    // String City = "City";
    //
    // System.out.println( City.toLowerCase() );

    // player.drink();
  }
}

//class player {
//  static void drink() {}
//}