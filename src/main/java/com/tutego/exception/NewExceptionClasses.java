package com.tutego.exception;

import java.io.IOException;

public class NewExceptionClasses {
  public static void main( String[] args ) throws FileException {
    throw new FileException();
    // extends Exception ?                => checked exception
    // extends RuntimeException ?         => unchecked exception
  }
}

class FileException extends IOException {
  public FileException() {
  }

  public FileException( String message ) {
    super( message );
  }

  public FileException( String message, Throwable cause ) {
    super( message, cause );
  }

  public FileException( Throwable cause ) {
    super( cause );
  }
}

class InsufficientException extends RuntimeException {
  public InsufficientException() {
  }

  public InsufficientException( String message ) {
    super( message );
  }

  public InsufficientException( String message, Throwable cause ) {
    super( message, cause );
  }

  public InsufficientException( Throwable cause ) {
    super( cause );
  }
}