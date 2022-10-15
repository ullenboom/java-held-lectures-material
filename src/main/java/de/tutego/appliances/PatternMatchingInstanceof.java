package de.tutego.appliances;

/**
 * Lernziel: Pattern Matching bei `instanceof` (Java 16)
 *
 * @see OverrideMethod
 */
public class PatternMatchingInstanceof {

  private static void list( Appliance... appliances ) {
    for ( Appliance appliance : appliances ) {
//      if ( appliance instanceof Radio ) {
//        Radio radio = (Radio) appliance;
//        System.out.println( "Radio " + radio.getFrequency() );
//      }
      if ( appliance instanceof Radio radio && radio.getFrequency() == 0 ) {
        System.out.println( "Radio " + radio.getFrequency() );
      }
      else if ( appliance instanceof FireAlarm ) {
        System.out.println( "FireAlarm" );
      }
    }
  }

  public static void main( String[] args ) {
    Radio radio = new Radio();
    radio.setWatt( 12 );
    radio.setFrequency( 120 );

    FireAlarm fireAlarm = new FireAlarm();

    list( radio, fireAlarm );
  }
}