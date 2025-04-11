public class VariableDeclarations {
  public static void main( String[] args ) {
    // int args; // Variable 'args' is already defined in the scope

    // byte -> 1 Byte
    // short -> 2 Byte
    // int -> 4 Byte
    // long -> 8 Byte
    // => Always signed

    // int age = 1222223333333;  // Integer number too large
    long age = 12222222222L;
    // Declared
    System.out.println( age );

    short s = 12;
    byte b = -128;   // -128 .. +127

    //

    // float -> 4 Byte
    // double -> 8 Byte

    double d = 12.333;
    float f = 234;

    //

    // char -> 2 Byte
    char startLetter = 'C';

    String name = "Chris";

    //

    // boolean -> 1 Bit

    boolean snowing = true;

    //

    int x, y = 12;

    //

    // System.out.println( x );  // Variable 'x' might not have been initialized

    x = 12;
    System.out.println( x );

    // Final Variable

    x = 12;
    x = 11;
    x = 10;

    final double PI = 3.1415;   // final is a Modifier
    // PI = 23452345;  // Cannot assign a value to final variable 'PI'

  }
}
