/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 19:45:29 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.Connection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.ParseSettings;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("select");
      attributes0.put("disabled", "name");
      FormElement formElement0 = new FormElement(tag0, "X5@V-", attributes0);
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "9Z;v K;X%'>Z", attributes0);
      formElement0.addElement(pseudoTextElement0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("select");
      attributes0.add("name", "name");
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "name", attributes0);
      formElement0.addElement(pseudoTextElement0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("input");
      FormElement formElement0 = new FormElement(tag0, "input", attributes0);
      attributes0.add("name", "name");
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("method", "POST");
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "method");
      ParseSettings parseSettings0 = ParseSettings.htmlDefault;
      Tag tag0 = Tag.valueOf("method", parseSettings0);
      Attributes attributes2 = attributes0.clone();
      FormElement formElement0 = new FormElement(tag0, "POST", attributes2);
      Element element0 = new Element(tag0, "method", attributes1);
      FormElement formElement1 = formElement0.addElement(element0);
      formElement0.addElement(formElement1);
      formElement1.formData();
      formElement0.text();
      FormElement formElement2 = new FormElement(tag0, "http://www.nytimes.com/2010/07/26/business/global/26bp.html?hp", attributes1);
      formElement2.submit();
      List<Connection.KeyVal> list0 = formElement2.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("method", "POST");
      Tag tag0 = Tag.valueOf("POST");
      FormElement formElement0 = new FormElement(tag0, "POST", attributes1);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: POST
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.add("action", "POS");
      Tag tag0 = Tag.valueOf("action");
      FormElement formElement0 = new FormElement(tag0, "action", attributes0);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Could not determine a form action URL for submit. Ensure you set a base URI when parsing.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Tag.valueOf("X5@V-");
      Tag tag0 = Tag.valueOf("select");
      Element element0 = new Element("select");
      Document.createShell("az");
      FormElement formElement0 = new FormElement(tag0, "button", (Attributes) null);
      FormElement formElement1 = formElement0.addElement(element0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("select");
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      assertEquals(0, formElement1.childNodeSize());
      
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("button");
      FormElement formElement0 = new FormElement(tag0, "button", attributes0);
      assertEquals("button", formElement0.nodeName());
      
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: button
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("PEX,");
      FormElement formElement0 = new FormElement(tag0, "PEX,", attributes0);
      formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("button");
      FormElement formElement0 = new FormElement(tag0, "button", attributes0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("_XI,");
      FormElement formElement0 = new FormElement(tag0, "_XI,", attributes0);
      Element element0 = new Element("input");
      // Undeclared exception!
      try { 
        formElement0.removeChild(element0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tag tag0 = Tag.valueOf("d8t]juxnSG");
      CDataNode cDataNode0 = new CDataNode("method");
      Attributes attributes0 = cDataNode0.attributes();
      Attributes attributes1 = attributes0.add("}|{v", "option[selected]");
      Attributes attributes2 = attributes1.clone();
      FormElement formElement0 = new FormElement(tag0, "d8t]juxnSG", attributes2);
      Elements elements0 = formElement0.elements();
      assertEquals(0, elements0.size());
  }
}
