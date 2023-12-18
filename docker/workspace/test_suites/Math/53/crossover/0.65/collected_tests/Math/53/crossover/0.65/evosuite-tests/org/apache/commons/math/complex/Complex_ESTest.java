/*
 * This file was automatically generated by EvoSuite
 * Sun Dec 17 08:50:24 GMT 2023
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
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.createComplex((-569.12384), 1.7976931348623157E308);
      Complex complex2 = complex1.multiply(5.98642305066196);
      Complex complex3 = Complex.I;
      Complex complex4 = Complex.INF;
      Complex complex5 = complex0.atan();
      assertEquals(0.0, complex5.getImaginary(), 0.01);
      assertEquals(0.7853981633974483, complex5.getReal(), 0.01);
      
      complex3.getArgument();
      Complex complex6 = complex2.sqrt1z();
      complex4.abs();
      List<Complex> list0 = complex6.nthRoot(4828);
      assertEquals(Double.NEGATIVE_INFINITY, complex6.getImaginary(), 0.01);
      assertTrue(list0.contains(complex6));
      assertEquals((-3407.016074457249), complex2.getReal(), 0.01);
      assertTrue(complex2.isInfinite());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.multiply((-1.0));
      Complex complex2 = complex0.tan();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertEquals(0.761594155955765, complex2.getImaginary(), 0.01);
      
      complex1.hashCode();
      Complex complex3 = complex1.atan();
      Object object0 = complex3.readResolve();
      boolean boolean0 = complex1.equals(object0);
      assertFalse(boolean0);
      
      Complex complex4 = Complex.INF;
      assertTrue(complex4.equals((Object)object0));
      
      complex0.abs();
      Complex complex5 = complex1.sqrt();
      assertEquals(-0.0, complex1.getReal(), 0.01);
      assertEquals((-0.7071067811865475), complex5.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.ZERO;
      Complex complex2 = complex0.NaN.multiply(complex1);
      assertTrue(complex2.isNaN());
      
      Complex complex3 = complex0.multiply(Double.POSITIVE_INFINITY);
      assertEquals(Double.POSITIVE_INFINITY, complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
      
      Complex complex2 = complex1.pow(complex0);
      Complex complex3 = (Complex)complex2.readResolve();
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.9073831389134585, complex3.getReal(), 0.01);
      assertTrue(complex3.equals((Object)complex2));
      
      Complex complex4 = Complex.ZERO;
      Complex complex5 = complex4.I.acos();
      assertEquals((-0.8813735870195429), complex5.getImaginary(), 0.01);
      
      complex0.equals(complex4);
      assertFalse(complex4.equals((Object)complex5));
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Complex complex0 = new Complex(1542.153519921, 1542.153519921);
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.multiply(6.283185307179586);
      complex2.equals(complex1);
      assertEquals(52.657213891692976, complex2.getImaginary(), 0.01);
      assertEquals(4.934801870069444, complex2.getReal(), 0.01);
      
      Complex complex3 = complex0.multiply(Double.NaN);
      assertFalse(complex3.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.sqrt();
      Complex complex2 = complex1.sin();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex2.equals((Object)complex1));
      
      List<Complex> list0 = complex0.nthRoot(2069);
      assertTrue(list0.contains(complex0));
      assertEquals(2069, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.divide(complex1);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.cos();
      assertEquals(1.5430806348152437, complex3.getReal(), 0.01);
      assertEquals(-0.0, complex3.getImaginary(), 0.01);
      
      complex0.hashCode();
      List<Complex> list0 = complex0.nthRoot(164);
      assertEquals(164, list0.size());
      
      complex0.abs();
      Complex complex4 = complex0.sqrt();
      assertEquals(0.7071067811865475, complex4.getImaginary(), 0.01);
      assertFalse(complex4.isInfinite());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Complex complex0 = new Complex((-0.25), (-1.3065629648763764));
      complex0.hashCode();
      Complex complex1 = new Complex((-0.25), (-2624.0));
      Complex complex2 = complex0.subtract(complex1);
      Complex complex3 = new Complex((-2624.0), (-0.25));
      Complex complex4 = complex0.asin();
      Complex complex5 = complex0.add(complex3);
      complex5.multiply(complex1);
      Complex complex6 = complex2.atan();
      assertEquals((-1.5707963267948966), complex6.getReal(), 0.01);
      
      complex2.subtract(complex4);
      Complex complex7 = complex1.tanh();
      assertEquals((-0.8630444122548535), complex7.getImaginary(), 0.01);
      assertEquals((-0.4499380347799798), complex7.getReal(), 0.01);
      
      List<Complex> list0 = complex4.nthRoot(1476);
      assertEquals((-0.1514199562553869), complex4.getReal(), 0.01);
      assertEquals(1476, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.atan();
      double double0 = complex1.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.NaN.cos();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      complex0.I.hashCode();
      Complex complex2 = complex0.multiply((double) (-3247));
      assertFalse(complex2.isInfinite());
      assertFalse(complex2.equals((Object)complex1));
      assertEquals(-0.0, complex2.getImaginary(), 0.01);
      assertEquals((-3247.0), complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      List<Complex> list0 = complex0.nthRoot(984);
      assertTrue(list0.contains(complex0));
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Complex complex0 = Complex.INF;
      List<Complex> list0 = complex0.nthRoot(1045);
      assertEquals(1, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.NaN.negate();
      complex0.abs();
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
  public void test13()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex1.NaN.cosh();
      Complex complex3 = complex1.atan();
      assertSame(complex3, complex2);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      complex0.multiply(complex1);
      Complex complex2 = complex1.multiply(complex0);
      assertEquals(Double.POSITIVE_INFINITY, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      
      Complex complex2 = Complex.NaN;
      assertFalse(complex2.equals((Object)complex1));
      
      Complex complex3 = Complex.I;
      boolean boolean0 = complex0.equals(complex3);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      try { 
        complex0.nthRoot((-3261));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -3,261
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Complex complex0 = new Complex(1493.724049, 1.0);
      Complex complex1 = new Complex(2249.057710519082, 1493.724049);
      Complex complex2 = Complex.INF;
      double double0 = complex0.getArgument();
      assertEquals(6.694675976287867E-4, double0, 0.01);
      
      Complex complex3 = complex2.atan();
      Complex complex4 = complex3.I.divide(complex2);
      assertNotSame(complex4, complex3);
      assertTrue(complex3.isNaN());
      assertEquals(0.0, complex4.getImaginary(), 0.01);
      
      double double1 = complex1.abs();
      assertEquals(2699.902242638849, double1, 0.01);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.isNaN());
      
      double double0 = complex0.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.multiply((double) (-3247));
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertEquals((-3247.0), complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertFalse(complex1.isInfinite());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.multiply(2733.641278);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.INF.conjugate();
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertTrue(complex1.isInfinite());
      
      Complex complex2 = complex0.ZERO.sqrt();
      assertEquals(0.0, complex2.getReal(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(0.0, complex2.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      Complex complex2 = Complex.NaN;
      complex0.equals(complex2);
      assertFalse(complex2.equals((Object)complex0));
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.atan();
      complex1.NaN.conjugate();
      double double0 = complex1.abs();
      assertEquals(0.7853981633974483, double0, 0.01);
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.getArgument();
      complex0.atan();
      Complex complex1 = Complex.I;
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Complex complex0 = Complex.I;
      List<Complex> list0 = complex0.nthRoot(935);
      assertEquals(935, list0.size());
      assertEquals(0.0, complex0.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.hashCode();
      complex0.multiply((double) (-3247));
      try { 
        complex0.nthRoot((-3247));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -3,247
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.NaN.tanh();
      complex1.multiply(3386.01887523491);
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
  public void test28()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-0.5411961001461971), 39.805060291849536);
      Complex complex2 = new Complex(0.0, (-0.5411961001461971));
      Complex complex3 = complex0.cosh();
      Complex complex4 = complex2.add(complex0);
      Complex complex5 = complex3.add(complex1);
      assertEquals(0.3158970096867041, complex5.getReal(), 0.01);
      assertEquals(39.805060291849536, complex5.getImaginary(), 0.01);
      
      Complex complex6 = complex4.subtract(complex3);
      Complex complex7 = complex4.subtract(complex6);
      Complex complex8 = complex1.sinh();
      Complex complex9 = complex7.tanh();
      assertFalse(complex2.equals((Object)complex0));
      assertEquals(0.0, complex9.getImaginary(), 0.01);
      assertEquals((-0.8570931098329013), complex6.getReal(), 0.01);
      assertEquals(0.6947569362840059, complex9.getReal(), 0.01);
      
      boolean boolean0 = complex3.equals(complex8);
      assertEquals(0.9892679987266524, complex8.getImaginary(), 0.01);
      assertEquals(0.28966632409681375, complex8.getReal(), 0.01);
      assertEquals(8.57916286531791E-17, complex3.getImaginary(), 0.01);
      assertFalse(complex1.equals((Object)complex5));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cos();
      assertEquals(1.5430806348152437, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      
      complex0.hashCode();
      Object object0 = new Object();
      boolean boolean0 = complex0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.multiply(Double.NaN);
      assertTrue(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      double double0 = complex1.abs();
      assertEquals(Double.NaN, double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.asin();
      Complex complex2 = complex1.ZERO.pow(complex0);
      assertSame(complex2, complex1);
      
      Complex complex3 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex3);
      assertTrue(boolean0);
      assertFalse(complex3.isInfinite());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      complex1.equals(complex0);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      assertFalse(complex0.equals((Object)complex1));
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-2.4492935982947064E-16), (-1.2246467991473532E-16));
      String string0 = complex0.toString();
      assertEquals("(-1.2246467991473532E-16, -0.5411961001461971)", string0);
      
      Complex complex2 = new Complex((-4636.816268597477), (-1.414213562373095));
      Complex complex3 = new Complex((-1421.38076441), 0.75);
      Complex complex4 = complex2.add(complex3);
      Complex complex5 = complex1.add(complex4);
      complex1.subtract(complex4);
      Complex complex6 = complex2.subtract(complex5);
      assertEquals((-0.7499999999999999), complex6.getImaginary(), 0.01);
      
      Complex complex7 = Complex.ONE;
      Complex complex8 = complex7.ONE.sqrt1z();
      assertEquals(0.0, complex8.getReal(), 0.01);
      assertEquals(0.0, complex8.getImaginary(), 0.01);
      
      Complex complex9 = complex7.pow(complex5);
      assertTrue(complex9.equals((Object)complex7));
      assertFalse(complex9.isInfinite());
      assertEquals(-0.0, complex9.getImaginary(), 0.01);
      assertEquals((-6058.197033007476), complex5.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = (Complex)complex0.readResolve();
      boolean boolean0 = complex0.equals(complex1);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      // Undeclared exception!
      complex0.nthRoot(1072995642);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.NaN.acos();
      double double0 = complex1.NaN.abs();
      assertEquals(Double.NaN, double0, 0.01);
      assertTrue(complex1.isNaN());
      
      Complex complex2 = complex0.asin();
      assertEquals(0.8813735870195428, complex2.getImaginary(), 0.01);
      assertEquals(0.0, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.sqrt();
      assertSame(complex1, complex0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Complex complex0 = new Complex(439.11732753, (-1386.0231474));
      Complex complex1 = new Complex((-115.7672356590066), Double.POSITIVE_INFINITY);
      Complex complex2 = complex0.multiply(complex1);
      assertTrue(complex1.isInfinite());
      assertFalse(complex0.isInfinite());
      assertTrue(complex2.isInfinite());
      assertEquals((-115.7672356590066), complex1.getReal(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      complex0.NaN.sinh();
      List<Complex> list0 = complex0.nthRoot(2065);
      assertTrue(list0.contains(complex0));
      assertEquals(0.0, complex0.getImaginary(), 0.01);
      assertEquals(2065, list0.size());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = Complex.INF;
      Complex complex2 = complex1.NaN.divide(complex0);
      Complex complex3 = new Complex((-2025.748), (-1.665334536937735E-16));
      Complex complex4 = complex3.atan();
      assertEquals(0.0, complex4.getImaginary(), 0.01);
      assertEquals((-1.5703026820183639), complex4.getReal(), 0.01);
      
      double double0 = complex1.abs();
      assertEquals(Double.POSITIVE_INFINITY, double0, 0.01);
      assertNotSame(complex1, complex2);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.acos();
      assertEquals((-0.8813735870195429), complex1.getImaginary(), 0.01);
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.asin();
      assertEquals(0.8813735870195428, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.INF.tanh();
      assertTrue(complex1.isNaN());
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      
      Complex complex2 = complex0.sqrt();
      assertFalse(complex2.isInfinite());
      assertEquals(0.7071067811865475, complex2.getImaginary(), 0.01);
      assertFalse(complex2.isNaN());
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.asin();
      assertEquals(Double.POSITIVE_INFINITY, complex0.getImaginary(), 0.01);
      assertEquals(Double.NaN, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex(1.2246467991473532E-16, 1.3065629648763764);
      Complex complex3 = new Complex(1.414213562373095, 0.5411961001461969);
      Complex complex4 = complex0.add(complex2);
      complex1.add(complex3);
      Complex complex5 = complex0.subtract(complex2);
      assertEquals((-2.4492935982947064E-16), complex5.getReal(), 0.01);
      
      Complex complex6 = complex4.subtract(complex0);
      Complex complex7 = complex6.divide(complex2);
      assertEquals(0.0, complex7.getImaginary(), 0.01);
      assertEquals(0.0, complex4.getReal(), 0.01);
      assertEquals(1.0, complex7.getReal(), 0.01);
      assertFalse(complex7.isInfinite());
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      Complex complex0 = Complex.NaN;
      Complex complex1 = complex0.INF.sinh();
      Complex complex2 = complex1.I.multiply((-1.2246467991473532E-16));
      assertEquals((-1.2246467991473532E-16), complex2.getImaginary(), 0.01);
      assertFalse(complex2.isInfinite());
      assertEquals(-0.0, complex2.getReal(), 0.01);
      
      double double0 = complex0.abs();
      assertFalse(complex0.equals((Object)complex2));
      assertTrue(complex0.equals((Object)complex1));
      assertEquals(Double.NaN, double0, 0.01);
      assertNotSame(complex0, complex1);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.sqrt();
      assertEquals(0.7071067811865476, complex1.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      assertFalse(complex1.isNaN());
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.ZERO.tan();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertTrue(complex1.isNaN());
      
      List<Complex> list0 = complex0.nthRoot(255);
      assertTrue(list0.contains(complex0));
      assertEquals(255, list0.size());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      Complex complex0 = Complex.ZERO;
      Complex complex1 = complex0.atan();
      assertTrue(complex1.equals((Object)complex0));
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      Complex complex0 = Complex.I;
      complex0.NaN.getField();
      Complex complex1 = Complex.INF;
      Complex complex2 = complex0.sqrt();
      assertFalse(complex2.isNaN());
      assertFalse(complex2.isInfinite());
      assertEquals(0.7071067811865476, complex2.getReal(), 0.01);
      assertEquals(0.7071067811865475, complex2.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.cosh();
      assertEquals(0.0, complex1.getImaginary(), 0.01);
      assertEquals(0.5403023058681398, complex1.getReal(), 0.01);
      
      Complex complex2 = complex0.sqrt();
      Complex complex3 = complex2.multiply(complex0);
      assertFalse(complex3.isInfinite());
      assertEquals(0.7071067811865476, complex3.getImaginary(), 0.01);
      assertEquals((-0.7071067811865475), complex3.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = Complex.NaN;
      Complex complex2 = complex0.INF.subtract(complex1);
      assertSame(complex2, complex1);
      
      Complex complex3 = complex0.asin();
      assertEquals(0.0, complex3.getReal(), 0.01);
      assertEquals(0.8813735870195428, complex3.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Complex complex0 = new Complex((-1.2246467991473532E-16), (-0.5411961001461971));
      Complex complex1 = new Complex((-1.414213562373095), (-1.3065629648763764));
      Complex complex2 = new Complex(1.2246467991473532E-16, 1.3065629648763764);
      Complex complex3 = complex2.add(complex2);
      complex2.ONE.toString();
      Complex complex4 = complex2.subtract(complex1);
      double double0 = complex4.ONE.abs();
      assertEquals(1.0, double0, 0.01);
      
      Complex complex5 = complex3.subtract(complex0);
      assertEquals(3.1543220298989496, complex5.getImaginary(), 0.01);
      assertEquals(3.6739403974420594E-16, complex5.getReal(), 0.01);
      
      String string0 = complex1.toString();
      assertFalse(complex1.isInfinite());
      assertEquals("(-1.414213562373095, -1.3065629648763764)", string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Complex complex0 = Complex.I;
      String string0 = complex0.I.toString();
      assertEquals("(0.0, 1.0)", string0);
      
      Complex complex1 = complex0.asin();
      double double0 = complex1.abs();
      assertEquals(0.8813735870195428, double0, 0.01);
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Complex complex0 = Complex.INF;
      Complex complex1 = complex0.sqrt();
      assertEquals(Double.NaN, complex1.getImaginary(), 0.01);
      assertEquals(Double.POSITIVE_INFINITY, complex1.getReal(), 0.01);
      assertFalse(complex1.isInfinite());
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertFalse(complex1.isNaN());
      assertEquals(0.0, complex1.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.asin();
      assertEquals(1.5707963267948966, complex1.getReal(), 0.01);
      assertEquals(-0.0, complex1.getImaginary(), 0.01);
      
      complex0.isNaN();
      assertEquals(0.0, complex0.getImaginary(), 0.01);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.INF.asin();
      complex1.subtract(complex0);
      try { 
        complex0.nthRoot((-2822));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cannot compute nth root for null or negative n: -2,822
         //
         verifyException("org.apache.commons.math.MathRuntimeException", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Complex complex0 = Complex.ONE;
      Complex complex1 = complex0.I.sin();
      assertEquals(0.0, complex1.getReal(), 0.01);
      assertEquals(1.1752011936438014, complex1.getImaginary(), 0.01);
      assertFalse(complex1.isInfinite());
      
      List<Complex> list0 = complex0.nthRoot(244);
      assertEquals(244, list0.size());
      assertTrue(list0.contains(complex0));
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Complex complex0 = Complex.I;
      Complex complex1 = complex0.asin();
      assertEquals(0.8813735870195428, complex1.getImaginary(), 0.01);
      assertEquals(0.0, complex1.getReal(), 0.01);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Complex complex0 = Complex.INF;
      complex0.ZERO.pow(complex0);
  }
}