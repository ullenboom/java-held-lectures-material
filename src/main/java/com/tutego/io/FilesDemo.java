package com.tutego.io;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.stream.Stream;

public class FilesDemo {
  public static void main( String[] args ) {

    Path htmlPath = Paths.get( "out.html" );

    // Write file

    try {
      String html = """
          <html>
          Hello World!
          </html>""";
      Files.writeString( htmlPath, html );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    // Read file

    try {
      String s = Files.readString( htmlPath );
      System.out.println( s );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    try {
      Files.delete( htmlPath );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    // Directory

    Path userHomePath = Paths.get( System.getProperty( "user.home" ) );
    System.out.println( userHomePath );

    try ( Stream<Path> list = Files.list( userHomePath ) ) {
      list.forEach( path -> {
        if ( Files.isDirectory( path ) ) {
          System.out.print( "<D> " );
        }
        else if ( Files.isRegularFile( path ) ) {
          try {
            BasicFileAttributes basicFileAttributes = Files.readAttributes( path,
                                                                            BasicFileAttributes.class );
            System.out.printf( "<F> %d %s ", Files.size( path ),
                               basicFileAttributes.lastModifiedTime() );
          }
          catch ( IOException e ) {
            throw new RuntimeException( e );
          }
        }
        System.out.println( path );
      } );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }

    // Walk

    //    try ( Stream<Path> walk = Files.walk( userHomePath ) ) {
    //      walk.forEach( System.out::println );
    //    }
    //    catch ( IOException e ) {
    //      throw new RuntimeException( e );
    //    }

    SimpleFileVisitor<Path> visitor = new SimpleFileVisitor<>() {
      @Override public FileVisitResult visitFile( Path file, BasicFileAttributes attrs ) {
        System.out.println( file );
        return FileVisitResult.CONTINUE;
      }

      @Override public FileVisitResult postVisitDirectory( Path dir, IOException exc ) {
        if ( exc == null ) {
          return FileVisitResult.CONTINUE;
        }
        else
          return FileVisitResult.SKIP_SUBTREE;
      }

      @Override public FileVisitResult visitFileFailed( Path file, IOException exc ) {
        return FileVisitResult.SKIP_SUBTREE;
      }
    };
    try {
      Files.walkFileTree( userHomePath, visitor );
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }
}
