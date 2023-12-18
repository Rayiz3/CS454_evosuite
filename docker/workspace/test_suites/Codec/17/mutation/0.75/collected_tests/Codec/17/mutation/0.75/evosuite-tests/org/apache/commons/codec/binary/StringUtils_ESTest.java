/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 15 22:21:45 GMT 2023
 */

package org.apache.commons.codec.binary;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import org.apache.commons.codec.binary.StringUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StringUtils_ESTest extends StringUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getBytesUtf16("");
      String string0 = "T+/w=";
      StringUtils.newStringUtf16Be(byteArray0);
      char[] charArray0 = new char[6];
      charArray0[0] = 'f';
      charArray0[1] = 'T';
      charArray0[2] = 'T';
      charArray0[3] = 'f';
      charArray0[4] = 'T';
      charArray0[5] = 'T';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringUtils.equals((CharSequence) "\u0000\u0000", (CharSequence) charBuffer0);
      StringUtils.getBytesUtf16Le("ceasar");
      byte[] byteArray1 = StringUtils.getBytesUtf16Be("T+/w=");
      StringUtils.getBytesIso8859_1("\u0000\u0000");
      String string1 = "";
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray1, "organiz");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // organiz: java.io.UnsupportedEncodingException: organiz
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getBytesUtf16("");
      StringUtils.getBytesIso8859_1("T+/w=");
      char[] charArray0 = new char[2];
      charArray0[0] = 'T';
      charArray0[1] = 'f';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) "ceasar", (CharSequence) charBuffer0);
      assertFalse(boolean0);
      
      StringUtils.getBytesUtf16Le("ceasar");
      byte[] byteArray1 = StringUtils.getBytesUsAscii("ceasar");
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.getByteBufferUtf8("archetype");
      StringUtils.getBytesUtf16("<p7gZvEA\"*2l;ypgq");
      StringUtils.newStringUtf16Be(byteArray1);
      boolean boolean1 = StringUtils.equals((CharSequence) "\u6365\u6173\u6172", (CharSequence) "\u0000\u0000");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringUtils.getBytesUtf16Be("Null string URL encoding test");
      String string0 = "";
      StringUtils.getBytesUtf16("");
      String string1 = ":M?bxm.1sci8";
      byte[] byteArray0 = StringUtils.getBytesIso8859_1(":M?bxm.1sci8");
      StringUtils.newStringUtf16Be(byteArray0);
      char[] charArray0 = new char[8];
      charArray0[0] = 'f';
      charArray0[1] = 'f';
      charArray0[2] = 'f';
      charArray0[3] = 'f';
      charArray0[4] = 'T';
      charArray0[5] = 'T';
      charArray0[6] = 'f';
      charArray0[7] = 'T';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      StringUtils.newStringIso8859_1(byteArray0);
      String string0 = "ceasar";
      byte[] byteArray1 = StringUtils.getBytesUtf16("");
      StringUtils.getBytesIso8859_1("T+/w=");
      StringUtils.newStringUtf16Be(byteArray1);
      char[] charArray0 = new char[2];
      charArray0[0] = 'T';
      charArray0[1] = 'f';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringUtils.equals((CharSequence) "ceasar", (CharSequence) charBuffer0);
      byte[] byteArray2 = StringUtils.getBytesUtf16Le("ceasar");
      StringUtils.getBytesUtf16Be("T+/w=");
      StringUtils.getBytesIso8859_1((String) null);
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray2, "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // : java.io.UnsupportedEncodingException: 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.getBytesUtf16("");
      StringUtils.getBytesIso8859_1("T+/w=");
      char[] charArray0 = new char[2];
      charArray0[0] = 'T';
      charArray0[1] = 'f';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.clear();
      StringUtils.equals((CharSequence) "ceasar", (CharSequence) charBuffer0);
      StringUtils.getBytesUtf16Le("ceasar");
      byte[] byteArray0 = StringUtils.getBytesUsAscii("ceasar");
      StringUtils.getByteBufferUtf8("archetype");
      StringUtils.getBytesUtf16("<p7gZvEA\"*2l;ypgq");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      assertEquals("\u6365\u6173\u6172", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
      StringUtils.newStringUtf16Be(byteArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) "", (CharSequence) null);
      assertFalse(boolean0);
      
      StringUtils.newStringUtf16(byteArray0);
      byte[] byteArray1 = StringUtils.getBytesUsAscii("");
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.equals((CharSequence) "", (CharSequence) "");
      StringUtils.newStringUtf16(byteArray1);
      boolean boolean1 = StringUtils.equals((CharSequence) "", (CharSequence) "");
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringUtils.newString((byte[]) null, "\f/Ny IT]3U^Eb");
      StringUtils.newStringUtf16((byte[]) null);
      StringUtils.newStringUtf16Be((byte[]) null);
      byte[] byteArray0 = new byte[0];
      StringUtils.newStringUsAscii(byteArray0);
      byte[] byteArray1 = new byte[9];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte)113;
      byteArray1[2] = (byte)1;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)9;
      byteArray1[5] = (byte)108;
      byteArray1[6] = (byte) (-1);
      byteArray1[7] = (byte) (-36);
      byteArray1[8] = (byte)103;
      String string0 = StringUtils.newStringUtf16Le(byteArray1);
      assertEquals("\u7100\u0001\u6C09\uFFFD\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String string0 = null;
      StringUtils.getBytesUnchecked((String) null, "");
      // Undeclared exception!
      try { 
        StringUtils.newStringIso8859_1((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Null string URL encoding test");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.equals((CharSequence) "Null string URL encoding test", (CharSequence) "Null string URL encoding test");
      byte[] byteArray1 = new byte[2];
      StringUtils.newStringUtf16(byteArray1);
      byte[] byteArray2 = StringUtils.getBytesUtf16Le("|_");
      String string1 = StringUtils.newStringUtf16(byteArray2);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Null string URL encoding test");
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.newStringUtf16(byteArray0);
      byte[] byteArray1 = StringUtils.getBytesUtf8("Null string URL encoding test");
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.newStringUsAscii(byteArray1);
      boolean boolean0 = StringUtils.equals((CharSequence) null, (CharSequence) "Null string URL encoding test");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("eK:0HeuF\"gqGW^-");
      StringUtils.equals((CharSequence) "eK:0HeuF\"gqGW^-", (CharSequence) "eK:0HeuF\"gqGW^-");
      byte[] byteArray1 = StringUtils.getBytesUtf16Le("eK:0HeuF\"gqGW^-");
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.newStringIso8859_1(byteArray1);
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.getBytesIso8859_1("eK:0HeuF\"gqGW^-");
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.getBytesUtf16Be("\uFFFD\uFFFD\u0000e\u0000K\u0000:\u00000\u0000H\u0000e\u0000u\u0000F\u0000\"\u0000g\u0000q\u0000G\u0000W\u0000^\u0000-");
      StringUtils.getBytesIso8859_1("\uFFFD\uFFFD\u0000e\u0000K\u0000:\u00000\u0000H\u0000e\u0000u\u0000F\u0000\"\u0000g\u0000q\u0000G\u0000W\u0000^\u0000-");
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8("");
      assertTrue(byteBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)0;
      byteArray1[1] = (byte) (-74);
      String string1 = StringUtils.newStringUtf8(byteArray1);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)0;
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      byte[] byteArray1 = StringUtils.getBytesUtf16("1}D]kS*");
      StringUtils.newStringUtf16Le(byteArray1);
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("q8ke,@VMC|@rYb", "1}D]kS*");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // 1}D]kS*: java.io.UnsupportedEncodingException: 1}D]kS*
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringUtils.newStringUtf16Be((byte[]) null);
      StringUtils.newStringUtf16Be((byte[]) null);
      StringUtils.newStringUtf16Le((byte[]) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-117);
      byteArray0[1] = (byte) (-66);
      byteArray0[2] = (byte)102;
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getBytesUtf8((String) null);
      StringUtils.getBytesUsAscii((String) null);
      StringUtils.getBytesUtf16Le("o9'qnO3 6W=|=MA{<r3");
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8("practical");
      assertEquals(9, byteBuffer0.remaining());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("sonic");
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.equals((CharSequence) "sonic", (CharSequence) "sonic");
      StringUtils.newStringUtf8(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.getBytesUtf16Be("sonic");
      byte[] byteArray1 = StringUtils.getBytesUtf8("#b )Y%");
      StringUtils.getByteBufferUtf8((String) null);
      StringUtils.newStringUtf8(byteArray1);
      byte[] byteArray2 = StringUtils.getBytesIso8859_1((String) null);
      assertNull(byteArray2);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringUtils.getBytesUtf16Le("5bcLMZLuLpE`-Lv~GeL");
      StringUtils stringUtils0 = new StringUtils();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringUtils.getBytesUsAscii("_4tdhp5D>V");
      StringUtils.getBytesIso8859_1("");
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // : java.io.UnsupportedEncodingException: 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Null string URL encoding test");
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.equals((CharSequence) "Null string URL encoding test", (CharSequence) "Null string URL encoding test");
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.getBytesUtf16Le("Null string URL encoding test");
      StringUtils stringUtils0 = new StringUtils();
      String string0 = StringUtils.newStringUtf16(byteArray0);
      assertEquals("Null string URL encoding test", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Le("org.apache.commons.codec.binary.StringUtils");
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      byte[] byteArray1 = StringUtils.getBytesUtf16Be((String) null);
      assertNull(byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Null string URL encoding test");
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.equals((CharSequence) "Null string URL encoding test", (CharSequence) "Null string URL encoding test");
      byte[] byteArray1 = new byte[1];
      StringUtils.newStringUtf16(byteArray1);
      StringUtils.getBytesUtf16Le("|_");
      StringUtils.newStringUtf16Be(byteArray1);
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8("D");
      assertTrue(byteBuffer0.hasRemaining());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      byte[] byteArray0 = StringUtils.getBytesUtf8("#b )Y%");
      StringUtils.newStringUtf8(byteArray0);
      byte[] byteArray1 = StringUtils.getBytesIso8859_1(": ");
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // : java.io.UnsupportedEncodingException: 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }
}