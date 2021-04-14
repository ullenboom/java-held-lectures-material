/**
 * Lernziel: Operatoren zur Bit-Manipulation
 * - Bitmanipulation
 * - Verschiebung
 *
 * @see ConsoleInputs
 */
public class ExpressionsOperatorsBinary {
  public static void main( String[] args ) {

    int b1 = 0b10101010;
    int b2 = 0b11010100;
    System.out.println( Integer.toBinaryString( b1 ) );
    System.out.println( Integer.toBinaryString( b2 ) );

    System.out.println( Integer.toBinaryString( ~b1 ) );
    System.out.println( Integer.toBinaryString( ~b2 ) );

    System.out.println( Integer.toBinaryString( b1 & b2 ) );
    System.out.println( Integer.toBinaryString( b1 | b2 ) );
    System.out.println( Integer.toBinaryString( b1 ^ b2 ) );

    System.out.println( Integer.toBinaryString( 0b10 >> 1 ) );
    System.out.println( Integer.toBinaryString( 0b10 >> 2 ) );
    System.out.println( Integer.toBinaryString( 0b10 << 1 ) );
    System.out.println( Integer.toBinaryString( 0b10 << 2 ) );
  }
}
