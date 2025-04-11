/* Ein umfassendes und leicht verständliches Cheat Sheet für Java-Entwickler.
Diese Sammlung von Snippets, Tipps und Best Practices deckt die grundlegenden bis fortgeschrittenen
Java-Konzepte ab und bietet schnelle Referenzen für häufig verwendete Syntax und Funktionen.
Perfekt für Anfänger, die Java lernen, sowie Umsteiger, die ihr Wissen auffrischen möchten.

Dieser mehrzeilige Text befindet sich in einem Blockkommentar. Sie sind nicht schachtelbar.
Sie beginnen mit /* und enden mit */
import java.util.Arrays;   // Importiert Typen wie 'Arrays' in den Namensraum.
//                         ☝️ Zeilenkommentar beginnt mit // und endet am Zeilenende.

public class Cheatsheet { /*
 ☝️ Sichtbarkeitsmodifizierer, von überall zugreifbar
        ☝️ Deklariert eine neue Klasse. Eine Klasse ist ein Typ.
                       ☝️  { öffnet einen Block, danach befindet man sich im Rumpf des Typs. */
  public static void main( String[] args ) {  /* Methodendeklaration
           ☝️ Auch ein Modifizierer: Methode ohne Objekt aufrufbar
                 ☝️ Methode liefert keine Rückgabe.
                      ☝️ Methodenname
                         ☝️ ( Parameterliste ) für Übergaben an die Methode.
                             ☝️ String[] ist der Parametertyp.
                                     ☝️ args ist der Parametername.
                                           ☝️ nach dem { befindet man sich im Rumpf der Methode. */
  } /*
 ☝️  Jede öffnende { hat immer eine schließende } */
}

/*
  javac Cheatsheet.java  ->  Compiler erzeugt Datei Cheatsheet.class mit Bytecode.
  java Cheatsheet        ->  Laufzeitumgebung (JVM) führt Bytecode aus.
 */

@SuppressWarnings( "all" ) /*
☝️           Mit @-Zeichen beginnen Annotationen. Sie liefern Metadaten für
             Laufzeitumgebung und Compiler (z. B. Warnungen zu ignorieren). */
class InputAndOutputExamples {
  public static void main( String[] args ) {
    //                                    ☝️  Nach der Java-Konvention ist { am Zeilenende.
    System.out.println();                    // Methodenaufruf
    //   ☝️  ☝️  Mit dem Punkt "navigiert" man zur Methode println(...)

    System.out.println( "Hello World" );
    //                       ☝️  Argument (was man der Methode übergibt): "Hello World"

    System.out.println( Math.PI );
    //           ☝️  println(...) ist eine überladene Methoden: Es gibt sie mit unterschiedlichen Parametern.

    System.out.println( new java.util.Scanner( System.in ).nextInt() );
    //                                                        ☝️  Eine Ganzzahl einlesen

    String line = new java.util.Scanner( System.in ).nextLine();   // Variablendeklaration
    // ☝️  Typ der Variablen
    //      ☝️  Name der Variablen, muss frei sein
    //         ☝️  Direkte Initialisierung

  }
}

@SuppressWarnings( "all" ) class DataTypesLiteralsExamples {
  public static void main( String[] args ) {
    // Ganzzahlen
    byte octet = 100;              // 8-Bit, Bereich: -128 bis 127
    short s = 10000;               // 16-Bit, Bereich: -32,768 bis 32,767
    int i = 100000;                // 32-Bit, Bereich: -2^31 bis 2^31-1
    long l = 1000000000000L;       // 64-Bit, Bereich: -2^63 bis 2^63-1
    //                   ☝️           Long Literale haben L oder l am Ende

    // Fließkommazahlen
    double d = 3.14159265359;      // 64-Bit IEEE 754 (Standard für Fließkommazahlen)
    float f = 3.14f;               // 32-Bit IEEE 754
    //           ☝️                   Float-Literale haben F oder f am Ende.

    // Einzelne Zeichen
    char c = 'A';                  // 16-Bit Unicode Zeichen
    //       ☝️                       Einzelne Zeichen in einzelnen Anführungszeichen

    // Boolesche Werte
    boolean bool = true;           // true oder false

    // String
    String str = "Strings stehen in 'doppelten' Anführungszeichen";
    //          ☝️ ️

    String multiline = """
                      ☝️ Mehrzeilige Zeichenketten beginnen mit drei ".    
        Und dann folgt ein Zeilenumbruch.""";

    // Finale (Konstante) Variablen
    final double PI = 3.14159;  // Konstante (kann nicht geändert werden)

    // Literal-Notationen
    int binary = 0b1010_1010;  // 170 in Dezimal
    //           ☝️
    int hex = 0xA5;            // 165 in Dezimal
    //        ☝️
    int oktal = 0777;          // 511 in Dezimal
    //         ☝️️
    int million = 1_000_000;   // Unterstriche machen große Zahlen lesbarer
    //            ☝️   ☝️
    double pi = 3.14_15_92;
    long big = 1_234_567_890_123L;  // long mit L-Suffix
  }
}

