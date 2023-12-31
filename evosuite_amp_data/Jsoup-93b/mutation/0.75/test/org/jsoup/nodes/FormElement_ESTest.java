/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 19:38:28 GMT 2023
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
import org.jsoup.nodes.Attribute;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("input");
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "NAME", attributes0);
      Attribute attribute0 = new Attribute("disabled", ",pQ5&");
      attributes0.put(attribute0);
      FormElement formElement0 = new FormElement(tag0, "NAME", attributes0);
      FormElement formElement1 = formElement0.addElement(pseudoTextElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("input");
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "name", attributes0);
      attributes0.add("name", "input");
      FormElement formElement0 = new FormElement(tag0, "input", attributes0);
      formElement0.addElement(pseudoTextElement0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("method");
      Attributes attributes0 = new Attributes();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "method");
      Attributes attributes1 = attributes0.put("method", "text");
      Attribute attribute0 = new Attribute("method", "POST", attributes1);
      Attribute attribute1 = new Attribute("BXYASQ!)K-5KX{", "method", attributes1);
      attributes0.put(attribute0);
      FormElement formElement0 = new FormElement(tag0, "https://jsoup.org/rez/osi_logo.png", attributes0);
      Parser parser0 = Parser.htmlParser();
      Document document0 = parser0.parseInput("U)gqZDg", "BXYASQ!)K-5KX{");
      Document document1 = document0.parser(parser0);
      FormElement formElement1 = formElement0.addElement(document1);
      FormElement formElement2 = formElement1.addElement(document1);
      formElement0.appendChild(formElement1);
      List<Connection.KeyVal> list0 = formElement1.formData();
      formElement0.submit();
      List<Connection.KeyVal> list1 = formElement2.formData();
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Tag tag0 = Tag.valueOf("method");
      Attributes attributes0 = new Attributes();
      Attribute attribute0 = new Attribute("method", "POST", attributes0);
      attributes0.put(attribute0);
      FormElement formElement0 = new FormElement(tag0, "method", attributes0);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: method
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tag tag0 = Tag.valueOf("<s/*.KW|\"8*>p-zquAX");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "<s/*.KW|\"8*>p-zquAX", attributes0);
      Element element0 = new Element("select");
      FormElement formElement1 = formElement0.addElement(element0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      List<Connection.KeyVal> list1 = formElement1.formData();
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf("input");
      Element element0 = new Element("input");
      FormElement formElement0 = new FormElement(tag0, "input", (Attributes) null);
      formElement0.addElement(element0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("w)ak=$hm");
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "w)ak=$hm", attributes0);
      Attributes attributes1 = attributes0.put("action", "w)ak=$hm");
      FormElement formElement0 = new FormElement(tag0, "w)ak=$hm", attributes1);
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
  public void test07()  throws Throwable  {
      Tag tag0 = Tag.valueOf("<s/*.KW|\"8*>p-zquAX");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "<s/*.KW|\"8*>p-zquAX", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tag tag0 = Tag.valueOf("action");
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.put("action", "action");
      FormElement formElement0 = new FormElement(tag0, "Could not determine a form action URL for submit. Ensure you set a base URI when parsing.", attributes1);
      FormElement formElement1 = formElement0.addElement((Element) null);
      Elements elements0 = formElement1.elements();
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Tag tag0 = Tag.valueOf("t|o*:rE%");
      FormElement formElement0 = new FormElement(tag0, "t|o*:rE%", (Attributes) null);
      assertFalse(formElement0.hasParent());
      
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tag tag0 = Tag.valueOf("input");
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "input", attributes0);
      FormElement formElement0 = new FormElement(tag0, "input", attributes0);
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
  public void test11()  throws Throwable  {
      Document document0 = Parser.parseBodyFragment("option", "option");
      Tag tag0 = Tag.valueOf("option");
      FormElement formElement0 = new FormElement(tag0, "option", (Attributes) null);
      formElement0.addElement(document0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tag tag0 = Tag.valueOf("t|rE%");
      FormElement formElement0 = new FormElement(tag0, "t|rE%", (Attributes) null);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: t|rE%
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }
}
