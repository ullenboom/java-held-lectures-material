package com.tutego.net;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class HttpClientDemo {
  public static void main( String[] args ) throws IOException {
    //    HttpClient httpClient = HttpClient.newHttpClient();
    HttpClient httpClient = HttpClient.newBuilder().connectTimeout( Duration.ofSeconds( 5 ) )
                                      .build();

    // GET https://randomuser.me/api
    HttpRequest httpRequest = HttpRequest.newBuilder( URI.create( "https://randomuser.me/api" ) )
                                         .GET()
                                         .build();

    //    try {
    //      HttpResponse<String> response = httpClient.send( httpRequest,
    //                                                       HttpResponse.BodyHandlers.ofString() );
    //      System.out.println( response.headers() );
    //      System.out.println( response.statusCode() );
    //      System.out.println( response.body() );
    //    }
    //    catch ( IOException | InterruptedException e ) {
    //      throw new RuntimeException( e );
    //    }

    try {
      CompletableFuture<HttpResponse<String>> response = httpClient.sendAsync( httpRequest,
                                                                               HttpResponse.BodyHandlers.ofString() );
      // ......................................................................
      HttpResponse<String> stringHttpResponse = response.get();
      System.out.println( stringHttpResponse.body() );
    }
    catch ( InterruptedException | ExecutionException e ) {
      throw new RuntimeException( e );
    }

    // POST https://httpbin.org/

    String body = """
        {
          "name": "Christian"
        }
        """;
    HttpRequest httpRequest2 = HttpRequest.newBuilder( URI.create( "https://httpbin.org/post" ) )
                                          .POST( HttpRequest.BodyPublishers.ofString( body ) )
                                          .headers( "Content-Type", "application/json" )
                                          .build();

    try {
      HttpResponse<String> httpResponse = httpClient.send( httpRequest2,
                                                           HttpResponse.BodyHandlers.ofString() );
      System.out.println( httpResponse.body() );
      System.out.println( httpResponse.statusCode() );
    }
    catch ( InterruptedException e ) {
      throw new RuntimeException( e );
    }
  }
}