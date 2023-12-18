/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 15 23:04:53 GMT 2023
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
      byte[] byteArray0 = new byte[20];
      byte byte0 = (byte)0;
      StringUtils.newStringIso8859_1(byteArray0);
      String string0 = "=/E_";
      StringUtils.getBytesUtf16Be("=/E_");
      byte[] byteArray1 = new byte[5];
      byteArray1[0] = (byte) (-6);
      byteArray1[1] = (byte)101;
      byteArray1[2] = (byte)0;
      byteArray1[3] = (byte)0;
      byteArray1[4] = (byte)0;
      StringUtils.newStringUsAscii(byteArray1);
      CharSequence charSequence0 = null;
      StringUtils.equals((CharSequence) "\uFFFDe\u0000\u0000\u0000", (CharSequence) null);
      StringUtils.getBytesUtf16("=/E_");
      StringUtils.getBytesUtf16Be("=/E_");
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", "LINUX");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // LINUX: java.io.UnsupportedEncodingException: LINUX
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'z';
      charArray0[1] = 'I';
      charArray0[2] = 's';
      charArray0[3] = '\"';
      charArray0[4] = '';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      StringUtils.newStringUtf16Be((byte[]) null);
      StringUtils.equals((CharSequence) null, (CharSequence) charBuffer0);
      StringUtils.newString((byte[]) null, "");
      String string0 = StringUtils.newStringUtf16Be((byte[]) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'z';
      charArray0[1] = 'I';
      charArray0[2] = 's';
      charArray0[3] = '\"';
      charArray0[4] = '';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.charAt(1);
      charBuffer0.order();
      boolean boolean0 = StringUtils.equals((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)105;
      byteArray0[3] = (byte)96;
      byteArray0[4] = (byte)105;
      byteArray0[5] = (byte)26;
      byteArray0[6] = (byte) (-1);
      StringUtils.newStringUtf16Be(byteArray0);
      boolean boolean1 = StringUtils.equals((CharSequence) "\u00FF\u6960\u691A\uFF00", (CharSequence) charBuffer0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-104);
      StringUtils.newStringUtf16Be(byteArray0);
      char[] charArray0 = new char[9];
      charArray0[0] = '';
      charArray0[1] = 'g';
      charArray0[2] = '';
      charArray0[3] = '';
      charArray0[4] = '';
      charArray0[5] = 'n';
      charArray0[6] = '';
      charArray0[7] = '';
      charArray0[8] = ';';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.order();
      StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "\uFFFD");
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "qkm");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // qkm: java.io.UnsupportedEncodingException: qkm
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      char[] charArray0 = new char[5];
      charArray0[0] = 'z';
      charArray0[1] = 'I';
      charArray0[2] = 's';
      charArray0[3] = '\"';
      charArray0[4] = 's';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      charBuffer0.order();
      StringUtils.equals((CharSequence) charBuffer0, (CharSequence) charBuffer0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-1);
      byteArray0[2] = (byte)105;
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.equals((CharSequence) "\u00FF\u6900\u0000\u0000", (CharSequence) charBuffer0);
      StringUtils.newStringUtf16(byteArray0);
      String string0 = "";
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

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-104);
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf16Le(byteArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) "\uFFFD", (CharSequence) "\uFFFD");
      StringUtils.getBytesUtf16Be("v:*[fGJI,5D?&S(I");
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf8(byteArray0);
      StringUtils.getByteBufferUtf8("");
      StringUtils.getBytesUtf8("9=i`IwH_$9w");
      StringUtils.getBytesUtf16("\uFFFD");
      StringUtils.getBytesUtf16("\uFFFD");
      StringUtils.getBytesUtf16Le("");
      StringUtils.equals((CharSequence) "\uFFFD", (CharSequence) "9=i`IwH_$9w");
      StringUtils stringUtils0 = new StringUtils();
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "9=i`IwH_$9w");
      boolean boolean1 = StringUtils.equals((CharSequence) "\uFFFD", (CharSequence) charBuffer0);
      assertFalse(boolean1);
      
      StringUtils.getByteBufferUtf8("\uFFFD");
      StringUtils.getBytesIso8859_1("?=?5r|l,+m*s8yQ'n");
      boolean boolean2 = StringUtils.equals((CharSequence) "", (CharSequence) "?=?5r|l,+m*s8yQ'n");
      assertFalse(boolean2 == boolean0);
      assertFalse(boolean2);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("};J]`[^DbL!8D;EU");
      StringUtils.equals((CharSequence) null, (CharSequence) "};J]`[^DbL!8D;EU");
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils stringUtils0 = new StringUtils();
      byte[] byteArray1 = new byte[0];
      StringUtils.newStringUtf8(byteArray1);
      byte[] byteArray2 = StringUtils.getBytesIso8859_1("BfLV0wXM?cP[>/");
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.getBytesUsAscii("\uFEFF};J]`[^DbL!8D;EU");
      byte[] byteArray3 = StringUtils.getBytesUsAscii("5.TKDD&(^QK");
      StringUtils.equals((CharSequence) null, (CharSequence) "BfLV0wXM?cP[>/");
      StringUtils.newStringUtf8(byteArray2);
      StringUtils.newStringIso8859_1(byteArray0);
      String string1 = StringUtils.newStringUtf16Le(byteArray3);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.getBytesUtf16("x<X~ood}");
      StringUtils.equals((CharSequence) null, (CharSequence) null);
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-115);
      String string0 = StringUtils.newStringUtf8(byteArray0);
      assertEquals("\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringUtils.newStringUtf16Be((byte[]) null);
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("?u}ouLTnBv>E:l", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // : java.io.UnsupportedEncodingException: 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("");
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.equals((CharSequence) "", (CharSequence) "");
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, ": ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // : : java.io.UnsupportedEncodingException: : 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8("");
      assertTrue(byteBuffer0.hasArray());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringUtils.getBytesUsAscii("%[\"A}%h");
      byte[] byteArray0 = StringUtils.getBytesUtf8("%[\"A}%h");
      assertArrayEquals(new byte[] {(byte)37, (byte)91, (byte)34, (byte)65, (byte)125, (byte)37, (byte)104}, byteArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringUtils.getBytesUtf16Le((String) null);
      StringUtils.newStringUtf16((byte[]) null);
      StringUtils.newStringUtf8((byte[]) null);
      StringUtils.newStringUsAscii((byte[]) null);
      StringUtils.getByteBufferUtf8((String) null);
      StringUtils.getBytesUtf8("Z%nxA|w|g1Z");
      StringUtils.getBytesIso8859_1((String) null);
      StringUtils.getBytesUtf16((String) null);
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("Z%nxA|w|g1Z");
      byte[] byteArray1 = StringUtils.getBytesUtf16("Z%nxA|w|g1Z");
      assertFalse(byteArray1.equals((Object)byteArray0));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte)1;
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.newStringUsAscii(byteArray0);
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      assertNotNull(string0);
      
      boolean boolean0 = StringUtils.equals((CharSequence) "\uFFFD", (CharSequence) "\uFFFD");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.equals((CharSequence) "\u0000", (CharSequence) "\u0000\u0000");
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "\u0000");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // \u0000: java.io.UnsupportedEncodingException: \u0000
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      StringUtils.newStringUtf16(byteArray0);
      byte[] byteArray1 = StringUtils.getBytesUtf16Be("");
      assertArrayEquals(new byte[] {}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[0];
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.equals((CharSequence) "\u0000", (CharSequence) "\u0000");
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "\u0000");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // \u0000: java.io.UnsupportedEncodingException: \u0000
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      StringUtils.getByteBufferUtf8("CNv=6R#`fluR~&");
      StringUtils.getBytesUtf16((String) null);
      StringUtils.getBytesUtf8("CNv=6R#`fluR~&");
      byte[] byteArray0 = StringUtils.getBytesUnchecked((String) null, "CNv=6R#`fluR~&");
      assertNull(byteArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      StringUtils.newStringIso8859_1(byteArray0);
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "\u0000\u0000");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // \u0000\u0000: java.io.UnsupportedEncodingException: \u0000\u0000
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }
}
