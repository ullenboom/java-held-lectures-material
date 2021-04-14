import javax.swing.*;

/**
 * Lernziel: `null` und `NullPointerException`
 * - Referenztyp `null`
 * - Ausnahme `NullPointerException`
 * - Prüfungen auf `null` und ungleich `null`
 *
 * @see OopGc
 */
public class NullNullPointerException {
  public static void main( String[] args ) {
    java.awt.Point p = null;
    String s = "Hallo";
    int i = 12;
    if ( s != null )
      System.out.println( s.length() );
    else
      System.out.println( "s == null" );

    String input = JOptionPane.showInputDialog( "Eingabe" );
    if ( input != null )
      System.out.println( input.length() );
  }
}
