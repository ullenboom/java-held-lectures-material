package com.tutego.net;

import javax.net.ServerSocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class ServerSocketDemo {
  // Server
  public static void main( String[] args ) throws IOException {
    ServerSocket serverSocket = ServerSocketFactory.getDefault().createServerSocket( 10_000 );
    while ( true ) {
      Socket clientSocket = serverSocket.accept();
      handleConnection( clientSocket );
      // new Thread( () -> {handleConnection(clientSocket);} ).start();
    }
  }

  private static void handleConnection( Socket clientSocket ) throws IOException {
    try ( clientSocket ) {
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