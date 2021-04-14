/**
 * Lernziel: Literale
 * - Literaltypen kennenlernen
 * - Hexadezimalzahlen schreiben
 * - Binäre Schreibweise
 * - Unterstriche in Zahlen
 *
 * @see Types
 */
public class Literals {
  /*
   *  - die Wahrheitswerte `true` und `false`
   *  - integrale Literale für Zahlen, etwa `122`
   *  - Fließkommaliterale, etwa `12.567` oder `9.999E-2`
   *  - Zeichenliterale, etwa `'X'` oder `'\n'`
   *  - String-Literale für Zeichenketten, wie `"Mandalore"`
   *  - `null` steht für einen besonderen Referenztyp
   */
  public static void main( String[] args ) {
    System.out.println(0.1+0.1+0.1);
    System.out.println('\n');
    System.out.println(123);
    System.out.println("'\"");
    System.out.println('\'');
    System.out.println(0x0); // 0
    System.out.println(0x9); // 9
    System.out.println(0xa); // 10
    System.out.println(0xf); // 15
    System.out.println(0x1000_0000);
    System.out.println(0b101_01001010_10011001);
    System.out.println(236_547_823);

  }
}
