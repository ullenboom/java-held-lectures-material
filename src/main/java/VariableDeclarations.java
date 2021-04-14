/**
 * Lernziel: Variablendeklarationen
 * - Einzelne Variablen deklarieren
 * - Mehrere Variablen kompakt deklarieren
 * - Automatische Initialisierung von lokalen Variablen?
 * - Variablendeklaration mit Wertinitialisierung
 * - Finale Variablen
 * - `char` und `String`
 *
 * @see OverloadedMethods
 */
public class VariableDeclarations {
  public static void main( String[] args ) {
    // byte -> 1 Byte
    // short -> 2 Byte
    // int -> 4 Byte
    // long -> 8 Byte
    long age = +100000000000000L;
    System.out.println(age);

    short s = 12;
    byte b = -128;  // -128 .. +127

    // float -> 4 Byte
    // double -> 8 Byte
    double d = 12.333;
    float  f = 2323;

    // char -> 2 Byte
    char sb = 'C';
    String name = "Chris";

    // boolean -> 1 Bit
    boolean snowing = true;

    int x, y = 12;
    System.out.println(y);
    x = 12;
    x = 11;
    x = 10;
    System.out.println(x);
    final double PI = 3.1415;
  }
}