@SuppressWarnings( "all" ) class OperatorAndOperandsExample {
  public static void main( String[] args ) {
    int a = 10, b = 3;
    // Arithmetische Operatoren
    System.out.println( a + b );  // 13
    System.out.println( a - b );  // 7
    System.out.println( a * b );  // 30
    System.out.println( a / b );  // 3
    System.out.println( a % b );  // 1
    System.out.println( ++a );    // 11
    System.out.println( --b );    // 2

    int ch;
    // Zuweisungsoperatoren
    ch = 15;
    System.out.println( ch += 5 ); // 20
    System.out.println( ch -= 5 ); // 15
    System.out.println( ch *= 2 ); // 30
    System.out.println( ch /= 3 ); // 10
    System.out.println( ch %= 4 ); // 2

    // Vergleichsoperatoren
    System.out.println( 1 == 2 ); // false
    System.out.println( 1 != 2 ); // true
    System.out.println( 2 > 1 );  // true
    System.out.println( 2 < 1 );  // false
    System.out.println( 1 >= 1 ); // true
    System.out.println( 2 <= 1 ); // false

    // Logische Operatoren
    System.out.println( !true );         // false (NICHT)
    System.out.println( true && false ); // false (UND)
    System.out.println( true || false ); // true  (ODER)
    System.out.println( true ^ false );  // true  (logisches XOR)
    System.out.println( true ^ true );   // false

    // Bitweise Operatoren
    int m = 0b1010_1010;   //  170 in Dezimal
    int n = 0b0011_1100;   //   60 in Dezimal
    int p = -0b1010_1010;  // -170 in Dezimal

    System.out.println( m & n );   // 44  (0b0010_1000)
    System.out.println( m | n );   // 186 (0b1011_1110)
    System.out.println( m ^ n );   // 142 (0b1001_0110)
    System.out.println( ~m );      // -171 (0b1111_1111_1111_1111_1111_1111_0101_0101)
    System.out.println( m << 2 );  // 680 (0b10_1010_1000)
    System.out.println( m >> 2 );  // 42  (0b0010_1010)
    System.out.println( m >>> 2 ); // 42  (0b0010_1010)
    System.out.println( p >> 2 );  // -43 (0b1111_1111_1111_1111_1111_1111_1101_0110)
    System.out.println( p >>> 2 ); // 1073741781 (0b0011_1111_1111_1111_1111_1111_1101_0110)

    // Bedingungsoperator
    // ergebnis = booleanBedingung ? wertWennWahr : wertWennFalsch;
    double x = 12, y = 22;
    double max = x > y ? x : y;      // 22

    // Implizite Typumwandlung (Widening Casting)
    long longVal = 1;                   // int zu long
    float floatVal = 12345678901234L;   // long zu float
    double doubleVal = floatVal;        // float zu double
    int charCode = 'A';                 // char zu int

    // Explizite Typumwandlung (Narrowing Casting)
    double doubleNum = 9.78;
    float floatNum = (float) doubleNum;     // double zu float
    //                  ☝️                     Zieltyp in runden Klammern vor Ausdruck
    long longNum = (long) floatNum;         // float zu long
    int intNum = (int) longNum;             // long zu int
    short shortNum = (short) intNum;        // int zu short
    byte byteNum = (byte) shortNum;         // short zu byte
    char charVal = (char) charCode;         // int zu char
  }
}

