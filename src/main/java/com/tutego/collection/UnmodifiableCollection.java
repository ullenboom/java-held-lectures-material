package com.tutego.collection;

import java.util.List;
import java.util.Map;

public class UnmodifiableCollection {
  public static void main( String[] args ) {
    // PaperSheet.FORMATS.clear();

    System.out.println( PaperSheet.FORMATS );
  }
}

class PaperSheet {

  public static final List<String> FORMATS = List.of( "A3", "A4", "A5" );

  public static final Map<String, Dimension> SIZES = Map.ofEntries(
      Map.entry( "A4", new Dimension( 210 /* mm */, 297 /* mm */ ) )
  );
}

record Dimension( int width, int height ) {}