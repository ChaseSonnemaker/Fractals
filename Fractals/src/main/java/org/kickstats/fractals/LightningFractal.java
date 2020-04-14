
package org.kickstats.fractals;

import java.awt.Container;
import javax.swing.JFrame;

/**
 * Creates a window used to draw a piece of the Mandelbrot Set.
 * 
 * The image is stylized using color manipulation 
 * to look like a lightning storm and drawn on a 
 * buffered image.
 * 
 * @author Chase Sonnemaker transcribed from Leon Tabak's code
 * @version 13 April 2020
 */
public class LightningFractal extends JFrame {
    
    //Window Information
    private static final int WINDOW_WIDTH = 512;
    private static final int WINDOW_HEIGHT = 512;
    private static final String WINDOW_TITLE = "Lightning Fractal";
    
    
    /**
     * Creates an instance of this class which creates a window.
     *
     * The window has a size and name defined in this class and draws 
     * a piece of the Mandelbrot Set by creating an instance of the
     * LightningFractalBitmap class.
     * 
     */
    public LightningFractal() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        this.setTitle(WINDOW_TITLE);
        
        Container pane = this.getContentPane();
        
        LightningFractalBitmap panel = new LightningFractalBitmap();
        pane.add(panel);
        
        this.setVisible(true);
    }// LightningFractal()
    
    
    /**
     * Calls the constructor of this class to create a window
     * with a Mandelbrot Set piece drawn on it.
     */
    public static void main(String[] args) {
        LightningFractal fractal = new LightningFractal();
    }// main(String[])
    
    
}// LightningFractal
