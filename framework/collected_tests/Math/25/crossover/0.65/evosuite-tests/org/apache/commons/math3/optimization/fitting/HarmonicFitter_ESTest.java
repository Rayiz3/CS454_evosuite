/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 22:36:12 GMT 2023
 */

package org.apache.commons.math3.optimization.fitting;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.math3.optimization.fitting.HarmonicFitter;
import org.apache.commons.math3.optimization.fitting.WeightedObservedPoint;
import org.apache.commons.math3.optimization.general.LevenbergMarquardtOptimizer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HarmonicFitter_ESTest extends HarmonicFitter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(0.341076, (-1088.0), 1580.8608860515394);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(79.769554, (-704.8), (-2851.3133664613324));
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-3.5997360512765566E-9), (-8.356612626832876), (-1088.0));
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(11540.0, (-2125.578899), (-2125.578899));
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint((-842.0), 4.99, 0.5);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint2;
      weightedObservedPointArray0[2] = weightedObservedPoint3;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      harmonicFitter_ParameterGuesser0.guess();
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint((-842.0), (-2156.29439), (-2125.578899));
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser1 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      harmonicFitter_ParameterGuesser1.guess();
      System.setCurrentTimeMillis((-864L));
      System.setCurrentTimeMillis(1L);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(2696.637150373, 0.0, 16.27);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(107.74146893, 16.27, (-1.0));
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(0.672, (-8.356612626832876), 0.5);
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-2125.578899), 11540.0, (-1.0));
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(1801.2486448, 2696.637150373, 2696.637150373);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint((-1.0), Double.POSITIVE_INFINITY, (-1088.0));
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser1 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {8.635, 5.440761415619629E-4, (-1.5500169904520924)}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-0.247797), 3246.0, (-0.385899));
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(6.283185307179586, 3246.0, (-1547.725817));
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(3246.0, (-812.1134435), 1.05);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      weightedObservedPointArray0[6] = weightedObservedPoint0;
      weightedObservedPointArray0[7] = weightedObservedPoint0;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser1 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      harmonicFitter_ParameterGuesser1.guess();
      System.setCurrentTimeMillis(4770L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(107.78440811239746, (-2096.9843343140687), 11.37730410167925);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-0.216248), 1923.37275, 6.283185307179586);
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(11.37730410167925, (-2096.9843343140687), 1.0500000000000007);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      weightedObservedPointArray0[5] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1.5707963267948966), 6.283185307179586, 1.0500000000000007);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-0.405195), 1.0500000000000007, (-1.0));
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[7];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-13.040640861460481), 429.3202284712402, 1.184154459111628E-8);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(6.283185307179586, 429.3202284712402, (-1.0));
      weightedObservedPointArray0[5] = weightedObservedPoint3;
      weightedObservedPointArray0[6] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser1 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser1.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-5194.7), (-2096.9843343140687), (-2096.9843343140687));
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(0.9700000000000006, (-1769.478466152), (-2461.67869544632));
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[5];
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-2096.9843343140687), 3325.012630663211, (-702.634568302077));
      weightedObservedPointArray0[1] = weightedObservedPoint2;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-571.41861), 1222.1456141, (-571.41861));
      harmonicFitter0.addObservedPoint(weightedObservedPoint0);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(318.0, 982.0, 318.0);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-2096.9843343140687), (-0.405195), 1.0600000000000007);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1.0600000000000007, 429.3202284712402, 0.9700000000000006);
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(1.0500000000000007, 507.214462, 429.3202284712402);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      weightedObservedPointArray0[5] = weightedObservedPoint1;
      weightedObservedPointArray0[6] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(429.3202284712402, (-1.0), (-1856.60522697411));
      weightedObservedPointArray0[7] = weightedObservedPoint3;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      harmonicFitter_ParameterGuesser0.guess();
      System.setCurrentTimeMillis(1397L);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-787.723), (-765.0), 1.1900000000000008);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-765.0), (-3726.063649341332), 1.1900000000000008);
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(6.283185307179586, 1.1000000000000008, 0.0);
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint((-1421.0), 4815.0, 4016.12);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[9];
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint3;
      weightedObservedPointArray0[2] = weightedObservedPoint3;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint((-1007.6), (-1007.6), 1128.181);
      weightedObservedPointArray0[3] = weightedObservedPoint4;
      weightedObservedPointArray0[4] = weightedObservedPoint2;
      weightedObservedPointArray0[5] = weightedObservedPoint1;
      weightedObservedPointArray0[6] = weightedObservedPoint3;
      weightedObservedPointArray0[7] = weightedObservedPoint0;
      weightedObservedPointArray0[8] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      harmonicFitter_ParameterGuesser0.guess();
      System.setCurrentTimeMillis((-9223372036854775808L));
      System.setCurrentTimeMillis((-9223372036854775808L));
      System.setCurrentTimeMillis((-9223372036854775808L));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-2096.9843343140687), (-0.405195), 1.0600000000000007);
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(429.3202284712402, (-779.055804060061), (-1769.478466152));
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[4];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint1;
      weightedObservedPointArray0[3] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-571.41861), 1222.1456141, (-571.41861));
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1222.1456141, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint((-571.41861), 0.04168701738764507, 0.9700000000000006);
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(429.3202284712402, 1.0500000000000007, 507.214462);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      weightedObservedPointArray0[0] = weightedObservedPoint1;
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint((-985.83072769), 429.3202284712402, (-1.0));
      weightedObservedPointArray0[2] = weightedObservedPoint4;
      weightedObservedPointArray0[3] = weightedObservedPoint2;
      weightedObservedPointArray0[4] = weightedObservedPoint1;
      weightedObservedPointArray0[5] = weightedObservedPoint3;
      weightedObservedPointArray0[6] = weightedObservedPoint1;
      weightedObservedPointArray0[7] = weightedObservedPoint3;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1088.0), (-1088.0), (-1088.0));
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint((-1088.0), (-1769.478466152), (-1088.0));
      weightedObservedPointArray0[5] = weightedObservedPoint1;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        harmonicFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1088.0), (-1088.0), (-2096.9843343140687));
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        harmonicFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      // Undeclared exception!
      try { 
        harmonicFitter_ParameterGuesser0.guess();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint((-1088.0), (-1088.0), (-2096.9843343140687));
      harmonicFitter0.addObservedPoint(weightedObservedPoint0);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[6];
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      weightedObservedPointArray0[1] = weightedObservedPoint0;
      weightedObservedPointArray0[2] = weightedObservedPoint0;
      weightedObservedPointArray0[3] = weightedObservedPoint0;
      weightedObservedPointArray0[4] = weightedObservedPoint0;
      weightedObservedPointArray0[5] = weightedObservedPoint0;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      WeightedObservedPoint[] weightedObservedPointArray0 = new WeightedObservedPoint[8];
      WeightedObservedPoint weightedObservedPoint0 = new WeightedObservedPoint(1024.0, Double.NEGATIVE_INFINITY, 1024.0);
      weightedObservedPointArray0[0] = weightedObservedPoint0;
      WeightedObservedPoint weightedObservedPoint1 = new WeightedObservedPoint(1024.0, 1024.0, 1024.0);
      weightedObservedPointArray0[1] = weightedObservedPoint1;
      WeightedObservedPoint weightedObservedPoint2 = new WeightedObservedPoint(1024.0, Double.NEGATIVE_INFINITY, 753.862994415473);
      weightedObservedPointArray0[2] = weightedObservedPoint2;
      WeightedObservedPoint weightedObservedPoint3 = new WeightedObservedPoint(753.862994415473, (-779.006166349361), 213.5242495277718);
      weightedObservedPointArray0[3] = weightedObservedPoint3;
      WeightedObservedPoint weightedObservedPoint4 = new WeightedObservedPoint(1024.0, (-787.723), 753.862994415473);
      weightedObservedPointArray0[4] = weightedObservedPoint4;
      WeightedObservedPoint weightedObservedPoint5 = new WeightedObservedPoint(6.283185307179586, 213.5242495277718, 0.0);
      weightedObservedPointArray0[5] = weightedObservedPoint5;
      WeightedObservedPoint weightedObservedPoint6 = new WeightedObservedPoint(0.0, 4016.12, 4001.45);
      weightedObservedPointArray0[6] = weightedObservedPoint6;
      WeightedObservedPoint weightedObservedPoint7 = new WeightedObservedPoint((-20.4113), Double.NEGATIVE_INFINITY, 3399.276186918);
      weightedObservedPointArray0[7] = weightedObservedPoint7;
      HarmonicFitter.ParameterGuesser harmonicFitter_ParameterGuesser0 = new HarmonicFitter.ParameterGuesser(weightedObservedPointArray0);
      double[] doubleArray0 = harmonicFitter_ParameterGuesser0.guess();
      assertArrayEquals(new double[] {Double.NaN, Double.NaN, Double.NaN}, doubleArray0, 0.01);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      double[] doubleArray0 = new double[1];
      doubleArray0[0] = 1.270000000000001;
      harmonicFitter0.fit(doubleArray0);
      // Undeclared exception!
      try { 
        harmonicFitter0.fit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }

  @Test(timeout = 4000)
  public void testPreconditions1_17()  throws Throwable  {
      LevenbergMarquardtOptimizer levenbergMarquardtOptimizer0 = new LevenbergMarquardtOptimizer();
      HarmonicFitter harmonicFitter0 = new HarmonicFitter(levenbergMarquardtOptimizer0);
      // Undeclared exception!
      try { 
        harmonicFitter0.fit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // sample contains 0 observed points, at least 4 are required
         //
         verifyException("org.apache.commons.math3.optimization.fitting.HarmonicFitter$ParameterGuesser", e);
      }
  }
}