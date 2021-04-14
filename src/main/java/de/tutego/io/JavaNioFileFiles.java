package de.tutego.io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

/**
 * Lernziel: Dateioperationen mit der Klasse `Files`
 * - Javadoc der Klasse `Files`
 * - Typische Aufgaben mit der `Files`-Klasse lösen
 *
 * @see InputStreamOutputStreamReaderWriter
 */
public class JavaNioFileFiles {
  public static void main( String[] args ) {

    try {
      String html = "<html>Hallo Welt</html>";
      Files.writeString( Paths.get( "out.html" ), html );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    try {
      String s = Files.readString( Paths.get( "out.html" ) );
      System.out.println( s );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    Path path = Paths.get( System.getProperty( "user.home" ) );
    System.out.println( path );

    try ( Stream<Path> list = Files.list( path ) ) {
      list.forEach( p -> {
        if ( Files.isDirectory( p ) )
          System.out.print( "<D> " );
        else if ( Files.isRegularFile( p ) ) {
          try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes( path, BasicFileAttributes.class );
            System.out.printf( "<F> %d %s ", Files.size( p ), basicFileAttributes.lastModifiedTime() );
          }
          catch ( IOException e ) {
            e.printStackTrace();
          }
        }
        System.out.println( p );
      } );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    //

    //    try ( Stream<Path> walk = Files.walk( path ) ) {
    //      walk.forEach( System.out::println );
    //    }
    //    catch ( IOException e ) {
    //      e.printStackTrace();
    //    }

    SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<>() {
      @Override public FileVisitResult visitFile( Path file, BasicFileAttributes attrs ) throws IOException {
        System.out.println( file );
        return FileVisitResult.CONTINUE;
      }

      @Override public FileVisitResult postVisitDirectory( Path dir, IOException exc ) throws IOException {
        if ( exc == null )
          return FileVisitResult.CONTINUE;
        else
          return FileVisitResult.SKIP_SUBTREE;
      }

      @Override public FileVisitResult visitFileFailed( Path file, IOException exc ) throws IOException {
        return FileVisitResult.SKIP_SUBTREE;
      }
    };

    try {
      Files.walkFileTree( path, visitor );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}