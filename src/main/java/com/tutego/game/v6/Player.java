package com.tutego.game.v6;

public class Player {
  private City location;

  public City currentLocation() {
    return location;
  }

  public void travelTo( City newCity ) {
    this.location = newCity;
  }
}
