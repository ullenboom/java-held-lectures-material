package de.tutego.appliances;

public abstract class Appliance {
  private boolean isOn;
  private double watt;

  enum Type {
    WHITE, BROWN, SMALL
  }

  static double watt( Appliance... appliances ) {
    double sum = 0;
    for ( Appliance appliance : appliances ) {
      sum += appliance.getWatt();
    }
    return sum;
  }

  Appliance() {
    //    super();
    //    System.out.println( "Appliance" );
    isOn = true;
  }

  public boolean isOn() {
    return isOn;
  }

  public void setOn( boolean on ) {
    System.out.println( toString() + " " + on );
    isOn = on;
  }

  public double getWatt() {
    return watt;
  }

  public void setWatt( double watt ) {
    this.watt = watt;
  }

  abstract Type getType();
    // 1. return null
    // 2. default
    // 3. abstract

  Appliance log() {
    System.out.println( "Appliance" );
    return this;
  }

  @Override public String toString() {
    return "Appliance{" +
           "isOn=" + isOn +
           ", watt=" + watt +
           '}';
  }
}
