package de.tutego.appliances;

import java.util.ArrayList;

public class House {
  private ArrayList<Appliance> appliances = new ArrayList<>();

  void add( Appliance appliance ) {
    System.out.printf( "Elektrogerät %s wird hinzugefügt%n", appliance );
    appliances.add( appliance );
  }

  int numberOfActiveAppliances() {
    int result = 0;
    for ( Appliance appliance : appliances ) {
      if ( appliance.isOn() )
        result++;
    }
    return result;
  }

  public void off() {
    for ( Appliance appliance : appliances ) {
      appliance.setOn( false );
    }
  }

  @Override public String toString() {
    return "House{" + "appliances=" + appliances + '}';
  }
}
