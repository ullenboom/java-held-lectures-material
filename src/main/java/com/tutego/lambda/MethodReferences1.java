package com.tutego.lambda;

public class MethodReferences1 {
  public static void main( String[] args ) {
    /*
    Method Reference to a …	      Syntax for Method Reference   Lambda Expression (Long Form)
    =========================================================================================================================
    … class method  	            Type::classmethod             () -> Type.classmethod()
    	                                                          (p1) -> Type.classmethod(p1)
    	                                                          (p1, p2[, ...]]) -> Type.classmethod(p1[, p2[, ...]])

    … instance method	            ref::instancemethod           () -> ref.instancemethod()
                                                                (p1) -> ref.instancemethod(p1)
                                                                (p1[, p2[, ...]]) -> ref.instancemethod(p1[, p2[, ...]])

    … instance method of a type   ObjectType::instancemethod    (obj) -> obj.instancemethod()
                                                                (obj, p1) -> obj.instancemethod(p1)
                                                                (obj, p1, p2[, ...]]) -> obj.instancemethod([p1[, p2[, ...]])
     */

    // Option 1

    foo( () -> System.currentTimeMillis() );
    foo( System::currentTimeMillis );

    // Option 2

    bar( ( long value ) -> System.out.println( value ) );
    bar( System.out::println );
    bar( System.err::println );
  }

  interface LongSupplier {
    long get();
  }

  interface LongConsumer {
    void apply( long value );
  }

  interface EqualsPredicate {
    boolean test( Object o1, Object o2 );
  }

  static void baz( MethodReferences2.EqualsPredicate equalsPredicate ) {
  }

  static void foo( LongSupplier longSupplier ) {
  }

  static void bar( LongConsumer longSupplier ) {
  }
}