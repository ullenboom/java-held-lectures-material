package de.tutego.appliances;

public class FireAlarm extends Appliance {
  FireAlarm() {
    //    super();
    System.out.println( "FireAlarm" );
    System.out.println( isOn() );
  }

  @Override FireAlarm log() {
    System.out.println( "Fire Alarm" );
    return this;
  }

  @Override
  public void setOn( boolean on ) {
    if ( !on )
      System.out.println( "Kann nicht ausgeschaltet werden." );
  }

  @Override Type getType() {
    return Type.SMALL;
  }
}
