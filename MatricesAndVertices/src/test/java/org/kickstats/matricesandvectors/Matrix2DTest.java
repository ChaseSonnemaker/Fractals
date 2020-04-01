
package org.kickstats.matricesandvectors;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests the Matrix2D class.
 * 
 * @author Chase Sonnemaker
 */
public class Matrix2DTest {
    
    public Matrix2DTest() {
    }

    /**
     * Test of toString method, of class Matrix2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Matrix2D instance = new Matrix2D();
        String expResult = "[(1.0, 0.0), (0.0, 1.0)]";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getNumber method, of class Matrix2D.
     */
    @Test
    public void testGetNumber() {
        System.out.println("getNumber");
        int row = 0;
        int column = 0;
        Matrix2D instance = new Matrix2D();
        double expResult = 1.0;
        double result = instance.getNumber(row, column);
        assertEquals(expResult, result, 1E-8);
    }

    /**
     * Test of getRow method, of class Matrix2D.
     */
    @Test
    public void testGetRow() {
        System.out.println("getRow");
        int row = 0;
        Matrix2D instance = new Matrix2D();
        Vector2D expResult = new Vector2D(1, 0);
        Vector2D result = instance.getRow(row);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of getColumn method, of class Matrix2D.
     */
    @Test
    public void testGetColumn() {
        System.out.println("getColumn");
        int column = 0;
        Matrix2D instance = new Matrix2D();
        Vector2D expResult = new Vector2D(1, 0);
        Vector2D result = instance.getColumn(column);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of multiply method, of class Matrix2D.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Matrix2D m = new Matrix2D(1, 2, 3, 4);
        Matrix2D instance = new Matrix2D(1, 2, 3, 4);
        Matrix2D expResult = new Matrix2D(7, 10, 15, 22);
        Matrix2D result = instance.multiply(m);
        assertEquals(expResult.getNumber(0, 0), result.getNumber(0, 0), 1E-8);
        assertEquals(expResult.getNumber(1, 0), result.getNumber(1, 0), 1E-8);
        assertEquals(expResult.getNumber(0, 1), result.getNumber(0, 1), 1E-8);
        assertEquals(expResult.getNumber(1, 1), result.getNumber(1, 1), 1E-8);
    }

    /**
     * Test of vectorMultiply method, of class Matrix2D.
     */
    @Test
    public void testVectorMultiply() {
        System.out.println("vectorMultiply");
        Vector2D v = new Vector2D(5, 6);
        Matrix2D instance = new Matrix2D(1, 2, 3, 4);
        Vector2D expResult = new Vector2D(17, 39);
        Vector2D result = instance.vectorMultiply(v);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of add method, of class Matrix2D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Matrix2D m = new Matrix2D(1, 2, 3, 4);
        Matrix2D instance = new Matrix2D(1, 2, 3, 4);
        Matrix2D expResult = new Matrix2D(2, 4, 6, 8);
        Matrix2D result = instance.add(m);
        assertEquals(expResult.getNumber(0, 0), result.getNumber(0, 0), 1E-8);
        assertEquals(expResult.getNumber(1, 0), result.getNumber(1, 0), 1E-8);
        assertEquals(expResult.getNumber(0, 1), result.getNumber(0, 1), 1E-8);
        assertEquals(expResult.getNumber(1, 1), result.getNumber(1, 1), 1E-8);
    }

    /**
     * Test of determinant method, of class Matrix2D.
     */
    @Test
    public void testDeterminant() {
        System.out.println("determinant");
        Matrix2D instance = new Matrix2D(1, 2, 3, 4);
        double expResult = -1;
        double result = instance.determinant();
        assertEquals(expResult, result, 1E-8);
    }

    /**
     * Test of inverse method, of class Matrix2D.
     */
    @Test
    public void testInverse() {
        System.out.println("inverse");
        Matrix2D instance = new Matrix2D(1, 2, 3, 4);
        Matrix2D expResult = new Matrix2D(-2.0, 1.0, 3.0 / 2.0, -1.0 / 2.0);
        Matrix2D result = instance.inverse();
        assertEquals(expResult.getNumber(0, 0), result.getNumber(0, 0), 1E-8);
        assertEquals(expResult.getNumber(1, 0), result.getNumber(1, 0), 1E-8);
        assertEquals(expResult.getNumber(0, 1), result.getNumber(0, 1), 1E-8);
        assertEquals(expResult.getNumber(1, 1), result.getNumber(1, 1), 1E-8);
    }
    
}
