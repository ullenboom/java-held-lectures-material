package de.tutego.appliances;

/**
 * Lernziel: Typbeziehungen
 * - Referenztyp und Objekttyp
 * - Implizite und explizite Typumwandlung
 * - `ClassCastException`
 * - `getClass()`, `class`-Literal
 * - `instanceof`-Operator
 * - Liskovsches Substitutionsprinzip
 *
 * @see PatternMatchingInstanceof
 */
public class ImplicitExplicitType {
  public static void main( String[] args ) {
    Radio radio = new Radio();
    FireAlarm fireAlarm = new FireAlarm();
    // Appliance appliance = new Appliance();
    Object o = new Object();
    /*
     Radio is-a Radio
     FireAlarm is-a FireAlarm
     Appliance is-a Appliance
     Object is-a Object
    */
    /*
     Radio is-a Appliance
     Appliance is-a Object
     => Radio is-a Object

     FireAlarm is-a Appliance is-a Object
     */

    // Referenztyp   Objekttyp
    Radio r1 = new Radio();
    Appliance r2 = new Radio();
    Object r3 = new Radio();
    Object r4 = new FireAlarm();

    System.out.println( ((Radio) r3).getFrequency() );
    //    System.out.println(((Radio)r4).getFrequency());

    System.out.println( r4.getClass() );
    System.out.println( r3.getClass() );

    if ( r3.getClass() == Radio.class )
      System.out.println( "Ist ein Radio" );

    System.out.println( r1 instanceof Radio );
    System.out.println( r3 instanceof Radio );
    System.out.println( r3 instanceof Appliance );
    System.out.println( r4 instanceof Radio );
    System.out.println( r4 instanceof Appliance );

    r1.setWatt( 100 );
    r2.setWatt( 10 );
    System.out.println( Appliance.watt( r1, r2 ) );
  }
}
