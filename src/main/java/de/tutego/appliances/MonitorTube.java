package de.tutego.appliances;

public class MonitorTube {

  private final TV tv;

  public MonitorTube( TV tv ) {
    this.tv = tv;
  }

  public void on() {
    System.out.println( "Ich bin eine Bildröhre, ich werde eingeschaltet" );
  }

  public void off() {
    System.out.println( "Ich bin eine Bildröhre, ich werde ausgeschaltet" );
  }

  public TV getTv() {
    return tv;
  }
}
