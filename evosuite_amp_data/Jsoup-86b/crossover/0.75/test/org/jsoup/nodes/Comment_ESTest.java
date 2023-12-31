/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:54:11 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.IllegalCharsetNameException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Comment_ESTest extends Comment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Comment comment0 = new Comment("! uN'B#0xHHr4U9D^@", "! uN'B#0xHHr4U9D^@");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Comment comment0 = new Comment("!9T%", "j2U7v#1lRgWE}sk)jC");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertTrue(boolean0);
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Comment comment0 = new Comment(" ", " ");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertFalse(boolean0);
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Comment comment0 = new Comment("!");
      comment0.clearAttributes();
      comment0.isXmlDeclaration();
      comment0.nodeName();
      comment0.toString();
      comment0.getData();
      comment0.nodeName();
      Appendable appendable0 = null;
      int int0 = (-3110);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.indentAmount(2147483645);
      Document.OutputSettings document_OutputSettings3 = document_OutputSettings2.clone();
      document_OutputSettings0.prettyPrint(false);
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      document_OutputSettings3.syntax(document_OutputSettings_Syntax0);
      document_OutputSettings2.prepareEncoder();
      // Undeclared exception!
      try { 
        document_OutputSettings3.charset("<script>One Two</script> <style>Three Four</style> <p>Fix Six</p>");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // <script>One Two</script> <style>Three Four</style> <p>Fix Six</p>
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = "sgG[21+";
      Comment comment0 = new Comment("sgG[21+", "!?xml version=\"1.0\" encoding=\"ISO-8859-1\"?");
      comment0.toString();
      comment0.toString();
      comment0.asXmlDeclaration();
      comment0.isXmlDeclaration();
      comment0.nodeName();
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "!?xml version=\"1.0\" encoding=\"ISO-8859-1\"?");
      int int0 = (-982);
      // Undeclared exception!
      try { 
        stringBuilder0.append((CharSequence) "#comment", (-982), (-982));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // start -982, end -982, s.length() 8
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Comment comment0 = new Comment("= ");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertFalse(boolean0);
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Comment comment0 = new Comment("@l10^q-", "@l10^q-");
      StringBuffer stringBuffer0 = new StringBuffer(927);
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.prettyPrint(false);
      comment0.outerHtmlHead(stringBuffer0, (-546), document_OutputSettings1);
      assertEquals("<!--@l10^q--->", stringBuffer0.toString());
      
      boolean boolean0 = comment0.isXmlDeclaration();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Comment comment0 = new Comment("??XML version='1' encoding='UTF-8' something='else'?", "??XML version='1' encoding='UTF-8' something='else'?");
      assertEquals("#comment", comment0.nodeName());
      
      // Undeclared exception!
      try { 
        comment0.asXmlDeclaration();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Comment comment0 = new Comment("= ");
      comment0.toString();
      // Undeclared exception!
      try { 
        comment0.asXmlDeclaration();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }
}
