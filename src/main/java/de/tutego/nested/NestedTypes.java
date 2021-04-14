package de.tutego.nested;

import de.tutego.nested.StaticNestedTypes.NonNull;

/**
 * Lernziel: Motivation für geschachtelte Typen
 * - Top-Level Typen vs. geschachtelte Typen
 * - Arten von geschachtelten Typen
 *
 * @see StaticNestedTypes
 */
public class NestedTypes {
  enum Color {
    RED
  }
  public static void main( String[] args ) {
    NonNull nonNull;
    /*
    Statischer geschachtelter Typ
    =============================

    class Out {
      static class In {}
    }
    */
    /*
    Innere Mitgliedsklasse
    ======================

    class Out {
      class In { }
    }
    */
    /*
    Lokaler (innerer) Typ
    =====================

    class Out {
      Out() {
        class In { }
      }
    }
    */
    /*
    Anonyme innere Klasse
    =====================

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

