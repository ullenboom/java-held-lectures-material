package de.tutego.javaselib;

import java.util.Map;
import java.util.Optional;
import java.util.Properties;

/**
 * Lernziel: System und System-Properties
 * - `System`
 * - `Runtime`
 * - System-Properties
 *
 * @see LocaleCurrency
 */
public class SystemRuntimeSystemProperties {
  public static void main( String[] args ) {

    Map<String, String> getenv = System.getenv();
    System.out.println( getenv );

    Properties properties = System.getProperties();
    System.out.println( properties );

    System.out.println( System.getProperty( "user.name" ) );
    System.out.println( System.getProperty( "user.home" ) );
    System.out.println( System.getProperty( "user.dir" ) );

    System.out.println( Optional.ofNullable( System.getProperty( "SLOW" ) ) );

  }
}