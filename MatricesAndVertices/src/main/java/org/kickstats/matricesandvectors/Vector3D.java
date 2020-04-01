
package org.kickstats.matricesandvectors;

/**
 * Models a vector of length 3.
 * 
 * @author Chase Sonnemaker
 * @version 31 March 2020
 */
public class Vector3D {
        
    /**
     * First number in the vector, corresponding to x.
     */
    double p0;
    
    /**
     * Second number in the vector, corresponding to y.
     */
    double p1;
    
    /**
     * Third number in the vector, corresponding to z.
     */
    double p2;
    
    
    /**
     * Creates a Vector3D instance.
     * 
     * @param p0 First number in the vector, corresponding to x.
     * @param p1 Second number in the vector, corresponding to y.
     * @param p2 Third number in the vector, corresponding to z.
     */
    public Vector3D(double p0, double p1, double p2) {
        this.p0 = p0;
        this.p1 = p1;
        this.p2 = p2;
    }// Vector2D(double, double)
    
    
    /**
     * Returns a string representation of the vector.
     * 
     * @return A string representation of the vector.
     */
    @Override
    public String toString() {
        return "";
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
     * Returns the second number in the vector.
     * 
     * @return The second number in the vector.
     */
    public double getp2() {
        return this.p2;
    }// getp0()
    
    
    /**
     * Dot multiplies this vector by another vector of length 3.
     * 
     * @param v Another vector of length 3.
     * @return The dot product of the two vectors.
     */
    public double dot(Vector3D v) {
        double product0 = this.p0 * v.p0;
        double product1 = this.p1 * v.p1;
        double product2 = this.p2 * v.p2;
        return product0 + product1 + product2;
    }// dot(Vector3D)
    
    
    /**
     * Adds this vector and another vector of length 3.
     * 
     * @param v Another vector of length 3.
     * @return A vector of length 3 that is the sum of the other two vectors.
     */
    public Vector3D add(Vector3D v) {
        double sum0 = this.p0 + v.p0;
        double sum1 = this.p1 + v.p1;
        return new Vector3D(0, 0, 0);
    }// add(Vector3D)
    
    
     /**
     * Scales each item in this vector by a different factor.
     * 
     * @param factor0 The factor by which to scale the first number in this
     * vector by.
     * @param factor1 The factor by which to scale the second number in this 
     * vector by.
     * @param factor2 The factor by which to scale the third number in this
     * vector by.
     * @return A new vector of length 3 that is the original scaled 
     * by the factors.
     */
    public Vector3D scale(double factor0, double factor1, double factor2) {
        double new0 = this.p0 * factor0;
        double new1 = this.p0 * factor1;
        return new Vector3D(0, 0, 0);
    }// scale(double, double, double)
    
    
    /**
     * Scales each item in this vector by the same factor.
     * 
     * @param factor The factor by which to increase or decrease the numbers in 
     * the vector.
     * @return A new vector of length 3 that is the original scaled 
     * by the factor.
     */
    public Vector3D scale(double factor) {
        return new Vector3D(0, 0, 0);
    }// scale(double)
    
    
    /**
     * Rotates this vector by an angle.
     * 
     * @param angle0 The angle to rotate about the x-axis.
     * @param angle1 The angle to rotate about the y-axis.
     * @param angle2 The angle to rotate about the z-axis.
     * @return A new vector of length 3 that is the original rotated by the 
     * angles.
     */
    public Vector3D rotate(double angle0, double angle1, double angle2) {
        double new0 = this.p0 * Math.cos(angle0) + this.p1 * Math.sin(angle0);
        double new1 = this.p0 * Math.sin(angle0) + this.p1 * Math.cos(angle0);
        return new Vector3D(0, 0, 0);
    }// rotate(double, double, double)
    
    
    /**
     * Rotates, scales, and moves a vector.
     * 
     * @param angle0 The angle (radians) by which to rotate this vector about
     * the x-axis.
     * @param angle1 The angle (radians) by which to rotate this vector about
     * the y-axis.
     * @param angle2 The angle (radians) by which to rotate this vector about
     * the z-axis.
     * @param scalep0 The factor by which to scale the first number of 
     * this vector.
     * @param scalep1 The factor by which to scale the second number of
     * this vector.
     * @param scalep3 The factor by which to scale the third number of
     * this vector.
     * @param deltap0 The distance to move the first number of this vector.
     * @param deltap1 The distance to move the second number of this vector.
     * @param deltap2 The distance to move the third number of this vector.
     * @return A new vector of length 3 that has been rotated, scaled, and 
     * moved accordingly.
     */
    public Vector3D rotateScaleTranslate(double angle0, double angle1, double angle2, 
        double scalep0, double scalep1, double scalep3, double deltap0, 
        double deltap1, double deltap2) {
        
        Vector3D rotated = this.rotate(angle0, 0, 0);
        Vector3D scaled = rotated.scale(scalep0, scalep1, 0);
        
        return new Vector3D(0, 0, 0);
    }// rotateScaleTranslate(double, double, double, double, double, double, 
     //double, double, double)
    
    
    /**
     * Finds the magnitude of the vector.
     * 
     * @return The magnitude of the vector.
     */
    public double magnitude() {
        return 0;
    }// magnitude()
    
}// Vector3D
