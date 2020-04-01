
package org.kickstats.matricesandvectors;

/**
 * Models a 2x2 matrix.
 * 
 * @author Chase Sonnemaker
 * @version 31 March 2020
 */
public class Matrix2D {
    
    /**
     * Number at row 0, column 0.
     */
    double p00;
     
    /**
     * Number at row 0, column 1.
     */
    double p01;
    
    /**
     * Number at row 1, column 0.
     */
    double p10;
    
    /**
     * Number at row 1, column 1.
     */
    double p11;
    
    /**
     * Vector representing row 0.
     */
    Vector2D row0;
    
    /**
     * Vector representing row 1.
     */
    Vector2D row1;
    
    /**
     * Vector representing column 0.
     */
    Vector2D column0;
    
    /**
     * Vector representing column 0.
     */
    Vector2D column1;
    
}// Matrix2D
