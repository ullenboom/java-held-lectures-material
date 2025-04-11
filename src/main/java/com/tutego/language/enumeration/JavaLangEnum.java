package com.tutego.language.enumeration;

public class JavaLangEnum {

  enum Country {
    GERMANY, UK, CHINA
  }

  public static void main( String[] args ) {
    /*
    http://www.javadecompilers.com/
    https://godbolt.org/
     */

    Country germany = Country.GERMANY;
    System.out.println( germany.name() );                           // GERMANY
    System.out.println( germany.toString() );                       // GERMANY
    System.out.println( germany.ordinal() );                        // 0
    System.out.println( germany.compareTo( Country.GERMANY ) );     // 0
    System.out.println( germany.compareTo( Country.CHINA ) );       // -2, GERMANY < CHINA

    System.out.println( Country.valueOf( "CHINA" ) );         // CHINA
    // System.out.println( Country.valueOf( "china" ) );
    // ->
    // Exception in thread "main" java.lang.IllegalArgumentException:
    // No enum constant com.tutego.language.enumeration.JavaLangEnum.Country.china

    Country[] countries = Country.values();
    for ( Country value : countries ) {
      System.out.println( value );
    }
    for ( Country value : countries ) {
      System.out.println( value );
    }

    System.out.println( Country.UK == Country.UK );  // true

    Country c = Country.GERMANY;
    String s = switch ( c ) {
      case UK -> "UK";
      case GERMANY, CHINA -> "";
    };

  }
}

//final class Country extends java.lang.Enum<Country> {
//  public static final Country GERMANY = new Country( 0, "GERMANY" );
//
//  public static final Country UK = new Country( 1, "UK" );
//
//  public static final Country CHINA = new Country( 2, "CHINA" );
//
//  private static final Country[] $VALUES = { GERMANY, UK, CHINA };
//
//  private Country( int ordinal, String name ) {
//    super( name, ordinal );
//  }
//
//  public static Country[] values() {
//    return $VALUES.clone();
//  }
//
//  public static Country valueOf( java.lang.String name ) {
//    return Enum.valueOf( Country.class, name );
//  }
//}
