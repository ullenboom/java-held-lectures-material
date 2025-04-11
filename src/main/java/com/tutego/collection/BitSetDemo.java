package com.tutego.collection;

import java.util.BitSet;

public class BitSetDemo {
  public static void main( String[] args ) {
    BitSet bitSet = new BitSet();
    Customer c1 = new Customer( 12, "Tito" );
    Customer c2 = new Customer( 123, "Raul" );
    bitSet.set( c1.id() );
    bitSet.set( c2.id() );

    System.out.println( bitSet.get( 10 ) );  // false
    System.out.println( bitSet.get( 12 ) );  // true

    System.out.println( bitSet.nextSetBit( 0 ) );  // 12

    for ( int i = bitSet.nextSetBit( 0 );
          i >= 0;
          i = bitSet.nextSetBit( i + 1 ) ) {
      System.out.println( i );
    }
  }
}

record Customer( int id, String name ) {}