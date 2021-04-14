package de.tutego.reflection;

import java.util.Map;

/**
 * Lernziel: Typbeziehungen von `Class`-Objekten abfragen
 * - Textrepräsentationen
 * - Oberklasse erfragen
 * - Implementierte Schnittstellen erfragen
 *
 * @see RealReflection
 */
public class ClassTypeHierarchies {
  public static void main( String[] args ) {

    Class<String> stringClass = String.class;
    Class<CharSequence> charSequenceClass = CharSequence.class;
    Class<Map.Entry> entryClass = Map.Entry.class;

    System.out.println( stringClass.toString() );
    System.out.println( stringClass.getSimpleName() );
    System.out.println( stringClass.getName() );
    System.out.println( stringClass.getCanonicalName() );
    System.out.println( charSequenceClass.toString() );
    System.out.println( charSequenceClass.getSimpleName() );
    System.out.println( charSequenceClass.getName() );
    System.out.println( charSequenceClass.getCanonicalName() );
    System.out.println( entryClass.toString() );
    System.out.println( entryClass.getSimpleName() );
    System.out.println( entryClass.getName() );
    System.out.println( entryClass.getCanonicalName() );

    //

    Class<?>[] interfaces = stringClass.getInterfaces();
    for ( Class<?> anInterface : interfaces ) {
      System.out.println( anInterface );
    }

    System.out.println( stringClass.getSuperclass() );
  }
}
