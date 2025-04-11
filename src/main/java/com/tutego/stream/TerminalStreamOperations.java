package com.tutego.stream;

import java.util.stream.Stream;

public class TerminalStreamOperations {
  public static void main( String[] args ) {

    Stream<Artist> stream = ArtistRepository.artists().parallelStream();
    // stream.forEach( artist -> System.out.println( artist ) );
    //    List<Artist> list = stream.collect( Collectors.toList() );
    //    List<Artist> list = stream.toList();
    //    Optional<Artist> min = stream.min(
    //        Comparator.comparingInt( o -> o.name.length() ) );
    //    System.out.println( min );  // Pink Floyd
    System.out.println( stream.anyMatch( artist -> !artist.name.isEmpty() ) );
  }
}