package com.tutego.lambda;

public class MethodReferences3 {
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

    // Using this references

    class Θ {
      boolean equals( Object o1, Object o2 ) {
        return false;
      }

      void thud() {
        baz( ( o1, o2 ) -> equals( o1, o2 ) );
        baz( ( o1, o2 ) -> this.equals( o1, o2 ) );
        baz( this::equals );
      }
    }

  }

  interface EqualsPredicate {
    boolean test( Object o1, Object o2 );
  }

  static void baz( EqualsPredicate equalsPredicate ) {
  }
}
