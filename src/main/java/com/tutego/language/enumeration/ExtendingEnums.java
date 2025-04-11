package com.tutego.language.enumeration;

import java.util.concurrent.ThreadLocalRandom;

public class ExtendingEnums {
  public static void main( String[] args ) {
    System.out.println( Country.defaultCountry() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );
    System.out.println( Country.random() );

    System.out.println( Country.GERMANY.iso3166_3() );
    System.out.println( Country.CHINA.iso3166_3() );
    System.out.println( Country.UK.iso3166_3() );
    System.out.println( Country.GERMANY.iso3166_2() );
    System.out.println( Country.CHINA.iso3166_2() );
    System.out.println( Country.UK.iso3166_2() );

    System.out.println( areAllBigCountries( Country.CHINA, Country.CHINA ) );

  }

  static boolean areAllBigCountries( IsBigCountry... countries ) {
    for ( IsBigCountry country : countries ) {
      if ( !country.isBig() ) {
        return false;
      }
    }
    return true;
  }

  interface IsBigCountry {
    boolean isBig();
  }

  enum Country implements IsBigCountry {
    GERMANY( "DEU" ) {
    },
    UK( "GBR" ) {
    },
    CHINA( "CHN" ) {
      @Override public boolean isBig() {
        return true;
      }
    };

    /*private*/ Country( String iso3166 ) {
      this.iso3166 = iso3166;
    }

    static Country defaultCountry() {
      return GERMANY;
    }

    static Country random() {
      return values()[ ThreadLocalRandom.current().nextInt( 0, 3 ) ];
    }

    private final String iso3166;

    // static {}

    private static final String[] ISO_3166_2 = { "DE", "GB", "CN" };

    String iso3166_2() {
      return ISO_3166_2[ this.ordinal() ];
    }

    String iso3166_3() {
      //      return switch ( this ) {
      //        case GERMANY -> "DEU";
      //        case UK -> "GBR";
      //        case CHINA -> "CHN";
      //      };
      return iso3166;
    }

    // abstract void foo();

    @Override public boolean isBig() {
      return false;
    }
  }
}

enum MainWindow {
  INSTANCE;

  void show() {}
}

