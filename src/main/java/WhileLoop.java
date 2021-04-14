/**
 * Lernziel: Kopfgesteuerte Schleife
 * - `while`-Schleife
 * - Endlosschleife
 * - `break` und `continue`
 *
 * Syntax:
 *  while ( Bedingung ) Anweisung
 *
 * @see ForLoop1
 */
public class WhileLoop {
  public static void main( String[] args ) {
    //    while ( Math.random() > 0.1 )
    //      System.out.println( "Rumpf" );

//    int number = 0;
//    int digit = 1;
//    while (number>0) {
//      digit++;
//      number /= 10;
//    }
//    System.out.println(digit);

//    int counter = 0;
//    final int LIMIT = 100;
//    while ( counter < LIMIT && Math.random() > 0.01 ) {
//      System.out.println( "Rump " + counter );
//      counter++;
//    }

//    int number = 234534535;
//    while ( true ) {
//      if ( number % 1111 == 0 )
//        break;
//      number--;
//
//      if ( number % 2 == 0 )
//        continue;
//
//      System.out.println(number);
//    }
//    // <- nach dem break

//    int number = 345352224;
//    end:
//    while ( true ) {
//      int lastDigit = number % 10;
//      number /= 10;
//      switch ( lastDigit ) {
//        case 0:
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//          System.out.println("letzte Ziffer ist kleiner 5");
//          break;
//        default:
//          break end;
//      }
//    }

//    int number = 345352224;
//    boolean end = false;
//    while ( ! end ) {
//      int lastDigit = number % 10;
//      number /= 10;
//      switch ( lastDigit ) {
//        case 0:
//        case 1:
//        case 2:
//        case 3:
//        case 4:
//          System.out.println("letzte Ziffer ist kleiner 5");
//          break;
//        default:
//          end = true;
//      }
//    }

    int counter = 1;
    while ( counter < 11 ) {
      System.out.println(counter);








      counter++;
    }

  }
}
