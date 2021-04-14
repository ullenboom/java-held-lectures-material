package de.tutego.string;

/**
 * Lernziel: Text-Blöcke (Java 15)
 *
 * @see de.tutego.appliances.Radio
 */
public class TextBlocks {
  public static void main( String[] args ) {
    String html = """
        <!DOCTYPE html>\
        <html>\
          <head>\
            <title>%s</title>
            <!-- weitere Kopfinformationen -->
            <!-- Kommentare werden im Browser nicht angezeigt. -->
          </head>
          <body>
            <p>Inhalt "der Webseite"\u6565</p>        \s
          </body>                                    
        </html>""";

    System.out.println( html.formatted( "Titel der Webseite" ) );
  }
}
