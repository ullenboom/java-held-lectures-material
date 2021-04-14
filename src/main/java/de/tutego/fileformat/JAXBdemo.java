package de.tutego.fileformat;

import javax.xml.bind.JAXB;
import javax.xml.bind.annotation.XmlElement;
import java.awt.*;
import java.awt.event.ActionListener;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Lernziel: Jakarta XML Binding (JAXB), aka "Java Architecture for XML Binding" kennenlernen
 * - xjc
 *
 * @see <a href="https://mvnrepository.com/artifact/javax.xml.bind/jaxb-api/2.3.1">JAXB API</a>
 * @see <a href="https://mvnrepository.com/artifact/org.glassfish.jaxb/jaxb-runtime/2.3.3">JAXB (JSR 222) Reference Implementation</a>
 * @see JSONdemo
 */
public class JAXBdemo {
  public static void main( String[] args ) {

    Dog dog1 = new Dog( "wuffi", 12 );
    Dog dog2 = new Dog( "waldi", 2 );
    List<Dog> dogs = new ArrayList<>();
    dogs.add( dog1 );
    dogs.add( dog2 );
    Person person = new Person( "Chris", dogs );

    StringWriter writer = new StringWriter();
    JAXB.marshal( person, writer );
    System.out.println( writer.toString() );

    Person person1 = JAXB.unmarshal( new StringReader( writer.toString() ), Person.class );
    System.out.println( person1 );
  }
}

class Person {
  private String name;
  private List<Dog> dogs = new ArrayList<>();

  public Person( String name, List<Dog> dogs ) {
    this.name = name;
    this.dogs = dogs;
  }

  public Person( String name ) {
    this.name = name;
  }

  public Person() {}

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  @XmlElement( name = "dog" )
  public List<Dog> getDogs() {
    return dogs;
  }

  public void setDogs( List<Dog> dogs ) {
    this.dogs = dogs;
  }

  @Override public String toString() {
    return "Person{" +
           "name='" + name + '\'' +
           ", dogs=" + dogs +
           '}';
  }
}

class Dog {
  private String name;
  private int age;

  public Dog( String name, int age ) {
    this.name = name;
    this.age = age;
  }

  public Dog() {}

  public String getName() {
    return name;
  }

  public void setName( String name ) {
    this.name = name;
  }

  //  @XmlTransient
  public int getAge() {
    return age;
  }

  public void setAge( int age ) {
    this.age = age;
  }

  @Override public String toString() {
    return "Dog{" +
           "name='" + name + '\'' +
           ", age=" + age +
           '}';
  }
}
