/*
 * This file was automatically generated by EvoSuite
 * Fri Dec 15 22:31:29 GMT 2023
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
      byte[] byteArray0 = StringUtils.getBytesUtf16(": ");
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.getBytesUtf8((String) null);
      boolean boolean0 = StringUtils.equals((CharSequence) "\uFFFD\uFFFD\u0000:\u0000 ", (CharSequence) "\uFEFF: ");
      assertFalse(boolean0);
      
      StringUtils.equals((CharSequence) null, (CharSequence) "$4c;vO#<C 88&u");
      StringUtils.newStringUtf8(byteArray0);
      StringUtils.newString((byte[]) null, "zH/_MoY06=R");
      StringUtils.equals((CharSequence) "\uFFFD\uFFFD\u0000:\u0000 ", (CharSequence) null);
      boolean boolean1 = StringUtils.equals((CharSequence) "\uFFFD\uFFFD\u0000:\u0000 ", (CharSequence) null);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringUtils.getBytesUtf8("");
      boolean boolean0 = StringUtils.equals((CharSequence) "$4c;vO#<C 88&u", (CharSequence) "");
      assertFalse(boolean0);
      
      boolean boolean1 = StringUtils.equals((CharSequence) null, (CharSequence) "");
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StringUtils.getBytesUnchecked((String) null, "$4c;vO#<C 88&u");
      boolean boolean0 = StringUtils.equals((CharSequence) "", (CharSequence) "");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringUtils.getBytesUtf16Le("sT}\u0004jA>h\",..#}");
      byte[] byteArray0 = StringUtils.getBytesIso8859_1("Windows Server 2012");
      StringUtils.getByteBufferUtf8("|xUJ:j");
      StringUtils.getBytesUtf16("RSP_kNfyE,M)[b<!`");
      byte[] byteArray1 = StringUtils.getBytesUtf8("|xUJ:j");
      StringUtils.newStringUtf16Be(byteArray1);
      byte[] byteArray2 = StringUtils.getBytesUsAscii("sT}\u0004jA>h\",..#}");
      StringUtils.newStringUtf16Be(byteArray2);
      StringUtils.getByteBufferUtf8("sT}\u0004jA>h\",..#}");
      byte[] byteArray3 = StringUtils.getBytesUtf16Le("Windows Server 2012");
      StringUtils.getByteBufferUtf8("");
      StringUtils.equals((CharSequence) "\u7354\u7D5C\u346A\u413E\u6822\u2C2E\u2E23\uFFFD", (CharSequence) "Windows Server 2012");
      StringUtils.newStringUsAscii(byteArray3);
      StringUtils.equals((CharSequence) "Windows Server 2012", (CharSequence) "\u7354\u7D5C\u346A\u413E\u6822\u2C2E\u2E23\uFFFD");
      StringUtils.equals((CharSequence) "Windows Server 2012", (CharSequence) "");
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getByteBufferUtf8("d%oDVZ=xufL|B:");
      boolean boolean0 = StringUtils.equals((CharSequence) "RSP_kNfyE,M)[b<!`", (CharSequence) "\u7354\u7D5C\u346A\u413E\u6822\u2C2E\u2E23\uFFFD");
      StringUtils.equals((CharSequence) "RSP_kNfyE,M)[b<!`", (CharSequence) "\u7354\u7D5C\u346A\u413E\u6822\u2C2E\u2E23\uFFFD");
      StringUtils.newStringUtf16(byteArray2);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "\u7354\u7D5C\u346A\u413E\u6822\u2C2E\u2E23\uFFFD");
      boolean boolean1 = StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "\u7354\u7D5C\u346A\u413E\u6822\u2C2E\u2E23\uFFFD");
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StringUtils.getByteBufferUtf8("");
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte) (-11);
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.getBytesUtf16("");
      CharBuffer charBuffer0 = CharBuffer.allocate((byte)1);
      StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "\uF500\u0000\u0000\uFFFD");
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getBytesIso8859_1("[iL:z");
      StringUtils.getBytesUtf16Le("");
      StringUtils.equals((CharSequence) "\uF500\u0000\u0000\uFFFD", (CharSequence) charBuffer0);
      StringUtils.getBytesUtf16("");
      StringUtils.getBytesUtf8("");
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("\uF500\u0000\u0000\uFFFD", "");
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
      byte[] byteArray0 = StringUtils.getBytesIso8859_1(": ");
      StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.equals((CharSequence) ": ", (CharSequence) "\u203A");
      String string0 = "";
      StringUtils.getBytesUtf8("");
      char[] charArray0 = new char[1];
      charArray0[0] = 'u';
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      // Undeclared exception!
      try { 
        StringUtils.equals((CharSequence) charBuffer0, (CharSequence) "");
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16(": ");
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getByteBufferUtf8("\u00FE\u00FF\u0000:\u0000 ");
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      StringUtils.equals((CharSequence) "\u00FE\u00FF\u0000:\u0000 ", (CharSequence) "\u00FE\u00FF\u0000:\u0000 ");
      byte[] byteArray1 = StringUtils.getBytesUtf16Le("\u00FE\u00FF\u0000:\u0000 ");
      StringUtils.getBytesUtf16Be("\u00FE\u00FF\u0000:\u0000 ");
      StringUtils.newStringIso8859_1(byteArray1);
      ByteBuffer byteBuffer0 = StringUtils.getByteBufferUtf8((String) null);
      assertNull(byteBuffer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringUtils stringUtils0 = new StringUtils();
      byte[] byteArray0 = new byte[7];
      byteArray0[0] = (byte)72;
      byteArray0[1] = (byte)1;
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("AAA/\r\n", "");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // : java.io.UnsupportedEncodingException: 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("");
      StringUtils.newStringIso8859_1(byteArray0);
      boolean boolean0 = StringUtils.equals((CharSequence) "", (CharSequence) "");
      boolean boolean1 = StringUtils.equals((CharSequence) "$4c;vO#<C 88&u", (CharSequence) "");
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringUtils.getBytesUsAscii((String) null);
      StringUtils.newStringUsAscii((byte[]) null);
      String string0 = StringUtils.newString((byte[]) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16("G~>A5YqBpWlRm =a]D");
      assertNotNull(byteArray0);
      
      StringUtils.equals((CharSequence) "$4c;vO#<C 88&u", (CharSequence) "G~>A5YqBpWlRm =a]D");
      boolean boolean0 = StringUtils.equals((CharSequence) ": ", (CharSequence) "$4c;vO#<C 88&u");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String string0 = "sT}\\4jA>h\",..#}";
      StringUtils.getBytesUtf16Le("sT}\u0004jA>h\",..#}");
      String string1 = "I";
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("sT}\u0004jA>h\",..#}", "sR<`AR)Y\u0004>{");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // sR<`AR)Y\u0004>{: java.io.UnsupportedEncodingException: sR<`AR)Y\u0004>{
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16Be("");
      String string0 = StringUtils.newStringUsAscii(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf16(": ");
      StringUtils.newStringIso8859_1(byteArray0);
      StringUtils.getByteBufferUtf8("\u00FE\u00FF\u0000:\u0000 ");
      StringUtils.newStringUsAscii(byteArray0);
      StringUtils.newStringUtf16(byteArray0);
      StringUtils.newStringUtf16Be(byteArray0);
      // Undeclared exception!
      try { 
        StringUtils.newString(byteArray0, "\u00FE\u00FF\u0000:\u0000 ");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // \u00FE\u00FF\u0000:\u0000 : java.io.UnsupportedEncodingException: \u00FE\u00FF\u0000:\u0000 
         //
         verifyException("org.apache.commons.codec.binary.StringUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii("");
      StringUtils.newStringUsAscii(byteArray0);
      String string0 = StringUtils.newStringUtf16Be(byteArray0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = StringUtils.equals((CharSequence) "$4c;vO#<C 88&u", (CharSequence) "");
      boolean boolean1 = StringUtils.equals((CharSequence) "$4c;vO#<C 88&u", (CharSequence) "$4c;vO#<C 88&u");
      assertFalse(boolean1 == boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUtf8("G~>A5YqWlRm =a]D");
      assertNotNull(byteArray0);
      
      boolean boolean0 = StringUtils.equals((CharSequence) "G~>A5YqWlRm =a]D", (CharSequence) "G~>A5YqWlRm =a]D");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii("");
      StringUtils.newStringUsAscii(byteArray0);
      String string0 = StringUtils.newStringUtf16Le(byteArray0);
      StringUtils.getBytesUtf16Be("");
      byte[] byteArray1 = StringUtils.getBytesIso8859_1("");
      StringUtils.newStringUtf16(byteArray1);
      String string1 = StringUtils.newStringUtf8(byteArray1);
      assertTrue(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[1];
      byteArray0[0] = (byte) (-105);
      String string0 = StringUtils.newStringUtf16(byteArray0);
      assertEquals("\uFFFD", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = StringUtils.getBytesUsAscii("");
      StringUtils.newStringUsAscii(byteArray0);
      // Undeclared exception!
      try { 
        StringUtils.getBytesUnchecked("", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringUtils.getBytesUtf8("");
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
}