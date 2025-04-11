package com.tutego.oop;

public class PublicStaticFinal {

  public final static double PI = 3.1415;
  public static final String EIGHT_POINTED_PINWHEEL_STAR = "\u2735";

  class City {
    public static int COST_KANDY_TO_HERSHEY = 13_30;
  }

  public static void main( String[] args ) {
    System.out.println( PublicStaticFinal.PI );
    // PublicStaticFinal.PI = 33333;
    System.out.println( Math.PI );
    System.out.println( EIGHT_POINTED_PINWHEEL_STAR );
  }

}

class PublicStaticFinalVariations {
  int A = 20;
  final int B = 20;
  public int C = 20;
  static int D = 20;
  static final int E = 20;
  public final int F = 20;
  public static int G = 20;
  public static final int H = 20;
}
