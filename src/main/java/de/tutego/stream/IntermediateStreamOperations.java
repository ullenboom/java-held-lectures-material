package de.tutego.stream;

import java.util.Comparator;

/**
 * Lernziel: Intermediäre Operationen auf einem Stream
 *
 * @see PrimitiveStreams
 */
public class IntermediateStreamOperations {
  public static void main( String[] args ) {
    ArtistRepository.artists().stream()
        //        .filter( artist -> artist.songs.size() > 1 )
        //        .map( artist -> artist.name )
        .flatMap( artist -> artist.songs.stream() )
        // .filter( song -> song.duration > 200 )
        .sorted( Comparator.comparing( song -> song.title ))
        .forEach( System.out::println );
  }
}