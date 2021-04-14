package de.tutego.os;

import java.util.prefs.BackingStoreException;
import java.util.prefs.Preferences;

/**
 * Lernziel: Benutzerdaten mit `Preferences` speichern
 * - Klasse `Preferences` und Methoden
 */
public class PreferencesDemo {
  public static void main( String[] args ) throws BackingStoreException {
    Preferences preferences = Preferences.userRoot().node( "de.tutego.os" );
    System.out.println( preferences.get( "username", "" ) );
    System.out.println( preferences.getInt( "age", 0 ) );
    preferences.put( "username", "chris" );
    preferences.putInt( "age", 99 );
    System.out.println( preferences.get( "username", "" ) );
    System.out.println( preferences.getInt( "age", 0 ) );
    preferences.remove( "age" );
    System.out.println( preferences.getInt( "age", 0 ) );
    // preferences.removeNode();
  }
}