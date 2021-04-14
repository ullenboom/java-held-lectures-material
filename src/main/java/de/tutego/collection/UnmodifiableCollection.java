package de.tutego.collection;

import java.awt.*;
import java.util.List;
import java.util.Map;

/**
 * Lernziel: Unmodifiable/Immutable Datenstrukturen
 * - Unmodifiable vs. Immutable
 * - Statische `of(...)`-Methoden aus `List`, `Set`, `Map`
 * - `List.copyOf(...)`
 *
 * @see BitSetDemo
 */
public class UnmodifiableCollection {
  public static void main( String[] args ) {
    System.out.println( PaperSheet.formats );
  }
}

class PaperSheet {

  public static final List<String> formats = List.of( "A3", "A4", "A5" );

  public static final Map<String, Dimension> sizes = Map.ofEntries(
      //"A4", new Dimension( 210, 297 /*mm*/ )
      Map.entry( "A4", new Dimension( 210, 297 /*mm*/ ) )
  );

}