/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 19:41:57 GMT 2023
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.Connection;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.FormElement;
import org.jsoup.nodes.Node;
import org.jsoup.parser.Tag;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FormElement_ESTest extends FormElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Tag tag0 = Tag.valueOf("Method");
      Attributes attributes0 = new Attributes();
      attributes0.put("Method", "POST");
      FormElement formElement0 = new FormElement(tag0, "POST", attributes0);
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
  public void test1()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      attributes0.clone();
      Tag tag0 = Tag.valueOf("select");
      FormElement formElement0 = new FormElement(tag0, "checkbox", attributes0);
      Element element0 = new Element(tag0, "checkbox", attributes0);
      FormElement formElement1 = formElement0.addElement(element0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Tag tag0 = Tag.valueOf("action");
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.add("action", "POST");
      FormElement formElement0 = new FormElement(tag0, "action", attributes1);
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
  public void test3()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("input");
      FormElement formElement0 = new FormElement(tag0, "input", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Tag tag0 = Tag.valueOf("7Lc*^m%3z6");
      Attributes attributes0 = new Attributes();
      Attributes attributes1 = attributes0.clone();
      Attributes attributes2 = attributes1.add((String) null, "input");
      FormElement formElement0 = new FormElement(tag0, "7Lc*^m%3z6", attributes2);
      Element element0 = null;
      formElement0.elements();
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
  public void test5()  throws Throwable  {
      Tag tag0 = Tag.valueOf("7Lc*^m%3z6");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "7Lc*^m%3z6", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      assertEquals("7lc*^m%3z6", formElement1.normalName());
      
      List<Connection.KeyVal> list0 = formElement1.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("input");
      FormElement formElement0 = new FormElement(tag0, "input", attributes0);
      List<Connection.KeyVal> list0 = formElement0.formData();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Attributes attributes0 = new Attributes();
      Tag tag0 = Tag.valueOf("select");
      FormElement formElement0 = new FormElement(tag0, "select", attributes0);
      FormElement formElement1 = formElement0.addElement(formElement0);
      // Undeclared exception!
      try { 
        formElement1.removeChild(formElement0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must be true
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Tag tag0 = Tag.valueOf("7Lc*^m]3&6");
      Attributes attributes0 = new Attributes();
      FormElement formElement0 = new FormElement(tag0, "7Lc*^m]3&6", attributes0);
      assertEquals("7Lc*^m]3&6", formElement0.baseUri());
      
      // Undeclared exception!
      try { 
        formElement0.submit();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Malformed URL: 7Lc*^m]3&6
         //
         verifyException("org.jsoup.helper.HttpConnection", e);
      }
  }
}
