package com.tutego.oop;

import java.time.Duration;

class Event {
  public int duration;

  /**
   * @return ISO-8601 event duration.
   */
  final String format() {
    return Duration.ofMinutes( duration ).toString();
  }
}

class Flight extends Event {
//  @Override String format() {  // 'format()' cannot override 'format()' in 'com.tutego.oop.Event'; overridden method is final
//    return duration + " minutes";
//  }
}

// final String Integer Math System Color

// class Nap extends Event {}  // -> Cannot inherit from final 'com.tutego.oop.Event'

public class FinalMethodAndFinalClass {
  public static void main( String[] args ) {
    // Event event = new Event();
    Event event = new Flight();
    event.duration = 12312;
    System.out.println( event.format() ); // PT205H12M
  }
}
