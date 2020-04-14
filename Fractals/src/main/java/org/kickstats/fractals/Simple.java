
package org.kickstats.fractals;

import java.awt.Container;
import javax.swing.JFrame;

/**
 * Creates a window used to draw a piece of the Mandelbrot Set.
 * 
 * The image is stylized using color manipulation 
 * to look like a lightning storm.
 * 
 * @author Chase Sonnemaker transcribed from Leon Tabak's code
 * @version 13 April 2020
 */
public class Simple extends JFrame {
    
    //Window Information
    private static final int SIMPLE_WIDTH = 512;
    private static final int SIMPLE_HEIGHT = 512;
    private static final String SIMPLE_TITLE = "Simple";
    
    
    /**
     * Creates an instance of this class which creates a window.
     *
     * The window has a size and name defined in this class and draws 
     * a piece of the Mandelbrot Set by creating an instance of the
     * SimpleBitmap class.
     * 
     */
    public Simple() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(SIMPLE_WIDTH, SIMPLE_HEIGHT);
        this.setTitle(SIMPLE_TITLE);
        
        Container pane = this.getContentPane();
        
        SimpleBitmap panel = new SimpleBitmap();
        pane.add(panel);
        
        this.setVisible(true);
    }// Simple()
    
    
    /**
     * Calls the constructor of this class to create a window
     * with a Mandelbrot Set piece drawn on it.
     */
    public static void main(String[] args) {
        Simple simple = new Simple();
    }// main(String[])
    
    
}// Simple
