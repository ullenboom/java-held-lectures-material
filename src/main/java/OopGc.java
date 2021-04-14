/**
 * Lernziel: Speicherverwaltung
 * - Objekte auf dem Heap
 * - `OutOfMemoryError`
 * - Garbage Collector
 *
 * @see CopyReferenceAndPassByValue
 */
public class OopGc {
  public static void main( String[] args ) {
    /*
+------------------------------------------------+
|  H A U P T S P Radio I C H Radio R                     |
| +-----------------------------+  +----------+  |
| | JVM                         |  | Office   |  |
| +------+-----------+----------+  + ---------+  |
| | Heap | Metadaten | Thread 1 |  | Editor   |  |
| |  o   |           | Thread 2 |  +----------+  |
| | o o  |           | Thread 3 |  | Browser  |  |
| +------+-----------+----------+  +----------+  |
+------------------------------------------------+ */

    java.util.Stack stack = new java.util.Stack();
//    while ( true ) {
////      stack.push( new java.awt.Point() );
//      new java.awt.Point();
//    }

    java.awt.Point p = new java.awt.Point();  // A <! nicht mehr benötigt
    p = new java.awt.Point();                 // B <! nicht mehr benötigt
    p = null;
  }
}
