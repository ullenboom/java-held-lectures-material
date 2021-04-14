package de.tutego.lambda;

/**
 * Lernziel: Methodenreferenzen
 * - Unterschiedliche Abkürzungen kennenlernen
 *
 * @see ConstructorReferences
 */
public class MethodReferences {
  interface LongSupplier {
    long get();
  }

  interface LongConsumer {
    void apply( long value );
  }

  interface EqualsPredicate {
    boolean test( Object o1, Object o2 );
  }

  static void foo( LongSupplier longSupplier ) {}

  static void bar( LongConsumer longSupplier ) {}

  static void baz( EqualsPredicate longSupplier ) {}

  public static void main( String[] args ) {
    /*
    Methodenreferenz auf eine …	   Syntax für Methodenreferenz    Lambda-Ausdruck
    ============================================================================================================================
    … Klassenmethode  	           Typ::klassenmethode            () -> Typ.klassenmethode()
    	                                                            (p1) -> Typ.klassenmethode(p1)
    	                                                            (p1, p2[, ...]]) -> Typ.klassenmethode(p1[, p2[, ...]])

    … Objektmethode	               ref::objektMethode             () -> ref.objektMethode()
                                                                  (p1) -> ref.objektMethode(p1)
                                                                  (p1[, p2[, ...]]) -> ref.objektMethode(p1[, p2[, ...]])

    … Objektmethode eines Typs	   ObjektTyp::objektMethode       (obj) -> obj.objektMethode()
                                                                  (obj, p1) -> obj.objektMethode(p1)
                                                                  (obj, p1, p2[, ...]]) -> obj.objektMethode([p1[, p2[, ...]])
     */
    // Option 1:
    foo( () -> System.currentTimeMillis() );
    foo( System::currentTimeMillis );

    // Option 2:
    bar( ( value ) -> System.out.println( value ) );
    bar( System.out::println );
    bar( System.err::println );

    // Option 3:
    baz( ( o1, o2 ) -> o1.equals( o2 ) );
    baz( Object::equals );

    class Θ {
      boolean equals( Object o1, Object o2 ) {return false;}

      void thud() {
        baz( ( o1, o2 ) -> equals( o1, o2 ) );
        baz( ( o1, o2 ) -> this.equals( o1, o2 ) );
        baz( this::equals );
      }
    }
  }
}