
package org.kickstats.fractals;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.WritableRaster;
import javax.swing.JPanel;

/**
 * Creates a panel and draws a piece of the Mandelbrot Set.
 * 
 * Uses class constants to map each pixel of the panel onto a 
 * point in the complex plane, the determines if that point is 
 * a member of the Mandelbrot Set and colors the pixel accordingly.
 * The complex plane being mapped to has a real range of -1 to -0.8
 * and an imaginary range of 0.22 to 0.35.
 * 
 * @author Chase Sonnemaker transcribed from Leon Tabak's code
 * @version 13 April 2020
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
     * Maps a pair of coordinates in one plane system (real) to coordinates 
     * in another plane system (complex).
     * 
     * The starting plane is assumed to be a real plane with dimensions 
     * defined by class constants and the resulting coordinates are assumed to 
     * by a complex plane with dimensions defined by class constants. As such 
     * the returned coordinate takes the form of a complex number. The 
     * mapping occurs in three steps.
     * <ul>
     * <li> A translation of the points by subtracting the smallest x and y 
     * value in the real plane from their respective coordinates.
     * <li> A scaling of the points by taking the range of x and y values in 
     * the complex plane and the range of x and y values in the real plane
     * and multiplying them together, then multiplying them by their
     * respective coordinates.
     * <li> A translation of the points by adding the smallest x and y value of 
     * the complex plane to their respective coordinates.
     * </ul>
     * 
     * @param x An x coordinate in the real plane.
     * @param y A y coordinate in the real plane.
     * @return A complex number represented coordinates in the real plane 
     * mapped to coordinates in the complex plane.
     */
    public Complex map(double x, double y) {
        //u (x) mapping
        double uDist = MAX_U - MIN_U;
        double xRange = MAX_X - MIN_X;
        double xDist = x - MIN_X;
        
        double newU = MIN_U + uDist * (xDist / xRange);
        
        //v (y) mapping
        double vDist = MAX_V - MIN_V;
        double yRange = MAX_Y - MIN_Y;
        double yDist = y - MIN_Y;
        
        double newV = MIN_V + vDist * (yDist / yRange);
        
        //Complex Coordinate
        return new Complex(newU, newV);
        
    }// mapX(Complex)
    
    
    /**
     * Checks to see if a complex point is in the Mandelbrot Set 
     * through iteration.
     * 
     * Using the following formula...
     * <P>
     * z = z(n&sup2;) + c
     * <P>
     * where z starts as the complex number point 0 + i * 0 and c is the 
     * complex number point to test, this loop is repeated until the magnitude 
     * of z is larger than 2, indicating the number is not in the Mandelbrot 
     * set, or until a class defined number of iterations is reached. 
     * 
     * @param c A complex number represent a point in the complex plane.
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
     * Creates an array of integers representing an RGB color based on a 
     * specified integer value.
     * 
     * This method is designed to be used with the return value of the
     * identifyMandelbrotMembership method and can be used to color an image
     * of the Mandelbrot Set. This particular coloring scheme was designed to 
     * color a piece of the Mandelbrot Set that looked like lightning, and 
     * would likely be less useful for other pieces.
     * <P>
     * The internal workings of this method can be thought of like a piecewise 
     * function which creates a series of color gradients.
     * <ul>
     * <li> For less than 10 iterations, the gradient is a series of 
     * brightening greens.
     * <li> For 10 to 24 iterations, the gradient is a series of 
     * brightening blues.
     * <li> For 25 to 74 iterations, the gradient is a series of 
     * brightening yellows.
     * <li> For more than 75 iterations, the gradient moves from a white to a 
     * dark gray.
     * </ul>
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
            int r = 325 - 2 * n;
            int g = 325 - 2 * n;
            int b = 325 - 2 * n;
            
            int[] rgb = {r, g, b};
            return rgb;
        }// else
        
    }// getRGBColor()
    
    
    /**
     * Creates an instance of this class which creates an image of the
     * Mandelbrot Set with a class constant specified height and width.
     */
    public SimpleBitmap() {
        int w = BITMAP_WIDTH;
        int h = BITMAP_HEIGHT;
        int imageType = BufferedImage.TYPE_INT_RGB;
        this.image = new BufferedImage(w, h, imageType);
    }// SimpleBitmap()
    
    
    /**
     * Creates the Mandelbrot Set image by assigning each pixel a color based 
     * on proximity to Mandelbrot Set membership.
     * 
     * To create the image, each pixel in the panel is mapped to a point on 
     * a class constant defined complex plane. This point is then tested for 
     * membership in the Mandelbrot Set. The number of completed iterations
     * of the testing function determines the color of the pixel to create the 
     * Mandelbrot Set image which is then transformed to properly fit the panel.
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
