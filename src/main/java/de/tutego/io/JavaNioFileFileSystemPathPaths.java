package de.tutego.io;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Lernziel: FileSystem, Path und Paths
 * - `FileSystems` und das Standard-Dateisystem
 * - Pfade vom (Standard) Dateisystem erfragen, `Paths`
 * - Operationen auf Pfaden
 *
 * @see JavaNioFileFiles
 */
public class JavaNioFileFileSystemPathPaths {
  public static void main( String[] args ) {

    //    FileSystem fileSystem = FileSystems.getDefault();
    //    Path path = fileSystem.getPath( "C:", "user", "ullenboom", "Desktop" );
    //    System.out.println( path );

    Path user = Paths.get( "c:", "user" );
    System.out.println( user );

    System.out.println( user.resolve( "ullenboom" ) );

    System.out.println( user.resolve( "de/tutego/io/test.txt" ).getFileName() );

    System.out.println( Paths.get( ".", ".." ).toAbsolutePath() );
    System.out.println( Paths.get( ".", ".." ).normalize() );
    System.out.println( Paths.get( ".", ".." ).toAbsolutePath().normalize() );

    //    Path.of(  ) Java 11

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