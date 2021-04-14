package de.tutego.exception;

/**
 * Lernziel: Automatisches Ressourcen-Management (`try`-mit-Ressourcen)
 * - Syntax
 * - `AutoCloseable`
 * - Mehrere Ressourcen nutzen
 * - Reihenfolge der Initialisierung und Schließung
 * - (Unterdrückte) Ausnahmen
 *
 * @see ThrowNewException
 */
public class TryWithResources {
  public static void main( String[] args ) {
    //    try ( Scanner scanner = new Scanner( Paths.get( "ausgabe.txt" ) );
    //          PrintWriter writer = new PrintWriter( "ausgabe2.txt" ) ) {
    //      while ( scanner.hasNextLine() ) {
    //        String line = scanner.nextLine();
    //        writer.println( line.toUpperCase( Locale.ROOT ) );
    //      }
    //    }
    //    catch ( IOException e ) {
    //      e.printStackTrace();
    //    }
    //    /*
    //    finally {
    //    writer.close();
    //    scanner.close();
    //    }
    //     */

    try ( Output output = new Output();
          Input input = new Input() ) {
      System.out.println( "Rumpf try-mit-Ressourcen" );
//      System.out.println( 1 / 0 );
    }
    catch ( ArithmeticException e ) {
      e.printStackTrace();
    }
  }
}

class Output implements AutoCloseable {
  public Output() {
    //    System.out.println(1/0);
  }

  @Override public void close() {
    System.out.println( "Output close()" );
    System.out.println(1/0);
  }
}

class Input implements AutoCloseable {
  public Input() {
    //    System.out.println( 1 / 0 );
  }

  @Override public void close() {
    System.out.println( "Input close()" );
    System.out.println(1/0);
  }
}
