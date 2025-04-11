package com.tutego.lang;

import java.util.Objects;

public class OverridingObjectMethods {
  public static void main( String[] args ) {
    Radio radio = new Radio();
    radio.isOn = true;
    radio.volume = 12;
    System.out.println( radio.hashCode() );

    Radio radio2 = new Radio();
    radio2.isOn = true;
    radio2.volume = 12;
    System.out.println( radio2.hashCode() );

    Radio radio3 = new Radio();
    radio3.isOn = true;
    radio3.volume = 13;
    System.out.println( radio3.hashCode() );

    System.out.println( radio.equals( radio2 ) );  // true
    System.out.println( radio2.equals( radio3 ) ); // false

    // r1.equals(r2)    =>  hashCode(r1) == hashCode(r2)
    // ! r1.equals(r2)  =>  ???
    // hashCode(r1) == hashCode(r2) ==> ???
    // hashCode(r1) != hashCode(r2) ==> ! r1.equals(r2)
  }
}

class Thing {
  String name;

  @Override public boolean equals( Object o ) {
    // 1.
    if ( this == o )
      return true;

    // 2., 3.
    if ( o == null || getClass() != o.getClass() )
      return false;

    Thing thing = (Thing) o;

    // 4.
    return Objects.equals( name, thing.name );
  }

  @Override public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  @Override public String toString() {
    return "Thing[name='" + name + '\'' + ']';
  }
}

class Appliance extends Thing {
  boolean isOn;
  double watt;

  @Override public boolean equals( Object o ) {
    // 1.
    if ( this == o )
      return true;
    // 2., 3.
    if ( o == null || getClass() != o.getClass() )
      return false;

    //
    if ( !super.equals( o ) )
      return false;

    // 4.
    Appliance appliance = (Appliance) o;

    if ( isOn != appliance.isOn )
      return false;
    return Double.compare( watt, appliance.watt ) == 0;
  }

  @Override public int hashCode() {
    // 1. super class
    int result = super.hashCode();
    // 2.
    long temp;
    result = 31 * result + (isOn ? 1 : 0);
    // 3.
    temp = Double.doubleToLongBits( watt );
    result = 31 * result + (int) (temp ^ (temp >>> 32));

    return result;
  }

  @Override public String toString() {
    return "Appliance{isOn=" + isOn + ", watt=" + watt + "} " + super.toString();
  }
}

class Radio extends Appliance {
  int volume;

  @Override public boolean equals( Object o ) {
    // 1.
    if ( this == o )
      return true;
    // 2., 3.
    if ( o == null || getClass() != o.getClass() )
      return false;
    //
    if ( !super.equals( o ) )
      return false;

    Radio radio = (Radio) o;
    // 4.
    return volume == radio.volume;
  }

  @Override public int hashCode() {
    // 1. super class
    int result = super.hashCode();
    // 2.
    result = 31 * result + volume;
    // 3.
    return result;
  }

  @Override public String toString() {
    return "Radio{volume=" + volume + "} " + super.toString();
  }
}