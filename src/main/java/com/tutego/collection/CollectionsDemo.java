package com.tutego.collection;

import java.util.*;

public class CollectionsDemo {
  public static void main( String[] args ) {
    Person person = new Person();
    person.addCat( new Cat() );
    person.addCat( new Cat() );
    person.addCat( new Cat() );
    List<Cat> cats = person.getCats();
    System.out.println( cats.size() );
    //    cats.clear();       // java.lang.UnsupportedOperationException
    System.out.println( cats.size() );
  }
}

class Person {
  private List<Cat> cats;

  public List<Cat> getCats() {
    if ( cats == null ) {
      return Collections.emptyList();
    }
    return Collections.unmodifiableList( cats );
  }

  public void addCat( Cat cat ) {
    if ( cats == null ) {
      cats = new ArrayList<>();
    }
    cats.add( cat );
  }
}

class Cat {
  private String key;
  private String value;

  Map<String, String> getProperties() {
//    HashMap<String, String> objectObjectHashMap = new HashMap<>();
//    objectObjectHashMap.put( key, value );
//    return objectObjectHashMap;

    return Collections.singletonMap( key, value );
  }
}