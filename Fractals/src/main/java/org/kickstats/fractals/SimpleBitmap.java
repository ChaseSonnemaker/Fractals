
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
    
    private static final int BITMAP_WIDTH = 512;
    private static final int BITMAP_HEIGHT = 512;
    private BufferedImage image;
    
    
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
        
        int[] black = {0, 0, 0};
        int[] yellow = {255, 255, 0};
        
        for(int i = 0; i < h; i++) {
            for(int j = 0; j < w; j++) {
                if (i < j) {
                    raster.setPixel(i, j, yellow);
                }// if
                else {
                    raster.setPixel(i, j, black);
                }// else
            }// for
        }// for
        
        g2D.drawImage(image, scale, this);
    }// paintComponent(Graphics)
    
    
}// SimpleBitmap
