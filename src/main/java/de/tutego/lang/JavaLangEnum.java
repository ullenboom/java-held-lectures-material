package de.tutego.lang;

/**
 * Lernziel: Aufzählungen mit Eigenschaften
 * - Statische Methoden deklarieren
 * - Objektmethoden deklarieren
 * - Konstruktoren ergänzen
 * - Schnittstellen implementieren
 * - Vereinigung von Aufzählungen
 *
 * @see IterableAndIterator
 */
public class JavaLangEnum {
  public static void main( String[] args ) {
    Country germany = Country.GERMANY;
    System.out.println( germany.name() );
    System.out.println( germany.toString() );
    System.out.println( germany.ordinal() );
    System.out.println( germany.compareTo( Country.GERMANY ) );
    System.out.println( germany.compareTo( Country.CHINA ) );
    for ( Country value : Country.values() ) {
      System.out.println( value );
    }
    System.out.println( Country.valueOf( "CHINA" ) );
    //    System.out.println(Country.valueOf( "china" ));

    System.out.println( Country.defaultCountry() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.GERMANY.iso3166() );
    System.out.println( Country.CHINA.iso3166() );
    System.out.println( Country.UK.iso3166() );

    /*
    http://www.javadecompilers.com/
     */
  }

  static void anyCountry(IsBigCountry country) {


  }
}

interface IsBigCountry {
  boolean isBig();
}

enum Country2 implements IsBigCountry {
  DENMARK;

  @Override public boolean isBig() {
    return false;
  }
}

enum Country implements IsBigCountry {
  GERMANY( "DEU" )
  //      {
  //    @Override public boolean isBig() {
  //      return false;
  //    }
  //  }
  ,
  UK( "GBR" )
  //    @Override public boolean isBig() {
  //      return false;
  //    }
  //  }
  ,
  CHINA( "CHN" ) {
    @Override public boolean isBig() {
      return true;
    }
  };

  private final String iso3166;

  /*private*/ Country( String iso3166 ) {this.iso3166 = iso3166;}

  public static Country defaultCountry() { return GERMANY; }

  public static Country random() { return values()[ (int) (Math.random() * 3) ]; }

  //  public String iso3166() {
  //    switch ( this ) {
  //      case GERMANY:
  //        return "DEU";
  //      case UK:
  //        return "GBR";
  //      default:
  //        return "CHN";
  //    }
  //  }
  public String iso3166() {
    return iso3166;
  }

  @Override public boolean isBig() {
    return false;
//    switch ( this ) {
//      case GERMANY:
//      case UK:
//        return false;
//      default:
//        return true;
//    }
  }
}

//final class Country extends Enum
//{
//
//  public static Country[]  values()
//  {
//    return (Country[])$VALUES.clone();
//  }
//
//  public static Country valueOf(String name)
//  {
//    return (Country)Enum.valueOf(Country.class, name);
//  }
//
//  private Country(String s, int i)
//  {
//    super(s, i);
//  }
//
//  private static Country[] $values()
//  {
//    return (new Country[] {
//        GERMANY, UK, CHINA
//    });
//  }
//
//  public static final Country GERMANY = new Country("GERMANY", 0);
//  public static final Country UK = new Country("UK", 1);
//  public static final Country CHINA = new Country("CHINA", 2);
//  private static final Country $VALUES[] = $values();
//
//}