@SuppressWarnings( "all" ) class ControlStructuresExamples {
  // Kontrollstrukturen sind Fallunterscheidungen und Schleifen
  public static void main( String[] args ) {
    // Bedingte Anweisungen mit if-else
    int score = 75;

    if ( score >= 90 ) {                // 👈 Bedingung muss vom Typ boolean sein
      System.out.println( "Score: A" ); // 👈 Code, wenn Bedingung wahr ist
    }
    // else if ( andereBooleanBedingung ) {
    else if ( score >= 60 ) {
      System.out.println( "Score: B" ); // 👈 Code, wenn andere Bedingung wahr ist
    }
    else {
      System.out.println( "Score: C" ); // 👈 Code, wenn keine Bedingung wahr ist
    }
    // -> Note: B

    // Switch

    String day = "MONDAY";
    // switch-Anweisung mit ->
    switch ( day ) {
      case null -> throw new IllegalStateException();
      //   ☝️   case null fängt null-Referenz ab
      case "MONDAY", "FRIDAY", "SUNDAY" -> System.out.println( "Busy day" );
      //          ☝️  ️Mehrere Fälle mit Komma abtrennen
      case "TUESDAY" -> System.out.println( "Productive day" );
      case "WEDNESDAY", "THURSDAY" -> System.out.println( "Normal day" );
      case "SATURDAY" -> System.out.println( "Lazy day" );
      default -> System.out.println( "Invalid day" );
      // ☝️     default deckt ab, was die anderen case nicht abgedeckt haben
    }

    // switch-Ausdruck mit ->
    System.out.println( switch ( day ) {
      case "MONDAY", "FRIDAY", "SUNDAY" -> "Busy day";
      case "TUESDAY" -> "Productive day";
      case "WEDNESDAY", "THURSDAY" -> "Normal day";
      case "SATURDAY" -> {
        String result = "Lazy day";
        yield result;
        //☝️  yield nutzen, wenn rechts vom Pfeil kein direkter Ausdruck steht
      }
      case null, default -> "Invalid day";
      //       ☝️        null und default kann man mit case und Komma zusammenfassen
    } );

    // while-Schleife, erst Prüfung vor ersten Durchlauf
    while ( Math.random() < 0.2 ) {  // 👈 Bedingung muss vom Typ boolean sein
      // Wiederholter Code
    }

    // do-while-Schleife, mindestens ein Durchlauf, dann Prüfung auf weitere Durchläufe
    do {
      // Wiederholter Code
    } while ( Math.random() < 0.2 ); // 👈 Bedingung muss vom Typ boolean sein

    // for-Schleife
    for (
        int i = 0;
        i < 10; i++ ) {
      //    ☝️                       Einmalige Initialisierung
      //             ☝️              Bedingung muss vom Typ boolean sein, vor jedem Schleifendurchlauf
      //                      ☝️     Am Ende jedes Schleifendurchlaufs
      // Wiederholter Code
    }

    //    break;      // Beendet die aktuelle Schleife oder switch-Anweisung
    //    continue;   // Springt zum nächsten Schleifendurchlauf
    //    return;     // Beendet die Methode und gibt optional einen Wert zurück
  }
}

@SuppressWarnings( "all" ) class ClassNewReferencesNullExamples {
  public static void main( String[] args ) {
    new StringBuilder();
    //☝️           Neue Instanz der Klasse StringBuilder wird mit new erstellt

    StringBuilder stringBuilder;        // Deklaration einer Referenzvariablen

    stringBuilder = new StringBuilder(); // Initialisieren einer Variablen mit neuer Instanz

    StringBuilder stringBuilder2 = new StringBuilder(); // Deklaration und Initialisierung

    StringBuilder anotherRef = stringBuilder;            // Referenz kopieren

    // Zugreifen auf Objektmethoden und -variablen
    stringBuilder.append( 1 );                           // Aufrufen einer Methode des Objekts
    java.awt.Point point = new java.awt.Point();
    point.x = 10;                                        // Setzen einer Objektvariablen
    point.y = point.x;                                   // Auslesen und Setzen einer Objektvariablen

    // null-Verweise
    StringBuilder nullObject = null;                     // Referenz zeigt auf kein Objekt

    if ( nullObject == null ) {                          // Prüfen, ob eine Referenz null ist
      System.out.println( "Referenz ist null" );
    }

    // Prüfen, ob eine Referenz nicht null ist, um NullPointerException zu vermeiden
    if ( stringBuilder != null ) {
      stringBuilder.toString();                       // Methode nur aufrufen, wenn das Objekt existiert
    }
  }
}

