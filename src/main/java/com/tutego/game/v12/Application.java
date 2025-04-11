package com.tutego.game.v12;

class Event extends Object {
  String about;
  int duration;
}

class Nap extends Event {
}

class Workout extends Event {
  int caloriesBurned;
}

public class Application {
  public static void main( String[] args ) {

    Nap nap1 = new Nap();
    Event nap2 = new Nap();
    Object nap3 = new Nap();

    //                =
    // Reference Type   Object Type

    Workout workout1 = new Workout();
    Event workout2 = new Workout();
    Object workout3 = new Workout();

    //

    nap1.about = "Sleep";
    workout1.about = "Jogging";
    workout1.caloriesBurned = 100;

    // Reference Type: Event

    // workout2.caloriesBurned  // Cannot resolve symbol 'caloriesBurned'

    // Reference Type: Object

    nap3.toString();

    //

    //    Event event = new Workout();
    //    Workout running = (Workout) event;
    //    running.caloriesBurned = 12;

    Event event = new Nap();
    Workout running = (Workout) event;
    running.caloriesBurned = 12;

    /*
    Exception in thread "main" java.lang.ClassCastException:
    class com.tutego.game.v12.Nap cannot be cast to class
    com.tutego.game.v12.Workout (com.tutego.game.v12.Nap and
    com.tutego.game.v12.Workout are in unnamed module of loader 'app')
     */

  }
}
