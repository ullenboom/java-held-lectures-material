package de.tutego.reflection;

/**
 * Lernziel: Annotationen auslesen
 * - Zusammenhang der Typen
 *
 * @see DeclareNewAnnotationTypes
 */
public class ReadAnnotations {
  public static void main( String[] args ) {
    Deprecated annotation = Tree.class.getAnnotation( Deprecated.class );
    System.out.println( annotation.forRemoval() );
    System.out.println( annotation.since() );
  }

  public @Override String toString() {
    return super.toString();
  }
}

@Deprecated//( since = "version 2.9", forRemoval = true )
class Tree {

}