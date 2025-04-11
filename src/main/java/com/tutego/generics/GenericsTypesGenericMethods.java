package com.tutego.generics;

import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

@SuppressWarnings( "all" )
public class GenericsTypesGenericMethods {

  public static void main( String[] args ) {

    int age;
    double income;
    String name;
    ArrayList<String> names;
    ArrayList<LocalDate> birthdays;

    /*
    raw type              ArrayList, List, Predicate, Comparator
    parameterized type	  ArrayList<String>, ArrayList<LocalDate>, Comparator<String>, Predicate<String>
    type argument	        String, LocalDate
    */

    names = new ArrayList<>();
    names.add( "String" );
    // names.add( new Point() );
    String s = names.get( 0 );

    birthdays = new ArrayList<>();
    birthdays.add( LocalDate.now() );
    LocalDate localDate = birthdays.get( 0 );

    ArrayList list = new ArrayList();
    list.add( new Point() );
    list.add( "String" );
    Object object = list.get( 0 );

  }
}
