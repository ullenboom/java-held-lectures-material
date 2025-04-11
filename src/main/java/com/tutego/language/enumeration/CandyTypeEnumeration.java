package com.tutego.language.enumeration;

import java.util.Objects;

public class CandyTypeEnumeration {
  public static void main( String[] args ) {

    Candy candy = new Candy();
    //    candy.candyType = CandyType.CARAMEL | CandyType.CHOCOLATE;
    //    // 0b000001 + 0b0000010 = 0b11
    //
    //    candy.candyType = 2000000 + Font.BOLD;

    CandyType candyType = CandyType.CHOCOLATE;
    candy.setCandyType( CandyType.CHOCOLATE );

    if ( candy.getCandyType() == CandyType.CHOCOLATE )
      System.out.println( "Choco" );

    switch ( candy.getCandyType() ) {
      case /*CandyType.*/CHOCOLATE -> System.out.println( "Choco" );
      default -> System.out.println( "??" );
    }
  }
}

//class CandyType {
//  public static final int OTHER = 0b000000;
//  public static final int CARAMEL = 0b000001;
//  public static final int CHOCOLATE = 0b0000010;
//}

enum CandyType {
  OTHER, CARAMEL, CHOCOLATE

  // public static final CandyType OTHER = new CandyType(...);
  // public static final CandyType C* = new CandyType(...);
}

class Candy {
  // int candyType;
  private CandyType candyType;

  public CandyType getCandyType() {
    return candyType;
  }

  public void setCandyType( CandyType candyType ) {
    Objects.requireNonNull( candyType );
    this.candyType = candyType;
  }
}