@SuppressWarnings( "all" ) class ArrayExamples {
  // Ein Array ist eine Datenstruktur, die eine festgelegte Anzahl von Elementen desselben Typs
  // in einer geordneten Sequenz speichert.
  public static void main( String[] args ) {
    // Arrays deklarieren und Array-Literal-Notation
    int[] intArray = { 1, 2, 3, 4, 5 };              // Array von Ganzzahlen
    String[] stringArray = new String[ 5 ];          // Array von Strings mit Länge 5
    int[][] twoDArray = { { 1, 2 }, { 3, 4 }, { 5, 6 } }; // Zweidimensionales Array

    // Auf Array-Elemente zugreifen
    int firstElement = intArray[ 0 ];                // Erstes Element des Arrays
    stringArray[ 0 ] = "Hello";                      // Erstes Element setzen
    int arrayLength = intArray.length;               // Länge des Arrays ermitteln, 5

    // Über Arrays iterieren
    for ( int i = 0; i < intArray.length; i++ ) {    // Variante 1
      System.out.println( intArray[ i ] );           // Element per Indexzugriff ausgeben
    }

    for ( int value : intArray ) {                   // Variante 2: Erweitere for-Schleife
      System.out.println( value );                   // Der Index steht nicht zur Verfügung
    }

    // java.util.Arrays ist eine Utiltiy-Klasse
    Arrays.fill( intArray, 42 );                     // Alle Elemente des Arrays auf 42 setzen
    Arrays.sort( intArray );                         // Sortieren in aufsteigender Reihenfolge
    Arrays.sort( stringArray );                      // String-Array alphabetisch sortieren
    // Binäre Suche im sortierten Array, -1 wenn nicht gefunden
    int index = Arrays.binarySearch( intArray, 3 );
    int[] copiedArray = Arrays.copyOf( intArray, intArray.length ); // Ganzes Array kopieren
    int[] partialCopy = Arrays.copyOfRange( intArray, 1,
                                            3 );       // Teilbereich des Arrays kopieren
    // Array zu String umwandeln: [1, 2, 3, 4, 5]
    String arrayAsString = Arrays.toString( intArray );

    // Mehrdimensionale Arrays
    int[][] matrix = new int[ 3 ][ 3 ];                  // Zweidimensionales Array (Matrix) deklarieren
    matrix[ 0 ][ 0 ] = 1;                                // Element setzen

    int[][][] threeDArray = new int[ 2 ][ 2 ][ 2 ];      // Dreidimensionales Array 2x2x2

    // Mehrdimensionale Arrays iterieren
    for ( int i = 0; i < matrix.length; i++ ) {
      for ( int j = 0; j < matrix[ i ].length; j++ ) {
        System.out.print( matrix[ i ][ j ] + " " );
      }
      System.out.println();
    }
  }

  static void printInfo( String name, int... scores ) {
    //                                   ☝️  Methode mit Varargs
    System.out.println( "Name: " + name );
    System.out.println( "Scores: " + Arrays.toString( scores ) );

    // Varargs aufrufen
    // printInfo( "Jill" );
    // printInfo( "Joe", 75, 80 );
  }
}

