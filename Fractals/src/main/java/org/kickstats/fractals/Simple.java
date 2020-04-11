
package org.kickstats.fractals;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;


/**
 * Makes a window used to draw something.
 * 
 * @author Chase Sonnemaker transcribed from Leon Tabak's code
 * @version 11 April 2020
 */
public class Simple extends JFrame {
    
    private static final int SIMPLE_WIDTH = 512;
    private static final int SIMPLE_HEIGHT = 512;
    private static final String SIMPLE_TITLE = "Simple";
    
    /**
     * Creates and displays a window.
     *
     * Draw something in the window by instantiating another class.
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
     * Creates an instance of this class. 
     */
    public static void main(String[] args) {
        Simple simple = new Simple();
    }// main(String[])
    
    
}// Simple
