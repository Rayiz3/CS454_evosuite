/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 05:46:35 GMT 2023
 */

package org.apache.commons.compress.archivers.zip;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.zip.X7875_NewUnix;
import org.apache.commons.compress.archivers.zip.ZipShort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class X7875_NewUnix_ESTest extends X7875_NewUnix_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.setUID(2181L);
      x7875_NewUnix0.setUID(60000L);
      x7875_NewUnix0.getLocalFileDataData();
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte)96, (byte) (-22), (byte)2, (byte) (-24), (byte)3}, byteArray1);
      
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)4;
      byteArray2[1] = (byte)0;
      x7875_NewUnix0.toString();
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte)4;
      byteArray2[5] = (byte)4;
      x7875_NewUnix0.parseFromLocalFileData(byteArray2, (byte)0, (byte)0);
      x7875_NewUnix0.hashCode();
      X7875_NewUnix x7875_NewUnix1 = (X7875_NewUnix)x7875_NewUnix0.clone();
      ZipShort zipShort0 = x7875_NewUnix1.getLocalFileDataLength();
      assertEquals(5, zipShort0.getValue());
      
      x7875_NewUnix1.getLocalFileDataData();
      x7875_NewUnix0.getUID();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix1);
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray2);
      X7875_NewUnix x7875_NewUnix2 = new X7875_NewUnix();
      x7875_NewUnix2.toString();
      boolean boolean1 = x7875_NewUnix2.equals(x7875_NewUnix1);
      assertFalse(boolean1 == boolean0);
      
      x7875_NewUnix2.toString();
      Object object0 = new Object();
      x7875_NewUnix2.equals(object0);
      x7875_NewUnix1.hashCode();
      assertTrue(x7875_NewUnix0.equals((Object)x7875_NewUnix1));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.setUID(2181L);
      Object object0 = x7875_NewUnix0.clone();
      assertTrue(object0.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.setUID(60001L);
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte)97, (byte) (-22), (byte)2, (byte) (-24), (byte)3}, byteArray1);
      
      byte[] byteArray2 = new byte[6];
      byteArray2[0] = (byte)0;
      byteArray2[1] = (byte)0;
      x7875_NewUnix0.toString();
      byteArray2[2] = (byte)0;
      byteArray2[3] = (byte)0;
      byteArray2[4] = (byte)4;
      byteArray2[5] = (byte)4;
      x7875_NewUnix0.parseFromLocalFileData(byteArray2, (byte)0, (byte)0);
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.clone();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(5, zipShort0.getValue());
      
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(0L);
      x7875_NewUnix0.getUID();
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)0, 247);
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      x7875_NewUnix0.hashCode();
      Object object0 = x7875_NewUnix0.clone();
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
      Object object1 = new Object();
      boolean boolean1 = x7875_NewUnix0.equals(object1);
      assertFalse(boolean1 == boolean0);
      
      byte[] byteArray2 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
      assertArrayEquals(new byte[] {(byte)1, (byte)1, (byte)0, (byte)2, (byte) (-24), (byte)3}, byteArray0);
      assertNotSame(byteArray2, byteArray0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, (-44));
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(5, zipShort0.getValue());
      
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      x7875_NewUnix0.hashCode();
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      x7875_NewUnix1.clone();
      Object object0 = new Object();
      x7875_NewUnix1.equals(x7875_NewUnix0);
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      x7875_NewUnix1.clone();
      x7875_NewUnix1.setGID(0L);
      x7875_NewUnix1.equals((Object) null);
      byte[] byteArray2 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
      assertEquals(1, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.setUID(2181L);
      x7875_NewUnix0.setUID(60000L);
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      byte[] byteArray1 = new byte[6];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)0;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)4;
      byteArray1[5] = (byte)4;
      x7875_NewUnix0.parseFromLocalFileData(byteArray1, (byte)0, (byte)0);
      x7875_NewUnix0.hashCode();
      Object object0 = x7875_NewUnix0.clone();
      x7875_NewUnix0.getUID();
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      Object object1 = new Object();
      boolean boolean0 = x7875_NewUnix1.equals(object1);
      boolean boolean1 = x7875_NewUnix1.equals(object0);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setGID(0L);
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(6, zipShort0.getValue());
      
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.setUID(1898L);
      x7875_NewUnix0.setUID(2181L);
      byteArray0[2] = (byte)0;
      byteArray0[1] = (byte)4;
      x7875_NewUnix0.getUID();
      byteArray0[2] = (byte)0;
      x7875_NewUnix0.getLocalFileDataData();
      byte[] byteArray2 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
      x7875_NewUnix0.parseFromLocalFileData(byteArray2, (byte)0, 247);
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte) (-24), (byte)3, (byte)1, (byte)0}, byteArray2);
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte) (-24), (byte)3, (byte)1, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(7, zipShort0.getValue());
      
      x7875_NewUnix0.getLocalFileDataLength();
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      assertTrue(x7875_NewUnix1.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix1.setUID(793L);
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      X7875_NewUnix x7875_NewUnix1 = (X7875_NewUnix)x7875_NewUnix0.clone();
      assertTrue(x7875_NewUnix1.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.equals(x7875_NewUnix1);
      X7875_NewUnix x7875_NewUnix2 = new X7875_NewUnix();
      x7875_NewUnix2.hashCode();
      assertTrue(x7875_NewUnix2.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.setUID(69L);
      x7875_NewUnix1.clone();
      x7875_NewUnix1.hashCode();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix2.getUID();
      X7875_NewUnix x7875_NewUnix3 = new X7875_NewUnix();
      x7875_NewUnix3.setGID(69L);
      x7875_NewUnix3.hashCode();
      x7875_NewUnix0.getGID();
      x7875_NewUnix2.hashCode();
      x7875_NewUnix1.hashCode();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix2);
      assertFalse(boolean0);
      
      X7875_NewUnix x7875_NewUnix4 = (X7875_NewUnix)x7875_NewUnix2.clone();
      x7875_NewUnix3.getCentralDirectoryLength();
      x7875_NewUnix2.getCentralDirectoryLength();
      x7875_NewUnix0.setGID((-1938L));
      x7875_NewUnix1.getCentralDirectoryLength();
      x7875_NewUnix3.toString();
      X7875_NewUnix.trimLeadingZeroesForceMinLength((byte[]) null);
      x7875_NewUnix3.hashCode();
      assertFalse(x7875_NewUnix3.equals((Object)x7875_NewUnix4));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      x7875_NewUnix1.getLocalFileDataData();
      assertTrue(x7875_NewUnix1.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.setGID(1111L);
      x7875_NewUnix0.equals(x7875_NewUnix1);
      assertFalse(x7875_NewUnix1.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.hashCode();
      assertFalse(x7875_NewUnix0.equals((Object)x7875_NewUnix1));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.hashCode();
      // Undeclared exception!
      try { 
        x7875_NewUnix0.parseFromLocalFileData(byteArray0, 1473, 1473);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1473
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = X7875_NewUnix.trimLeadingZeroesForceMinLength((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      long long0 = x7875_NewUnix0.getUID();
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getHeaderId();
      assertEquals(30837, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setGID(0L);
      x7875_NewUnix0.getLocalFileDataLength();
      byte[] byteArray0 = new byte[6];
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.setUID(2181L);
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)4;
      x7875_NewUnix0.getUID();
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)52;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)1;
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      x7875_NewUnix0.hashCode();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getCentralDirectoryLength();
      x7875_NewUnix0.getGID();
      ZipShort zipShort1 = x7875_NewUnix0.getHeaderId();
      assertNotSame(zipShort1, zipShort0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.parseFromCentralDirectoryData((byte[]) null, 7, 7);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte) (-24), (byte)3, (byte)2, (byte) (-24), (byte)3}, byteArray0);
      
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(7, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      Object object0 = new Object();
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      assertFalse(boolean0);
      
      x7875_NewUnix0.clone();
      x7875_NewUnix0.getLocalFileDataData();
      Object object1 = x7875_NewUnix0.clone();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.equals(object1);
      x7875_NewUnix0.clone();
      Object object2 = new Object();
      x7875_NewUnix0.equals(object2);
      assertTrue(x7875_NewUnix0.equals((Object)object1));
      
      x7875_NewUnix0.setUID((-4451L));
      x7875_NewUnix0.setGID((-4451L));
      x7875_NewUnix0.toString();
      x7875_NewUnix0.getCentralDirectoryLength();
      Object object3 = new Object();
      x7875_NewUnix0.equals(object3);
      x7875_NewUnix0.getGID();
      Object object4 = x7875_NewUnix0.clone();
      x7875_NewUnix0.equals(object4);
      x7875_NewUnix0.setGID((-2169L));
      x7875_NewUnix0.getCentralDirectoryData();
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.hashCode();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(11, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setGID(0L);
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      assertFalse(x7875_NewUnix1.equals((Object)x7875_NewUnix0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.hashCode();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(0L);
      Object object0 = x7875_NewUnix0.clone();
      assertTrue(object0.equals((Object)x7875_NewUnix0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(1000L);
      byte[] byteArray0 = x7875_NewUnix0.getCentralDirectoryData();
      assertEquals(0, byteArray0.length);
      
      x7875_NewUnix0.setUID((-1300L));
      x7875_NewUnix0.hashCode();
      byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
      assertEquals(9, byteArray1.length);
      assertArrayEquals(new byte[] {(byte)1, (byte)4, (byte) (-20), (byte) (-6), (byte) (-1), (byte) (-1), (byte)2, (byte) (-24), (byte)3}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.toString();
      x7875_NewUnix0.getLocalFileDataLength();
      Object object0 = x7875_NewUnix0.clone();
      assertTrue(object0.equals((Object)x7875_NewUnix0));
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.getGID();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(7, zipShort0.getValue());
  }
}
