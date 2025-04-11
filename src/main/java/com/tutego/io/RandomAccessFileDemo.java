package com.tutego.io;

import com.tutego.io.CoordinateWriter.Coordinate;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileDemo {
  public static void main( String[] args ) {

    try ( CoordinateWriter coordinateWriter = new CoordinateWriter( "coordinate.bin" ) ) {

      coordinateWriter.writeCoordinate( new Coordinate( 10, 11 ) );
      coordinateWriter.writeCoordinate( new Coordinate( 100, 101 ) );

      coordinateWriter.seek( 0 );
      Coordinate coordinate1 = coordinateWriter.readCoordinate();
      System.out.println( coordinate1 );

      coordinateWriter.seek( 1 );
      Coordinate coordinate2 = coordinateWriter.readCoordinate();
      System.out.println( coordinate2 );

      coordinateWriter.seek( 0 );
      coordinateWriter.writeCoordinate( new Coordinate( 20, 22 ) );
      coordinateWriter.seek( 0 );
      Coordinate coordinate11 = coordinateWriter.readCoordinate();
      System.out.println( coordinate11 );

    }
    catch ( IOException e ) {
      e.printStackTrace();
    }

    new File( "coordinate.bin").delete();
  }

}

class CoordinateWriter implements AutoCloseable {

  private final RandomAccessFile randomAccessFile;

  public CoordinateWriter( String filename ) throws FileNotFoundException {
    this.randomAccessFile = new RandomAccessFile( filename, "rw" );
  }

  @Override public void close() throws IOException {
    randomAccessFile.close();
  }

  public void seek( int offset ) throws IOException {
    randomAccessFile.seek( offset * (Double.BYTES + Double.BYTES) );
  }

  record Coordinate(
      double longitude,
      double latitude
  ) {}

  void writeCoordinate( Coordinate coordinate ) throws IOException {
    randomAccessFile.writeDouble( coordinate.longitude() );
    randomAccessFile.writeDouble( coordinate.latitude() );
  }

  public Coordinate readCoordinate() throws IOException {
    double longitude = randomAccessFile.readDouble();
    double latitude = randomAccessFile.readDouble();
    return new Coordinate( longitude, latitude );
  }

}