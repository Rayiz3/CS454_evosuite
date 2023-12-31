/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:35:20 GMT 2023
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.parser.HtmlTreeBuilder;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Parser;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class W3CDom_ESTest extends W3CDom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parseBodyFragmentRelaxed("xmlns:059k+CW#on!EC", "xmlns:059k+CW#on!EC");
      Attributes attributes0 = document0.attributes();
      attributes0.put("xmlns:059k+CW#on!EC", "S");
      attributes0.normalize();
      attributes0.remove("xmlnsrh85|?'z|90");
      Document document1 = document0.clone();
      Element element0 = document1.tagName("S");
      document1.normalise();
      document0.prependChild(element0);
      org.w3c.dom.Document document2 = w3CDom0.fromJsoup(document0);
      assertNotNull(document2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((org.w3c.dom.Document) null);
      Comment comment0 = new Comment("Nu\"MP9", "xmlns:");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(comment0, 17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parseBodyFragmentRelaxed("hml>\n<head><eta ]harset3UTL-8\"1</head>\n<body></b:dyi</html>", "hml>\n<head><eta ]harset3UTL-8\"1</head>\n<body></b:dyi</html>");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parseBodyFragmentRelaxed("xmlns:059k+CW#on!EC", "xmlns:059k+CW#on!EC");
      Attributes attributes0 = document0.attributes();
      attributes0.put("xmlns:059k+CW#on!EC", "xmlns:059k+CW#on!EC");
      document0.prependChild(document0);
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parseBodyFragmentRelaxed("xmlns:059k+CW#on!EC", "xmlns:059k+CW#on!EC");
      Attributes attributes0 = document0.attributes();
      attributes0.put("xmlns", "xmlns");
      document0.prependChild(document0);
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parseBodyFragmentRelaxed("<html>\n<head><meta 0harset=UTL-8\"></head>\n<body></b:dy>\n</html>", "<html>\n<head><meta 0harset=UTL-8\"></head>\n<body></b:dy>\n</html>");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      ParseSettings parseSettings0 = ParseSettings.preserveCase;
      Document document0 = Parser.parseBodyFragmentRelaxed("<html>\n<head><meta 0harset=UTL-8\"></head>\n<body></b:dy>\n</html>", "<html>\n<head><meta 0harset=UTL-8\"></head>\n<body></b:dy>\n</html>");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      DataNode dataNode0 = new DataNode("<html>\n<head><meta 0harset=UTL-8\"></head>\n<body></b:dy>\n</html>");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(dataNode0, 1267);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      HtmlTreeBuilder htmlTreeBuilder0 = new HtmlTreeBuilder();
      Document document0 = Parser.parse("4%-y", "4%-y");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      w3CDom_W3CBuilder0.head((Node) null, 100);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Document.createShell("html>\n<head><meta 0harset=UTL-8\"1</head>\n<body></b:dyi</html>");
      document0.prependElement("html>\n<head><meta 0harset=UTL-8\"1</head>\n<body></b:dyi</html>");
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      String string0 = w3CDom0.asString((org.w3c.dom.Document) null);
      assertEquals("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup((Document) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parseBodyFragmentRelaxed("", "");
      org.w3c.dom.Document document1 = w3CDom0.fromJsoup(document0);
      assertNotNull(document1);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      Document document0 = Parser.parse("xmlnsrh85|?'z|90", "xmlnsrh85|?'z|90");
      w3CDom0.fromJsoup(document0);
  }
}
