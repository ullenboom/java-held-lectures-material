public class IfElseStatement {
  public static void main( String[] args ) {
    //    boolean isRed = Math.random() > 0.5;
    //    boolean isUnderline = Math.random() > 0.5;
    //    if ( isRed )
    //      if ( isUnderline )
    //        System.out.println( "Red" );
    //      else // Dangling-Else-Problem
    //        System.out.println( "Blue" );
    //    else
    //      System.out.println( "abc" );

    double random = Math.random();
    if ( random < 0.3 )
      System.out.println( "Red" );
    else if ( random < 0.6 )
      System.out.println( "Green" );
    else
      System.out.println( "Blue" );
  }
}
