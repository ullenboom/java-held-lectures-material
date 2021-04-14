package de.tutego.stream;

import java.util.stream.IntStream;

/**
 * Lernziel: Primitive Streams
 * - Aggregations-Funktionen
 * - Ranges
 *
 * @see de.tutego.io.JavaNioFileFileSystemPathPaths
 */
public class PrimitiveStreams {
  public static void main( String[] args ) {

    //    String collect = IntStream.of( 3, 7, 34, 2, 5, 78, 9, 4 )
    //        .map( operand -> operand * 2 )
    //        .mapToObj( value -> "'" + value + "'" )
    //        .collect( Collectors.joining( ", " ) );
    //    System.out.println( collect );

//    IntSummaryStatistics summaryStatistics = ArtistRepository.artists().stream()
//        .flatMap( artist -> artist.songs.stream() )
//        .mapToInt( value -> value.duration )
//        .summaryStatistics();
//    System.out.println( summaryStatistics );

    IntStream.rangeClosed( 1, 12 ).forEach( System.out::println );

  }
}