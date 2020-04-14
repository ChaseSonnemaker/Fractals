
package org.kickstats.fractals;

/**
 * Models a complex number.
 * 
 * Has methods for adding, multiplying, and finding the magnitude of 
 * complex numbers. Complex number z can be represented by the following 
 * equation...
 * <P>
 z = real + i * imaginary
 <P>
 Where real and imaginary are real numbers and i is the square root of -1. This class 
 models a complex number by storing the real and imaginary values.
 *  
 * 
 * @author Chase Sonnemaker
 * @version 11 April 2020
 */
public class Complex {
    
    private final double real;
    private final double imaginary;
    
    /**
     * Creates a complex number.
     * 
     * Stores the x and y values in the equation...
     * <P>
 z = real + i * imaginary
     * 
     * @param x The real value of the complex number.
     * @param y The imaginary value of the complex number
     */
    public Complex(double x, double y) {
        this.real = x;
        this.imaginary = y;
    }// Complex(double, double)
    
    
    /**
     * Returns a string that represents this complex number.
     * 
     * The complex number is represented in the form...
     * <P>
 z = real + i * imaginary
     * 
     * @return A string representation of this complex number.
     */
    @Override        
    public String toString() {
        return this.real + " + i * " + this.imaginary;
    }// toString()
    
    
    /**
     * Adds this complex number with another complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the sum of the other two
     * complex numbers.
     */
    public Complex add(Complex c) {
        double newX = this.getReal() + c.getReal();
        double newY = this.getImaginary() + c.getImaginary();
        
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
        double newX = this.getReal() - c.getReal();
        double newY = this.getImaginary() - c.getImaginary();
        
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
        double newX = (this.getReal() * c.getReal()) - (this.getImaginary() * c.getImaginary());
        double newY = (this.getReal() * c.getImaginary()) + (this.getImaginary() * c.getReal());
        
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
        double newXNumerator = (this.real * c.real) + (this.imaginary * c.imaginary);
        double newYNumerator = (this.imaginary * c.real) - (this.real * c.imaginary);
        double newDenominator = Math.pow(c.real, 2) + Math.pow(c.imaginary, 2);
        
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
        double xSquare = Math.pow(this.getReal(), 2);
        double ySquare = Math.pow(this.getImaginary(), 2);
        
        return Math.sqrt(xSquare + ySquare);
    }// magnitude()

    /**
     * Gets the x value of this complex number.
     * 
     * x represents the x in the following equation
     * of a complex number...
     * <P>
 z = real + i * imaginary
     * 
     * @return The real value of this complex number. 
     */
    public double getReal() {
        return real;
    }// getX()

    
    /**
     * Gets the y value of this complex number.
     * 
     * y represents the y in the following equation
     * of a complex number...
     * <P>
 z = real + i * imaginary
     * 
     * @return The imaginary value of this complex number. 
     */
    public double getImaginary() {
        return imaginary;
    }// getY()
    
    
}// Complex
