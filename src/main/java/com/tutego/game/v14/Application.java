package com.tutego.game.v14;

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

  static int totalDuration( Event... events ) {
    int sum = 0;
    for ( Event event : events ) {
      sum += event.duration;
    }
    return sum;
  }

  static int totalDurationOfNoNapEvents( Event... events ) {
    int sum = 0;
    for ( Event event : events ) {
      // if ( !(event instanceof Nap) )
      if ( !(event.getClass() == Nap.class) )
        sum += event.duration;
    }
    return sum;
  }

  static boolean burnedSameCalories( Event event1, Event event2 ) {
    //    if ( !(event1 instanceof Workout && event2 instanceof Workout) ) {
    //      return false;
    //    }
    //
    //    Workout workout1 = (Workout) event1;
    //    Workout workout2 = (Workout) event2;
    //    return workout1.caloriesBurned == workout2.caloriesBurned;
    //    if ( event1 instanceof Workout && event2 instanceof Workout ) {
    //      Workout workout1 = (Workout) event1;
    //      Workout workout2 = (Workout) event2;
    //      return workout1.caloriesBurned == workout2.caloriesBurned;
    //    }
    //    return false;
    // Pattern-Matching for instanceof
    //    if ( event1 instanceof Workout workout1 && event2 instanceof Workout workout2 ) {
    //      //                           --------                              --------   <-- Pattern variable
    //      return workout1.caloriesBurned == workout2.caloriesBurned;
    //    }
    //    return false;

    return event1 instanceof Workout workout1 && event2 instanceof Workout workout2
        && workout1.caloriesBurned == workout2.caloriesBurned;
    //     Flow Scoping
  }

  static String toXml( Object o ) {

    //    if ( o == null )
    //      return "<null/>";
    //
    //    if ( o instanceof Nap nap )
    //      return "<nap about=%s duration=%s/>".formatted( nap.about, nap.duration );
    //
    //    if ( o instanceof Workout workout)
    //      return "<workout ...>";
    //
    //    return "";

    //    switch ( o ) {
    //      case null -> {
    //        return "<null/>";
    //      }
    //      case Nap nap -> {
    //        return "<nap about=%s duration=%s/>".formatted( nap.about, nap.duration );
    //      }
    //      case Workout workout -> {
    //        return "<workout ...>";
    //      }
    //      case Event event -> {
    //        return "<event ... />";
    //      }
    //      default -> {
    //        return "<object/>";
    //      }
    //    }

    return switch ( o ) {
      case null -> "<null/>";
      //      // Label is dominated by a preceding case label 'Event event'
      //      case Event event -> "<event ... />";
      case Nap nap -> "<nap about=%s duration=%s/>".formatted( nap.about, nap.duration );
      case Workout workout -> "<workout ...>";
      case Event event -> "<event ... />";
      default -> "<object/>";
    };
  }

  static void guardsExample() {
    Event event = new Nap();
    switch ( event ) {
      case Nap nap when nap.duration < 10 -> {
        System.out.println( "Too brief" );
      }
      case Nap nap when nap.duration > 100 -> {
        System.out.println( "Too long!" );
      }
      case Nap nap -> {
        System.out.println( "Just right" );
      }
      case Workout workout -> {
      }
      default -> {
      }
    }
  }

  public static void main( String[] args ) {
    /*
    Workout wo1 = new Workout();
    System.out.println( wo1 instanceof Workout );        // true
    System.out.println( wo1 instanceof Event );          // true
    System.out.println( wo1 instanceof Object );         // true

    Event wo2 = new Workout();
    System.out.println( wo2 instanceof Workout );        // true
    System.out.println( wo2 instanceof Event );          // true
    System.out.println( wo2 instanceof Object );         // true
    System.out.println( wo2 instanceof Nap );            // false

    Object wo3 = new Workout();
    System.out.println( wo3 instanceof Workout );        // true
    System.out.println( wo3 instanceof Event );          // true
    System.out.println( wo3 instanceof Object );         // true
    System.out.println( wo3 instanceof Nap );            // false
    System.out.println( wo3 instanceof String );         // false
    */
    /*
    Nap nap = null;
    System.out.println( nap instanceof Nap );                  // false
    System.out.println( nap instanceof Object );               // false
    */

    System.out.println( toXml( null ) );
    Nap nap = new Nap();
    nap.duration = 30;
    nap.about = "sleep";
    System.out.println( toXml( nap ) );
    Workout workout = new Workout();
    workout.duration = 300;
    workout.about = "walking";
    workout.caloriesBurned = 12;
    System.out.println( toXml( workout ) );
  }
}
