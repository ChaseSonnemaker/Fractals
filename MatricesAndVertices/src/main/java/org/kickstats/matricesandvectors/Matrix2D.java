
package org.kickstats.matricesandvectors;

/**
 * Models a 2x2 matrix.
 * 
 * @author Chase Sonnemaker
 * @version 31 March 2020
 */
public class Matrix2D {
    
    public enum vectorType{
        COLUMN, ROW
    }// vectorType
    
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
    
    
    /**
     * Creates a 2x2 identity matrix instance.
     */
    public Matrix2D() {
        
    }// Matrix2D()
    
    
    /**
     * Creates a 2x2 matrix instance.
     * 
     * @param p00 Number at row 0, column 0.
     * @param p01 Number at row 0, column 1.
     * @param p10 Number at row 1, column 0.
     * @param p11 Number at row 1, column 1.
     */
    public Matrix2D(double p00, double p01, double p10, double p11) {
        
    }// Matrix2D(double, double, double, double)
    
    
    /**
     * Creates a 2x2 matrix instance.
     * 
     * @param v0 First vector in the matrix (top or left-most).
     * @param v1 Second vector in the matrix (bottom or right-most).
     * @param type ROW if vectors are rows or COLUMN if vectors are columns.
     */
    public Matrix2D(Vector2D v0, Vector2D v1, vectorType type) {
        
    }// Matrix(Vector2D, Vector2D, vectorType)
    
            
}// Matrix2D
