package com.tutego.util;

import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;

public class OptionalDemo {
  public static void main( String[] args ) {

    // Optional<T>

    Optional<Object> empty = Optional.empty();
    Optional<String> result = Optional.of( "Result" );
    Optional<Object> empty2 = Optional.ofNullable( null );
    Optional<Object> result2 = Optional.ofNullable( "Result2" );

    System.out.println( empty.isPresent() );
    System.out.println( empty.isEmpty() );
    System.out.println( result.isPresent() );
    System.out.println( result.isEmpty() );
    System.out.println( empty2.isPresent() );
    System.out.println( empty2.isEmpty() );
    System.out.println( result2.isPresent() );
    System.out.println( result2.isEmpty() );

    System.out.println( result.get() );  // Result
    // System.out.println( empty.get() );  // java.util.NoSuchElementException: No value present
    System.out.println( result.orElse( "Default" ) );  // Result
    System.out.println( empty.orElse( "Default" ) );   // Default

    Person heinz = new Person();
    System.out.println( heinz.getSpouse() );

    // OptionalInt, OptionalLong, OptionalDouble

    System.out.println( max() );   // OptionalInt.empty

  }

  static OptionalInt max( int... values ) {
    if ( values.length == 0 )
      return OptionalInt.empty();
    return OptionalInt.of( Integer.MAX_VALUE );
  }

}

class Person {
  private Person spouse;

  public Optional<Person> getSpouse() {
    return Optional.ofNullable( spouse );
  }

  public void setSpouse( Person spouse ) {
    this.spouse = Objects.requireNonNull( spouse );
  }

  void removeSpouse() {
    spouse = null;
  }
}