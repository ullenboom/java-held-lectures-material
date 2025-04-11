package com.tutego.game.v13;

class Event {
  String about;
  int duration;
}

class Nap extends Event {
}

class Workout extends Event {
  int caloriesBurned;
}

public class Application {

  //  int totalDuration( Nap event1, Nap event2 ) {
  //    return event1.duration + event2.duration;
  //  }
  //
  //  int totalDuration( Nap event1, Workout event2 ) {
  //    return event1.duration + event2.duration;
  //  }
  //
  //  int totalDuration( Workout event1, Workout event2 ) {
  //    return event1.duration + event2.duration;
  //  }

  static int totalDuration( Event event1, Event event2 ) {
    return event1.duration + event2.duration;
  }

  static int totalDuration( Event... events ) {
    int sum = 0;
    for ( Event event : events ) {
      sum += event.duration;
    }
    return sum;
  }

  public static void main( String[] args ) {
    /*
    Liskov substitution principle (LSP)
     */

    Workout running = new Workout();
    running.duration = 50;
    Event sleeping = new Nap();
    sleeping.duration = 40;
    System.out.println( totalDuration( running, sleeping ) );
    System.out.println( totalDuration( running ) );

    System.out.println( running );  // com.tutego.game.v13.Workout@506e1b77
  }
}
