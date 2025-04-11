public class ConsoleInputs {
  public static void main( String[] args ) {

    /*
     Write: System.out, System.err
     Read: System.in
     */

    System.out.println( "Please enter product name: " );
    String name = new java.util.Scanner( System.in ).nextLine();
    // String name = new java.util.Scanner( System.in ).next();

    System.out.println( "Please enter kcal: " );
    double kcal = new java.util.Scanner( System.in ).nextDouble();

    System.out.println( "Please enter the number of products: " );
    int number = new java.util.Scanner( System.in ).nextInt();

    System.out.println( name );
    System.out.println( kcal );
    System.out.printf( "%.2f%n", kcal );
    System.out.println( number );

    /*
     */

    // Console
  }
}
