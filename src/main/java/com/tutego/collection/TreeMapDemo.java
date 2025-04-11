package com.tutego.collection;

import java.time.LocalDate;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapDemo {
  public static void main( String[] args ) {

    NavigableMap<LocalDate, String> dates = new TreeMap<>();
//    NavigableMap<LocalDate, String> dates = new TreeMap<>( Comparator.reverseOrder() );
    dates.put( LocalDate.of( 2024, 3, 15 ), "World Sleep Day" );
    dates.put( LocalDate.of( 2010, 3, 15 ), "Day Of Good Humor" );
    dates.put( LocalDate.of( 2030, 3, 15 ), "Smurf Day" );

    System.out.println( dates ); // {2010-03-15=Day Of Good Humor, 2024-03-15=World Sleep Day, 2030-03-15=Smurf Day}

    System.out.println( dates.firstKey() );                  // 2010-03-15
    System.out.println( dates.firstEntry().getKey() ); // 2010-03-15
    System.out.println( dates.firstEntry().getValue() );  // Day Of Good Humor

    System.out.println( dates.ceilingEntry( LocalDate.MIN ) ); // // 2010-03-15

    System.out.println( dates.subMap( LocalDate.of( 2020, 1, 1 ),
                                      LocalDate.of( 2030, 1, 1 ) ) );

  }
}
