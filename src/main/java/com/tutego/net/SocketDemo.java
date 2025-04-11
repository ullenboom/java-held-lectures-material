package com.tutego.net;

import javax.net.SocketFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class SocketDemo {

  public static void main( String[] args ) {
    // Client
    String number1 = new Scanner( System.in ).nextLine();
    String number2 = new Scanner( System.in ).nextLine();
    String result = multiply( number1, number2 );
    System.out.println( result );
  }

  private static String multiply( String number1, String number2 ) {
    try ( Socket socket = SocketFactory.getDefault().createSocket( "localhost", 10_000 ) ) {
      OutputStream outputStream = socket.getOutputStream();
      InputStream inputStream = socket.getInputStream();
      PrintWriter printWriter = new PrintWriter( outputStream, true, StandardCharsets.UTF_8 );
      printWriter.println( number1 );
      printWriter.println( number2 );
      String result = new Scanner( inputStream, StandardCharsets.UTF_8 ).nextLine();
      return result;
    }
    catch ( IOException e ) {
      throw new RuntimeException( e );
    }
  }
}
