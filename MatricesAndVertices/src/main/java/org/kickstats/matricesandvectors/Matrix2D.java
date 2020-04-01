
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
    
    
    /**
     * Returns a string representation of this matrix.
     * 
     * @return A string representation of this matrix.
     */
    @Override
    public String toString() {
        return "";
    }// toString()
    
    
    /**
     * Returns a number in this matrix.
     * 
     * @param row The row index of the number.
     * @param column The column index of the number.
     * @return A number stored in the matrix.
     */
    public double getNumber(int row, int column) {
        return 0;
    }// getNumber(int, int)
    
    
    /**
     * Multiplies this matrix with another 2x2 matrix.
     * 
     * @param m Another 2x2 matrix.
     * @return A new 2x2 matrix that is the product of the other two matrices.
     */
    public Matrix2D multiply(Matrix2D m) {
        return new Matrix2D();
    }// multiply(Matrix2D)
    
    
    /**
     * Multiplies this matrix by a vector of length 2.
     * 
     * @param v A vector of length 2.
     * @return A vector of length 2 that is the product of this matrix and the 
     * vector v.
     */
    public Vector2D vectorMultiply(Vector2D v) {
        return new Vector2D(0, 0);
    }// vectorMultiply(Vector2D)
    
    
    /**
     * Adds this matrix with another 2x2 matrix.
     * 
     * @param m Another 2x2 matrix.
     * @return A 2x2 matrix that is the sum of the other two matrices.
     */
    public Matrix2D add(Matrix2D m) {
        return new Matrix2D();
    }// add(Matrix2D)
    
    
    /**
     * Finds the determinant of this matrix.
     * 
     * @return The determinant of this matrix.
     */
    public double determinant() {
        return 0;
    }// determinant()
    
    
    /**
     * Finds the inverse matrix of this matrix.
     * 
     * @return The inverse matrix of this matrix.
     */
    public Matrix2D inverse() {
        return new Matrix2D();
    }// inverse()   
    
}// Matrix2D
