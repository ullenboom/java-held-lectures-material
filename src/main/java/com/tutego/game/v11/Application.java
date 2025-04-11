package com.tutego.game.v11;

// class Object { Object() { /*1*/} }

class Event extends Object {
  String about;
  int duration;

  Event() {
    super();
    // 2
  }
}

class Nap extends Event {
  Nap() {
    super();
    // 3
  }
}

class Workout extends Event {
  private final String name;
  int caloriesBurned;

  Workout( String name ) {
    // super();
    this.name = name;
  }
}

class Jogging extends Workout {
  Jogging( String name ) {
    super( name );
  }
}

public class Application {

  public static void main( String[] args ) {
    new Nap();
  }
}
