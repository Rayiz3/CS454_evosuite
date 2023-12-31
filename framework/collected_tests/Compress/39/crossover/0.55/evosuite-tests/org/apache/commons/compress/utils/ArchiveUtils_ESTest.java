/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 06:19:44 GMT 2023
 */

package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Date;
import java.util.jar.JarEntry;
import org.apache.commons.compress.archivers.ArchiveEntry;
import org.apache.commons.compress.archivers.ar.ArArchiveEntry;
import org.apache.commons.compress.archivers.cpio.CpioArchiveEntry;
import org.apache.commons.compress.archivers.memory.MemoryArchiveEntry;
import org.apache.commons.compress.archivers.sevenz.SevenZArchiveEntry;
import org.apache.commons.compress.archivers.tar.TarArchiveEntry;
import org.apache.commons.compress.archivers.zip.ZipArchiveEntry;
import org.apache.commons.compress.utils.ArchiveUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArchiveUtils_ESTest extends ArchiveUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      ArchiveUtils.toAsciiString(byteArray0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 808471376L);
      ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      boolean boolean0 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[11];
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("0E?-wms[><p[X/|");
      FileSystemHandling.shouldAllThrowIOExceptions();
      byteArray1[0] = (byte)8;
      ArchiveUtils.toAsciiString(byteArray0);
      MockFile mockFile0 = new MockFile("\u0000", "\u0000");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "#I4");
      zipArchiveEntry0.setSize((byte)8);
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.setPermissions(evoSuiteFile0, true, false, false);
      ArchiveUtils.isEqualWithNull(byteArray1, 0, (byte)8, byteArray1, 8215, 0);
      ArchiveUtils.sanitize("\u0000");
      ArchiveUtils.sanitize("");
      ArchiveUtils.sanitize("org.apache.commons.compress.utils.ArchiveUtils");
      System.setCurrentTimeMillis(8215);
      ArchiveUtils.toString((ArchiveEntry) zipArchiveEntry0);
      mockFile0.toURI();
      ZipArchiveEntry zipArchiveEntry1 = new ZipArchiveEntry(mockFile0, "\u0000");
      ArchiveUtils.toString((ArchiveEntry) zipArchiveEntry0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray1, 0, 8215, byteArray1, (-1), 2106);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-98);
      byteArray1[1] = (byte) (-8);
      byteArray1[2] = (byte) (-1);
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)46;
      byteArray1[5] = (byte)20;
      byteArray1[6] = (byte) (-53);
      byteArray1[7] = (byte)8;
      byteArray1[8] = (byte) (-41);
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      assertFalse(boolean0);
      
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[4] = (byte)1;
      byte[] byteArray1 = new byte[18];
      byteArray1[1] = (byte)0;
      byteArray1[4] = (byte) (-60);
      byteArray1[4] = (byte)1;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      ArchiveUtils.sanitize("");
      MockFile mockFile0 = new MockFile("UVGhJdv*ayx,");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "");
      String string0 = ArchiveUtils.toString((ArchiveEntry) zipArchiveEntry0);
      assertEquals("-       0 ", string0);
      
      FileSystemHandling.shouldAllThrowIOExceptions();
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean1 = ArchiveUtils.isEqualWithNull(byteArray1, (byte)1, (byte)0, byteArray1, (byte)0, 11);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[1] = (byte)35;
      byteArray0[4] = (byte)35;
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte)35, 1001, byteArray0, 1001, (-32));
      assertFalse(boolean0);
      
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[1];
      ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte)14;
      ArchiveUtils.toAsciiString(byteArray0);
      boolean boolean0 = ArchiveUtils.matchAsciiBuffer("\u0000", byteArray0);
      String string0 = ArchiveUtils.sanitize("0E?-wms[><p[X/|");
      assertEquals("0E?-wms[><p[X/|", string0);
      
      MockFile mockFile0 = new MockFile("0E?-wms[><p[X/|");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "#I4");
      String string1 = ArchiveUtils.toString((ArchiveEntry) zipArchiveEntry0);
      assertEquals("-       0 #I4", string1);
      
      FileSystemHandling.shouldAllThrowIOExceptions();
      boolean boolean1 = ArchiveUtils.isEqualWithNull(byteArray2, 0, (byte)14, byteArray2, 8215, 0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[24];
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-26);
      byteArray0[4] = (byte) (-8);
      ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-6), (-32), byteArray0, (byte)35, (byte) (-26));
      ArchiveUtils.matchAsciiBuffer("J/", byteArray0);
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, (String) null);
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-8);
      byteArray1[1] = (byte) (-6);
      byteArray1[4] = (byte) (-26);
      byteArray1[3] = (byte) (-26);
      byteArray1[4] = (byte)35;
      ArchiveUtils.isEqual(byteArray1, byteArray1, true);
      byte[] byteArray2 = new byte[0];
      ArchiveUtils.isEqual(byteArray2, byteArray1, false);
      FileSystemHandling.setPermissions((EvoSuiteFile) null, true, true, false);
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("H=fmZqGw", false);
      ArchiveUtils.sanitize("_K#ZV2[5&&`_^N");
      System.setCurrentTimeMillis((-32));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)35;
      byteArray0[4] = (byte) (-26);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-6), (-32), byteArray0, (byte)35, (byte)0);
      boolean boolean1 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      assertTrue(boolean1);
      
      ArchiveUtils.toAsciiString(byteArray0);
      boolean boolean2 = ArchiveUtils.matchAsciiBuffer("\u0000#\u0000\u0000\uFFFD", byteArray0);
      assertTrue(boolean2 == boolean0);
      
      String string0 = ArchiveUtils.sanitize("\u0000#\u0000\u0000\uFFFD");
      assertEquals("?#???", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-6);
      byteArray0[4] = (byte) (-8);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-6), (-32), byteArray0, (byte)35, (byte) (-6));
      assertFalse(boolean0);
      
      ArchiveUtils.matchAsciiBuffer("J/", byteArray0);
      byte[] byteArray1 = new byte[9];
      byteArray1[1] = (byte) (-8);
      byteArray1[2] = (byte) (-6);
      ArchiveUtils.toAsciiString(byteArray1);
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte) (-6);
      byteArray2[1] = (byte)35;
      byteArray2[2] = (byte) (-26);
      byteArray2[3] = (byte) (-52);
      byteArray2[4] = (byte) (-52);
      byteArray2[5] = (byte) (-8);
      byteArray2[6] = (byte) (-52);
      ArchiveUtils.isEqualWithNull(byteArray1, 74, (byte) (-6), byteArray2, (byte)35, (byte) (-6));
      boolean boolean1 = ArchiveUtils.isEqualWithNull(byteArray1, (byte)35, (byte) (-8), byteArray1, 63, (byte) (-8));
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (-1696));
      assertTrue(boolean0);
      
      ArchiveUtils.toAsciiString(byteArray0);
      String string0 = ArchiveUtils.toAsciiString(byteArray0, (int) (byte)0, (int) (byte)0);
      assertEquals("", string0);
      
      ArchiveUtils.toAsciiString(byteArray0);
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", (byte)1, true);
      String string1 = ArchiveUtils.toString((ArchiveEntry) tarArchiveEntry0);
      assertEquals("-       0 \u0000\u0000\u0000\u0000\u0000\u0000\u0000", string1);
      
      boolean boolean1 = FileSystemHandling.shouldAllThrowIOExceptions();
      assertTrue(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      byte[] byteArray1 = new byte[2];
      ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      byte[] byteArray2 = new byte[7];
      byteArray2[0] = (byte)14;
      byteArray2[1] = (byte)45;
      byteArray2[2] = (byte)21;
      byteArray2[3] = (byte) (-89);
      byteArray2[4] = (byte)100;
      byteArray2[5] = (byte)7;
      byteArray2[6] = (byte)32;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray2, byteArray1, true);
      ArchiveUtils.isEqual(byteArray2, byteArray0, false);
      boolean boolean1 = ArchiveUtils.isEqual(byteArray2, byteArray0);
      assertTrue(boolean1 == boolean0);
      
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("_]<i)TPzu6}D=!\"4Z?", false);
      String string0 = ArchiveUtils.sanitize("_]<i)TPzu6}D=!\"4Z?");
      assertEquals("_]<i)TPzu6}D=!\"4Z?", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[2] = (byte)23;
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArchiveUtils.isArrayZero(byteArray0, (byte)23);
      ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      FileSystemHandling.shouldAllThrowIOExceptions();
      ArchiveUtils.isArrayZero(byteArray0, (-499));
      ArchiveUtils.toAsciiString(byteArray0);
      ArchiveUtils.isEqualWithNull(byteArray0, 822, (byte)0, byteArray0, 2833, 0);
      System.setCurrentTimeMillis((byte)0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = new byte[18];
      byteArray1[0] = (byte) (-51);
      byteArray1[1] = (byte)1;
      byteArray1[4] = (byte) (-51);
      byteArray1[3] = (byte)85;
      byteArray1[4] = (byte)1;
      ArchiveUtils.isArrayZero(byteArray0, (byte)85);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("", 546L);
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      ArchiveUtils.isEqual(byteArray1, byteArray1);
      ArchiveUtils.toAsciiString(byteArray1);
      ArchiveUtils.toAsciiString(byteArray1, (int) (byte)1, 4);
      ArchiveUtils.toAsciiString(byteArray1);
      byte[] byteArray2 = new byte[2];
      byteArray2[0] = (byte)45;
      byteArray2[1] = (byte)85;
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray2, 3823, 3257, byteArray0, 201, 9600);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 3823
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      FileSystemHandling.shouldAllThrowIOExceptions();
      MockFile mockFile0 = new MockFile("");
      CpioArchiveEntry cpioArchiveEntry0 = new CpioArchiveEntry(mockFile0, "");
      String string0 = ArchiveUtils.toString((ArchiveEntry) cpioArchiveEntry0);
      assertEquals("d       0 ", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("4c$E5ng", false);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, 9568, (-1888), byteArray0, 31, (-1888));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte) (-26);
      byteArray0[4] = (byte) (-8);
      ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-6), (-32), byteArray0, (byte)35, (byte)0);
      ArchiveUtils.matchAsciiBuffer("J/", byteArray0);
      ArchiveUtils.sanitize("J/");
      FileSystemHandling.shouldAllThrowIOExceptions();
      System.setCurrentTimeMillis(0L);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte[] byteArray1 = new byte[4];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)32;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-9);
      byteArray0[4] = (byte)85;
      ArchiveUtils.isArrayZero(byteArray0, (byte)0);
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("USER_WRITE", (byte)0);
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      ArchiveUtils.sanitize("WL=S]*{9XO");
      ArchiveUtils.isEqual(byteArray0, byteArray0);
      ArchiveUtils.toAsciiString(byteArray0);
      ArchiveUtils.toAsciiString(byteArray0, 1, (int) (byte)0);
      ArchiveUtils.toAsciiString(byteArray0);
      arArchiveEntry0.getLastModifiedDate();
      ArchiveUtils.matchAsciiBuffer("`\n", byteArray0, (int) (byte)0, 2);
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-9), 2883, byteArray0, 2825, 7);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -9
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-51);
      byteArray1[1] = (byte)1;
      byteArray1[2] = (byte) (-51);
      byteArray1[3] = (byte)85;
      byteArray1[4] = (byte)1;
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray1, (-1696));
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("USER_WRITE", (-3774L));
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      String string0 = ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      assertEquals("-   -3774 USER_WRITE", string0);
      
      String string1 = ArchiveUtils.sanitize("D%7C]L 0x");
      assertEquals("D%7C?]L 0x?", string1);
      
      boolean boolean1 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      ArchiveUtils.toAsciiString(byteArray0);
      ArchiveUtils.toAsciiString(byteArray0, (int) (byte)1, (int) (byte)1);
      ArchiveUtils.toAsciiString(byteArray0);
      boolean boolean2 = ArchiveUtils.isEqual(byteArray0, (int) (byte)1, 30837, byteArray1, 30837, (-451));
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2 == boolean1);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byte byte0 = (byte)1;
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-51);
      byteArray1[1] = (byte)1;
      byteArray1[2] = (byte) (-51);
      byteArray1[3] = (byte)85;
      byteArray1[4] = (byte)1;
      ArchiveUtils.isArrayZero(byteArray1, (-1696));
      ArArchiveEntry arArchiveEntry0 = new ArArchiveEntry("USER_WRITE", (-3774L));
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      arArchiveEntry0.getLastModifiedDate();
      ArchiveUtils.toString((ArchiveEntry) arArchiveEntry0);
      String string0 = "D%7C]L 0x";
      ArchiveUtils.sanitize("`\n");
      ArchiveUtils.isEqual(byteArray0, byteArray0);
      ArchiveUtils.toAsciiString(byteArray0);
      // Undeclared exception!
      try { 
        ArchiveUtils.toAsciiString(byteArray1, 2786, (int) (byte)1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = ArchiveUtils.toAsciiBytes("");
      byte[] byteArray1 = new byte[17];
      byteArray1[0] = (byte) (-17);
      byteArray1[1] = (byte)101;
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray1, 258);
      ArchiveUtils.toAsciiString(byteArray1);
      boolean boolean1 = ArchiveUtils.isEqual(byteArray1, (-17), (-2100), byteArray0, (-2815), 65);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte) (-26);
      byteArray0[3] = (byte) (-6);
      byteArray0[4] = (byte) (-8);
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray0, (byte) (-6), (-32), byteArray0, (byte)35, (byte) (-6));
      boolean boolean1 = ArchiveUtils.matchAsciiBuffer("J/", byteArray0);
      assertTrue(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byte[] byteArray1 = new byte[5];
      byteArray1[3] = (byte)1;
      boolean boolean0 = ArchiveUtils.isEqualWithNull(byteArray1, (byte)85, (-1), byteArray0, (byte)1, (byte)85);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)23;
      byteArray0[2] = (byte)23;
      ArchiveUtils.isArrayZero(byteArray0, (byte)23);
      ArchiveUtils.matchAsciiBuffer("^u0jmY>aPSNi", byteArray0);
      ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      ArchiveUtils.sanitize("^u0jmY>aPSNi");
      byte[] byteArray1 = new byte[0];
      ArchiveUtils.isEqual(byteArray1, byteArray1, true);
      ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      ArchiveUtils.isEqual(byteArray1, byteArray0, false);
      ArchiveUtils.isEqual(byteArray0, byteArray0);
      ArchiveUtils.matchAsciiBuffer("^u0jmY>aPSN?i", byteArray1, (int) (byte)23, 0);
      ArchiveUtils.isArrayZero(byteArray1, (-499));
      ArchiveUtils.toAsciiString(byteArray0);
      TarArchiveEntry tarArchiveEntry0 = null;
      try {
        tarArchiveEntry0 = new TarArchiveEntry(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 99
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)3;
      byteArray0[1] = (byte) (-58);
      byteArray0[2] = (byte) (-7);
      byteArray0[3] = (byte) (-11);
      byteArray0[4] = (byte)97;
      byteArray0[5] = (byte)100;
      byteArray0[6] = (byte)63;
      byteArray0[7] = (byte)110;
      byteArray0[8] = (byte)46;
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)100;
      byteArray1[1] = (byte)3;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byte[] byteArray1 = new byte[1];
      byteArray1[0] = (byte)1;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray1, true);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte) (-60);
      byteArray0[1] = (byte) (-60);
      byteArray0[2] = (byte) (-60);
      byteArray0[3] = (byte) (-60);
      byteArray0[4] = (byte) (-60);
      byteArray0[5] = (byte) (-60);
      ArchiveUtils.isEqual(byteArray0, byteArray0);
      ArchiveUtils.toAsciiString(byteArray0);
      ArchiveUtils.sanitize("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD");
      ArchiveUtils.toAsciiString(byteArray0);
      TarArchiveEntry tarArchiveEntry0 = new TarArchiveEntry("\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD\uFFFD", true);
      ArchiveUtils.toString((ArchiveEntry) tarArchiveEntry0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      tarArchiveEntry0.setGroupId(0L);
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte) (-60);
      byteArray1[1] = (byte) (-60);
      byteArray1[2] = (byte) (-21);
      byteArray1[3] = (byte) (-60);
      byteArray1[4] = (byte) (-60);
      byteArray1[5] = (byte) (-94);
      byteArray1[6] = (byte) (-60);
      byteArray1[7] = (byte) (-33);
      byteArray1[8] = (byte) (-60);
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray1, (byte) (-60), 75, byteArray0, (byte) (-60), 16877);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -60
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("RDkE68xd<*");
      assertEquals("RD?kE68xd<*", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      boolean boolean0 = ArchiveUtils.isArrayZero(byteArray0, (-9956));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byte byte0 = (byte) (-23);
      byteArray0[0] = (byte) (-23);
      byte byte1 = (byte) (-34);
      byteArray0[1] = (byte) (-34);
      ArchiveUtils.isEqual(byteArray0, (int) (byte) (-34), (int) (byte) (-23), byteArray0, (int) (byte) (-34), 284);
      ArchiveUtils.isEqual(byteArray0, 501, (-1129), byteArray0, 512, (int) (byte) (-23));
      ArchiveUtils.toAsciiBytes("Q+.f3WH8?=6[2.Kn");
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-23);
      byteArray1[1] = (byte) (-23);
      byteArray1[2] = (byte) (-23);
      byteArray1[3] = (byte) (-23);
      byteArray1[4] = (byte) (-34);
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, 284, (int) (byte) (-23), byteArray1, 1706, 888, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1683
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)1;
      byteArray0[1] = (byte)45;
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte)22;
      byteArray0[4] = (byte)41;
      byteArray0[5] = (byte) (-37);
      byteArray0[6] = (byte)80;
      byteArray0[7] = (byte)3;
      byteArray0[8] = (byte)1;
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, 502, (int) (byte) (-37), byteArray0, (int) (byte)22, (int) (byte) (-37));
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)99;
      byteArray0[1] = (byte)35;
      byteArray0[2] = (byte)99;
      byteArray0[3] = (byte)11;
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      byteArray0[4] = (byte)11;
      ArchiveUtils.isEqualWithNull(byteArray0, (byte)11, (-32), byteArray0, (byte)35, (byte)11);
      ArchiveUtils.matchAsciiBuffer("J/", byteArray0);
      ArchiveUtils.sanitize("J/");
      MockFile mockFile0 = new MockFile("");
      ZipArchiveEntry zipArchiveEntry0 = new ZipArchiveEntry(mockFile0, "The entry is not a symbolic link");
      ArchiveUtils.toString((ArchiveEntry) zipArchiveEntry0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, (-1), (byte)99, byteArray0, (byte)35, 206);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MemoryArchiveEntry memoryArchiveEntry0 = new MemoryArchiveEntry("WORLD_READ");
      memoryArchiveEntry0.getLastModifiedDate();
      memoryArchiveEntry0.getLastModifiedDate();
      memoryArchiveEntry0.getLastModifiedDate();
      ArchiveUtils.toString((ArchiveEntry) memoryArchiveEntry0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)84;
      byteArray0[1] = (byte) (-106);
      byteArray0[2] = (byte)92;
      byteArray0[3] = (byte)108;
      byteArray0[4] = (byte)5;
      byteArray0[5] = (byte) (-8);
      byteArray0[6] = (byte) (-114);
      byteArray0[7] = (byte)0;
      ArchiveUtils.matchAsciiBuffer("", byteArray0, (int) (byte) (-8), (int) (byte)0);
      byte[] byteArray1 = new byte[3];
      byteArray1[0] = (byte)5;
      byteArray1[1] = (byte) (-8);
      byteArray1[2] = (byte)5;
      ArchiveUtils.isEqual(byteArray1, (int) (byte)5, 46, byteArray1, (int) (byte) (-106), 0);
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, (-594), 0, byteArray0, (byte) (-106), (byte) (-114));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -708
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      SevenZArchiveEntry sevenZArchiveEntry0 = new SevenZArchiveEntry();
      String string0 = ArchiveUtils.toString((ArchiveEntry) sevenZArchiveEntry0);
      assertEquals("-       0 null", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual((byte[]) null, (byte[]) null, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[4];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)23;
      byteArray0[2] = (byte)23;
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, (int) (byte)23, 1446, byteArray0, (-810), (int) (byte)23);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 23
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      String string0 = ArchiveUtils.sanitize("bad extra field starting at ");
      assertEquals("bad extra field starting at ", string0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      String string0 = "org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory";
      ArchiveUtils.sanitize("org.apache.commons.compress.archivers.zip.X0016_CertificateIdForCentralDirectory");
      byte[] byteArray0 = new byte[0];
      ArchiveUtils.isEqual(byteArray0, 496, (-1), byteArray0, (-1), (-1));
      byte[] byteArray1 = new byte[0];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqual(byteArray0, 154, 496, byteArray1, 183, 496, true);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 154
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byte[] byteArray1 = new byte[3];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray1, byteArray0, false);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0, true);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      byte[] byteArray1 = ArchiveUtils.toAsciiBytes("ssAEujZ");
      ArchiveUtils.isArrayZero(byteArray1, 192);
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull((byte[]) null, 2833, 2833, (byte[]) null, 2833, 2833);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        ArchiveUtils.isEqualWithNull(byteArray0, (-1615), (-1615), byteArray0, 2815, 2815);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 1200
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      byte[] byteArray0 = new byte[15];
      boolean boolean0 = ArchiveUtils.isEqual(byteArray0, byteArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      // Undeclared exception!
      try { 
        ArchiveUtils.isArrayZero(byteArray0, (byte)126);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.utils.ArchiveUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      ArchiveUtils.toAsciiBytes("sOSDt");
      ArchiveUtils.isArrayZero(byteArray0, (-579));
      String string0 = ArchiveUtils.toAsciiString(byteArray0);
      assertEquals("\u0000\u0000\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byteArray0[2] = (byte)0;
      ArchiveUtils.matchAsciiBuffer("", byteArray0);
      String string0 = ArchiveUtils.sanitize("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      byte[] byteArray0 = new byte[4];
      String string0 = ArchiveUtils.toAsciiString(byteArray0, 0, 0);
      assertEquals("", string0);
  }
}
