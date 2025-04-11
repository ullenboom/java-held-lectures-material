package com.tutego.game.v10;

public class Application {
  public static void main( String[] args ) {
    // Event event = new Event();

    Nap sleep = new Nap();
    sleep.duration = 60;
    sleep.about = "Sleep";

    Workout walking = new Workout();
    walking.about = "Go for a run";
    walking.duration = 30;
    walking.caloriesBurned = 200;

    // sleep.toString()

    // Nap -|> Event -|> Object
    // Workout -|> Event -|> Object
  }
}
