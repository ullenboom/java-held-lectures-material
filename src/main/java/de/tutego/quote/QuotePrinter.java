package de.tutego.quote;

public class QuotePrinter {
  public static void printQuote() {
    System.out.println('"');
    Quote.quote();
    System.out.println('"');
  }
}
