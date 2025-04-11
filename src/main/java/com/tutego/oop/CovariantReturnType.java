package com.tutego.oop;

public class CovariantReturnType {

  class Event {}

  class Workout extends Event {}

  class Calendar {
    Event first() {
      return new Event();
    }
  }

  class WorkoutCalendar extends Calendar {
    // Covariant Return Type
    @Override Workout first() {
      return new Workout();
    }
  }

  public static void main( String[] args ) {

  }
}
