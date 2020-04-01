
package org.kickstats.matricesandvectors;

/**
 * Models a vertex of length 2.
 * 
 * @author Chase Sonnemaker
 * @version 31 March 2020
 */
public class Vector2D {
    
    double p0;
    double p1;
    
    
    /**
     * Creates a Vector2D instance.
     * 
     * @param p0 First number in the vector.
     * @param p1 Second number in the vector.
     */
    public Vector2D(double p0, double p1) {
        this.p0 = p0;
        this.p1 = p1;
    }// Vector2D(double, double)
    
    
    /**
     * Returns a string representation of the vector.
     * 
     * @return A string representation of the vector.
     */
    @Override
    public String toString() {
        return "(" + this.p0 + ", " + this.p1 + ")";
    }// toString()
    
    
    /**
     * Returns the first number in the vector.
     * 
     * @return The first number in the vector.
     */
    public double getp0() {
        return this.p0;
    }// getp0()

    
     /**
     * Returns the second number in the vector.
     * 
     * @return The second number in the vector.
     */
    public double getp1() {
        return this.p1;
    }// getp0()
    
    
    /**
     * Dot multiplies this vector by another vector of length 2.
     * 
     * @param v Another vector of length 2.
     * @return The dot product of the two vectors.
     */
    public double dot(Vector2D v) {
        double product0 = this.p0 * v.p0;
        double product1 = this.p1 * v.p1;
        return product0 + product1;
    }// dot(Vector2D)
    
    
    /**
     * Adds this vector and another vector of length 2.
     * 
     * @param v Another vector of length 2.
     * @return A vector of length 2 that is the sum of the other two vectors.
     */
    public Vector2D add(Vector2D v) {
        double sum0 = this.p0 + v.p0;
        double sum1 = this.p1 + v.p1;
        return new Vector2D(sum0, sum1);
    }// add(Vector2D)
    
    
     /**
     * Scales each item in this vector by a different factor.
     * 
     * @param factor0 The factor by which to scale the first number in this
     * vector by.
     * @param factor1 The factor by which to scale the second number in this 
     * vector by.
     * @return A new vector of length 2 that is the original scaled 
     * by the factors.
     */
    public Vector2D scale(double factor0, double factor1) {
        double new0 = this.p0 * factor0;
        double new1 = this.p0 * factor1;
        return new Vector2D(new0, new1);
    }// scale(double, double)
    
    
    /**
     * Scales each item in this vector by the same factor.
     * 
     * @param factor The factor by which to increase or decrease the numbers in 
     * the vector.
     * @return A new vector of length 2 that is the original scaled 
     * by the factor.
     */
    public Vector2D scale(double factor) {
        return this.scale(factor, factor);
    }// scale(double)
    
    
    /**
     * Rotates this vector by an angle.
     * 
     * @param angle The angle (radians) by which to rotate this vector.
     * @return A new vector of length 2 that is the original rotated by the 
     * angle.
     */
    public Vector2D rotate(double angle) {
        double new0 = this.p0 * Math.cos(angle) + this.p1 * Math.sin(angle);
        double new1 = this.p0 * Math.sin(angle) + this.p1 * Math.cos(angle);
        return new Vector2D(new0, new1);
    }// rotate(double)
    
    
    /**
     * Rotates, scales, and moves a vector.
     * 
     * @param angle The angle (radians) by which to rotate this vector.
     * @param scalep0 The factor by which to scale the first number of 
     * this vector.
     * @param scalep1 The factor by which to scale the second number of
     * this vector.
     * @param deltap0 The distance to move the first number of this vector.
     * @param deltap1 The distance to move the second number of this vector.
     * @return A new vector of length 2 that has been rotated, scaled, and 
     * moved accordingly.
     */
    public Vector2D rotateScaleTranslate(double angle, double scalep0,
        double scalep1, double deltap0, double deltap1) {
        
        return new Vector2D(0, 0);
    }// rotateScaleTranslate(double, double, double, double, double)
    
    
    /**
     * Finds the magnitude of the vector.
     * 
     * @return The magnitude of the vector.
     */
    public double magnitude() {
        return 0;
    }// magnitude()
    
    
}// Vector2D
