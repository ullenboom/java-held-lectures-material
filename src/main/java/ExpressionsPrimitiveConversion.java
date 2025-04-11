public class ExpressionsPrimitiveConversion {
  public static void main( String[] args ) {

    /*
      Two types of typecasting:

      1. implicit (automatic) typecasting (widening conversion)

      │ From Type    │ To Type(s)
      ├──────────────┼────────────────────────────────
      │ byte         │ short, int, long, float, double
      │ short, char  │ int, long, float, double
      │ int          │ long, float, double
      │ long         │ float, double
      │ float        │ double
    */

    int intValue = 12;
    long longValue = intValue;   // <-

    System.out.println( Integer.MAX_VALUE );
    float maxValue = Integer.MAX_VALUE;  // <-
    System.out.println( maxValue );

    /*
      2. explicit typecasting (narrowing conversion)
    */

    /*
      │ From Type │ To Type(s)
      ├───────────┼────────────────────────────────────
      │ short     │ byte, char
      │ char      │ byte, short
      │ int       │ byte, short, char
      │ long      │ byte, short, char, int
      │ float     │ byte, short, char, int, long
      │ double    │ byte, short, char, int, long, float
    */

    long value = 1111111L;
    int intVal = (int) (value + value);

    double random = Math.random();  // 0.00000000 .. <0.9999999999
    System.out.println( (int) (random * 10) );

    System.out.println( (int) (Math.random() * 10) );
    System.out.println( (int) (Math.random() * 10) );
    System.out.println( (int) (Math.random() * 10) );
    System.out.println( (int) (Math.random() * 10) );
    System.out.println( (int) (Math.random() * 10) );

    // String s = String.valueOf( value );
  }
}
