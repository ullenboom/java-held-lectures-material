package com.tutego.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ComplexTest {



  @Test
  public void testSquaredMagnitude() {
    // given
    Complex c = new Complex( 3, 4 );

    // when
    double result = c.squaredMagnitude();

    // then
    double expected = 25.;  // 3 * 3 + 4 * 4;

    assertTrue( expected == result );
    assertFalse( expected != result );

    assertEquals( expected, result );
    assertEquals( 25., result, 0.000001 );
    assertEquals( 25., result, "Squared magnitude should be " + expected );
    assertEquals( 25., result, () -> "Squared magnitude should be " + expected );

    // Arrange
    // Act
    // Assert
  }

  @Test
  void testZeroConstant() {
    Complex zero = Complex.ZERO;

    assertEquals( 0., zero.real() );
    assertEquals( 0., zero.imaginary() );
  }

  @Test
  void testOfWithZeroValues() {
    Complex zero = Complex.of( 0, 0 );
    assertSame( Complex.ZERO, zero );
    assertNotSame( Complex.ZERO, Complex.of( 1, 2 ) );
    assertInstanceOf( Complex.class, zero );
  }

  @Test
  void testAsPartArray() {
    double[] result = new Complex( 3, 4 ).asPartArray();
    double[] expected = { 3., 4. };
    assertArrayEquals( expected, result );
  }

  @Test
  void testAssertDoesNotThrow() {
    assertDoesNotThrow( () -> new Complex( 1, 2 ),
                        "Constructor should not throw an exception" );
    assertDoesNotThrow( () -> new Complex( 1, 2 ),
                        () -> "Constructor should not throw an exception" );
  }

  @Test
  void testInvalidComplexNumber() {
    assertThrows( IllegalArgumentException.class, () -> {
      new Complex( Double.NaN, 1 );
    } );

    IllegalArgumentException exception = assertThrows( IllegalArgumentException.class, () -> {
      new Complex( 1, Double.NaN );
    } );
    assertEquals( "Real and imaginary parts must be valid numbers", exception.getMessage() );
  }

  @Test
  void testAdd() {
    Complex result = new Complex( 3, 4 ).add( new Complex( 1, 2 ) );

    // assertAll(String heading, Executable... executables)

    assertAll( "Addition",
               () -> assertEquals( 4., result.real() ),
               () -> assertEquals( 6., result.imaginary() )
    );
  }

  static Stream<Arguments> complexNumberProviderForMultiplication() {
    return Stream.of(
        Arguments.of( new Complex( 3, 4 ), new Complex( 1, 2 ), new Complex( -5, 10 ) ),
        Arguments.of( Complex.ZERO, new Complex( 1, 1 ), Complex.ZERO ),
        Arguments.of( new Complex( -3, -4 ), new Complex( 3, 4 ), Complex.ZERO )
    );
  }

  @ParameterizedTest
  @MethodSource( "complexNumberProviderForMultiplication" )
  void testMultiply( Complex c1, Complex c2, Complex expectedResult ) {
    Complex result = c1.multiply( c2 );

    assertAll(
        () -> assertEquals( expectedResult.real(), result.real() ),
        () -> assertEquals( expectedResult.imaginary(),
                            result.imaginary() )
    );
  }
}