@SuppressWarnings( "all" ) class StringExamples {
  public static void main( String[] args ) {

    // char
    char c1 = 'A';
    char c2 = 65;                           // ASCII-Wert für 'A'
    // char Operationen
    char nextChar = (char) (c1 + 1);        // 'B'
    // Character (Wrapper-Klasse für char)
    Character ch = Character.valueOf( 'A' );
    Character ch2 = 'A';                    // Autoboxing
    // Character statische Methoden
    boolean isDigit = Character.isDigit( '5' );       // true
    boolean isLetter = Character.isLetter( 'A' );     // true
    boolean isWhitespace = Character.isWhitespace( ' ' );  // true
    char upperCase = Character.toUpperCase( 'a' );    // 'A'
    char lowerCase = Character.toLowerCase( 'A' );    // 'a'

    // String
    String s1 = "tutego";
    String s2 = new String( "tutego" );     // Möglich, aber
    s1.length();                            // Länge des Strings
    s1.charAt( 0 );                         // Zeichen an Position 0
    s1.substring( 1, 4 );                   // Teilstring von Index 1 bis 3
    s1.toLowerCase();                       // In Kleinbuchstaben
    s1.toUpperCase();                       // In Großbuchstaben
    s1.trim();                              // Leerzeichen am Anfang und Ende entfernen
    s1.replace( 'e', 'a' );                 // 'e' durch 'a' ersetzen
    s1.contains( "te" );                    // Prüft, ob "te" enthalten ist
    String[] parts = s1.split( "e" );       // Teilt String an 'e'

    // String Vergleiche
    boolean isEqual = s1.equals( s2 );      // Inhalt vergleichen
    boolean isSameRef = (s1 == s2);         // Referenz vergleichen (Vorsicht!)
    int compResult = s1.compareTo( s2 );    // Lexikografischer Vergleich, <0, ==0, >0

    // StringBuilder
    StringBuilder sb = new StringBuilder();
    StringBuilder sb2 = new StringBuilder( "Initial content" );
    sb.append( "Hello" );                   // Anhängen
    sb.insert( 5, " World" );               // Einfügen an Position 5
    sb.delete( 5, 11 );                     // Löschen von Index 5 bis 10
    sb.reverse();                           // Umkehren
    String result = sb.toString();          // In String umwandeln

    // Konvertierungen
    String str = "Hello";
    char[] charArray = str.toCharArray();           // String zu char-Array
    char[] charArray2 = { 'W', 'o', 'r', 'l', 'd' };
    String str2 = new String( charArray2 );           // char-Array zu String
    int num = 123;
    String numStr = String.valueOf( num );            // int zu String
    // oder
    String numStr2 = Integer.toString( num );
    String numStr3 = "456";
    int parsedNum = Integer.parseInt( numStr3 );      // String zu int
  }
}

@SuppressWarnings( "all" ) class CoreClasseExamples {
  public static void main( String[] args ) {
    int intPrim = 42;
    Integer intObj = Integer.valueOf( intPrim );  // Explizites Boxing
    Integer intAutoboxed = 42;
    //                     ☝️                        Autoboxing (Primitiv -> Wrapper)
    int intUnboxed = intObj;
    //                ☝️                             Unboxing (Wrapper -> Primitiv)
    Integer nullableInt = null;
    // System.out.println( nullableInt * 2 );
    //                     ☝️                        Führt zu einer NullPointerException

    Integer a = 127, b = 127, c = 128, d = 128;
    System.out.println( a == b );                 // true (Caching -128 bis 127)
    System.out.println( c == d );                 // false
    System.out.println( c.equals( d ) );          // true
  }
}

@SuppressWarnings( "all" )
abstract class Shape {               // Basisklasse für geometrische Formen
  // ☝️                                 Von abstrakten Klassen können keine Instanzen gebildet werden.
  private String color;
  // ☝️                                 Private Eigenschaft ist außerhalb von Shape nicht einsehbar.

  Shape( String color ) {            // Parametrisierter Konstruktor
    this.color = color;              // Initialisiert die Farbe
  }

  Shape() {                          // Eigener Paramterloser Konstruktor
    this( "Black" );
    //☝️                                 Mit this(...) Weiterleitung an anderen Konstruktor der Klasse.
  }

  public String getColor() {
    return /*this.*/color;
    //        ☝️                         this ist nicht nötig, da es keinen Namenskonflikt gibt.
  }

  public abstract double getArea();
  //        ☝️  Eine abstrakte Methode muss von allen Unterklassen implementiert werden,
  //           oder die Unterklasse muss selbst abstrakt sein.

  // Konkrete Methode in der abstrakten Klasse
  public void displayInfo() {
    System.out.println( "Shape color: " + getColor() );
    //                                      ☝️  Auch direkter Zugriff auf color wäre denkbar.
  }
}

@SuppressWarnings( "all" )
class Circle extends Shape {
  //            ☝️                       Rectangle erbt von Shape. Nur eine Oberklasse ist erlaubt.
  private double radius;

  public Circle( String color, double radius ) {
    super( color );
    //☝️                                 Mit super Aufruf des Konstruktors der Oberklasse.
    this.radius = radius;
  }

  // Getter und Setter
  public double getRadius() {return radius;}

  public void setRadius( double radius ) {this.radius = radius;}

  // Implementation der abstrakten Methode
  @Override
  // ☝️                     Annotation dokumentiert das Überschreiben von Methoden.
  public double getArea() {
    return radius * radius * Math.PI;
  }

