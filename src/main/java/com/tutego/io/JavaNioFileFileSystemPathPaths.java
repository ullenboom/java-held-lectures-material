package com.tutego.io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class JavaNioFileFileSystemPathPaths {
  public static void main( String[] args ) {

    //    FileSystem fileSystem = FileSystems.getDefault();
    //    Path path = fileSystem.getPath( "c:", "user", "christian", "Desktop" );
    //    System.out.println( path );

    //    Path path = Paths.get( "c:", "user", "christian", "Desktop" );
    //    System.out.println( path );

    Path path = Path.of( "c:", "user" );
    System.out.println( path );

    System.out.println( path.resolve( "christian" ).resolve( "Desktop" ) );

    System.out.println( path.resolve( "test.txt" ).getFileName() );

    System.out.println( Paths.get( "." ) );
    System.out.println( Paths.get( "." ).toAbsolutePath() );
    System.out.println( Paths.get( ".", ".." ).toAbsolutePath() );
    System.out.println( Paths.get( ".", ".." ).toAbsolutePath().normalize() );

    /*
    // Zip File System Provider
    Path path = Paths.get( "zip-file.zip" );
    URI uri = URI.create( "jar:file:" + path.toUri().getPath() );
    Map<String, String> env = new HashMap<>();
    FileSystem fs = FileSystems.newFileSystem( uri, env );
    fs.getPath(...);
    */
  }
}