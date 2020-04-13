
package org.kickstats.fractals;

/**
 * Models a complex number.
 * 
 * Has methods for adding, multiplying, and finding the magnitude of 
 * complex numbers. Complex number z can be represented by the following 
 * equation...
 * <P>
 * z = x + i * y
 * <P>
 * Where x and y are real numbers and i is the square root of -1. This class 
 * models a complex number by storing the x and y values.
 *  
 * 
 * @author Chase Sonnemaker
 * @version 11 April 2020
 */
public class Complex {
    
    private final double x;
    private final double y;
    
    /**
     * Creates a complex number.
     * 
     * Stores the x and y values in the equation...
     * <P>
     * z = x + i * y
     * 
     * @param x The x value of the complex number.
     * @param y The y value of the complex number
     */
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
    }// Complex(double, double)
    
    
    /**
     * Returns a string that represents this complex number.
     * 
     * The complex number is represented in the form...
     * <P>
     * z = x + i * y
     * 
     * @return A string representation of this complex number.
     */
    @Override        
    public String toString() {
        return this.x + " + i * " + this.y;
    }// toString()
    
    
    /**
     * Adds this complex number with another complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the sum of the other two
     * complex numbers.
     */
    public Complex add(Complex c) {
        double newX = this.getX() + c.getX();
        double newY = this.getY() + c.getY();
        
        return new Complex(newX, newY);
    }// add(Complex)
    
    
    /**
     * Subtracts another complex number from this complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the difference between 
     * this complex number and another complex number.
     */
    public Complex subtract(Complex c) {
        double newX = this.getX() - c.getX();
        double newY = this.getY() - c.getY();
        
        return new Complex(newX, newY);
    }// subtract(Complex)
    
    
    /**
     * Multiplies this complex number with another complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the product of the 
     * other two complex numbers.
     */
    public Complex multiply(Complex c) {
        double newX = (this.getX() * c.getX()) - (this.getY() * c.getY());
        double newY = (this.getX() * c.getY()) + (this.getY() * c.getX());
        
        return new Complex(newX, newY);
    }// multiply(Complex)
    
    
    /**
     * Divides this complex number by another complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the quotient of the
     * other two complex numbers.
     */
    public Complex divide(Complex c) {
        double newXNumerator = (this.x * c.x) + (this.y * c.y);
        double newYNumerator = (this.y * c.x) - (this.x * c.y);
        double newDenominator = Math.pow(c.x, 2) + Math.pow(c.y, 2);
        
        double newX = newXNumerator / newDenominator;
        double newY = newYNumerator / newDenominator;
        
        return new Complex(newX, newY);
    }// divide(Complex)
    
    
    /**
     * Returns the magnitude of this complex number.
     * 
     * The magnitude of a complex number is the number's distance from
     * the origin in the complex plane.
     * 
     * @return The magnitude of this complex number.
     */
    public double magnitude() {
        double xSquare = Math.pow(this.getX(), 2);
        double ySquare = Math.pow(this.getY(), 2);
        
        return Math.sqrt(xSquare + ySquare);
    }// magnitude()

    /**
     * Gets the x value of this complex number.
     * 
     * x represents the x in the following equation
     * of a complex number...
     * <P>
     * z = x + i * y
     * 
     * @return The x value of this complex number. 
     */
    public double getX() {
        return x;
    }// getX()

    
    /**
     * Gets the y value of this complex number.
     * 
     * y represents the y in the following equation
     * of a complex number...
     * <P>
     * z = x + i * y
     * 
     * @return The y value of this complex number. 
     */
    public double getY() {
        return y;
    }// getY()
    
    
}// Complex
