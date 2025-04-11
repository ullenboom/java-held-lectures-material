package com.tutego.io;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDateTime;

public class JavaIoFileAndJavaAwtDesktop {
  public static void main( String[] args ) throws IOException {

    String html = """
        <html>
        <body>
        <strong>%s</strong>
        </body>
        </html>""".formatted( LocalDateTime.now() );

    Path path = Files.createTempFile( "", ".html" );
    System.out.println( path );
    Files.writeString( path, html );

    //

    if ( Desktop.isDesktopSupported() ) {
      Desktop desktop = Desktop.getDesktop();
      desktop.open( path.toFile() );
    }
  }
}