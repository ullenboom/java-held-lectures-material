package de.tutego.net;

import javax.net.ServerSocketFactory;
import javax.net.SocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Lernziel: Netzwerkkommunikation über Sockets
 * - `SocketFactory` und `ServerSocketFactory`
 * - `Socket` und `ServerSocket`
 *
 * @see HttpClientDemo
 */
public class SocketAndServerSocket {
}

class Server {
  public static void main( String[] args ) throws IOException {
    ServerSocket serverSocket = ServerSocketFactory.getDefault().createServerSocket( 10_000 );
    while ( true ) {
      Socket clientSocket = serverSocket.accept();
      handleConnection( clientSocket );
      // new Thread( () -> { handleConnection( clientSocket ); } ).start();
    }
  }

  private static void handleConnection( Socket clientSocket ) throws IOException {
    try ( Socket __ = clientSocket ) {
      OutputStream outputStream = clientSocket.getOutputStream();
      InputStream inputStream = clientSocket.getInputStream();
      Scanner scanner = new Scanner( inputStream, StandardCharsets.UTF_8 );
      String line1 = scanner.nextLine();
      String line2 = scanner.nextLine();
      String result = new BigInteger( line1 ).multiply( new BigInteger( line2 ) ).toString();
      PrintWriter printWriter = new PrintWriter( outputStream, true, StandardCharsets.UTF_8 );
      printWriter.println( result );
    }
  }
}

class Client {
  public static void main( String[] args ) {
    try ( Socket socket = SocketFactory.getDefault().createSocket( "localhost", 10_000 ) ) {
      OutputStream outputStream = socket.getOutputStream();
      InputStream inputStream = socket.getInputStream();
      PrintWriter printWriter = new PrintWriter( outputStream, true, StandardCharsets.UTF_8 );
      printWriter.println( ThreadLocalRandom.current().nextInt( 10000000 ) );
      printWriter.println( "8298348947837868" );
      String result = new Scanner( inputStream, StandardCharsets.UTF_8 ).nextLine();
      System.out.println( result );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}