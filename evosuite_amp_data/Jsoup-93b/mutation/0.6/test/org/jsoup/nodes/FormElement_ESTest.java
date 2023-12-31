/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 19:59:27 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.Collection;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.jsoup.Connection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.PseudoTextElement;
import org.jsoup.nodes.TextNode;
import org.jsoup.parser.Parser;
import org.jsoup.parser.Tag;
import org.jsoup.select.Elements;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      attributes0.put("name", "name");
      FormElement formElement1 = formElement0.addElement(formElement0);
      formElement1.appendText("Lm ?hOi2");
      Attributes attributes1 = attributes0.add("type", "radio");
      Document document0 = Parser.parse("POST", "R2;:0c:8K");
      FormElement formElement2 = formElement0.addElement(document0);
      FileSystemHandling.shouldAllThrowIOExceptions();
      Attributes attributes2 = attributes1.add("checked", "Sa@a<<zs)@Rj/nK");
      formElement2.formData();
      FormElement formElement3 = new FormElement(tag0, "name", attributes0);
      attributes2.add("checked", "type");
      // Undeclared exception!
      try { 
        formElement2.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: textarea
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      attributes0.put("name", "name");
      formElement0.addElement(formElement0);
      Attributes attributes1 = attributes0.add("type", "radio");
      Document document0 = Parser.parse("POST", "R2;:0c:8K");
      FormElement formElement1 = formElement0.addElement(document0);
      attributes1.add("checked", "Sa@a<<zs)@Rj/nK");
      formElement1.formData();
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: textarea
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      attributes0.put("name", "name");
      FormElement formElement1 = formElement0.addElement(formElement0);
      attributes0.add("type", "radio");
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "select", attributes0);
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      FormElement formElement1 = formElement0.addElement(pseudoTextElement0);
      attributes0.add("name", "name");
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Tag tag0 = Tag.valueOf("botsz@.+UInIU8e`a=d");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "botsz@.+UInIU8e`a=d", attributes0);
      attributes0.add("METHOD", "POST");
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: botsz@.+UInIU8e`a=d
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      attributes0.put("name", "textarea");
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      Element element0 = new Element(tag0, "textarea", attributes0);
      Tag tag1 = Tag.valueOf("select");
      TextNode textNode0 = new TextNode("a$");
      Attributes attributes1 = textNode0.attributes();
      Element element1 = new Element(tag1, ",h6%e-@C8pH??Q", attributes1);
      FormElement formElement0 = new FormElement(tag1, "select", (Attributes) null);
      FormElement formElement1 = formElement0.addElement(element1);
      formElement1.getElementsByAttributeValue("L^K@{8<M}(BS'+", "f?QE_");
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Tag tag0 = Tag.valueOf("select");
      Attributes attributes0 = new Attributes();
      PseudoTextElement pseudoTextElement0 = new PseudoTextElement(tag0, "select", attributes0);
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      FormElement formElement1 = formElement0.addElement(pseudoTextElement0);
      attributes0.put("DISABLED", "DISABLED");
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      attributes0.add("action", "N}`");
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
  public void test09()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Tag tag0 = Tag.valueOf("gq.I>J$^8mZ");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "gq.I>J$^8mZ", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      assertFalse(formElement1.isBlock());
      
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Tag tag0 = Tag.valueOf("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00F6 W\u00F6rld!</html>");
      TextNode textNode0 = TextNode.createFromEncoded("<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00F6 W\u00F6rld!</html>");
      Attributes attributes0 = textNode0.attributes();
      FormElement formElement0 = new FormElement(tag0, "<?xml version=\"1.0\" encoding=\"iso-8859-1\"?><!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Strict//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd\"><html xmlns=\"http://www.w3.org/1999/xhtml\" lang=\"en\" xml:lang=\"en\">Hell\u00F6 W\u00F6rld!</html>", attributes0);
      // Undeclared exception!
      try { 
        formElement0.removeChild((Node) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.Node", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      attributes0.put("name", "textarea");
      FormElement formElement1 = formElement0.addElement(formElement0);
      Elements elements0 = formElement1.elements();
      // Undeclared exception!
      try { 
        formElement1.insertChildren(2793, (Collection<? extends Node>) elements0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Insert position out of bounds.
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: textarea
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Tag tag0 = Tag.valueOf("method");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "method", attributes0);
      assertEquals(0, formElement0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Tag tag0 = Tag.valueOf("textarea");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "textarea", attributes0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertEquals(0, list0.size());
  }
}
