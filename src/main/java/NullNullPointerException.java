import javax.swing.*;

public class NullNullPointerException {
  public static void main( String[] args ) {
    java.awt.Point p = null;
    String s = "HELLO";
    //    int i = 12;
    //    System.out.println( i );
    System.out.println( s );

    // NullPointerException

    // s.length();
    // Exception in thread "main" java.lang.NullPointerException: Cannot invoke "String.length()" because "s" is null

    // null tests, != null, == null

    if ( s != null ) {
      System.out.println( s.length() );
    }
    else {
      System.out.println( "s == null " );
    }

    // GUI input

    String input = JOptionPane.showInputDialog( "Input" );
    if ( input != null )
      System.out.println( input.length() );
  }
}
