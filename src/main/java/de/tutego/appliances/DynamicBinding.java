package de.tutego.appliances;

/**
 * Lernziel: Dynamisches Binden
 * - Methoden überschreiben und dynamisch binden
 * - Wo nicht dynamisch gebunden wird
 *
 * @see AbstractClasses
 */
public class DynamicBinding {
  public static void main( String[] args ) {
    Object o = new Object();
    System.out.println( o.toString() );
//    Appliance a = new Appliance();
//    System.out.println( a.toString() );

    Radio r = new Radio();
    System.out.println( r.toString() );
    Appliance r2 = new Radio();
    System.out.println( r2.toString() );
    Object r3 = new Radio();
    System.out.println( r3 );

    // Wo nicht dynamisch gebunden wird
    // private
    // static
    // final
  }
}
