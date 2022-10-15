package de.tutego.appliances;

public class TV {
  private int channel;
  private boolean isOn;
  private MonitorTube monitorTube = new MonitorTube( this );

  public TV() {
  }

  public TV( TV original ) {
    channel = original.channel;
    isOn = original.isOn;
  }

  public int getChannel() {
    return channel;
  }

  public void setChannel( int channel ) {
    this.channel = channel;
  }

  public boolean isOn() {
    return isOn;
  }

  public void setOn( boolean on ) {
    isOn = on;
  }

  public void on() {
    System.out.println( "Ich bin ein TV, ich werde eingeschaltet" );
    monitorTube.on();
  }

  public MonitorTube getMonitorTube() {
    return monitorTube;
  }

  public void off() {
    monitorTube.off();
    System.out.println( "Ich bin ein TV, ich werde ausgeschaltet" );
  }
}
