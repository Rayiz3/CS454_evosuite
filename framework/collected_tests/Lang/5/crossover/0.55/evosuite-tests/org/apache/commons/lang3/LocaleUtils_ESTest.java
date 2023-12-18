/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 21:11:25 GMT 2023
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.apache.commons.lang3.LocaleUtils;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.testcarver.testcase.EvoSuiteXStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LocaleUtils_ESTest extends LocaleUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = "uu_UU_";
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("uu_UU_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: uu_UU_
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("us_EN_A");
      assertEquals("EN", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("fr__POSIX");
      assertEquals("fr__POSIX", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("us_ZH");
      assertEquals("us", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("glt");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: glt
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_eN");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_eN
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_EN-a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_EN-a
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("org.apache.commons.lang3.LocaleUtils");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang3.LocaleUtils
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_Na");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_Na
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.JAPANESE;
      Locale locale1 = Locale.CANADA;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertTrue(list0.contains(locale1));
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("c");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: c
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      locale0.stripExtensions();
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.localeLookupList((Locale) null);
      Locale locale1 = (Locale)EvoSuiteXStream.fromString("<locale>qq</locale>");
      LocaleUtils.localeLookupList(locale1);
      LocaleUtils.countriesByLanguage("<locale>qq</locale>");
      LocaleUtils.countriesByLanguage("<locale>qq</locale>");
      LocaleUtils.countriesByLanguage("!B\"TFWgS&");
      LocaleUtils.countriesByLanguage("0'");
      LocaleUtils.countriesByLanguage("zz");
      LocaleUtils.languagesByCountry("!B\"TFWgS&");
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("aQ#Scu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: aQ#Scu
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
      LinkedList<Locale> linkedList0 = new LinkedList<Locale>();
      List<Locale> list0 = LocaleUtils.languagesByCountry("BE");
      LocaleUtils.languagesByCountry("org.apache.commons.lang3.LocaleUtils$SyncAvoid");
      LocaleUtils.countriesByLanguage("th");
      LocaleUtils.countriesByLanguage("us_eN");
      List<Locale> list1 = LocaleUtils.countriesByLanguage("us_eN");
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.localeLookupList((Locale) null);
      Locale locale1 = (Locale)EvoSuiteXStream.fromString("<locale>qq</locale>");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale1);
      LocaleUtils.languagesByCountry("");
      LocaleUtils.languagesByCountry("sv");
      LocaleUtils.languagesByCountry("org.apache.commons.lang3.LocaleUtils");
      LocaleUtils.languagesByCountry("}+'05de");
      LocaleUtils.languagesByCountry("}+'05de");
      List<Locale> list1 = LocaleUtils.languagesByCountry((String) null);
      assertFalse(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("th");
      assertFalse(list0.isEmpty());
      
      List<Locale> list1 = LocaleUtils.languagesByCountry("TH");
      assertFalse(list1.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.CHINESE;
      List<Locale> list0 = LocaleUtils.countriesByLanguage("hr");
      assertFalse(list0.contains(locale0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage((String) null);
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage("O");
      LocaleUtils.countriesByLanguage("de");
      LocaleUtils.countriesByLanguage("ja");
      List<Locale> list1 = LocaleUtils.countriesByLanguage("ja");
      assertFalse(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null);
      Locale locale1 = (Locale)EvoSuiteXStream.fromString("<locale>qq</locale>");
      LocaleUtils.localeLookupList(locale1);
      LocaleUtils.countriesByLanguage("<locale>qq</locale>");
      LocaleUtils.countriesByLanguage("<locale>qq</locale>");
      LocaleUtils.countriesByLanguage("!B\"TFWgS&");
      LocaleUtils.countriesByLanguage("PE");
      LocaleUtils.countriesByLanguage("zz");
      List<Locale> list1 = LocaleUtils.countriesByLanguage("?{i<.un9v`+x1S1oYb");
      assertNotSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("cGBI7_;O");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("th");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("UY");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = new Locale("us_ENU-a", "us_ENU-a", "us_ENU-a");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.US;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("SFSAFDFDSDFF");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: SFSAFDFDSDFF
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.availableLocaleList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("th");
      assertEquals("", locale0.getISO3Country());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }
}