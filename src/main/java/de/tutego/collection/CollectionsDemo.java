package de.tutego.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Lernziel: Utility-Klasse `Collections`
 * - Operationen auf Listen, Mengen, Assoziativspeichern
 * - Leere Datenstrukturen
 * - Wrapper
 *
 * @see UnmodifiableCollection
 */
public class CollectionsDemo {
  public static void main( String[] args ) {
    Person person = new Person();
    person.addCat( new Cat() );
    person.addCat( new Cat() );
    person.addCat( new Cat() );
    List<Cat> cats = person.getCats();
    cats.clear();
  }
}

class Person {
  private List<Cat> cats;

  public List<Cat> getCats() {
    if ( cats == null )
      return Collections.emptyList();
    return Collections.unmodifiableList( cats );
  }

  public void addCat( Cat cat ) {
    if ( cats == null )
      cats = new ArrayList<>();
    cats.add( cat );
  }
}

class Cat {
  private String key;
  private String value;

  Map<String, String> getProperties() {
    return Collections.singletonMap( key, value );
  }
}