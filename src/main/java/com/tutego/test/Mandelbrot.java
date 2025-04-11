package com.tutego.test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.*;

public class Mandelbrot {

  private static final int MAX_ITERATIONS = 500;
  private static final int SIZE = 500;

  static class MandelbrotPanel extends JPanel {
    @Override
    protected void paintComponent( Graphics g ) {
      super.paintComponent( g );
      double realMin = -2.0, realMax = 1.0;
      double imagMin = -1.5, imagMax = 1.5;

      for ( int y = 0; y < SIZE; y++ ) {
        for ( int x = 0; x < SIZE; x++ ) {
          double zx = realMin + x * (realMax - realMin) / SIZE;
          double zy = imagMin + y * (imagMax - imagMin) / SIZE;
          Complex c = new Complex( zx, zy );
          int iter = 0;
          for ( Complex z = Complex.ZERO; z.squaredMagnitude() < 4 && iter < MAX_ITERATIONS; ) {
            z = z.multiply( z ).add( c );
            iter++;
          }
          g.setColor( iter >= MAX_ITERATIONS ?
                      Color.BLACK :
                      Color.getHSBColor( (float) iter / MAX_ITERATIONS, 0.7f, 1f ) );
          g.drawRect( x, y, 1, 1 );
        }
      }
    }
  }

  public static void main( String[] args ) {
    JFrame frame = new JFrame();
    frame.getContentPane().add( new MandelbrotPanel() );
    frame.setSize( new Dimension( SIZE, SIZE ) );
    frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
    frame.setVisible( true );
  }
}
