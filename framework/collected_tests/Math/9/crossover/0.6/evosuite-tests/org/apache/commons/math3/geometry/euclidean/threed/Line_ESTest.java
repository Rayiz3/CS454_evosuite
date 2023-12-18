/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 22:16:17 GMT 2023
 */

package org.apache.commons.math3.geometry.euclidean.threed;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.geometry.Vector;
import org.apache.commons.math3.geometry.euclidean.oned.Vector1D;
import org.apache.commons.math3.geometry.euclidean.threed.Euclidean3D;
import org.apache.commons.math3.geometry.euclidean.threed.Line;
import org.apache.commons.math3.geometry.euclidean.threed.Vector3D;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Line_ESTest extends Line_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0, 1.0);
      Vector3D vector3D1 = new Vector3D(1.0, 1.0, 0.26051153111544323);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      line0.contains(vector3D1);
      Vector3D vector3D2 = new Vector3D(1.0, 4.54058368820243E-17, 1893.55345494);
      Vector3D vector3D3 = Vector3D.PLUS_K;
      Vector3D vector3D4 = vector3D3.subtract((Vector<Euclidean3D>) vector3D2);
      Vector3D vector3D5 = new Vector3D(1.0, vector3D1, 1.0, vector3D4, 3193.7272683393, vector3D2);
      line1.toSubSpace(vector3D5);
      Line line2 = new Line(line1);
      vector3D4.getSpace();
      Vector3D vector3D6 = Vector3D.NEGATIVE_INFINITY;
      line0.toSubSpace(vector3D0);
      line2.toSubSpace(vector3D3);
      Line line3 = new Line(line2);
      line3.intersection(line2);
      line2.distance(line1);
      Vector3D vector3D7 = Vector3D.MINUS_I;
      Line line4 = new Line(vector3D4, vector3D7);
      line2.distance(line4);
      line2.isSimilarTo(line4);
      Vector3D vector3D8 = Vector3D.PLUS_K;
      Line line5 = null;
      try {
        line5 = new Line(vector3D8, vector3D8);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0, 3.141592653489793);
      Vector3D vector3D1 = new Vector3D(2649658.678480627, 1.0, (-1470.93413));
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D1, vector3D0);
      Vector3D vector3D2 = new Vector3D(1.0, (-533.7228732358));
      boolean boolean0 = line1.isSimilarTo(line0);
      assertTrue(boolean0);
      
      line0.toSubSpace(vector3D2);
      line1.toSubSpace(vector3D1);
      Vector3D vector3D3 = new Vector3D(1.0, 1.5, 1.0);
      Vector3D vector3D4 = new Vector3D(0.366272509098053, 2.0, 0.5);
      Line line2 = new Line(vector3D4, vector3D0);
      Line line3 = new Line(vector3D0, vector3D4);
      Vector3D vector3D5 = new Vector3D(3.141592653489793, vector3D2, (-1470.93413), vector3D4, 3.141592653489793, vector3D3);
      Vector3D vector3D6 = Vector3D.NEGATIVE_INFINITY;
      Line line4 = new Line(vector3D3, vector3D2);
      Line line5 = new Line(line4);
      Vector3D vector3D7 = new Vector3D((-533.7228732358), vector3D1);
      Line line6 = new Line(vector3D6, vector3D7);
      Vector3D vector3D8 = Vector3D.NaN;
      line6.toSubSpace(vector3D8);
      line4.toSubSpace(vector3D6);
      Line line7 = line1.revert();
      vector3D6.negate();
      Vector3D vector3D9 = line4.intersection(line2);
      assertNull(vector3D9);
      
      line3.toSubSpace(vector3D2);
      Vector1D vector1D0 = line7.toSubSpace(vector3D2);
      assertEquals(0.5077475302616375, vector1D0.getX(), 0.01);
      
      line0.revert();
      Vector3D vector3D10 = line0.closestPoint(line4);
      assertEquals(3.141283347136012, vector3D10.getNormInf(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      boolean boolean0 = line0.isSimilarTo(line0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0, 1.0);
      Vector3D vector3D1 = new Vector3D(1.0, 1.0, 0.26051153111544323);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D1, vector3D0);
      line0.isSimilarTo(line1);
      Line line2 = null;
      try {
        line2 = new Line(vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      double double0 = line0.distance(line0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_I;
      Vector3D vector3D1 = Vector3D.MINUS_I;
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      double double0 = line1.distance(line0);
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0, 1.0);
      Vector3D vector3D1 = new Vector3D(1.5, 1.0, 1.0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D0, vector3D1);
      line1.toSubSpace(vector3D0);
      line1.toSubSpace(vector3D1);
      Vector3D vector3D2 = new Vector3D(2.0, 0.0, 0.0);
      Vector3D vector3D3 = new Vector3D(2.0, 0.5, 0.5);
      Line line2 = new Line(vector3D2, vector3D0);
      Line line3 = new Line(vector3D3, vector3D2);
      Vector3D vector3D4 = Vector3D.MINUS_J;
      Vector3D vector3D5 = new Vector3D(3791.7818, vector3D1, 582.8294, vector3D1, 0.5, vector3D4, 1.5, vector3D0);
      line3.toSubSpace(vector3D5);
      line2.toSubSpace(vector3D5);
      Vector3D vector3D6 = line1.intersection(line2);
      assertNotNull(vector3D6);
      
      line1.toSubSpace(vector3D5);
      line1.toSubSpace(vector3D0);
      Vector3D vector3D7 = line0.intersection(line3);
      line3.toSubSpace(vector3D0);
      Vector1D vector1D0 = line2.toSubSpace(vector3D7);
      assertEquals(1.2819751242557095E-16, vector1D0.getX(), 0.01);
      
      boolean boolean0 = line0.isSimilarTo(line1);
      assertTrue(boolean0);
      
      line2.getDirection();
      Vector3D vector3D8 = Vector3D.MINUS_K;
      line0.contains(vector3D8);
      assertTrue(vector3D0.equals((Object)vector3D6));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = line0.revert();
      line0.closestPoint(line0);
      assertNotSame(line0, line1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      boolean boolean0 = line0.isSimilarTo(line1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void testIntersectionOutsideOutsidetestIntersectionOutsideOutside_09()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.570796326794897, 1.0, 1.0);
      Vector3D vector3D1 = new Vector3D(1.5, 1.0, 1.0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D0, vector3D1);
      line1.toSubSpace(vector3D0);
      line1.toSubSpace(vector3D1);
      Vector3D vector3D2 = new Vector3D(2.0, 0.0, 0.0);
      Vector3D vector3D3 = new Vector3D(2.0, 0.5, 0.5);
      Line line2 = new Line(vector3D2, vector3D3);
      Line line3 = new Line(vector3D2, vector3D3);
      line3.toSubSpace(vector3D2);
      Vector1D vector1D0 = Vector1D.NEGATIVE_INFINITY;
      Vector3D vector3D4 = line0.intersection(line2);
      assertNotNull(vector3D4);
      
      line0.toSubSpace(vector3D4);
      line2.toSubSpace(vector3D4);
      Vector3D vector3D5 = line0.intersection(line2);
      line0.toSubSpace(vector3D5);
      Vector1D vector1D1 = line2.toSubSpace(vector3D5);
      assertEquals(1.414213562373095, vector1D1.getX(), 0.01);
      assertEquals(5.999999999999999, vector3D5.getNormSq(), 0.01);
      
      Vector3D vector3D6 = line1.getOrigin();
      assertEquals(1.5707963267948968, vector3D6.getAlpha(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_K;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(line0);
      Vector3D vector3D2 = line1.closestPoint(line0);
      assertEquals(0.0, vector3D2.getNormInf(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0, 1.0);
      Vector3D vector3D1 = new Vector3D(1.5, 1.0, 1.0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D0, vector3D1);
      line1.toSubSpace(vector3D0);
      line1.toSubSpace(vector3D1);
      Vector3D vector3D2 = new Vector3D(4.440892098500626E-16, 48.0, 4.440892098500626E-16);
      Vector3D vector3D3 = new Vector3D(0.0, 48.0, 903.4709093224122);
      Vector3D vector3D4 = Vector3D.PLUS_I;
      Line line2 = new Line(vector3D0, vector3D4);
      Line line3 = new Line(vector3D1, vector3D0);
      line1.toSubSpace(vector3D1);
      line1.toSubSpace(vector3D4);
      Vector3D vector3D5 = line2.intersection(line0);
      assertNotNull(vector3D5);
      
      line1.toSubSpace(vector3D4);
      Vector1D vector1D0 = line3.toSubSpace(vector3D5);
      assertEquals((-1.0), vector1D0.getX(), 0.01);
      
      Vector3D vector3D6 = line0.intersection(line1);
      assertNotNull(vector3D6);
      
      line0.toSubSpace(vector3D4);
      Vector1D vector1D1 = line3.toSubSpace(vector3D0);
      assertTrue(vector1D1.equals((Object)vector1D0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Line line1 = new Line(vector3D0, vector3D0);
      line0.toSubSpace(vector3D0);
      Vector3D vector3D1 = line0.intersection(line1);
      assertNull(vector3D1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.wholeLine();
      boolean boolean0 = line0.isSimilarTo(line0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Line line0 = null;
      try {
        line0 = new Line((Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Vector3D vector3D0 = new Vector3D(1.0, 1.0, 1.0);
      double double0 = 1.5;
      Vector3D vector3D1 = new Vector3D(1.5, 1.0, 1.0);
      Line line0 = new Line(vector3D0, vector3D1);
      Line line1 = new Line(vector3D0, vector3D1);
      Vector1D vector1D0 = line1.toSubSpace(vector3D0);
      line1.toSubSpace(vector3D1);
      Vector3D vector3D2 = new Vector3D(2.0, 0.0, 0.0);
      Vector3D vector3D3 = new Vector3D(1.0, 1122.9065551464735, 1180.4);
      Line line2 = new Line(vector3D2, vector3D1);
      Line line3 = new Line(vector3D0, vector3D3);
      line1.toSpace(vector1D0);
      line0.toSubSpace(vector3D3);
      line2.toSubSpace(vector3D0);
      line2.intersection(line1);
      line0.toSubSpace(vector3D2);
      line0.toSubSpace(vector3D0);
      // Undeclared exception!
      try { 
        line3.intersection((Line) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector1D vector1D0 = Vector1D.ONE;
      line0.toSpace(vector1D0);
      Vector3D vector3D1 = line0.closestPoint(line0);
      assertEquals(Double.NaN, vector3D1.getNorm(), 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Line line0 = null;
      try {
        line0 = new Line(vector3D0, vector3D0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // zero norm
         //
         verifyException("org.apache.commons.math3.geometry.euclidean.threed.Line", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.ZERO;
      Line line0 = new Line(vector3D1, vector3D0);
      Line line1 = new Line(line0);
      Vector3D vector3D2 = line1.intersection(line0);
      assertNotNull(vector3D2);
      
      Vector3D vector3D3 = line0.closestPoint(line1);
      assertEquals(0.0, vector3D3.getAlpha(), 0.01);
      assertSame(vector3D3, vector3D2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      line0.toSubSpace(vector3D0);
      Vector3D vector3D1 = line0.closestPoint(line0);
      assertEquals(Double.NaN, vector3D1.getNorm1(), 0.01);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      boolean boolean0 = line0.contains(vector3D0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.PLUS_J;
      Vector3D vector3D1 = Vector3D.crossProduct(vector3D0, vector3D0);
      Line line0 = new Line(vector3D1, vector3D0);
      boolean boolean0 = line0.contains(vector3D0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.NaN;
      Line line0 = new Line(vector3D0, vector3D0);
      double double0 = line0.getAbscissa(vector3D0);
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Vector3D vector3D0 = Vector3D.POSITIVE_INFINITY;
      Line line0 = new Line(vector3D0, vector3D0);
      Vector3D vector3D1 = line0.closestPoint(line0);
      assertNotSame(vector3D0, vector3D1);
  }
}