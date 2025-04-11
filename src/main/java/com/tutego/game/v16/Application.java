package com.tutego.game.v16;

/*
 Regular class:  A class that may have subclasses.
 Final Class:    A class that does not allow subclasses.
 Abstract Class: A class that must have a subclass.
 */
abstract class Event {
  String about;
  int duration;

  abstract void process( Player player );
}

// Class 'Mugging' must either be declared abstract or implement abstract method 'process(Player)' in 'Event'
class Mugging extends Event {
  @Override
  void process( Player player ) {
    player.money = 0;
  }
}

class Gift extends Event {
  @Override void process( Player player ) {
    player.money += 10_00;
  }
}

class NoopEvent extends Event {
  @Override void process( Player player ) {
  }
}

class RandomGameEvents {

  static Event nextRandomEvent() {
    double random = Math.random();
    if ( random < 0.5 )
      return new NoopEvent();
    if ( random < 0.8 )
      return new Gift();

    return new Mugging();
  }
}

class Player {
  int money;
  String location;

  void travelTo( String cityName ) {
    RandomGameEvents.nextRandomEvent().process( this );
    location = cityName;
  }
}

public class Application {
  static Event nextRandomEvent() {
    return Math.random() > 0.5 ? new Gift() : new Mugging();
  }

  public static void main( String[] args ) {
    // Event event = new Event(); // 'Event' is abstract; cannot be instantiated
    //    Event event = new Gift(); // Mugging();
    //    Event event = nextRandomEvent();
    //    Player player = new Player();
    //    player.money = 1000_00;
    //    event.process( player );
    //    System.out.println( player.money );

    Player player = new Player();
    player.money = 100_00;

    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
    player.travelTo( "Candy Town" );
    System.out.println( player.money );
  }
}
