package com.tutego.util;

public class SystemRuntimeSystemProperties {
  public static void main( String[] args ) {

    String property = Environment.getProperty( "NUMBER_OF_PROCESSORS" );
    System.out.println( property );

    //    Map<String, String> env = System.getenv();
    //    System.out.println( env );
    //
    //    System.out.println( env.get( "NUMBER_OF_PROCESSORS" ) );
    //    System.out.println( System.getenv( "NUMBER_OF_PROCESSORS" ) );

//    Properties properties = System.getProperties();
//    System.out.println( properties );
//
//    System.out.println( System.getProperty( "user.name" ) );
//    System.out.println( System.getProperty( "user.home" ) );
//    System.out.println( System.getProperty( "user.dir" ) );

    System.out.println( Environment.getProperty( "user.home" ) );

    System.out.println( Environment.getProperty( "API_KEY" ) );
  }
}

class Environment {
  static String getProperty( String name ) {
    String result = System.getenv( name );
    if ( result != null ) {
      return result;
    }
    // result == null
    result = System.getProperty( name );
    return result;
  }
}