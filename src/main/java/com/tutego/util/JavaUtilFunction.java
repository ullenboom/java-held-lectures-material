package com.tutego.util;

import java.util.LinkedList;
import java.util.function.IntBinaryOperator;

public class JavaUtilFunction {
  public static void main( String[] args ) {
    UpnCalc upnCalc = new UpnCalc();
    upnCalc.push( 10 );
    upnCalc.push( 20 );
    upnCalc.push( 5 );
    System.out.println( upnCalc );
    upnCalc.binary( UpnCalc.addition );
    System.out.println( upnCalc );
    upnCalc.binary( UpnCalc.addition );
    System.out.println( upnCalc );
  }
}

//@FunctionalInterface
//interface BinaryOperation {
//  int operation( int value1, int value2 );
//}

class UpnCalc {
//  static BinaryOperation addition = ( value1, value2 ) -> value1 + value2;
  static IntBinaryOperator addition = ( value1, value2 ) -> value1 + value2;

  private final LinkedList<Integer> numbers = new LinkedList<>();

  void push( int number ) {
    numbers.add( number );
  }

//  public void binary( BinaryOperation binaryOperation ) {
  public void binary( IntBinaryOperator binaryOperation ) {
    int value2 = numbers.removeLast();
    int value1 = numbers.removeLast();
//    int result = binaryOperation.operation( value1, value2 );
    int result = binaryOperation.applyAsInt( value1, value2 );
    push( result );
  }

  @Override public String toString() {
    return "UpnCalc{" + "numbers=" + numbers + '}';
  }
}