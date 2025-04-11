package com.tutego.stream;

import java.util.stream.IntStream;

public class PrimitiveStreams {
  public static void main( String[] args ) {
    // IntStream, LongStream, DoubleStream

    //    String collect = IntStream.of( 3, 5, 6, 78, 9, 6, 4, 3, 34 )
    //                              .map( operand -> operand * 2 )
    //                              .mapToObj( value -> "'" + value + "'" )
    //                              .collect( Collectors.joining( ", " ) );
    //    System.out.println( collect );

    // Aggregates

    //    IntSummaryStatistics summaryStatistics = ArtistRepository.artists().stream()
    //                                               .flatMap( artist -> artist.songs.stream() )
    //                                               .mapToInt( song -> song.duration )
    //                                               .summaryStatistics();
    //    System.out.println( summaryStatistics );

    // Ranges

    IntStream.rangeClosed( 1, 12 ).forEach( System.out::println );

  }
}