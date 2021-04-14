package de.tutego.lang;

/**
 * Lernziel: `java.lang.Object`
 * - Bedeutung der `Object`-Methoden
 * - Methoden überschreiben
 * - `Class`-Objekte `getClass()`, `Class`-Literale
 * - `toString()`
 * - `equals(...)` und `hashCode()`
 *
 * @see ComparatorAndComparable
 */
public class JavaLangObject {
  public static void main( String[] args ) {
    //    Object o1 = new Point();
    //    Object o2 = "";
    //    System.out.println( o1.getClass().getSimpleName() );
    //    System.out.println( o2.getClass() );
    //    if ( o1.getClass() == o2.getClass() )
    //      System.out.println( "Gleicher Bauplan" );
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

  }
}

class Thing {
  String name;

  @Override public boolean equals( Object o ) {
    // 1.
    if ( this == o )
      return true;
    // 2. 3.
    if ( o == null || getClass() != o.getClass() )
      return false;

    Thing thing = (Thing) o;

    // 4.
    return name != null ? name.equals( thing.name ) : thing.name == null;
  }

  @Override public int hashCode() {
    return name != null ? name.hashCode() : 0;
  }

  @Override public String toString() {
    return "Thing{" + "name='" + name + '\'' + '}';
  }
}

class Appliance extends Thing {
  boolean isOn;
  double watt;

  @Override public boolean equals( Object o ) {
    // 1.
    if ( this == o )
      return true;
    // 2. 3.
    if ( o == null || getClass() != o.getClass() )
      return false;
    //
    if ( !super.equals( o ) )
      return false;

    // 4.
    Appliance appliance = (Appliance) o;

    if ( isOn != appliance.isOn )
      return false;
    return Double.compare( appliance.watt, watt ) == 0;
  }

  @Override public int hashCode() {
    // 1.
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
    return "Appliance{" +
           "name='" + name + '\'' +
           "} " + super.toString();
  }
}

class Radio extends Appliance {
  int volume;

  @Override public boolean equals( Object o ) {
    // 1.
    if ( this == o )
      return true;
    // 2. 3.
    if ( o == null || getClass() != o.getClass() )
      return false;
    if ( !super.equals( o ) )
      return false;

    // 4.
    Radio radio = (Radio) o;

    return volume == radio.volume;
  }

  @Override public int hashCode() {
    int result = super.hashCode();
    result = 31 * result + volume;
    return result;
  }

  @Override public String toString() {
    return "Radio{" + "volume=" + volume + "} " + super.toString();
  }
}