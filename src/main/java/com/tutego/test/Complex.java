package com.tutego.test;

public record Complex( double real, double imaginary ) {

  public static Complex ZERO = new Complex( 0, 0 );

  public Complex {
    if ( Double.isNaN( real ) || Double.isNaN( imaginary ) )
      throw new IllegalArgumentException( "Real and imaginary parts must be valid numbers" );
  }

  static Complex of( double real, double imaginary ) {
    return real == 0 && imaginary == 0 ? ZERO : new Complex( real, imaginary );
  }

  public Complex add( Complex other ) {
    return new Complex( this.real + other.real, this.imaginary + other.imaginary );
  }

  public Complex multiply( Complex other ) {
    var realPart = this.real * other.real - this.imaginary * other.imaginary;
    var imaginaryPart = this.real * other.imaginary + this.imaginary * other.real;
    return new Complex( realPart, imaginaryPart );
  }

  // This give the magnitude squared of the complex number
  public double squaredMagnitude() {
    return real * real + imaginary * imaginary;
  }

  public double[] asPartArray() {
    return new double[]{ real, imaginary };
  }
}
