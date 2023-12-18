/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:58:19 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.Document;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Comment_ESTest extends Comment_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Comment comment0 = new Comment("^/Cwp*JW");
      comment0.asXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Comment comment0 = new Comment("!-->");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Comment comment0 = new Comment(">+O!5\"-/w5>U^", ">+O!5\"-/w5>U^");
      assertEquals("#comment", comment0.nodeName());
      
      Comment comment1 = new Comment(">+O!5\"-/w5>U^", ">+O!5\"-/w5>U^");
      comment1.coreValue("!1`6`TcqYXd;@wqL<b");
      Comment comment2 = new Comment(">+O!5\"-/w5>U^");
      boolean boolean0 = comment1.isXmlDeclaration();
      assertTrue(boolean0);
      assertEquals("#comment", comment1.nodeName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Comment comment0 = new Comment("", "");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comment comment0 = new Comment("T`^0K%;4fsxQ5$Y", "T`^0K%;4fsxQ5$Y");
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
  public void test05()  throws Throwable  {
      Comment comment0 = new Comment(">+O!5\"-/w5>U^", ">+O!5\"-/w5>U^");
      comment0.isXmlDeclaration();
      boolean boolean0 = comment0.isXmlDeclaration();
      assertFalse(boolean0);
      
      comment0.nextSibling();
      comment0.nodeName();
      String string0 = comment0.nodeName();
      assertEquals("#comment", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Comment comment0 = new Comment("?^/Cwp*JW");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comment comment0 = new Comment("-->");
      boolean boolean0 = comment0.isXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Comment comment0 = new Comment(".K~Hgy>n(");
      assertFalse(comment0.hasParent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comment comment0 = new Comment("k`eIMB_=Ulm%@!r$");
      String string0 = comment0.toString();
      assertEquals("\n<!--k`eIMB_=Ulm%@!r$-->", string0);
      
      boolean boolean0 = comment0.isXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Comment comment0 = new Comment(" Threy", " Threy");
      StringBuilder stringBuilder0 = new StringBuilder();
      Document.OutputSettings document_OutputSettings0 = new Document.OutputSettings();
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.outline(true);
      document_OutputSettings1.clone();
      Document.OutputSettings document_OutputSettings2 = document_OutputSettings1.prettyPrint(false);
      comment0.outerHtmlHead(stringBuilder0, 3623, document_OutputSettings2);
      assertEquals("<!-- Threy-->", stringBuilder0.toString());
      
      comment0.asXmlDeclaration();
      assertEquals("#comment", comment0.nodeName());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Comment comment0 = new Comment("ckE4RYA");
      String string0 = comment0.getData();
      assertEquals("#comment", comment0.nodeName());
      assertEquals("ckE4RYA", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Comment comment0 = new Comment("-->");
      comment0.outerHtml();
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