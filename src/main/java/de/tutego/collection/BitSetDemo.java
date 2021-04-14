package de.tutego.collection;

import java.util.BitSet;

/**
 * Lernziel: Klasse `BitSet`
 * - Setzen, Löschen, Anfragen von Bits
 * - Bits ablaufen
 *
 * @see Queues
 */
public class BitSetDemo {
  public static void main( String[] args ) {
    BitSet bitSet = new BitSet();
    Customer c1 = new Customer();
    c1.id = 12;
    c1.name = "Raul";
    Customer c2 = new Customer();
    c2.id = 123;
    c2.name = "Tita";
    bitSet.set( c1.id );
    bitSet.set( c2.id );

    System.out.println( bitSet.get( 10 ) ); // false
    System.out.println( bitSet.get( 12 ) ); // true

    System.out.println( bitSet.nextSetBit( 0 ) ); // 12

    for ( int i = bitSet.nextSetBit( 0 ); i >= 0; i = bitSet.nextSetBit( i + 1 ) )
      System.out.println( i );
  }
}

class Customer {
  int id;
  String name;
}