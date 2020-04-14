
package org.kickstats.fractals;

/**
 * Models a complex number.
 * 
 * Has methods for adding, subtracting, multiplying, dividing, and finding 
 * the magnitude of complex numbers. This class models a complex number by 
 * using the following representation of complex number z. 
 * <P>
 *  z = x + i * y
 * <P>
 * Where x and y are real numbers and i is the square root of -1. This class 
 * models a complex number by storing x as the real component and y as the 
 * representation of the imaginary component in the complex number.
 * <P>
 * For more information about complex numbers try 
 * <a href="https://www.mathsisfun.com/numbers/complex-numbers.html">here
 * </a>.
 * 
 * @author Chase Sonnemaker
 * @version 13 April 2020
 */
public class Complex {
    
    /**
     * The real component of the complex number. 
     * 
     * Calculated as the x value in the z = x + i * y 
     * representation of a complex number. 
     */
    private final double real;
    
    /**
     * The representation of the imaginary component of the complex number. 
     * 
     * Calculated as the y value in the z = x + i * y 
     * representation of a complex number. 
     */
    private final double imaginary;
    
    
    /**
     * Creates a complex number.
     * 
     * Stores the x and and y values in the equation...
     * <P>
     * z = x + i * y
     * <P>
     * To model a complex number.
     * 
     * @param x The real component of the complex number, calculated as x 
     * in the equation above.
     * @param y A representation of the imaginary component of the complex 
     * number, calculated as y in the equation above.
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
     * <code>real + i * imaginary</code>
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
     * @return A complex number that is the sum of this complex
     * number and another complex number.
     */
    public Complex add(Complex c) {
        double newX = this.real + c.real;
        double newY = this.imaginary + c.imaginary;
        
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
        double newX = this.real - c.real;
        double newY = this.imaginary - c.imaginary;
        
        return new Complex(newX, newY);
    }// subtract(Complex)
    
    
    /**
     * Multiplies this complex number with another complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the product of the 
     * this complex number and another complex number.
     */
    public Complex multiply(Complex c) {
        double newX = (this.real * c.real) 
                                - (this.imaginary * c.imaginary);
        
        double newY = (this.real * c.imaginary) 
                                + (c.real * this.imaginary);
        
        return new Complex(newX, newY);
    }// multiply(Complex)
    
    
    /**
     * Divides this complex number by another complex number.
     * 
     * @param c Another complex number.
     * @return A complex number that is the quotient of the
     * this complex number divided by another complex number.
     */
    public Complex divide(Complex c) {
        double newXNumerator = (this.real * c.real) 
                                    + (this.imaginary * c.imaginary);
        
        double newYNumerator = (this.imaginary * c.real) 
                                    - (this.real * c.imaginary);
        
        double newDenominator = Math.pow(c.real, 2) 
                                    + Math.pow(c.imaginary, 2);
        
        double newX = newXNumerator / newDenominator;
        double newY = newYNumerator / newDenominator;
        
        return new Complex(newX, newY);
    }// divide(Complex)
    
    
    /**
     * Returns the magnitude of this complex number.
     * 
     * The magnitude of a complex number is the number's distance from
     * the origin in the complex plane. For more information of what 
     * this means and how it is calculated try 
     * <a href="https://www.expii.com/t/magnitude-of-a-complex-number-4944">here
     * </a>.
     * 
     * @return The magnitude of this complex number.
     */
    public double magnitude() {
        double xSquare = Math.pow(this.real, 2);
        double ySquare = Math.pow(this.imaginary, 2);
        
        return Math.sqrt(xSquare + ySquare);
    }// magnitude()

    
    /**
     * Returns the squared magnitude of this complex number.
     * 
     * This is the magnitude of the complex number without the square root. 
     * Can be used to speed up calculations in some situations.
     * For more information of what the magnitude is and how it is 
     * calculated see the magnitude method. 
     * 
     * @return The squared magnitude of this complex number.
     */
    public double magnitudeSquared() {
        double xSquare = Math.pow(this.real, 2);
        double ySquare = Math.pow(this.imaginary, 2);
        
        return xSquare + ySquare;
    }// magnitudeSquared()
    
    
    /**
     * Gets the real component of this complex number.
     * 
     * The real component of this complex number is the value of x 
     * in the following equation of a complex number...
     * <P>
     * z = x + i * y
     * 
     * @return The real component of this complex number. 
     */
    public double getReal() {
        return this.real;
    }// getReal()

    
    /**
     * Gets the imaginary component of this complex number.
     * 
     * The imaginary component of this complex number is the value of y 
     * in the following equation of a complex number...
     * <P>
     * z = x + i * y
     * 
     * @return The imaginary component of this complex number. 
     */
    public double getImaginary() {
        return this.imaginary;
    }// getImaginary()
    
    
}// Complex
