import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
import java.util.List;

/**
 * Lernziel: `import`-Deklaration
 * - Pakete
 * - Volle Qualifizierung vs. `import`-Deklaration
 *
 * @see de.tutego.app.MyPackageDeclaration
 */
public class ImportDeclaration {
  public static void main( String[] args ) {

    //    System.out.println( "x=" );
    //    int x = new java.util.Scanner( System.in ).nextInt();
    //    System.out.println( "y=" );
    //    int y = new java.util.Scanner( System.in ).nextInt();
    //
    //    java.awt.Point point = new java.awt.Point( x, y );
    //    // 1. point.x/y=
    //    // 2. point.setLocation(x,y)
    //    System.out.println( point.distance( 0, 0 ) );

    System.out.println( "x=" );
    int x = new Scanner( System.in ).nextInt();
    System.out.println( "y=" );
    int y = new Scanner( System.in ).nextInt();

    Point point = new Point( x, y );
    // 1. point.x/y=
    // 2. point.setLocation(x,y)
    System.out.println( point.distance( 0, 0 ) );

    Polygon p = new Polygon();

    List l;
    java.awt.List list;

    JOptionPane.showInputDialog( "Eingabe" );
  }
}

