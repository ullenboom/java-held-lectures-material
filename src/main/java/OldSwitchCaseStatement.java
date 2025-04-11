public class OldSwitchCaseStatement {
  public static void main( String[] args ) {
    int value = 1;
    switch ( value ) {
      case 1:
        System.out.println( 1 );
        break;
        // fall-through
      case 2 - 5:
      // case 3:
        System.out.println( 2 );
    }
  }
}
