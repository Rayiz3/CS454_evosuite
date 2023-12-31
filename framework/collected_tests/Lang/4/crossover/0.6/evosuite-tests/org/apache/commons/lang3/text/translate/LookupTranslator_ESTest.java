/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 20:45:20 GMT 2023
 */

package org.apache.commons.lang3.text.translate;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.CharBuffer;
import org.apache.commons.lang3.text.translate.LookupTranslator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.testcarver.testcase.EvoSuiteXStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LookupTranslator_ESTest extends LookupTranslator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = EvoSuiteXStream.fromString("<string-buffer>one</string-buffer>");
      EvoSuiteXStream.fromString("<string-buffer>two</string-buffer>");
      CharSequence[][] charSequenceArray0 = new CharSequence[3][5];
      CharSequence[] charSequenceArray1 = new CharSequence[2];
      charSequenceArray1[0] = (CharSequence) "<string-buffer>one</string-buffer>";
      charSequenceArray1[1] = (CharSequence) "<string-buffer>one</string-buffer>";
      charSequenceArray0[0] = charSequenceArray1;
      CharSequence[] charSequenceArray2 = new CharSequence[6];
      charSequenceArray2[0] = (CharSequence) "<string-buffer>one</string-buffer>";
      charSequenceArray2[1] = (CharSequence) object0;
      charSequenceArray2[2] = (CharSequence) object0;
      charSequenceArray2[3] = (CharSequence) "<string-buffer>two</string-buffer>";
      charSequenceArray2[4] = (CharSequence) "<string-buffer>two</string-buffer>";
      charSequenceArray2[5] = (CharSequence) "<string-buffer>two</string-buffer>";
      charSequenceArray0[1] = charSequenceArray2;
      CharSequence[] charSequenceArray3 = new CharSequence[5];
      charSequenceArray3[0] = (CharSequence) "<string-buffer>two</string-buffer>";
      charSequenceArray3[1] = (CharSequence) "<string-buffer>one</string-buffer>";
      charSequenceArray3[2] = (CharSequence) "<string-buffer>one</string-buffer>";
      charSequenceArray3[3] = (CharSequence) "<string-buffer>two</string-buffer>";
      charSequenceArray3[4] = (CharSequence) "<string-buffer>one</string-buffer>";
      charSequenceArray0[2] = charSequenceArray3;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      EvoSuiteXStream.fromString("<string-buffer>one</string-buffer>");
      EvoSuiteXStream.fromString("<string-buffer>one</string-buffer>");
      StringWriter stringWriter0 = new StringWriter();
      StringWriter stringWriter1 = stringWriter0.append(charSequenceArray2[4]);
      lookupTranslator0.translate((CharSequence) "<string-buffer>one</string-buffer>", 0, (Writer) stringWriter1);
      int int0 = lookupTranslator0.translate((CharSequence) "<string-buffer>one</string-buffer>", 1892, (Writer) stringWriter0);
      assertEquals("<string-buffer>two</string-buffer>one", stringWriter0.toString());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LookupTranslator lookupTranslator0 = new LookupTranslator((CharSequence[][]) null);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object object0 = EvoSuiteXStream.fromString("<string-buffer>on9</string-buffer>");
      CharSequence[] charSequenceArray0 = new CharSequence[2];
      charSequenceArray0[0] = (CharSequence) object0;
      CharSequence[][] charSequenceArray1 = new CharSequence[1][6];
      charSequenceArray1[0] = charSequenceArray0;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray1);
      lookupTranslator0.translate((CharSequence) "<string-buffer>on9</string-buffer>");
      LookupTranslator lookupTranslator1 = new LookupTranslator(charSequenceArray1);
      assertFalse(lookupTranslator1.equals((Object)lookupTranslator0));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[0][5];
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1803);
      lookupTranslator0.translate((CharSequence) charBuffer0);
      LookupTranslator lookupTranslator1 = new LookupTranslator(charSequenceArray0);
      assertFalse(lookupTranslator1.equals((Object)lookupTranslator0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[0][5];
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray0);
      StringWriter stringWriter0 = new StringWriter();
      StringBuffer stringBuffer0 = stringWriter0.getBuffer();
      int int0 = lookupTranslator0.translate((CharSequence) stringBuffer0, 117, (Writer) stringWriter0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = EvoSuiteXStream.fromString("<string-buffer>one</string-buffer>");
      EvoSuiteXStream.fromString("<string-buffer>two</string-buffer>");
      CharSequence[] charSequenceArray0 = new CharSequence[2];
      charSequenceArray0[0] = (CharSequence) object0;
      CharSequence[][] charSequenceArray1 = new CharSequence[2][6];
      charSequenceArray1[0] = charSequenceArray0;
      charSequenceArray1[1] = charSequenceArray0;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = EvoSuiteXStream.fromString("<string-buffer>one</string-buffer>");
      CharSequence[] charSequenceArray0 = new CharSequence[2];
      charSequenceArray0[0] = (CharSequence) object0;
      CharSequence[][] charSequenceArray1 = new CharSequence[1][6];
      charSequenceArray1[0] = charSequenceArray0;
      LookupTranslator lookupTranslator0 = new LookupTranslator(charSequenceArray1);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CharSequence[][] charSequenceArray0 = new CharSequence[11][6];
      LookupTranslator lookupTranslator0 = null;
      try {
        lookupTranslator0 = new LookupTranslator(charSequenceArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.lang3.text.translate.LookupTranslator", e);
      }
  }
}
