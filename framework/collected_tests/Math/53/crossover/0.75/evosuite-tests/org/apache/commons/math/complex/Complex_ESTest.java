/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 17 08:35:45 GMT 2023
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
      Complex complex1 = complex0.multiply(Double.NaN);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-1761.743604));
      Complex complex2 = complex0.divide(complex1);
      assertEquals((-5.676194865867666E-4), complex2.getReal(), 0.01);
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-1761.743604));
      Complex complex2 = complex1.sqrt();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-1761.743604), complex1.getImaginary(), 0.01);
      assertEquals((-29.679484530564206), complex2.getImaginary(), 0.01);
      assertEquals(29.679484530564206, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-2799.2954168));
      complex0.abs();
      complex1.multiply(Double.POSITIVE_INFINITY);
      complex1.nthRoot(982);
      Complex complex2 = Complex.I;
      Complex complex3 = complex2.asin();
      Complex complex4 = Complex.ONE;
      Complex complex5 = Complex.ZERO;
      Complex complex6 = complex1.divide(complex4);
      Complex complex7 = complex3.sqrt();
      Complex complex8 = new Complex(2283.1423345, 982);
      complex8.multiply((-2799.2954168));
      complex6.multiply(Double.POSITIVE_INFINITY);
      complex0.abs();
      complex7.multiply((-407.1407485));
      Complex complex9 = new Complex(982, Double.POSITIVE_INFINITY);
      complex9.acos();
      Complex complex10 = Complex.NaN;
      complex4.sqrt1z();
      try { 
        complex8.nthRoot((-740));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -740
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(577.588301175192);
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.tanh();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.acos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.multiply(5.1);
      assertFalse(complex2.isInfinite());
      assertEquals(5.1, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.cos();
      complex1.cos();
      List<Complex> list0 = complex0.nthRoot(615);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex1));
      assertSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.NaN.atan();
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
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.INF;
      complex0.ONE.pow(complex1);
      try { 
        complex0.nthRoot((-76));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -76
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.ONE.exp();
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      
      Complex complex2 = complex1.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(2.718281828459045, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.I.cos();
      assertTrue(complex1.isNaN());
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
      
      Complex complex3 = Complex.I;
      Object object0 = new Object();
      boolean boolean0 = complex3.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-372.484192889954), Double.POSITIVE_INFINITY);
      Complex complex2 = new Complex((-1500.324693229), 2.0);
      Complex complex3 = new Complex(635.85, (-7.58155));
      Complex complex4 = complex2.pow(complex1);
      assertTrue(complex4.isNaN());
      
      Complex complex5 = new Complex(2857.39009747715, (-1291.0));
      Complex complex6 = Complex.INF;
      Complex complex7 = Complex.INF;
      Complex complex8 = complex5.log();
      complex6.negate();
      Complex complex9 = Complex.I;
      Complex complex10 = complex9.multiply((-66.39046459435569));
      String string0 = complex8.toString();
      assertEquals("(8.050543875014101, -0.42435885353459535)", string0);
      
      Complex complex11 = complex10.acos();
      assertEquals(-0.0, complex10.getReal(), 0.01);
      assertEquals(4.88875733540183, complex11.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Complex complex0 = new Complex(11044.288915697893, Double.POSITIVE_INFINITY);
      assertTrue(complex0.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(11044.288915697893, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply((-1.732050807568877));
      assertTrue(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(46);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), 1.5164629308487783);
      Complex complex1 = Complex.INF;
      Complex complex2 = Complex.INF;
      Complex complex3 = complex1.add(complex0);
      Complex complex4 = complex0.add(complex1);
      Complex complex5 = Complex.I;
      Complex complex6 = complex0.subtract(complex1);
      assertEquals(Double.NEGATIVE_INFINITY, complex6.getImaginary(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex6.getReal(), 0.01);
      
      Complex complex7 = Complex.ONE;
      Complex complex8 = complex5.multiply(1.5164629308487783);
      assertFalse(complex8.equals((Object)complex0));
      assertEquals(1.5164629308487783, complex8.getImaginary(), 0.01);
      assertEquals(0.0, complex8.getReal(), 0.01);
      assertFalse(complex8.equals((Object)complex5));
      
      boolean boolean0 = complex1.equals(complex3);
      assertTrue(complex1.equals((Object)complex4));
      assertFalse(complex0.isInfinite());
      assertTrue(complex3.isInfinite());
      assertFalse(complex0.equals((Object)complex8));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.ZERO.divide(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      
      Complex complex3 = complex0.NaN.tan();
      List<Complex> list0 = complex0.nthRoot(1716);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
      
      List<Complex> list1 = complex2.nthRoot(1);
      assertSame(complex2, complex3);
      assertTrue(list1.contains(complex2));
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = Complex.NaN;
      Complex complex3 = complex1.divide(complex2);
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      complex0.NaN.conjugate();
      try { 
        complex0.nthRoot((-843));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -843
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(207);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = new Complex((-1789.29444454), (-1789.29444454));
      Complex complex1 = new Complex((-1789.29444454), (-1789.29444454));
      Complex complex2 = Complex.ZERO;
      complex2.NaN.hashCode();
      try { 
        complex2.nthRoot((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -1
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.sqrt();
      complex0.NaN.negate();
      try { 
        complex0.nthRoot((-479));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -479
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.acos();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = new Complex(1.0, 2.0296354527386606);
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.pow(complex1);
      assertSame(complex2, complex1);
      
      complex0.getField();
      assertFalse(complex0.isInfinite());
      assertEquals(2.0296354527386606, complex0.getImaginary(), 0.01);
      assertFalse(complex0.isNaN());
      assertEquals(1.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.exp();
      int int0 = (-2565);
      try { 
        complex0.nthRoot((-2565));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,565
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.nthRoot((-4571));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -4,571
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.atan();
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      List<Complex> list0 = complex0.nthRoot(1721);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1721, list0.size());
      assertFalse(list0.contains(complex1));
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      double double0 = complex0.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      complex1.hashCode();
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.ONE.cosh();
      try { 
        complex0.nthRoot((-2367));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,367
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.sqrt();
      assertTrue(complex2.equals((Object)complex0));
      assertFalse(complex2.equals((Object)complex1));
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex1 = new Complex(1.2246467991473532E-16, 1.3065629648763764);
      complex1.I.getField();
      Complex complex2 = complex0.subtract(complex1);
      complex2.getArgument();
      Complex complex3 = complex2.subtract(complex1);
      complex1.getArgument();
      Complex complex4 = complex0.divide(complex3);
      assertEquals(0.4101207282703284, complex4.getReal(), 0.01);
      assertFalse(complex4.isInfinite());
      assertEquals((-0.2128269076114514), complex4.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(complex1.equals((Object)complex0));
      
      Complex complex2 = Complex.I;
      Complex complex3 = complex0.divide(complex2);
      assertTrue(complex3.equals((Object)complex1));
      assertNotSame(complex3, complex0);
      assertFalse(complex3.isInfinite());
      assertTrue(complex0.equals((Object)complex1));
      assertEquals(0.0, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.INF;
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = (Complex)complex0.ONE.readResolve();
      assertEquals(1.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.sqrt();
      assertFalse(complex2.isInfinite());
      assertEquals(0.7071067811865475, complex2.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      complex0.ZERO.conjugate();
      try { 
        complex0.nthRoot((-75));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -75
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.NaN.sinh();
      Complex complex2 = complex0.multiply(264.3269892295);
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      
      double double0 = complex1.abs();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(complex0.equals((Object)complex2));
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.NaN.cosh();
      Complex complex2 = Complex.INF;
      Complex complex3 = Complex.INF;
      Complex complex4 = complex3.divide(complex2);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getImaginary(), 0.01);
      assertFalse(complex4.isInfinite());
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
      assertTrue(complex4.equals((Object)complex1));
      assertNotSame(complex4, complex1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.sin();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = complex0.sqrt();
      assertFalse(complex2.isInfinite());
      assertEquals(0.7071067811865475, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = new Complex((-1789.29444454), (-0.16624882440418567));
      Complex complex1 = Complex.I;
      Complex complex2 = complex0.add(complex1);
      assertFalse(complex2.isInfinite());
      assertEquals((-1789.29444454), complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex0));
      assertEquals((-1789.29444454), complex0.getReal(), 0.01);
      assertEquals(0.8337511755958144, complex2.getImaginary(), 0.01);
      
      Complex complex3 = Complex.INF;
      Complex complex4 = complex3.multiply(0.7850550008644321);
      boolean boolean0 = complex3.equals(complex4);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = complex1.INF.tan();
      assertTrue(complex2.isNaN());
      assertEquals(Double.NaN, complex2.getReal(), 0.01);
      
      Complex complex3 = new Complex((-1.2246467991473532E-16), (-879.299));
      Complex complex4 = new Complex(0.99, 0.5411961001461969);
      Complex complex5 = complex0.add(complex1);
      Complex complex6 = complex5.add(complex3);
      assertEquals((-1.4142135623730954), complex6.getReal(), 0.01);
      assertEquals((-881.1467590650226), complex6.getImaginary(), 0.01);
      
      Complex complex7 = Complex.INF;
      Complex complex8 = complex4.ONE.sqrt1z();
      assertEquals(0.0, complex8.getReal(), 0.01);
      assertEquals(0.0, complex8.getImaginary(), 0.01);
      
      complex0.subtract(complex7);
      Complex complex9 = complex4.subtract(complex1);
      assertEquals(2.404213562373095, complex9.getReal(), 0.01);
      assertFalse(complex9.isInfinite());
      assertEquals(1.8477590650225733, complex9.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.tan();
      assertFalse(complex1.isInfinite());
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
      
      Complex complex2 = Complex.ZERO;
      Complex complex3 = complex0.divide(complex2);
      assertTrue(complex3.equals((Object)complex1));
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertNotSame(complex3, complex1);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex((-1.2246467991473532E-16), 1.3065629648763764);
      Complex complex3 = new Complex(1.414213562373095, (-1.414213562373095));
      complex0.add(complex2);
      Complex complex4 = complex1.add(complex3);
      Complex complex5 = Complex.ZERO;
      Complex complex6 = complex3.subtract(complex5);
      Complex complex7 = complex0.subtract(complex4);
      boolean boolean0 = complex4.equals(complex7);
      assertFalse(complex3.isInfinite());
      assertFalse(boolean0);
      assertTrue(complex3.equals((Object)complex6));
      assertEquals(2.179580427103274, complex7.getImaginary(), 0.01);
      assertEquals((-1.2246467991473532E-16), complex7.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = new Complex((-1789.29444454), (-1789.29444454));
      Complex complex1 = complex0.add(complex0);
      Complex complex2 = Complex.INF;
      Complex complex3 = complex1.multiply((-1789.29444454));
      assertEquals(6403149.218523415, complex3.getReal(), 0.01);
      assertEquals((-3578.58888908), complex1.getReal(), 0.01);
      assertEquals((-3578.58888908), complex1.getImaginary(), 0.01);
      assertEquals(6403149.218523415, complex3.getImaginary(), 0.01);
      
      boolean boolean0 = complex2.equals(complex0);
      assertFalse(complex0.isInfinite());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.cos();
      Complex complex2 = complex1.I.cos();
      complex0.equals(complex1);
      double double0 = complex2.abs();
      assertTrue(complex1.isNaN());
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex2.getReal(), 0.01);
      assertFalse(complex1.equals((Object)complex0));
      assertEquals(1.5430806348152437, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.I.atan();
      assertTrue(complex1.isNaN());
      
      double double0 = complex0.abs();
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.divide(complex0);
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      List<Complex> list0 = complex0.nthRoot(1138);
      assertEquals(0.0, complex0.getReal(), 0.01);
      assertEquals(1138, list0.size());
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-12.9593152353742));
      Complex complex2 = complex1.NaN.subtract(complex0);
      assertTrue(complex2.isNaN());
      
      double double0 = complex1.abs();
      assertEquals(12.9593152353742, double0, 0.01);
      assertEquals((-12.9593152353742), complex1.getImaginary(), 0.01);
      assertEquals(-0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex((-0.1666666567325592), Double.NaN);
      Complex complex3 = new Complex(1516.8328529, 1.414213562373095);
      Complex complex4 = Complex.INF;
      Complex complex5 = complex1.add(complex2);
      Complex complex6 = Complex.I;
      Complex complex7 = complex6.subtract(complex2);
      Complex complex8 = complex7.INF.multiply(complex1);
      assertEquals(Double.POSITIVE_INFINITY, complex8.getImaginary(), 0.01);
      
      complex5.subtract(complex7);
      assertEquals(Double.NaN, complex7.getReal(), 0.01);
      assertTrue(complex5.isNaN());
      assertEquals((-1.5808802191056541), complex5.getReal(), 0.01);
      
      String string0 = complex1.toString();
      assertEquals("(-1.414213562373095, -1.3065629648763764)", string0);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.INF.subtract(complex1);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.multiply(264.3269892295);
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertFalse(complex3.isNaN());
      assertEquals(0.0, complex3.getImaginary(), 0.01);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = Complex.ZERO;
      String string0 = complex1.toString();
      assertEquals("(0.0, 0.0)", string0);
      
      Complex complex2 = complex0.divide(complex1);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(Double.NaN, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.asin();
      Complex complex2 = complex1.NaN.divide(complex0);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex3.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex3.getImaginary(), 0.01);
      assertFalse(complex3.isNaN());
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.ONE.sinh();
      assertEquals(1.1752011936438014, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.sqrt();
      assertFalse(complex2.isInfinite());
      assertEquals(0.7071067811865475, complex2.getImaginary(), 0.01);
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertFalse(complex2.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.multiply(264.3269892295);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), 1.5164629308487783);
      Complex complex1 = Complex.INF;
      Complex complex2 = Complex.INF;
      Complex complex3 = complex1.add(complex0);
      Complex complex4 = complex0.add(complex1);
      Complex complex5 = Complex.I;
      Complex complex6 = complex0.subtract(complex1);
      assertTrue(complex6.isInfinite());
      assertEquals(Double.NEGATIVE_INFINITY, complex6.getReal(), 0.01);
      assertEquals(Double.NEGATIVE_INFINITY, complex6.getImaginary(), 0.01);
      
      Complex complex7 = Complex.ONE;
      Complex complex8 = complex5.multiply(1.5164629308487783);
      complex7.isNaN();
      double double0 = complex1.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertTrue(complex1.equals((Object)complex3));
      assertTrue(complex1.equals((Object)complex4));
      
      boolean boolean0 = complex8.equals(complex5);
      assertFalse(complex8.equals((Object)complex0));
      assertFalse(complex8.isInfinite());
      assertFalse(boolean0);
      assertEquals(0.0, complex8.getReal(), 0.01);
      assertEquals(1.5164629308487783, complex8.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = new Complex(0.761594155955765, 0.761594155955765);
      Complex complex1 = complex0.ONE.tanh();
      assertEquals(0.761594155955765, complex1.getReal(), 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.multiply(0.761594155955765);
      assertFalse(complex0.isInfinite());
      assertEquals(0.5800256583859741, complex2.getImaginary(), 0.01);
      assertEquals(0.5800256583859741, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.I;
      complex1.NaN.getField();
      double double0 = complex0.abs();
      assertEquals(0.0, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
      assertTrue(complex1.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex1.pow(complex0);
      assertTrue(complex2.isNaN());
      assertFalse(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      Complex complex0 = new Complex((-18.47931792080745), (-18.47931792080745));
      Complex complex1 = complex0.INF.sin();
      assertTrue(complex1.isNaN());
      
      Complex complex2 = complex0.multiply((-18.47931792080745));
      assertEquals((-18.47931792080745), complex0.getReal(), 0.01);
      assertEquals((-18.47931792080745), complex0.getImaginary(), 0.01);
      assertEquals(341.4851908182754, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(341.4851908182754, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test65()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.sqrt1z();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test66()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-1.2246467991473532E-16));
      Complex complex1 = complex0.INF.asin();
      assertTrue(complex1.isNaN());
      assertFalse(complex0.isNaN());
      assertFalse(complex0.isInfinite());
      assertEquals((-1.2246467991473532E-16), complex0.getReal(), 0.01);
  }
}