package com.tutego.generics;

import java.util.ArrayList;

public class GenericsRestrictions {

  /*
    public class ArrayList<E>
    extends AbstractList<E>
    implements List<E>, RandomAccess, Cloneable, Serializable
   */

  public static void main( String[] args ) {

    /*
    raw type                            List, Predicate, Comparator
    parameterized type              	  List<String>, List<LocalDate>, Comparator<String>, Predicate<String>
    type argument               	      String, LocalDate

    generic type                        ArrayList<E>
    generic method                      <T> firstOrElse
    type parameter (aka type variable)  T
    */

    /*
      No generic types with primitive types
     */

    // ArrayList<int> list;   // -> Type argument cannot be of primitive type
    // ArrayList<Integer>

    /*
      No instanceof with parameterized types
     */

    //    Object list = new ArrayList<String>();
    //    System.out.println( list instanceof ArrayList<?> );
    //    System.out.println( list instanceof ArrayList<Integer> ); // -> 'Object' cannot be safely cast to 'ArrayList<Integer>'
    //    System.out.println( list instanceof ArrayList<String> );

    /*
      No casts with parameterized types
     */

    //    Object list1 = new ArrayList<String>();
    //    ArrayList<String> list2 = (ArrayList<String>) list1;
    //    ArrayList<String> list3 = (ArrayList) list1;  // Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList<java.lang.String>'
    //    ArrayList<Double> list4 = (ArrayList) list1;  // Unchecked assignment: 'java.util.ArrayList' to 'java.util.ArrayList<java.lang.String>'

    /*
      No overloaded method with same raw type
     */

    /*
      No new instances of a type parameters
     */

    class Box<T> {
      void create() {
        new Box<>();
        // new T();  // -> Type parameter 'T' cannot be instantiated directly
      }
    }

    /*
      No arrays of parameterized types
     */

    int[] numbers;
    //    ArrayList<String>[] strings1 = new ArrayList[ 10 ]; // -> Unchecked assignment: 'java.util.ArrayList[]' to 'java.util.ArrayList<java.lang.String>[]'
    //    ArrayList<String>[] strings2 = new ArrayList<String>[10]; // -> Generic array creation


    /*
      No static fields from type parameters of types
     */

    class Pocket<T> {
      T foo() {return null;}
      //      static T bar() {return null;}  // -> 'Pocket.this' cannot be referenced from a static context
    }

    /*
      No catch of a parameterized type
     */

    //    class NoNegativeCaloriesException<E> extends Exception { // -> Generic class may not extend 'java.lang.Throwable'
    //    }

    class Candy<T extends Exception> {
      //      void convert() throws T {
      //
      //      }
      void convert() {
        //        try {
        //        }
        //        catch ( T t ) { // -> Cannot catch type parameters
        //        }
      }
    }

    /*
      Class object does not capture type argument
     */

    ArrayList<String> strings1 = new ArrayList<>();
    ArrayList<Double> strings2 = new ArrayList<>();
    ArrayList strings3 = new ArrayList<>();
    System.out.println( strings1.getClass() );
    System.out.println( strings2.getClass() );
    System.out.println( strings3.getClass() );
    System.out.println( strings3.getClass() == strings1.getClass() );  // true
    System.out.println( strings3.getClass() == strings2.getClass() );  // true
    System.out.println( strings3.getClass() == ArrayList.class );      // true
  }

  //  void sort( List<Integer> integers ) {} // -> 'sort(List<Integer>)' clashes with 'sort(List<String>)'; both methods have same erasure
  //  void sort( List<String> strings ) {}
}