  // Rectangle kann als Unterklasse neue Methode hinzufügen.
  public double getPerimeter() {
    return 2 * Math.PI * radius;
  }

  // Überschreiben der Methode displayInfo()
  // Alle nicht-privaten und nicht-finalen Methoden können überschrieben werden.
  @Override public void displayInfo() {
    super.displayInfo();
    //☝️    Mit super.methode(...) wird eine Methode der Oberklasse aufgerufen.
    //      Ohne super gibt es einen rekursiven Aufruf.
    System.out.println( "A circle with radius " + radius + "." );
  }

  // Statische Methode zum Vergleich zweier Kreise
  public static Circle getLarger( Circle r1, Circle r2 ) {
    return r1.getArea() > r2.getArea() ? r1 : r2;
  }
}

@SuppressWarnings( "all" )
class CircleExamples /* extends Object */ {
  //                      ☝️    Wird keine explizite Oberklasse erweitert, ist es automatisch Object.

  // CircleExamples() {}
  //  ☝️    Eine Klasse ohne expliziten Konstruktor bekommt automatisch
  //       vom Compiler einen sogenannten Default-Konstruktor.

  public static void main( String[] args ) {
    Circle redCircle = new Circle( "Red", 5 );
    Circle blueCircle = new Circle( "Blue", 4 );

    redCircle.displayInfo();
    System.out.printf( "Area: %s, Circumference: %s%n", redCircle.getArea(),
                       redCircle.getPerimeter() );

    Shape shape1 = new Circle( "Red", 5 );
    Shape shape2 = new Circle( "Blue", 4 );
    // ☝️   Referenztyp kann ein Basistyp sein
    //                  ☝️   Objekttyp

    Shape[] shapes = { shape1, shape2, new Circle( "Green", 2 ) };

    for ( Shape shape : shapes ) {
      shape.displayInfo();
      System.out.println( shape.getArea() );
      //                          ☝️   Methodenaufruf dynamisch gebunden an tatsächlichen Typ (Polymorphie)

      if ( shape instanceof Circle ) {
        //          ☝️                       Prüfen, ob hinter shape etwas vom Typ Rectangle steht.
        Circle rect = (Circle) shape;
        //                   ☝️     Explizite Typumwandlung von Shape auf Rectangle.
        System.out.println( rect.getPerimeter() );
        //                           ☝️     Ohne Typumwandlung gibt es getPerimeter() auf Shape nicht.
      }

      // Rectangle rect = (Rectangle) new Object();
      //                    ☝️     Explizite Typumwandlung führt zur ClassCastException,
      //                           weil Object kein Rectangle ist.
    }

    if ( shape1 instanceof Circle circle1 &&
        shape2 instanceof Circle circle2 ) {
      //                             ☝️   Pattern-Variable bei instanceof
      Circle larger = Circle.getLarger( circle1, circle2 );
    }
  }
}

@SuppressWarnings( "all" )
interface Playable {
  // ☝️ Schnittstellen (engl. interfaces) werden mit dem Schlüsselwort interface deklariert.

  /* public static final */ int MIN_VOLUME = 0, MAX_VOLUME = 100;
  //   ☝️ Jede Variable innerhalb einer Schnittstelle ist implizit public, static und final.

  static int validateVolume( int volume ) {
    //☝️ Eine Schnittstelle kann statische Methoden mit Implementierung enthalten.
    //  Diese Methoden können direkt über die Schnittstelle aufgerufen werden,
    //  ohne dass eine Instanz benötigt wird.
    return Math.clamp( volume, MIN_VOLUME, MAX_VOLUME );
  }

  /* public abstract */ void play();
  //                              ☝️ Abstrakte Methoden habe keine Implementierung.
  // ☝️ Jede Methode innerhalb einer Schnittstelle ist implizit public und abstract.
}

@SuppressWarnings( "all" )
interface Rateable {
  //          ☝️ Viele Schnittstellen enden auf -able, um eine Fähigkeit oder Eigenschaft anzuzeigen.

  void rate( int rating );

  int getRating();

  private String generateStars( int count, boolean filled ) {
    // ☝️ Schnittstellen können private Methoden enthalten. Diese können nur innerhalb der
    // Schnittstelle verwendet werden, um Code zwischen Default- oder statischen Methoden zu teilen.
    return (filled ? "★" : "☆").repeat( count );
  }

