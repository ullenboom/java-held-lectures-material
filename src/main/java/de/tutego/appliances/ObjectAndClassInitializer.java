package de.tutego.appliances;

/**
 * Lernziel: Initialisierungsarten
 * - Attribut-Initialisierung
 * - Exemplar-Initialisierer
 * - Statischer Initialisierer
 *
 * @see Associations
 */
public class ObjectAndClassInitializer {
  public static void main( String[] args ) {
    new Dungon();
    new Dungon( 3 );
    System.out.println( new Joystick().numberOfButtons );
    System.out.println(Math2.PI);
  }
}

class Dungon {
  // Exemplar-Initialisierer
  {
    System.out.println( "1" );
  }

  Dungon() {
    System.out.println( "3" );
  }

  Dungon( int n ) {
    System.out.println( "int 3" );
  }

  {
    System.out.println( "2" );
  }
  /*
  =>
  Dungon() {
    System.out.println("1");
    System.out.println("2");
    System.out.println("3");
  }

   */
}

/*
class Joystick {
  int numberOfButtons = (int) (Math.random() * 100);
  Joystick() {}
  Joystick( int numberOfButtons ) {this.numberOfButtons = numberOfButtons;}
}
*/
class Joystick {
  int numberOfButtons;

  Joystick() {numberOfButtons = (int) (Math.random() * 100);}

  Joystick( int numberOfButtons ) {
    numberOfButtons = (int) (Math.random() * 100);
    this.numberOfButtons = numberOfButtons;
  }
}

class Math2 {
  public static final double PI;
  static int i;
  static {
    PI = 3.141592653589793;
    i = 1/0;
  }
}