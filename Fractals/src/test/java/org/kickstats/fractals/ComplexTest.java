
package org.kickstats.fractals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the various methods defined in the Complex class.
 * 
 * Uses the complex number...
 * <P>
 * z = 3 + i * 16 
 * <P>
 * as the main instance to call methods on 
 * and uses the complex number...
 * <P>
 * z = 12 + i * 5
 * <P>
 * as a instance when needed for methods that work
 * with two complex numbers.
 * 
 * @author Chase Sonnemaker
 * @version 13 April 2020
 */
public class ComplexTest {
    
    public ComplexTest() {
    }// ComplexTest()

    
    /**
     * Test of toString method, of class Complex.
     * 
     * Converts 3 + i * 16 to a string.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Complex instance = new Complex(3, 16);
        String expResult = "3.0 + i * 16.0";
        String result = instance.toString();
        assertEquals(expResult, result);
    }// testToString()

    
    /**
     * Test of add method, of class Complex.
     * 
     * Finds the sum of (3 + i * 16) + (12 + i * 5). 
     * Which should be 15 + i * 21.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Complex c = new Complex(12, 5);
        Complex instance = new Complex(3, 16);
        Complex expResult = new Complex(15, 21);
        Complex result = instance.add(c);
        assertEquals(expResult.getReal(), result.getReal(), 1E-8);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 1E-8);
    }// testAdd()

    
    /**
     * Test of subtract method, of class Complex.
     * 
     * Finds the sum of (3 + i * 16) - (12 + i * 5). 
     * Which should be -9 + i * 11.
     */
    @Test
    public void testSubtract() {
        System.out.println("subtract");
        Complex c = new Complex(12, 5);
        Complex instance = new Complex(3, 16);
        Complex expResult = new Complex(-9, 11);
        Complex result = instance.subtract(c);
        assertEquals(expResult.getReal(), result.getReal(), 1E-8);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 1E-8);
    }// testSubtract()

    
    /**
     * Test of multiply method, of class Complex.
     * 
     * Finds the sum of (3 + i * 16) * (12 + i * 5). 
     * Which should be -44 + i * 207.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Complex c = new Complex(12, 5);
        Complex instance = new Complex(3, 16);
        Complex expResult = new Complex(-44, 207);
        Complex result = instance.multiply(c);
        assertEquals(expResult.getReal(), result.getReal(), 1E-8);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 1E-8);
    }// testMultiply()

    
    /**
     * Test of divide method, of class Complex.
     * 
     * Finds the sum of (3 + i * 16) / (12 + i * 5). 
     * Which should be (116/169) + i * (177/169).
     */
    @Test
    public void testDivide() {
        System.out.println("divide");
        Complex c = new Complex(12, 5);
        Complex instance = new Complex(3, 16);
        Complex expResult = new Complex((116.0 / 169.0), (177.0 / 169.0));
        Complex result = instance.divide(c);
        assertEquals(expResult.getReal(), result.getReal(), 1E-8);
        assertEquals(expResult.getImaginary(), result.getImaginary(), 1E-8);
    }// testDivide()

    
    /**
     * Test of magnitude method, of class Complex.
     * 
     * Finds the magnitude of 3 + i * 16.
     * Which should be the square root of 265.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Complex instance = new Complex(3, 16);
        double expResult = Math.sqrt(265);
        double result = instance.magnitude();
        assertEquals(expResult, result, 1E-8);
    }// testMagnitude()

    
    /**
     * Test of getReal method, of class Complex.
     * 
     * Gets the x number of 3 + i * 16.
     * Which should be 3.
     */
    @Test
    public void testGetReal() {
        System.out.println("getReal");
        Complex instance = new Complex(3, 16);
        double expResult = 3.0;
        double result = instance.getReal();
        assertEquals(expResult, result, 1E-8);
    }// testGetReal()

    
    /**
     * Test of getImaginary method, of class Complex.
     * 
     * Gets the x number of 3 + i * 16.
     * Which should be 16.
     */
    @Test
    public void testGetImaginary() {
        System.out.println("getImaginary");
        Complex instance = new Complex(3, 16);
        double expResult = 16.0;
        double result = instance.getImaginary();
        assertEquals(expResult, result, 1E-8);
    }// testGetImaginary()
    
    
}// ComplexTest
