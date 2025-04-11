package com.tutego.string;

public class TextBlocks {
  public static void main( String[] args ) {

    String html = """
        <!DOCTYPE html>
        <html>
        <head>
            <title>%s</title>
          </head>
          <body>
            <div>
                <p>Hello world!</p>
            </div>
          </body>
        </html>""";

    System.out.println( html.formatted( "This is a title" ) );

    //    String html = """
    //        <!DOCTYPE html>
    //        <html>
    //          <head>\
    //            <title>This is a title</title>\
    //          </head>
    //          <body>
    //            <div>
    //                <p>Hello "world"!</p>\u6565\n
    //            </div>
    //          </body>                    \s
    //        </html>""";


  }
}
