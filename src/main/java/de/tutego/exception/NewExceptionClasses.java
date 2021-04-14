package de.tutego.exception;

import java.io.IOException;

/**
 * Lernziel: Eigene Exception-Klassen schreiben
 * - Oberklasse auswählen
 * - Konstruktoren und `super(...)`
 * - Modellierung Richtung geprüfte oder ungeprüfte Ausnahmen?
 *
 * @see de.tutego.lang.JavaLangObject
 */
public class NewExceptionClasses {
  public static void main( String[] args ) throws FileException {
    throw new FileException();
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