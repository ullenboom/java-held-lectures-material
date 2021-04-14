package de.tutego.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArtistRepository {
  static List<Artist> artists() {
    ArrayList<Artist> artists = new ArrayList<>();
    artists.add( new Artist( "The Beatles", Arrays.asList( new Song( "Love Me Do", 139 ),
                                                           new Song( "Ask Me Why", 144 ) ) ) );
    artists.add( new Artist( "Pink Floyd", Arrays.asList( new Song( "Money", 239 ) ) ) );
    return artists;
  }
}
