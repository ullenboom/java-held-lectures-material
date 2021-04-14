package de.tutego.stream;

import java.util.List;

public class Artist {
  public final String name;
  public final List<Song> songs;

  public Artist( String name, List<Song> songs ) {
    this.name = name;
    this.songs = songs;
  }

  @Override public String toString() {
    return "Artist{" +
           "name='" + name + '\'' +
           ", songs=" + songs +
           '}';
  }
}