  default String getRatingStars() {
    // ☝️ Eine Schnittstelle kann Default-Methoden mit Standardimplementierung enthalten.
    // Sie können überschrieben werden, müssen es aber nicht.
    return generateStars( getRating(), true ) + generateStars( 10 - getRating(), false );
  }
}

@SuppressWarnings( "all" )
class Podcast implements Playable {
  //           ☝️ Schnittstellen werden mit dem Schlüsselwort implements implementiert,
  //              nicht mit extends wie bei Klassen.

  @Override public void play() {}
  // ☝️ Diese Methode überschreibt und implementiert die abstrakte Methode der Schnittstelle Playable.
}

@SuppressWarnings( "all" )
class Track implements Playable, Rateable {
  //                          ☝️ Eine Klasse kann mehrere Schnittstellen implementieren,
  //                            um mehrere Fähigkeiten zu kombinieren.
  @Override public void play() {}

  @Override public void rate( int rating ) {}

  @Override public int getRating() {return 0;}
}

@SuppressWarnings( "all" )
abstract class Album implements Rateable {}
// ☝️ Eine Klasse muss nicht alle abstrakten Methoden ihrer Schnittstellen implementieren.
//    Aber wenn sie nicht alle abstrakten Methoden implementiert, muss die Klasse selbst abstrakt sein.

@SuppressWarnings( "all" )
class RatedPodcast extends Podcast implements Rateable {
  //               ☝️ Eine Klasse kann eine Oberklasse haben und beliebig viele Schnittstellen implementieren.
  @Override public void rate( int rating ) {}

  @Override public int getRating() {return 0;}

  // RatedPodcast enthält alle Methoden aus Object, Podcast, Playable und Rateable.
}

@SuppressWarnings( "all" ) record Person(
    String name, int age   // Record-Komponenten in runden Klammern.
) {
  // private final String name, int age
  // Record-Komponenten werden zu privaten, finalen Variablen

  // int birthdate;
  // ☝️ Eigene Objektvariablen sind unzulässig.

  public boolean isAdult() {
    //          ☝️ Eigene Methoden sind zulässig.

    return age() >= 18;
    // return age >= 18;
    //        ☝️ Zugriff über die privaten Variablen oder Zugriffsmethoden (engl. accessor method)
  }

  @Override public String name() {
    // ☝️ Zugriffsmethoden können überschrieben werden.
    return name.toLowerCase();
  }
}

@SuppressWarnings( "all" )
record Cube( int radius )
    // extends java.lang.Record
    //    ☝️ Oberklasse ist immer Record, keine Vererbung möglich.
    implements Comparable<Cube> {
  //      ☝️ Record kann Schnittstellen implementieren.

  // Impliziter eigener kanonischer Konstruktor
  Cube( int radius ) {
    if ( radius < 0 )
      throw new IllegalArgumentException();

    this.radius = radius;
    //          ☝️ Im kanonischen Konstruktor müssen alle Record-Variablen initialisiert werden.
  }

  @Override public int compareTo( Cube other ) {
    return Integer.compare( this.radius, other.radius );
  }
}

@SuppressWarnings( "all" ) record LineSegment( double length ) {

  public static final double UNIT_LENGTH = 1.0;
  //      ☝️👇  Statische Variablen und Methoden sind zulässig.

  public static LineSegment unit() {
    return new LineSegment( UNIT_LENGTH );
  }

  // Kompakter Konstruktor, es fehlt die Parameterliste
  LineSegment {
    if ( length < 0 )
      throw new IllegalArgumentException();
    // this.length wird automatisch mit length initialisiert.
  }

  LineSegment() {
    // ☝️ Weitere Konstruktoren sind möglich.
    this( 0 );
    // ☝️ Nur Weiterleitung auf kanonischen Konstruktor erlaubt.
  }
}

@SuppressWarnings( "all" ) class RecordExamples {
  public static void main( String[] args ) {
    Person chris = new Person( "Chris", 50 );
    //                 ☝️ Jedes Record hat einen kanonischen Konstruktor.
    chris.age();
    chris.isAdult();
    chris.name();
    //    ☝️ Für alle Record-Komponenten werden Zugriffsmethoden generiert.

    chris.toString();
    chris.equals( null );
    chris.hashCode();
    //    ☝️ Jedes Record hat diese Methoden sinnvoll implementiert.
  }
}