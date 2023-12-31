/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 17 09:00:02 GMT 2023
 */

package org.apache.commons.math.complex;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.apache.commons.math.complex.Complex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Complex_ESTest extends Complex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.divide(complex0);
      String string0 = complex2.toString();
      assertEquals("(1.0, 0.0)", string0);
      
      Complex complex3 = complex2.divide(complex0);
      complex0.abs();
      complex1.abs();
      Complex complex4 = complex0.log();
      assertEquals(0.0, complex4.getReal(), 0.01);
      
      Complex complex5 = complex0.divide(complex3);
      Complex complex6 = complex1.sin();
      assertEquals(0.0, complex6.getReal(), 0.01);
      
      Complex complex7 = complex3.tanh();
      assertEquals((-1.557407724654902), complex7.getImaginary(), 0.01);
      assertEquals(0.0, complex7.getReal(), 0.01);
      
      List<Complex> list0 = complex5.nthRoot(358);
      assertFalse(list0.contains(complex5));
      
      Complex complex8 = Complex.ONE;
      List<Complex> list1 = complex3.nthRoot(339);
      assertFalse(list1.contains(complex2));
      assertEquals(339, list1.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.createComplex(3148.9061382, Double.POSITIVE_INFINITY);
      Complex complex3 = Complex.ONE;
      Complex complex4 = complex1.acos();
      assertEquals(-0.0, complex4.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex4.getReal(), 0.01);
      
      Complex complex5 = complex2.sin();
      Complex complex6 = complex3.multiply((-764.0));
      assertEquals((-764.0), complex6.getReal(), 0.01);
      assertEquals(-0.0, complex6.getImaginary(), 0.01);
      
      Complex complex7 = complex3.multiply(complex2);
      assertTrue(complex7.equals((Object)complex5));
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      complex1.sqrt();
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex1.sqrt();
      Complex complex4 = Complex.ONE;
      Complex complex5 = complex3.createComplex(Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      Complex complex6 = new Complex(1.0, Double.POSITIVE_INFINITY);
      Complex complex7 = complex6.multiply(Double.POSITIVE_INFINITY);
      assertTrue(complex7.equals((Object)complex5));
      assertTrue(complex6.isInfinite());
      
      Complex complex8 = complex3.multiply(complex1);
      assertNotSame(complex8, complex7);
      assertFalse(complex3.isInfinite());
      assertEquals(Double.NaN, complex8.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex3.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = new Complex(0, (-1423.822279168844));
      Complex complex1 = complex0.sqrt();
      Complex complex2 = Complex.I;
      Complex complex3 = complex2.pow(complex0);
      complex3.nthRoot(250);
      complex1.getField();
      Complex complex4 = complex3.add(complex1);
      complex3.nthRoot(2576);
      Complex complex5 = Complex.ZERO;
      List<Complex> list0 = complex5.nthRoot(17);
      assertEquals(17, list0.size());
      
      complex4.asin();
      assertEquals((-26.68166298386257), complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex4.getReal(), 0.01);
      
      Complex complex6 = new Complex((-1284.414), 2097);
      Complex complex7 = new Complex((-1404.575592557647), (-2549.813139227137));
      Complex complex8 = Complex.NaN;
      assertSame(complex8, complex9);
      
      Complex complex10 = Complex.I;
      complex10.getField();
      Complex complex11 = Complex.INF;
      Complex complex12 = Complex.I;
      Complex complex13 = complex12.sqrt();
      Complex complex14 = new Complex(1.2675934823758863E-8, (-1025.055502));
      Complex complex15 = complex5.sqrt();
      assertTrue(complex15.equals((Object)complex5));
      
      Complex complex16 = complex13.multiply((-2549.813139227137));
      assertEquals((-1802.9901615060671), complex16.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      Complex complex1 = complex0.asin();
      assertEquals((-1.2246467991473532E-16), complex1.getReal(), 0.01);
      assertEquals((-1.2246467991473532E-16), complex0.getReal(), 0.01);
      
      Complex complex2 = Complex.INF;
      Complex complex3 = Complex.I;
      Complex complex4 = complex3.multiply(Double.NaN);
      assertEquals(Double.NaN, complex4.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.equals(complex0);
      try { 
        complex0.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = complex2.sin();
      Complex complex4 = Complex.I;
      complex0.getField();
      Complex complex5 = Complex.INF;
      Complex complex6 = complex2.sqrt();
      assertEquals(Double.NEGATIVE_INFINITY, complex6.getImaginary(), 0.01);
      assertFalse(complex6.equals((Object)complex2));
      
      Complex complex7 = (Complex)complex0.readResolve();
      assertEquals(0.0, complex7.getImaginary(), 0.01);
      
      Complex complex8 = Complex.NaN;
      complex1.equals(complex8);
      double double0 = complex3.abs();
      assertTrue(complex3.equals((Object)complex6));
      assertFalse(complex3.isInfinite());
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.multiply(0.5223207255798706);
      Complex complex3 = complex0.multiply(complex2);
      assertSame(complex3, complex1);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), 2421.07);
      Complex complex1 = new Complex(2206.7117807828645, 6.283185307179586);
      List<Complex> list0 = complex1.nthRoot(242);
      assertEquals(242, list0.size());
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = Complex.INF;
      String string0 = complex3.toString();
      assertEquals("(Infinity, Infinity)", string0);
      
      Complex complex4 = Complex.INF;
      Complex complex5 = complex4.sin();
      Complex complex6 = complex1.sinh();
      Complex complex7 = Complex.INF;
      Complex complex8 = complex6.atan();
      assertTrue(complex8.equals((Object)complex5));
      
      Complex complex9 = complex1.sqrt();
      assertEquals(0.06687697578186207, complex9.getImaginary(), 0.01);
      
      boolean boolean0 = complex3.equals(complex6);
      assertFalse(boolean0);
      assertEquals(Double.POSITIVE_INFINITY, complex6.getReal(), 0.01);
      assertTrue(complex6.isInfinite());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt();
      complex0.readResolve();
      complex1.readResolve();
      Complex complex2 = (Complex)complex1.readResolve();
      boolean boolean0 = complex0.equals(complex2);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(boolean0);
      
      Complex complex3 = new Complex(301, 301);
      double double0 = complex1.abs();
      assertEquals(1.0, double0, 0.01);
      assertFalse(complex0.equals((Object)complex3));
      assertTrue(complex0.equals((Object)complex1));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      Complex complex1 = complex0.asin();
      complex1.equals(complex0);
      try { 
        complex0.nthRoot((-3221));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -3,221
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.createComplex(1.0000000000000002, Double.POSITIVE_INFINITY);
      Complex complex3 = complex2.multiply(complex0);
      assertTrue(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertEquals(1.0000000000000002, complex2.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.tan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.multiply((-2896.441));
      assertEquals((-2896.441), complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.NaN.tanh();
      // Undeclared exception!
      complex0.nthRoot(833221300);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.sin();
      Complex complex1 = complex0.sqrt();
      Object object0 = new Object();
      complex0.equals(object0);
      int int0 = 0;
      try { 
        complex1.nthRoot(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: 0
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      complex0.NaN.negate();
      try { 
        complex0.nthRoot((-2975));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,975
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.acos();
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.divide(complex1);
      assertTrue(complex2.isNaN());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.cos();
      try { 
        complex0.nthRoot((-397));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -397
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.multiply(0.9999999999999999);
      Complex complex2 = complex0.divide(complex0);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sinh();
      List<Complex> list0 = complex0.nthRoot(1513);
      assertSame(complex0, complex1);
      assertTrue(list0.contains(complex1));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      Complex complex1 = complex0.NaN.exp();
      Complex complex2 = complex1.NaN.sin();
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.asin();
      assertEquals((-2.2204460492503128E-16), complex3.getImaginary(), 0.01);
      assertEquals((-1.2246467991473532E-16), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.NaN.sqrt1z();
      Complex complex3 = complex0.divide(complex1);
      assertSame(complex3, complex2);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.I.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.acos();
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.INF.sin();
      assertFalse(complex2.isInfinite());
      
      double double0 = complex1.abs();
      assertNotSame(complex1, complex2);
      assertTrue(complex1.equals((Object)complex2));
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.atan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      
      double double0 = complex0.abs();
      assertEquals(1.0, complex0.getReal(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex0.getReal(), 0.01);
      assertTrue(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = complex0.divide(complex0);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertSame(complex2, complex1);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.hashCode();
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.asin();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.divide(complex0);
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertTrue(complex2.equals((Object)complex0));
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.I;
      try { 
        complex0.nthRoot((-519));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -519
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.INF.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex0.acos();
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      assertEquals(0.0, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = new Complex((-0.5411961001461971), (-0.5411961001461971));
      assertFalse(complex0.isInfinite());
      assertEquals((-0.5411961001461971), complex0.getImaginary(), 0.01);
      
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.sqrt();
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      
      Complex complex3 = complex1.multiply((-0.5411961001461971));
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex(1.2246467991473532E-16, 1.3065629648763764);
      Complex complex2 = new Complex(1.2246467991473532E-16, (-0.541196100146197));
      Complex complex3 = complex2.add(complex1);
      Complex complex4 = complex0.add(complex2);
      Complex complex5 = complex4.subtract(complex3);
      assertEquals((-1.8477590650225735), complex5.getImaginary(), 0.01);
      assertEquals((-2.4492935982947064E-16), complex5.getReal(), 0.01);
      
      complex2.isNaN();
      double double0 = complex3.getArgument();
      assertEquals(1.5707963267948963, double0, 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.ZERO.tan();
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getReal(), 0.01);
      
      Complex complex3 = complex0.divide(complex1);
      assertTrue(complex0.equals((Object)complex2));
      assertSame(complex3, complex1);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.I.conjugate();
      Complex complex1 = complex0.acos();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(150);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(1);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.I.cosh();
      Complex complex1 = Complex.ONE;
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.conjugate();
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex0.divide(complex2);
      assertSame(complex3, complex1);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.ZERO.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      
      Complex complex2 = complex0.divide(complex0);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex(1.2246467991473532E-16, 1.3065629648763764);
      Complex complex2 = new Complex(1.2246467991473532E-16, (-0.541196100146197));
      Complex complex3 = complex2.add(complex1);
      Complex complex4 = complex0.add(complex2);
      Complex complex5 = complex4.subtract(complex3);
      assertEquals((-2.4492935982947064E-16), complex5.getReal(), 0.01);
      assertEquals((-1.8477590650225735), complex5.getImaginary(), 0.01);
      
      boolean boolean0 = complex4.equals(complex0);
      assertFalse(boolean0);
      
      double double0 = complex3.getArgument();
      assertEquals(1.5707963267948963, double0, 0.01);
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      List<Complex> list0 = complex0.nthRoot(119);
      assertTrue(list0.contains(complex0));
      assertEquals(119, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = new Complex((-34.45927900207522), (-34.45927900207522));
      Complex complex1 = Complex.INF;
      complex1.getField();
      Complex complex2 = complex1.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      assertFalse(complex2.isInfinite());
      
      Complex complex3 = (Complex)complex1.readResolve();
      assertTrue(complex3.isInfinite());
      
      boolean boolean0 = complex1.equals(complex0);
      assertFalse(complex0.isInfinite());
      assertTrue(complex1.equals((Object)complex3));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      String string0 = complex0.NaN.toString();
      assertEquals("(NaN, NaN)", string0);
      
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex(1.2246467991473532E-16, 1.3065629648763764);
      Complex complex3 = new Complex((-1636.20325059), (-1.414213562373095));
      Complex complex4 = complex2.add(complex0);
      Complex complex5 = complex4.add(complex0);
      Complex complex6 = complex1.subtract(complex5);
      complex0.subtract(complex5);
      Complex complex7 = complex6.multiply((-12.9593152353742));
      assertEquals(18.327239364934467, complex7.getReal(), 0.01);
      assertEquals(33.86432267339622, complex7.getImaginary(), 0.01);
      assertFalse(complex7.isInfinite());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply(1.4997597826618576E-32);
      assertEquals(1.4997597826618576E-32, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.ONE.readResolve();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.ZERO.tanh();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex0.divide(complex1);
      assertTrue(complex1.equals((Object)complex2));
      assertEquals(Double.NaN, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      Complex complex2 = complex1.sqrt();
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex2.getImaginary(), 0.01);
      
      Complex complex3 = complex1.ONE.tan();
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertEquals(1.557407724654902, complex3.getReal(), 0.01);
      assertFalse(complex3.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.I.exp();
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      
      String string0 = complex0.ZERO.toString();
      assertFalse(complex0.equals((Object)complex1));
      assertEquals("(0.0, 0.0)", string0);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex((-947.7), (-0.5411961001461971));
      Complex complex3 = new Complex((-1.2246467991473532E-16), (-4113.55993));
      Complex complex4 = complex2.add(complex3);
      Complex complex5 = complex3.NaN.exp();
      assertEquals(Double.NaN, complex5.getImaginary(), 0.01);
      
      Complex complex6 = complex0.add(complex4);
      complex2.subtract(complex3);
      Complex complex7 = complex2.subtract(complex1);
      assertEquals(0.7653668647301792, complex7.getImaginary(), 0.01);
      assertEquals((-946.2857864376269), complex7.getReal(), 0.01);
      
      Complex complex8 = complex3.divide(complex6);
      assertEquals(0.2186633173757612, complex8.getImaginary(), 0.01);
      assertEquals(0.9493735781228467, complex8.getReal(), 0.01);
      assertFalse(complex8.isInfinite());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.divide(complex0);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.tan();
      Complex complex2 = complex1.pow(complex0);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.acos();
      assertEquals(1.5707963267948966, complex3.getReal(), 0.01);
      assertEquals((-0.8813735870195429), complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.NaN.subtract(complex1);
      Complex complex3 = Complex.ZERO;
      Complex complex4 = complex3.I.sin();
      assertEquals(1.1752011936438014, complex4.getImaginary(), 0.01);
      assertFalse(complex4.isInfinite());
      assertEquals(0.0, complex4.getReal(), 0.01);
      
      Complex complex5 = complex0.divide(complex3);
      assertSame(complex5, complex2);
      assertFalse(complex5.equals((Object)complex4));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.INF.sqrt();
      Complex complex2 = complex0.divide(complex0);
      Complex complex3 = complex1.divide(complex0);
      assertFalse(complex1.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sinh();
      assertEquals(0.8414709848078965, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.acos();
      assertEquals((-0.8813735870195429), complex2.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ZERO.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex((-1.2246467991473532E-16), 1.3065629648763764);
      Complex complex3 = new Complex((-0.5411961001461971), (-1605.5395));
      Complex complex4 = complex1.ONE.asin();
      assertEquals(-0.0, complex4.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex4.getReal(), 0.01);
      
      Complex complex5 = Complex.ZERO;
      Complex complex6 = complex1.add(complex5);
      Complex complex7 = complex2.add(complex6);
      Complex complex8 = complex1.subtract(complex7);
      complex8.NaN.hashCode();
      assertEquals(2.220446049250313E-16, complex8.getReal(), 0.01);
      
      Complex complex9 = complex0.subtract(complex1);
      assertEquals(0.7653668647301792, complex9.getImaginary(), 0.01);
      
      complex1.getField();
      Complex complex10 = complex1.sqrt();
      assertEquals(0.505554783079548, complex10.getReal(), 0.01);
      assertEquals((-1.2922071045570458), complex10.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test67()  throws Throwable  {
      Complex complex0 = new Complex((-0.5), (-0.5));
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.sqrt();
      assertEquals((-0.5), complex0.getImaginary(), 0.01);
      assertEquals((-0.7768869870150187), complex2.getImaginary(), 0.01);
      assertEquals(0.3217971264527913, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test68()  throws Throwable  {
      Complex complex0 = Complex.I;
      double double0 = complex0.abs();
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test69()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.acos();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test70()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.I.getField();
      Complex complex1 = complex0.acos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test71()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.hashCode();
      try { 
        complex0.nthRoot((-2843));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,843
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test72()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
  }
}
