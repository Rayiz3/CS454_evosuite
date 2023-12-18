/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 10:17:29 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thoughtworks.xstream.io.StreamException;
import java.io.StringReader;
import java.nio.CharBuffer;
import org.apache.commons.csv.ExtendedBufferedReader;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.testcarver.testcase.EvoSuiteXStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ExtendedBufferedReader_ESTest extends ExtendedBufferedReader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hello,\n\n\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      StringReader stringReader1 = new StringReader("hello,\n\n\n");
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(stringReader1);
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(stringReader1);
      int int0 = ExtendedBufferedReader.UNDEFINED;
      ExtendedBufferedReader extendedBufferedReader3 = new ExtendedBufferedReader(extendedBufferedReader2);
      String string0 = extendedBufferedReader1.readLine();
      extendedBufferedReader1.read();
      extendedBufferedReader2.read();
      ExtendedBufferedReader extendedBufferedReader4 = new ExtendedBufferedReader(extendedBufferedReader0);
      ExtendedBufferedReader extendedBufferedReader5 = new ExtendedBufferedReader(extendedBufferedReader1);
      String string1 = extendedBufferedReader5.readLine();
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StringReader stringReader0 = new StringReader("hello,\n\n\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      CharBuffer.wrap((CharSequence) "hello,\n\n\n");
      int int0 = ExtendedBufferedReader.UNDEFINED;
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(extendedBufferedReader0);
      String string0 = extendedBufferedReader1.readLine();
      extendedBufferedReader2.readLine();
      stringReader0.reset();
      extendedBufferedReader1.read();
      extendedBufferedReader2.read();
      ExtendedBufferedReader extendedBufferedReader3 = new ExtendedBufferedReader(extendedBufferedReader0);
      String string1 = extendedBufferedReader2.readLine();
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int int0 = ExtendedBufferedReader.END_OF_STREAM;
      StringReader stringReader0 = new StringReader("hello,\n\n\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      extendedBufferedReader0.readLine();
      String string0 = extendedBufferedReader0.readLine();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int int0 = ExtendedBufferedReader.END_OF_STREAM;
      StringReader stringReader0 = new StringReader("hello,\n\n\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      extendedBufferedReader0.lookAhead();
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      extendedBufferedReader0.readLine();
      extendedBufferedReader0.read();
      extendedBufferedReader1.lookAhead();
      String string0 = extendedBufferedReader1.readLine();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int int0 = ExtendedBufferedReader.END_OF_STREAM;
      StringReader stringReader0 = new StringReader("hello,\n\n\n");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      extendedBufferedReader0.lookAhead();
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      String string0 = extendedBufferedReader0.readLine();
      String string1 = extendedBufferedReader1.readLine();
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^`>xJ ");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      stringReader0.reset();
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      int int0 = extendedBufferedReader1.read();
      assertEquals(94, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StringReader stringReader0 = new StringReader("j,uJ~'BbeV");
      StringReader stringReader1 = new StringReader("j,uJ~'BbeV");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      StringReader stringReader2 = new StringReader("^`>xJ ");
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(stringReader2);
      extendedBufferedReader1.readLine();
      extendedBufferedReader0.readLine();
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(stringReader1);
      ExtendedBufferedReader extendedBufferedReader3 = new ExtendedBufferedReader(extendedBufferedReader2);
      int int0 = extendedBufferedReader1.getLineNumber();
      ExtendedBufferedReader extendedBufferedReader4 = new ExtendedBufferedReader(extendedBufferedReader3);
      extendedBufferedReader4.getLineNumber();
      int int1 = ExtendedBufferedReader.END_OF_STREAM;
      char[] charArray0 = new char[3];
      charArray0[0] = 'c';
      charArray0[1] = 'F';
      charArray0[2] = 'x';
      int int2 = extendedBufferedReader4.read(charArray0, 0, 1);
      assertTrue(int2 == int0);
      assertEquals(1, int2);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^`>xJ ");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      stringReader0.reset();
      char[] charArray0 = new char[0];
      extendedBufferedReader0.read(charArray0);
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      int int0 = extendedBufferedReader1.read();
      assertEquals(94, int0);
      
      int int1 = extendedBufferedReader0.read();
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StringReader stringReader0 = new StringReader("  x");
      StringReader stringReader1 = new StringReader("");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      StringReader stringReader2 = new StringReader("^`>xJ ");
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(stringReader2);
      extendedBufferedReader0.readLine();
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(stringReader1);
      CharBuffer charBuffer0 = CharBuffer.wrap((CharSequence) "^`>xJ ");
      extendedBufferedReader2.read(charBuffer0);
      ExtendedBufferedReader extendedBufferedReader3 = new ExtendedBufferedReader(extendedBufferedReader1);
      extendedBufferedReader3.readLine();
      extendedBufferedReader1.readLine();
      // Undeclared exception!
      try { 
        EvoSuiteXStream.fromString("6n2Z.4W*'!");
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         // 
         //
         verifyException("com.thoughtworks.xstream.io.xml.XppReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6*;pF");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      char[] charArray0 = new char[6];
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      int int0 = ExtendedBufferedReader.END_OF_STREAM;
      extendedBufferedReader0.read();
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(extendedBufferedReader0);
      extendedBufferedReader2.readLine();
      extendedBufferedReader0.readLine();
      ExtendedBufferedReader extendedBufferedReader3 = new ExtendedBufferedReader(extendedBufferedReader0);
      extendedBufferedReader3.getLineNumber();
      ExtendedBufferedReader extendedBufferedReader4 = new ExtendedBufferedReader(extendedBufferedReader2);
      extendedBufferedReader2.getLineNumber();
      extendedBufferedReader2.read();
      String string0 = extendedBufferedReader0.readLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      int int0 = extendedBufferedReader0.read();
      assertEquals((-1), int0);
      
      StringReader stringReader1 = new StringReader("]|0}4W={E?|Gmnw");
      StringReader stringReader2 = new StringReader("]|0}4W={E?|Gmnw");
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(stringReader2);
      extendedBufferedReader0.readLine();
      extendedBufferedReader1.readLine();
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(extendedBufferedReader0);
      extendedBufferedReader2.readLine();
      extendedBufferedReader2.readLine();
      int int1 = extendedBufferedReader0.getLineNumber();
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      extendedBufferedReader0.read();
      extendedBufferedReader0.getLineNumber();
      extendedBufferedReader0.readAgain();
      char[] charArray0 = new char[1];
      charArray0[0] = 'Q';
      // Undeclared exception!
      try { 
        extendedBufferedReader0.read(charArray0, (-1), (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.BufferedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6;;,pF");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      int int0 = extendedBufferedReader1.read();
      assertEquals(54, int0);
      
      int int1 = extendedBufferedReader0.read();
      assertEquals((-1), int1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      String string0 = extendedBufferedReader0.readLine();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringReader stringReader0 = new StringReader("^`>xJ ");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      int int0 = extendedBufferedReader0.lookAhead();
      int int1 = extendedBufferedReader0.read();
      assertTrue(int1 == int0);
      assertEquals(94, int1);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringReader stringReader0 = new StringReader("6;;,pF");
      char[] charArray0 = new char[0];
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      String string0 = extendedBufferedReader0.readLine();
      assertEquals("6;;,pF", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      int int0 = extendedBufferedReader0.read();
      assertEquals((-1), int0);
      
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      extendedBufferedReader1.getLineNumber();
      ExtendedBufferedReader extendedBufferedReader2 = new ExtendedBufferedReader(extendedBufferedReader1);
      int int1 = extendedBufferedReader0.getLineNumber();
      assertEquals(0, int1);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringReader stringReader0 = new StringReader("");
      ExtendedBufferedReader extendedBufferedReader0 = new ExtendedBufferedReader(stringReader0);
      extendedBufferedReader0.read();
      ExtendedBufferedReader extendedBufferedReader1 = new ExtendedBufferedReader(extendedBufferedReader0);
      String string0 = extendedBufferedReader1.readLine();
      assertNull(string0);
  }
}