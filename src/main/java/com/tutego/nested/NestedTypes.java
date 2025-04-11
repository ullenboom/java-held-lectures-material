package com.tutego.nested;

import com.tutego.nested.NestedStaticTypes.NonNullPredicate;

public class NestedTypes {   // <-- Top level class

  public static void main( String[] args ) {
    /*
    Nested static Type
    ==================

    class Out {
      static class In {}
    }
    */

    // NestedStaticTypes.NonNullPredicate nonNullPredicate;
    NonNullPredicate nonNullPredicate;  // -> import com.tutego.nested.NestedStaticTypes.NonNullPredicate;

    /*
    Member Type / Nested (non-static) Type
    ======================================

    class Out {
      class In { }
    }
    */

    /*
    Local Type
    ==========

    class Out {
      Out() {
        class In { }
      }
    }
    */

    /*
    Anonymous Class
    ===============

    class Out {
      Out() {
        Runnable r = new Runnable() {
          public void run() { }
        };
      }
    }
    */
  }
}
