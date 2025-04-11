package com.tutego.game.v4;

public class City {
  /*
                  (2_90)
   Giggles -------------------- Hershey
      |                           /
      |                         / (12_40 ->)
      |                       /
    (9_90)                  /
      |                   /
      |                 /
      |               /
      |             /
      |           /
      |         /
      |       / (<- 13_30)
      |     /
      Kandy
   */

  public static int COST_GIGGLES_TO_HERSHEY =  2_90;
  public static int COST_GIGGLES_TO_KANDY   =  9_90;
  public static int COST_HERSHEY_TO_KANDY   = 12_40;
  public static int COST_KANDY_TO_HERSHEY   = 13_30;


  public static int calculateTravelCost( String cityName1, String cityName2 ) {
    int[][] costs = {
    //             KANDY                   HERSHEY                  GIGGLES
    /* KANDY */   { 0,                     COST_KANDY_TO_HERSHEY,   COST_GIGGLES_TO_KANDY },
    /* HERSHEY */ { COST_HERSHEY_TO_KANDY, 0,                       COST_GIGGLES_TO_HERSHEY },
    /* GIGGLES */ { COST_GIGGLES_TO_KANDY, COST_GIGGLES_TO_HERSHEY, 0 }
    };

    int city1Index = getCityIndex( cityName1 ), city2Index = getCityIndex( cityName2 );
    return (city1Index >= 0 && city2Index >= 0) ? costs[ city1Index ][ city2Index ] : -1;
  }

  private static int getCityIndex( String cityName ) {
    return switch ( cityName.toLowerCase() ) {
      case "kandy"   -> 0;
      case "hershey" -> 1;
      case "giggles" -> 2;
      default -> -1;
    };
  }
}
