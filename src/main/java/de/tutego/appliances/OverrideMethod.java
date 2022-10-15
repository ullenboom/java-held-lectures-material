package de.tutego.appliances;

/**
 * Lernziel: Methoden überschreiben
 * - Annotation `@Override`
 * - `super`-Aufruf
 * - finale Methoden und finale Klassen
 * - kovariante Rückgabetypen
 *
 * @see DynamicBinding
 */
public class OverrideMethod {
  public static void main( String[] args ) {
    FireAlarm fireAlarm = new FireAlarm();
    fireAlarm.setOn( false );
    FireAlarm log = fireAlarm.log();

    System.out.println( new Radio().toString() );

//    BadRadio badRadio = new BadRadio();
//    badRadio.setFrequency( -33444 );
  }
}

//class BadRadio extends Radio {
//  @Override void setFrequency( double newFrequency ) {
//    frequency = newFrequency;
//  }
//}
