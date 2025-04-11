import javax.swing.*;
import java.awt.*;
// import java.awt.List;
import java.util.Scanner;
import java.util.List;

public class ImportDeclaration {
  public static void main( String[] args ) {

//    System.out.println( "x=" );
//    int x = new java.util.Scanner( System.in ).nextInt();
//    System.out.println( "y=" );
//    int y = new java.util.Scanner( System.in ).nextInt();
//
//    java.awt.Point point = new java.awt.Point( x, y );

    System.out.println( "x=" );
    int x = new Scanner( System.in ).nextInt();
    System.out.println( "y=" );
    int y = new Scanner( System.in ).nextInt();

    Point point = new Point( x, y );
    // 1. point.x/y = ...
    // 2. point.setLocation(x,y)
    // 3. new Point(x, y)

    System.out.println( point );
    System.out.println( point.distance( 0, 0 ) );

    Polygon p = new Polygon();

    List l;
    java.awt.List awtList;

    JOptionPane.showInputDialog( "Input" );

  }
}
