public class ExpressionsOperatorsBinary {
  public static void main( String[] args ) {

    int b1 = 0b10101010;
    int b2 = 0b11010100;

    System.out.println( b1 );
    System.out.println( b2 );

    System.out.println( Integer.toBinaryString( b1 ) );
    System.out.println( Integer.toBinaryString( b2 ) );

    // ~

    System.out.println( Integer.toBinaryString( b1 ) );   // 00000000000000000000000010101010
    System.out.println( Integer.toBinaryString( ~b1 ) );  // 11111111111111111111111101010101

    // & | ^

    System.out.println( Integer.toBinaryString( b1 & b2 ) );   // 10000000
    System.out.println( Integer.toBinaryString( b1 | b2 ) );   // 11111110
    System.out.println( Integer.toBinaryString( b1 ^ b2 ) );   // 01111110

    // << >> >>>

    System.out.println( Integer.toBinaryString( b1 ) );         //   10101010
    System.out.println( b1 );                                   //   170
    System.out.println( Integer.toBinaryString( b1 << 1 ) );   //  101010100
    System.out.println( b1 << 1 );                               //  340
    System.out.println( Integer.toBinaryString( b1 << 2 ) );   // 1010101000

    System.out.println( Integer.toBinaryString( b1 ) );          //   10101010
    System.out.println( Integer.toBinaryString( b1 >> 1 ) );   //    1010101
    System.out.println( Integer.toBinaryString( b1 >> 2 ) );   //     101010

    System.out.println( Integer.toBinaryString( -1 ) );        // 11111111111111111111111111111111
    System.out.println( Integer.toBinaryString( -1 >> 1 ) );   // 11111111111111111111111111111111
    System.out.println( Integer.toBinaryString( -1 >>> 1 ) );  // 01111111111111111111111111111111

    //

    int input = 234234;
    System.out.println( Integer.toBinaryString( input ) );               // 111001001011111010
    //                                                                      0000000000XXXXXXXX
    System.out.println( Integer.toBinaryString( input & 0b1111_1111 ) );   //       11111010
    System.out.println( Integer.toBinaryString( input & 0xff ) );          //       11111010

    //

    byte b = (byte) 0b1110_1010;
    System.out.println( Integer.toBinaryString( b & 0b1111 ) );              //       1010
    System.out.println( Integer.toBinaryString( (b >> 4) & 0b1111 ) );       //       1110

    //

    // Integer.

  }
}
