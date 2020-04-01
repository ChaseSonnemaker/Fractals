
package org.kickstats.matricesandvectors;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Testing the Vector2D class.
 * 
 * @author Chase Sonnemaker
 */
public class Vector2DTest {
    
    public Vector2DTest() {
    }

    /**
     * Test of toString method, of class Vector2D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector2D instance = new Vector2D(2, 2);
        String expResult = "(2.0, 2.0)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getp0 method, of class Vector2D.
     */
    @Test
    public void testGetp0() {
        System.out.println("getp0");
        Vector2D instance = new Vector2D(2, 2);
        double expResult = 2;
        double result = instance.getp0();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getp1 method, of class Vector2D.
     */
    @Test
    public void testGetp1() {
        System.out.println("getp1");
        Vector2D instance = new Vector2D(2, 2);
        double expResult = 2;
        double result = instance.getp1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dot method, of class Vector2D.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vector2D v = new Vector2D(2, 2);
        Vector2D instance = new Vector2D(2, 2);
        double expResult = 8;
        double result = instance.dot(v);
        assertEquals(expResult, result, 1E-8);
    }

    /**
     * Test of add method, of class Vector2D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector2D v = new Vector2D(2, 2);
        Vector2D instance = new Vector2D(2, 2);
        Vector2D expResult = new Vector2D(4, 4);
        Vector2D result = instance.add(v);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of scale method, of class Vector2D.
     */
    @Test
    public void testScale_double_double() {
        System.out.println("scale");
        double factor0 = 2;
        double factor1 = 4;
        Vector2D instance = new Vector2D(2, 2);
        Vector2D expResult = new Vector2D(4, 8);
        Vector2D result = instance.scale(factor0, factor1);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of scale method, of class Vector2D.
     */
    @Test
    public void testScale_double() {
        System.out.println("scale");
        double factor = 3;
        Vector2D instance = new Vector2D(2, 2);
        Vector2D expResult = new Vector2D(6, 6);
        Vector2D result = instance.scale(factor);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of rotate method, of class Vector2D.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        double angle = 2 * Math.PI;
        Vector2D instance = new Vector2D(2, 2);
        Vector2D expResult = new Vector2D(2, 2);
        Vector2D result = instance.rotate(angle);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of rotateScaleTranslate method, of class Vector2D.
     */
    @Test
    public void testRotateScaleTranslate() {
        System.out.println("rotateScaleTranslate");
        double angle = 2 * Math.PI;
        double scalep0 = 2;
        double scalep1 = 4;
        double deltap0 = 3;
        double deltap1 = 3;
        Vector2D instance = new Vector2D(2, 2);
        Vector2D expResult = new Vector2D(7, 11);
        Vector2D result = instance.rotateScaleTranslate(angle, scalep0, scalep1, deltap0, deltap1);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
    }

    /**
     * Test of magnitude method, of class Vector2D.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector2D instance = new Vector2D(2, 2);
        double expResult = 2.82842712475;
        double result = instance.magnitude();
        assertEquals(expResult, result, 1E-8);
    }
    
}
