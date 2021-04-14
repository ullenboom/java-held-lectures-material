package de.tutego.lambda;

import java.util.Comparator;

/**
 * Lernziel: Comparator-Exemplare aufbauen und verketten
 * - Statische Methoden zum Aufbau neuer Comparator-Exemplare, Key-Extractor
 * - Comparator-Exemplare verketten
 *
 * @see de.tutego.javaselib.SystemRuntimeSystemProperties
 */
public class JavaFunctionalComparator {
  public static void main( String[] args ) {
    //    Comparator<Country> comparatorName = ( c1, c2 ) -> c1.name.compareTo( c2.name );
    //    Comparator<Country> comparatorArea = ( c1, c2 ) -> Double.compare( c1.area, c2.area );
    //    Comparator<Country> comparatorPopulation = ( c1, c2 ) -> Double.compare( c1.population, c2.population );
    Comparator<Country> comparatorPopulation = Comparator.comparingInt( county -> county.population );
    Comparator<Country> comparatorName = Comparator.comparing( country -> country.name );
    Comparator<Country> comparatorArea = Comparator.comparingDouble( country -> country.area );

    Comparator<Country> comparator = comparatorArea.thenComparing( comparatorPopulation ).thenComparing( comparatorName );
  }
}

class Country {
  String name;
  double area;
  int population;
}
