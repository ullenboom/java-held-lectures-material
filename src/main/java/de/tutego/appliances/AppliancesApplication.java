package de.tutego.appliances;

public class AppliancesApplication {
  public static void main( String[] args ) {
    Radio r1 = new Radio();
    r1.setFrequency( -999999 );
    r1.setOn( true );
    r1.setName( "Omis altes Radio" );
    r1.volumeUp();
    r1.volumeDown();
    r1.volumeDown();
    r1.volumeDown();
    r1.volumeDown();
    r1.setModulation( null );

    System.out.println( r1.toString() );
    System.out.println( r1 );
    Radio r2 = Radio.ofName( "Opis altes Radio" );
    System.out.println( r2.getFrequency() );
    System.out.println( r2.isOn() );
    System.out.println( r2.getVolume() );
    System.out.println( r2.getName() );

    ProductionDate productionDate = new ProductionDate().month( 12 ).year( 2020 );
    System.out.println( productionDate.month() );
    System.out.println( productionDate.year() );

    System.out.println( Radio.senderNameToFrequency( "java" ) );
    System.out.println( Radio.senderNameToFrequency( "schnipp" ) );

    TV tv1 = new TV();
    tv1.setOn( true );
    tv1.setChannel( 12 );
    TV tv2 = new TV( tv1 );
    System.out.println( tv2.getChannel() );
    System.out.println( tv2.isOn() );

    System.out.println( tv1.getMonitorTube() );
    System.out.println( tv1.getMonitorTube().getTv() );
    System.out.println( tv1 );
    tv1.on();
    tv1.off();

    House house = new House();
    house.add( r1 );
    house.add( r2 );
    house.add( new FireAlarm() );
    r1.setOn( true );
    r2.setOn( true );
    System.out.println( house );
    System.out.println( house.numberOfActiveAppliances() );

    FireAlarm fireAlarm = new FireAlarm();
    fireAlarm.setOn( true );

    house.off();
  }
}
