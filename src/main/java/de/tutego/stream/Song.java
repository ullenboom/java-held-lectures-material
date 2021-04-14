package de.tutego.stream;

public class Song {
  public final String title;
  public final int duration;

  public Song( String title, int duration ) {
    this.title = title;
    this.duration = duration;
  }

  @Override public String toString() {
    return "Song{" +
           "title='" + title + '\'' +
           ", duration=" + duration +
           '}';
  }
}
