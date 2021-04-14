package de.tutego.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Lernziel: Wahlfreier Dateizugriff mit `RandomAccessFile`
 * - Access-Mode
 * - Schnittstellen `DataOutput`, `DataInput`
 *
 * @see de.tutego.net.IpAddress
 */
public class JavaIoRandomAccessFile {
  public static void main( String[] args ) {

    try ( RandomAccessFile raf = new RandomAccessFile( "coordinates.bin", "rw" ) ) {
      Coordinate coordinate = new Coordinate();
      coordinate.longitude = 12;
      coordinate.latitude = 12;
      CoordinateWriter.write( coordinate, raf );
      coordinate.longitude = 60;
      coordinate.latitude = 10;
      CoordinateWriter.write( coordinate, raf );
      raf.seek( 0 );
      System.out.println( CoordinateWriter.read( raf ) );
      System.out.println( CoordinateWriter.read( raf ) );
      raf.seek( Double.BYTES + Double.BYTES );
      System.out.println( CoordinateWriter.read( raf ) );
      raf.seek( 0 );
      coordinate.longitude = 0;
      coordinate.latitude = 0;
      CoordinateWriter.write( coordinate, raf );
      raf.seek( 0 );
      System.out.println( CoordinateWriter.read( raf ) );
    }
    catch ( IOException e ) {
      e.printStackTrace();
    }
  }
}

class Coordinate {
  double longitude, latitude;

  @Override public String toString() {
    return "Coordinate{" + "longitude=" + longitude + ", latitude=" + latitude + '}';
  }
}

class CoordinateWriter {
  static void write( Coordinate coordinate, RandomAccessFile raf ) throws IOException {
    raf.writeDouble( coordinate.latitude );
    raf.writeDouble( coordinate.longitude );
  }

  static Coordinate read( RandomAccessFile raf ) throws IOException {
    Coordinate coordinate = new Coordinate();
    coordinate.latitude = raf.readDouble();
    coordinate.longitude = raf.readDouble();
    return coordinate;
  }
}