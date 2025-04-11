package com.tutego.stream;

import java.util.List;

public class CreateStream {
  public static void main( String[] args ) {

    /*
    ┌────────┐  ┌──────────────────────────┐  ┌──────────────────────────┐  ┌────────────────────┐
    │ Source ├─►│ Intermediate Operation 1 ├─►│ Intermediate Operation 2 ├─►│ Terminal Operation │
    └────────┘  └──────────────────────────┘  └──────────────────────────┘  └────────────────────┘
     */

  }
}

class Song {
  final String title;
  final int duration;

  Song( String title, int duration ) {
    this.title = title;
    this.duration = duration;
  }

  @Override public String toString() {
    return "Song{title='" + title + '\'' + ", duration=" + duration + '}';
  }
}

class Artist {
  final String name;
  final List<Song> songs;

  Artist( String name, List<Song> songs ) {
    this.name = name;
    this.songs = songs;
  }

  @Override public String toString() {
    return "Artist{name='" + name + '\'' + ", songs=" + songs + '}';
  }
}

class ArtistRepository {
  static List<Artist> artists() {
    return List.of(
        new Artist( "The Beatles",
                    List.of( new Song( "Love Me Do", 139 ),
                             new Song( "Ask My Why", 144 ) ) ),
        new Artist( "Pink Floyd", List.of( new Song( "Money", 239 ) ) )
    );
  }
}