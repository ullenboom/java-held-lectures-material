package de.tutego.stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Lernziel: Terminale Operationen auf einem Stream
 *
 * @see IntermediateStreamOperations
 */
public class TerminalStreamOperations {
  public static void main( String[] args ) {

    Stream<Artist> stream = ArtistRepository.artists().parallelStream();
    // stream.forEach( artist -> System.out.println( artist ) );
    // List<Artist> collect = stream.collect( Collectors.toList() );
    //    Optional<Artist> min = stream.min( ( o1, o2 ) -> Integer.compare( o1.name.length(), o2.name.length() ) );
    //    System.out.println( min ); // Pink Floyd
    System.out.println( stream.anyMatch( artist -> !artist.name.isEmpty() ) );
  }
}