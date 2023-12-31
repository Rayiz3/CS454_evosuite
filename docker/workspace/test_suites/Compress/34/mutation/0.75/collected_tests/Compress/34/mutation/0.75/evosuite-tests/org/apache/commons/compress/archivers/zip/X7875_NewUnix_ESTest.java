/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 05:24:47 GMT 2023
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
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)14;
      byteArray0[1] = (byte) (-51);
      byteArray0[2] = (byte)1;
      byteArray0[3] = (byte)114;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte) (-101);
      byteArray0[6] = (byte)99;
      byteArray0[7] = (byte)1;
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, (byte)1, (byte)14);
      x7875_NewUnix0.hashCode();
      x7875_NewUnix0.hashCode();
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertArrayEquals(new byte[] {(byte)14, (byte) (-51), (byte)1, (byte)114, (byte)0, (byte) (-101), (byte)99, (byte)1}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setGID((-1159L));
      byte[] byteArray0 = new byte[5];
      x7875_NewUnix0.toString();
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 0);
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.setGID(1000L);
      byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.hashCode();
      Object object0 = new Object();
      X7875_NewUnix x7875_NewUnix1 = (X7875_NewUnix)x7875_NewUnix0.clone();
      x7875_NewUnix0.parseFromLocalFileData(byteArray1, 0, (-2333));
      x7875_NewUnix1.setUID((-1942L));
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray1);
      x7875_NewUnix1.equals(x7875_NewUnix0);
      X7875_NewUnix x7875_NewUnix2 = new X7875_NewUnix();
      x7875_NewUnix0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setGID((-1157L));
      byte[] byteArray0 = new byte[5];
      x7875_NewUnix0.toString();
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 0);
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.hashCode();
      Object object0 = new Object();
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 0);
      X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      Object object1 = x7875_NewUnix0.clone();
      boolean boolean1 = x7875_NewUnix1.equals(object1);
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID((-1L));
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      x7875_NewUnix0.equals(x7875_NewUnix1);
      x7875_NewUnix1.hashCode();
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)5;
      x7875_NewUnix1.parseFromCentralDirectoryData(byteArray0, 0, 0);
      byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
      X7875_NewUnix x7875_NewUnix2 = new X7875_NewUnix();
      x7875_NewUnix1.getLocalFileDataData();
      x7875_NewUnix0.toString();
      x7875_NewUnix0.getLocalFileDataLength();
      Object object0 = new Object();
      x7875_NewUnix1.equals(object0);
      x7875_NewUnix1.setUID((-1L));
      Object object1 = new Object();
      X7875_NewUnix x7875_NewUnix3 = new X7875_NewUnix();
      x7875_NewUnix3.getLocalFileDataData();
      x7875_NewUnix1.equals(x7875_NewUnix3);
      x7875_NewUnix3.equals(x7875_NewUnix1);
      x7875_NewUnix0.setGID((-1L));
      x7875_NewUnix2.setUID(619L);
      x7875_NewUnix3.parseFromLocalFileData(byteArray1, 0, (byte)5);
      x7875_NewUnix3.hashCode();
      assertTrue(x7875_NewUnix3.equals((Object)x7875_NewUnix1));
      
      byte[] byteArray2 = x7875_NewUnix0.getLocalFileDataData();
      assertEquals(11, byteArray2.length);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID((-1L));
      x7875_NewUnix0.setGID((-1L));
      byte[] byteArray0 = new byte[5];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 0);
      byteArray0[0] = (byte)5;
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.getLocalFileDataData();
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = X7875_NewUnix.trimLeadingZeroesForceMinLength((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      assertTrue(x7875_NewUnix1.equals((Object)x7875_NewUnix0));
      
      x7875_NewUnix0.setGID(12345L);
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix1);
      assertFalse(boolean0);
      
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(7, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertEquals(1, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID((-1L));
      x7875_NewUnix0.setUID((-1L));
      x7875_NewUnix0.setGID((-1157L));
      byte[] byteArray0 = new byte[5];
      x7875_NewUnix0.parseFromLocalFileData(byteArray0, 0, 0);
      byteArray0[0] = (byte)5;
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.getLocalFileDataData();
      byte[] byteArray1 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)0, (byte)1, (byte)0, (byte)1, (byte)0}, byteArray1);
      
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals(x7875_NewUnix1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID((-1L));
      X7875_NewUnix x7875_NewUnix1 = new X7875_NewUnix();
      x7875_NewUnix0.equals(x7875_NewUnix1);
      x7875_NewUnix1.hashCode();
      X7875_NewUnix x7875_NewUnix2 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix2.getLocalFileDataLength();
      assertTrue(x7875_NewUnix2.equals((Object)x7875_NewUnix1));
      assertEquals(7, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.hashCode();
      ZipShort zipShort0 = x7875_NewUnix0.getHeaderId();
      x7875_NewUnix0.equals(zipShort0);
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.setUID(249L);
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      Object object0 = x7875_NewUnix0.clone();
      x7875_NewUnix0.getLocalFileDataData();
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      assertTrue(boolean0);
      
      x7875_NewUnix0.clone();
      x7875_NewUnix0.parseFromCentralDirectoryData(byteArray0, 263, 732);
      assertArrayEquals(new byte[] {(byte)1, (byte)1, (byte) (-7), (byte)2, (byte) (-24), (byte)3}, byteArray0);
      
      x7875_NewUnix0.getLocalFileDataLength();
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.hashCode();
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.getCentralDirectoryLength();
      byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
      
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.toString();
      x7875_NewUnix0.getGID();
      ZipShort zipShort1 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(6, zipShort1.getValue());
      
      String string0 = x7875_NewUnix0.toString();
      assertEquals("0x7875 Zip Extra Field: UID=249 GID=1000", string0);
      
      x7875_NewUnix0.getHeaderId();
      x7875_NewUnix0.clone();
      x7875_NewUnix0.clone();
      assertTrue(x7875_NewUnix0.equals((Object)object0));
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getHeaderId();
      assertEquals(30837, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      Object object0 = x7875_NewUnix0.clone();
      assertTrue(object0.equals((Object)x7875_NewUnix0));
      
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      boolean boolean0 = x7875_NewUnix0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      String string0 = x7875_NewUnix0.toString();
      assertEquals("0x7875 Zip Extra Field: UID=1000 GID=1000", string0);
      
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(7, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.getUID();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(7, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID((-1L));
      x7875_NewUnix0.setUID((-1L));
      x7875_NewUnix0.getGID();
      X7875_NewUnix.trimLeadingZeroesForceMinLength((byte[]) null);
      x7875_NewUnix0.getHeaderId();
      x7875_NewUnix0.getCentralDirectoryLength();
      x7875_NewUnix0.getLocalFileDataData();
      x7875_NewUnix0.toString();
      byte[] byteArray0 = X7875_NewUnix.trimLeadingZeroesForceMinLength((byte[]) null);
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      assertEquals(1, byteArray1.length);
      assertNotSame(byteArray1, byteArray0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte) (-24), (byte)3, (byte)2, (byte) (-24), (byte)3}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(7, zipShort0.getValue());
      
      x7875_NewUnix0.setGID(1L);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.getUID();
      x7875_NewUnix0.setUID((-25L));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(1504L);
      x7875_NewUnix0.setUID(1018L);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)81;
      byteArray0[2] = (byte)1;
      x7875_NewUnix0.parseFromCentralDirectoryData(byteArray0, (byte)81, 0);
      assertArrayEquals(new byte[] {(byte)1, (byte)81, (byte)1}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = x7875_NewUnix0.getCentralDirectoryData();
      assertEquals(0, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      long long0 = x7875_NewUnix0.getGID();
      assertEquals(1000L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)86;
      byteArray0[1] = (byte)13;
      byte[] byteArray1 = X7875_NewUnix.trimLeadingZeroesForceMinLength(byteArray0);
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      x7875_NewUnix0.setUID(5454L);
      x7875_NewUnix0.getCentralDirectoryLength();
      x7875_NewUnix0.hashCode();
      x7875_NewUnix0.getCentralDirectoryLength();
      x7875_NewUnix0.setGID((-393L));
      x7875_NewUnix0.getGID();
      x7875_NewUnix0.getCentralDirectoryLength();
      ZipShort zipShort0 = x7875_NewUnix0.getLocalFileDataLength();
      assertEquals(9, zipShort0.getValue());
      
      x7875_NewUnix0.clone();
      byte[] byteArray2 = x7875_NewUnix0.getCentralDirectoryData();
      x7875_NewUnix0.hashCode();
      x7875_NewUnix0.setGID((byte)13);
      x7875_NewUnix0.clone();
      byte[] byteArray3 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte)78, (byte)21, (byte)1, (byte)13}, byteArray3);
      
      x7875_NewUnix0.parseFromCentralDirectoryData(byteArray1, (byte)13, 3);
      x7875_NewUnix0.setGID(5454L);
      x7875_NewUnix0.getCentralDirectoryData();
      x7875_NewUnix0.parseFromCentralDirectoryData(byteArray2, (byte)86, 6);
      x7875_NewUnix0.parseFromCentralDirectoryData(byteArray2, 4, (byte)13);
      assertEquals(0, byteArray2.length);
      
      byte[] byteArray4 = x7875_NewUnix0.getLocalFileDataData();
      assertArrayEquals(new byte[] {(byte)1, (byte)2, (byte)78, (byte)21, (byte)2, (byte)78, (byte)21}, byteArray4);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      ZipShort zipShort0 = x7875_NewUnix0.getCentralDirectoryLength();
      assertEquals(7, zipShort0.getValue());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      X7875_NewUnix x7875_NewUnix0 = new X7875_NewUnix();
      // Undeclared exception!
      try { 
        x7875_NewUnix0.parseFromLocalFileData((byte[]) null, (-1234567), 30837);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.archivers.zip.X7875_NewUnix", e);
      }
  }
}
