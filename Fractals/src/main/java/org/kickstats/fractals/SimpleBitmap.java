
package org.kickstats.fractals;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JPanel;

/**
 * Creates a panel and draws an image.
 * 
 * Currently creates an image of a screen where everything above a diagonal is
 * yellow and everything below the diagonal is black.
 * 
 * @author Chase Sonnemaker transcribed from Leon Tabak's code
 * @version 11 April 2020
 */
public class SimpleBitmap extends JPanel {
    
    //JPanel Variables
    private static final int BITMAP_WIDTH = 512;
    private static final int BITMAP_HEIGHT = 512;
    private BufferedImage image;
    
    //Real plane (Pixels)
    private final double MIN_X = 0;
    private final double MAX_X = BITMAP_WIDTH;
    private final double MIN_Y = 0;
    private final double MAX_Y = BITMAP_HEIGHT;    

    //Complex plane 
    private final double MIN_U = -1;
    private final double MAX_U = -0.8;
    private final double MIN_V = 0.22;
    private final double MAX_V = 0.35;
    
    //Mandelbrot Set
    private final int MAX_ITERATIONS = 100;
    private final double MAX_MAGNITUDE = 2.0;
    
    
    /**
     * Maps a pair of real plane coordinates to coordinates in the 
     * complex plane.
     * 
     * @param x An x coordinate in the real plane.
     * @param y A y coordinate in the real plane.
     * @return A complex number represented coordinates in the real plane 
     * mapped to coordinates in the complex plane.
     */
    public Complex map(double x, double y) {
        //u mapping
        double uDist = MAX_U - MIN_U;
        double xRange = MAX_X - MIN_X;
        double xDist = x - MIN_X;
        
        double newU = MIN_U + uDist * (xDist / xRange);
        
        //v mapping
        double vDist = MAX_V - MIN_V;
        double yRange = MAX_Y - MIN_Y;
        double yDist = y - MIN_Y;
        
        double newV = MIN_V + vDist * (yDist / yRange);
        
        //Complex Coordinate
        return new Complex(newU, newV);
        
    }// mapX(Complex)
    
    
    /**
     * Checks to see if a complex point is in the Mandelbrot Set by iterating.
     * 
     * Stops if the number is not in the set or if a threshold of iterations 
     * is reached. 
     * 
     * @param c A complex number represent a point on the complex plane.
     * @return The number of iterations that occurred while testing to see 
     * if the point is in the Mandelbrot Set. 
     */
    public int identifyMandelbrotMembership(Complex c) {
        Complex z = new Complex(0, 0);
        int iterCount = -1;
        while(z.magnitude() < MAX_MAGNITUDE && iterCount < MAX_ITERATIONS) {
            z = c.add(z.multiply(z));
            iterCount++;
        }// while
        return iterCount;
    }// identifyMandelbrotMembership(Complex c)
    
    
    /**
     * Returns an array of integers representing rgb color values.
     * 
     * The returned color is based on the value of an integer and
     * is designed to be used with the return value of the
     * identifySet method.
     * 
     * @param n An integer used to define the returned color.
     * @return An array of integers representing a rgb color value.
     */
    public int[] getRGBColor(int n) {
        if(n < 10) {
            int r = 0;
            int g = 150 + 20 * n;
            int b = 0;
            
            int[] rgb = {r, g, b};
            return rgb;
        }// if
        
        else if(n >= 10 && n < 25) {
            int r = 25 + n;
            int g = 50 + 2 * n;
            int b = 125 + 2 * n;
            
            int[] rgb = {r, g, b};
            return rgb;
        }// else if
        
        else if(n >= 25 && n < 75) {
            int r = 255;
            int g = 255;
            int b = 100 + n;
            
            int[] rgb = {r, g, b};
            return rgb;
        }// else if
        
        else {
            int r = 255 - 2 * n;
            int g = 255 - 2 * n;
            int b = 255 - 2 * n;
            
            int[] rgb = {r, g, b};
            return rgb;
        }// else
        
    }// getRGBColor()
    
    
    /**
     * Creates an instance of this class.
     */
    public SimpleBitmap() {
        int w = BITMAP_WIDTH;
        int h = BITMAP_HEIGHT;
        int imageType = BufferedImage.TYPE_INT_RGB;
        this.image = new BufferedImage(w, h, imageType);
    }// SimpleBitmap()
    
    
    /**
     * Creates an image of a yellow and black screen where a diagonal splits
     * the colors.
     * 
     * This image is drawn by manipulating the screen's pixels in a certain 
     * pattern.
     * 
     * @param g A graphics object.
     */
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;
        
        int w = this.getWidth();
        int h = this.getHeight();
        
        AffineTransform scale = new AffineTransform();
        scale.setToScale(((double) w) / BITMAP_WIDTH, 
                        ((double) h) / BITMAP_HEIGHT);
        
        WritableRaster raster = this.image.getRaster();
         
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                Complex c = map(i, j);
                int iterations = identifyMandelbrotMembership(c); 

                int[] color = getRGBColor(iterations);
                raster.setPixel(i, j, color);
            }// for
        }// for
        
        g2D.drawImage(image, scale, this);
    }// paintComponent(Graphics)
    
    
}// SimpleBitmap
