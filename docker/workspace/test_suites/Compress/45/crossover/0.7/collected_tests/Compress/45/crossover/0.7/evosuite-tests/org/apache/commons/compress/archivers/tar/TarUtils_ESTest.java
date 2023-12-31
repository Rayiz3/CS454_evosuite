/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 09:49:12 GMT 2023
 */

package org.apache.commons.compress.archivers.tar;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.apache.commons.compress.archivers.tar.TarUtils;
import org.apache.commons.compress.archivers.zip.ZipEncoding;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TarUtils_ESTest extends TarUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[8];
      byte byte0 = (byte)2;
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.formatNameBytes("w7+Apf{Qu@=", byteArray0, (int) (byte)2, (int) (byte)2, zipEncoding0);
      TarUtils.parseBoolean(byteArray0, 4);
      // Undeclared exception!
      try { 
        TarUtils.parseOctalOrBinary(byteArray0, (byte)2, (byte)2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid byte 119 at offset 0 in 'w7' len=2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[32];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((-33L), byteArray0, 1, 14);
      assertEquals(15, int0);
      
      TarUtils.parseOctalOrBinary(byteArray0, 14, 15);
      int int1 = TarUtils.formatLongOctalOrBinaryBytes(0L, byteArray0, 15, 1);
      assertEquals(16, int1);
      
      long long0 = TarUtils.computeCheckSum(byteArray0);
      assertEquals(3395L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[31];
      TarUtils.formatLongOctalOrBinaryBytes((-2180L), byteArray0, 7, 7);
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.parseName(byteArray0, 7, 14, zipEncoding0);
      TarUtils.computeCheckSum(byteArray0);
      TarUtils.formatLongOctalOrBinaryBytes(14, byteArray0, 14, 7);
      TarUtils.parseOctalOrBinary(byteArray0, 14, 7);
      // Undeclared exception!
      try { 
        TarUtils.parseName(byteArray0, 227, 7, zipEncoding0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 233
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(415L, byteArray0, 7, 7);
      assertEquals(14, int0);
      
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      String string0 = TarUtils.parseName(byteArray0, 7, 14, zipEncoding0);
      assertEquals("000637 ", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[45];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(7, byteArray0, 7, 7);
      assertEquals(14, int0);
      
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      String string0 = TarUtils.parseName(byteArray0, 2, 14, zipEncoding0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[45];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(7, byteArray0, 28, 7);
      assertEquals(35, int0);
      
      TarUtils.formatLongOctalOrBinaryBytes(28, byteArray0, 7, 7);
      TarUtils.parseOctalOrBinary(byteArray0, 35, 2);
      long long0 = TarUtils.computeCheckSum(byteArray0);
      assertEquals(654L, long0);
      
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      String string0 = TarUtils.parseName(byteArray0, 2, 14, zipEncoding0);
      assertEquals("", string0);
      
      long long1 = TarUtils.parseOctalOrBinary(byteArray0, 14, 2);
      assertEquals(0L, long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[45];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(7, byteArray0, 7, 7);
      assertEquals(14, int0);
      
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      String string0 = TarUtils.parseName(byteArray0, 7, 14, zipEncoding0);
      assertEquals("000007 ", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[27];
      TarUtils.formatLongOctalOrBinaryBytes((-1L), byteArray0, 1, 13);
      TarUtils.parseOctalOrBinary(byteArray0, 1, 1);
      // Undeclared exception!
      try { 
        TarUtils.verifyCheckSum(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 148
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[40];
      TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, byteArray0, (byte)8, (byte)8);
      TarUtils.parseOctalOrBinary(byteArray0, (byte)8, (byte)8);
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, byteArray0, 26, 26);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      TarUtils.formatNameBytes(")(W?JgX3G`\"{u3", byteArray0, 2, (-2572), zipEncoding0);
      TarUtils.computeCheckSum(byteArray0);
      boolean boolean0 = TarUtils.parseBoolean(byteArray0, 0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[39];
      byte byte0 = (byte)8;
      long long0 = 281474976710656L;
      TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, byteArray0, (byte)8, (byte)8);
      // Undeclared exception!
      try { 
        TarUtils.parseOctalOrBinary(byteArray0, (byte)8, 16);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // At offset 8, 16 byte binary number exceeds maximum signed long value
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[64];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((-334L), byteArray0, 5, 5);
      assertEquals(10, int0);
      
      long long0 = TarUtils.parseOctalOrBinary(byteArray0, 5, 10);
      assertEquals((-367236883677184L), long0);
      
      long long1 = TarUtils.computeCheckSum(byteArray0);
      assertEquals(1197L, long1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[14];
      TarUtils.formatLongOctalOrBinaryBytes((-2137L), byteArray0, 3, 3);
      TarUtils.formatLongOctalOrBinaryBytes((-2137L), byteArray0, 6, 3);
      // Undeclared exception!
      try { 
        TarUtils.parseOctal(byteArray0, 6, 3);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid byte -1 at offset 0 in '\uFFFD\uFFFD\uFFFD' len=3
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[13];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((-4209L), byteArray0, 4, 4);
      assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[45];
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes((-1623), byteArray0, (-1623), (-1623));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -1623 is too large for -1623 byte field.
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[35];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(9, byteArray0, 1, 9);
      assertEquals(10, int0);
      
      long long0 = TarUtils.parseOctal(byteArray0, 9, 9);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte)7, byteArray0, (byte)7, (byte)7);
      assertEquals(14, int0);
      
      ZipEncoding zipEncoding0 = TarUtils.DEFAULT_ENCODING;
      String string0 = TarUtils.parseName(byteArray0, (int) (byte)7, (int) (byte)7, zipEncoding0);
      assertEquals("000007 ", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      // Undeclared exception!
      try { 
        TarUtils.formatNameBytes("{G@dg: yj$cN,UEbpy", byteArray0, 0, 238);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 20
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byteArray0[0] = (byte)5;
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte)5, byteArray0, (byte)5, (byte)5);
      assertEquals(10, int0);
      
      boolean boolean0 = TarUtils.parseBoolean(byteArray0, (byte)5);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = TarUtils.formatNameBytes("{G@dg: yj$cN,UEbpy", byteArray0, 1, (-917));
      assertEquals((-916), int0);
      
      boolean boolean0 = TarUtils.parseBoolean(byteArray0, 1);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)0}, byteArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      String string0 = TarUtils.parseName(byteArray0, 13, (int) (byte)7, zipEncoding0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte)8, byteArray0, (byte)8, (byte)8);
      assertEquals(16, int0);
      
      long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte)8, (byte)8);
      assertEquals(8L, long0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[39];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(281474976710656L, byteArray0, (byte)8, (byte)8);
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      int int0 = (-2147483646);
      // Undeclared exception!
      try { 
        TarUtils.formatCheckSumOctalBytes((byte)0, byteArray0, (-325), (-325));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -653
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte)7, byteArray0, (byte)7, (byte)7);
      assertEquals(14, int0);
      
      long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte)7, (byte)7);
      assertEquals(7L, long0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[47];
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes((-548L), byteArray0, 24, 24);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      long long0 = TarUtils.parseOctalOrBinary(byteArray0, (byte)0, 349);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      boolean boolean0 = TarUtils.parseBoolean(byteArray0, (byte)7);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      // Undeclared exception!
      try { 
        TarUtils.parseOctalOrBinary(byteArray0, (byte)0, (byte)0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Length 0 must be at least 2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      String string0 = TarUtils.parseName(byteArray0, 253, (-2086126971));
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      byte byte0 = (byte)0;
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes((byte)0, byteArray0, (byte)0, (byte)0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        TarUtils.formatNameBytes("oDJ,~qFrj33i(", byteArray0, 128, 128);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      byte[] byteArray0 = new byte[49];
      ZipEncoding zipEncoding0 = TarUtils.FALLBACK_ENCODING;
      // Undeclared exception!
      try { 
        TarUtils.formatNameBytes("Archive ends without any headers", byteArray0, (-539), (-539), zipEncoding0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes(2, byteArray0, 2, 2);
      assertEquals(4, int0);
      assertArrayEquals(new byte[] {(byte)0, (byte)0, (byte)50, (byte)32, (byte)0, (byte)0, (byte)0}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalBytes((-1500), (byte[]) null, (byte)0, (-1500));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // -1500=1777777777777777775044 will not fit in octal number buffer of length -1501
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      long long0 = TarUtils.computeCheckSum(byteArray0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      TarUtils.computeCheckSum(byteArray0);
      // Undeclared exception!
      try { 
        TarUtils.formatOctalBytes(7L, byteArray0, 15, 2);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // 7=7 will not fit in octal number buffer of length 0
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes((-1065L), byteArray0, (byte)5, (byte)5);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 9
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      byte[] byteArray0 = new byte[20];
      int int0 = TarUtils.formatLongOctalOrBinaryBytes((byte)5, byteArray0, (byte)5, (byte)5);
      assertEquals(10, int0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      // Undeclared exception!
      try { 
        TarUtils.formatLongOctalOrBinaryBytes((-652), (byte[]) null, (-652), (-652));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Value -652 is too large for -652 byte field.
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        TarUtils.verifyCheckSum(byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 148
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      // Undeclared exception!
      try { 
        TarUtils.parseName(byteArray0, 55, 55);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 109
         //
         verifyException("org.apache.commons.compress.archivers.tar.TarUtils", e);
      }
  }
}
