/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.kickstats.matricesandvectors;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Tests for the Vector3D class.
 * 
 * @author Chase Sonnemaker
 */
public class Vector3DTest {
    
    public Vector3DTest() {
    }

    /**
     * Test of toString method, of class Vector3D.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Vector3D instance = new Vector3D(2, 2, 2);
        String expResult = "(2, 2, 2)";
        String result = instance.toString();
        assertEquals(expResult, result);
    }

    /**
     * Test of getp0 method, of class Vector3D.
     */
    @Test
    public void testGetp0() {
        System.out.println("getp0");
        Vector3D instance = new Vector3D(2, 2, 2);
        double expResult = 2;
        double result = instance.getp0();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getp1 method, of class Vector3D.
     */
    @Test
    public void testGetp1() {
        System.out.println("getp1");
        Vector3D instance = new Vector3D(2, 2, 2);
        double expResult = 2;
        double result = instance.getp1();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of getp2 method, of class Vector3D.
     */
    @Test
    public void testGetp2() {
        System.out.println("getp2");
        Vector3D instance = new Vector3D(2, 2, 2);
        double expResult = 2;
        double result = instance.getp2();
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dot method, of class Vector3D.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vector3D v = new Vector3D(2, 2, 2);
        Vector3D instance = new Vector3D(2, 2, 2);
        double expResult = 12;
        double result = instance.dot(v);
        assertEquals(expResult, result, 1E-8);
    }

    /**
     * Test of add method, of class Vector3D.
     */
    @Test
    public void testAdd() {
        System.out.println("add");
        Vector3D v = new Vector3D(2, 2, 2);
        Vector3D instance = new Vector3D(2, 2, 2);
        Vector3D expResult = new Vector3D(4, 4, 4);
        Vector3D result = instance.add(v);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
        assertEquals(expResult.getp2(), result.getp2(), 1E-8);
    }

    /**
     * Test of scale method, of class Vector3D.
     */
    @Test
    public void testScale_3args() {
        System.out.println("scale");
        double factor0 = 2;
        double factor1 = 4;
        double factor2 = 6;
        Vector3D instance = new Vector3D(2, 2, 2);
        Vector3D expResult = new Vector3D(4, 8, 12);
        Vector3D result = instance.scale(factor0, factor1, factor2);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
        assertEquals(expResult.getp2(), result.getp2(), 1E-8);
    }

    /**
     * Test of scale method, of class Vector3D.
     */
    @Test
    public void testScale_double() {
        System.out.println("scale");
        double factor = 4;
        Vector3D instance = new Vector3D(2, 2, 2);
        Vector3D expResult = new Vector3D(8, 8, 8);
        Vector3D result = instance.scale(factor);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
        assertEquals(expResult.getp2(), result.getp2(), 1E-8);
    }

    /**
     * Test of rotate method, of class Vector3D.
     */
    @Test
    public void testRotate() {
        System.out.println("rotate");
        double angle0 = 2 * Math.PI;
        double angle1 = 2 * Math.PI;
        double angle2 = 2 * Math.PI;
        Vector3D instance = new Vector3D(2, 2, 2);
        Vector3D expResult = new Vector3D(2, 2, 2);
        Vector3D result = instance.rotate(angle0, angle1, angle2);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
        assertEquals(expResult.getp2(), result.getp2(), 1E-8);
    }

    /**
     * Test of rotateScaleTranslate method, of class Vector3D.
     */
    @Test
    public void testRotateScaleTranslate() {
        System.out.println("rotateScaleTranslate");
        double angle0 = 2 * Math.PI;
        double angle1 = 2 * Math.PI;
        double angle2 = 2 * Math.PI;
        double scalep0 = 2;
        double scalep1 = 4;
        double scalep3 = 6;
        double deltap0 = 6;
        double deltap1 = 4;
        double deltap2 = 2;
        Vector3D instance = new Vector3D(2, 2, 2);
        Vector3D expResult = new Vector3D(10, 12, 14);
        Vector3D result = instance.rotateScaleTranslate(angle0, angle1, angle2, scalep0, scalep1, scalep3, deltap0, deltap1, deltap2);
        assertEquals(expResult.getp0(), result.getp0(), 1E-8);
        assertEquals(expResult.getp1(), result.getp1(), 1E-8);
        assertEquals(expResult.getp2(), result.getp2(), 1E-8);
    }

    /**
     * Test of magnitude method, of class Vector3D.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector3D instance = new Vector3D(2, 2, 2);
        double expResult = Math.sqrt(Math.pow(2, 2) + Math.pow(2, 2) + Math.pow(2, 2));
        double result = instance.magnitude();
        assertEquals(expResult, result, 1E-8);
    }
    
}
