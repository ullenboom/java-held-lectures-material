/**
 * Lernziel: Ausdrücke und Operatoren
 * - Zuweisungsoperator in Anweisung und Ausdruck
 * - Math.random()
 * - Unäres Minus und Plus
 * - Arithmetik, Divisionsoperator, Restwert-Operator
 * - Vergleiche
 * - Logische Operatoren
 * - Kurzschluss
 * - Verbundoperator
 * - Präfix-/Postfix-Inkrement und -Dekrement
 * - Typumwandlung
 * - String-Konkatenation
 *
 * @see ExpressionsOperatorsBinary
 */
public class ExpressionsOperators {
  /*
   * Ein *Ausdruck* (*expression*) ergibt bei der Auswertung ein Ergebnis.
   */
  public static void main( String[] args ) {
    int age;
    System.out.println(age = 90);
    System.out.println(age);

    System.out.println(Math.random());  // 0.0 <= random < 1.0
    System.out.println(-(-Math.random()));  // 0.0 <= random < 1.0

    System.out.println(Math.random() * 10);  // 0.0 <= random < 10.0

    int number = 10_000_000;
    System.out.println(10_000_000*number);

    System.out.println(10/3);
    System.out.println(10.5%3);

    System.out.println( 1 < 2);
    System.out.println( 1 > 0);
    System.out.println( 3.3 <= 1.1 + 1.1 +1.1);
    System.out.println( 1.0 != 2.0 );

    System.out.println(true && true);
    System.out.println(true && false);
    System.out.println(true || true);
    System.out.println(true || false);
    System.out.println(true ^ true);
    System.out.println(true ^ false);
    System.out.println(false ^ true);
    System.out.println(false ^ false);

    System.out.println(!true);
    System.out.println(!false);

    boolean b = 10*10 < 99;
    System.out.println( !b );

    // Kurzschluss
    System.out.println( true || true || false );
    System.out.println( false && true && true );

    // Nicht-Kurzschluss
    System.out.println( true | true | false );
    System.out.println( false & true & true );

    double random = Math.random();
    random = random * 10;                      // v = v (op) v
    random *= 10;

    random = random + 1;
    random += 1;

    int width = 100;
    int len = 100;
    System.out.println(width++);  // System.out.println(width); width++;
    System.out.println(width);
    System.out.println(++len);    // len++; System.out.println(len);
    System.out.println(len);

    System.out.println((1+1)*10);

    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10
    System.out.println((int)(Math.random()*11));  // (int) 0 <= random < 10.99999 => 0 .. 10

    int nn = 99;
    String hello = "Hallo ";
    System.out.println(hello + nn + " Welten");
    System.out.println(2+"2"+(nn+1));
    String s = "Zufallszahl " + Math.random();
    System.out.println(s);
  }
}
