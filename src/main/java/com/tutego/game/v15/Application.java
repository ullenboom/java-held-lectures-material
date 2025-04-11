package com.tutego.game.v15;

/*
class Object {
  ...
  public String toString() {
        return getClass().getName() + "@" + Integer.toHexString(hashCode());
    }
  }
 */

class Event extends Object {
  String about;
  int duration;

  @Override
  public String toString() {
    return "Event[about=%s, duration=%s]".formatted( about, duration );
  }
}

class Nap extends Event {
  @Override
  public String toString() {
    return "Nap[%s]".formatted( super.toString() );
  }
}

class Workout extends Event {
  int caloriesBurned;

  @Override
  public String toString() {
    return "Workout[%s, caloriesBurned=%s]".formatted( super.toString(), caloriesBurned );
  }
}

public class Application {
  public static void main( String[] args ) {
//    Object o = new Object();
//    System.out.println( o ); // java.lang.Object@7530d0a
//    Event event = new Event();
//    System.out.println( event ); // com.tutego.game.v15.Event@3941a79c
//    System.out.println( new Workout() ); // com.tutego.game.v15.Workout@4fca772d
//    System.out.println( new Point() );
//    System.out.println( new Nap() );

    Workout workout1 = new Workout();
    workout1.about = "about";
    workout1.duration = 10;
    workout1.caloriesBurned = 300;
    System.out.println( workout1.toString() );  // Workout[...]

    Event workout2 = new Workout();
    workout2.about = "about";
    workout2.duration = 10;
    System.out.println( workout2.toString() );  // Workout[...]

    Object workout3 = new Workout();
    System.out.println( workout3.toString() );  // Workout[...]
    System.out.println( workout3 );  // Workout[...]

  }

  //  // String
  //  public static String valueOf(Object obj) {
  //    return (obj == null) ? "null" : obj.toString();
  //  }
  //
  //  // PrintStream
  //  public void println( Object x ) {
  //    String s = (x == null) ? "null" : x.toString();
  //    //                                ^^^^^^^^^^^
  //    print( s );
  //    newLine();
  //  }
}
