public class OopGc {
  public static void main( String[] args ) {
    /*
    ┌────────────────────────────────────────────────┐
    │  M E M O R Y                                   │
    │ ┌─────────────────────────────┐  ┌──────────┐  │
    │ │ JVM                         │  │ Office   │  │
    │ ├──────┬───────────┬──────────┤  ├──────────┤  │
    │ │ Heap │ Metadata  │ Thread 1 │  │ Editor   │  │
    │ │  o   │           │ Thread 2 │  ├──────────┤  │
    │ │ o o  │           │ Thread 3 │  │ Browser  │  │
    │ └──────┴───────────┴──────────┘  └──────────┘  │
    └────────────────────────────────────────────────┘ */

    //    java.util.ArrayList list = new java.util.ArrayList();
    //    while ( true ) {
    //      list.add( new java.awt.Point() );
    //    }
    //    // Exception in thread "main" java.lang.OutOfMemoryError: Java heap space

    //    while ( true ) {
    //      new java.awt.Point();
    //    }

    java.awt.Point p = new java.awt.Point();  // A  -> no strong reference anymore
    p = new java.awt.Point();                 // B  -> no strong reference anymore
    p = null;

    {
      int i = 0;
      String s = "";
    }

    // System.out.println(s);



  }
}
