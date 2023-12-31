/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 20:54:39 GMT 2023
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
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
      Locale locale0 = LocaleUtils.toLocale("us_EN_A");
      assertEquals("EN", locale0.getCountry());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("fs_EJI1");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: fs_EJI1
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("fr__P");
      assertEquals("fr__P", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("uu_mUU_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: uu_mUU_
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Locale locale0 = Locale.GERMAN;
      List<Locale> list0 = LocaleUtils.countriesByLanguage("th");
      assertFalse(list0.contains(locale0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_E3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_E3
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("us_EN");
      assertEquals("us", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("uuqUU_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: uuqUU_
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Locale locale0 = Locale.FRENCH;
      Locale locale1 = Locale.US;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale1);
      assertEquals(2, list0.size());
      assertTrue(list0.contains(locale1));
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: 
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("uuu");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: uuu
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
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
  public void testLocaleLookupList_LocaletestLanguagesByCountry_13()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.localeLookupList((Locale) null);
      Locale locale1 = (Locale)EvoSuiteXStream.fromString("<locale>qq</locale>");
      LocaleUtils.localeLookupList(locale1);
      Locale locale2 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.localeLookupList(locale2);
      LocaleUtils.localeLookupList(locale2);
      Locale locale3 = (Locale)EvoSuiteXStream.fromString("<locale>en_US</locale>");
      LocaleUtils.localeLookupList(locale3);
      Locale locale4 = (Locale)EvoSuiteXStream.fromString("<locale>en_US_ZZZZ</locale>");
      locale4.stripExtensions();
      LocaleUtils.localeLookupList(locale4);
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      LocaleUtils.languagesByCountry("ZA");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("ZA");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: ZA
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.languagesByCountry("[");
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.languagesByCountry("SFsafdFDsdfF");
      LocaleUtils.countriesByLanguage("DO");
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.languagesByCountry("JP");
      List<Locale> list1 = LocaleUtils.languagesByCountry((String) null);
      assertSame(list1, list0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Locale locale0 = Locale.SIMPLIFIED_CHINESE;
      LocaleUtils.toLocale("ja");
      List<Locale> list0 = LocaleUtils.countriesByLanguage("ja");
      assertFalse(list0.contains(locale0));
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.languagesByCountry("<locale>en</locale>");
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage("de");
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage("GR");
      List<Locale> list1 = LocaleUtils.countriesByLanguage("_4q`~$^l|nN5");
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry("<locale>en</locale>");
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry("org.apache.commons.lang3.LocaleUtils$SyncAvoid");
      LocaleUtils.languagesByCountry("6.0");
      LocaleUtils.isAvailableLocale(locale0);
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertEquals(160, set0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("GR");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("pt");
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("Invalid locale format: ");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("hi");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Locale locale0 = Locale.ITALIAN;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = new Locale("pt", "pt", "pt");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = Locale.JAPAN;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Locale locale0 = Locale.TAIWAN;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("pl");
      assertEquals("pl", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("m)q35El|F&8\"QnZcCL");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: m)q35El|F&8\"QnZcCL
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.availableLocaleList();
      assertEquals(160, list0.size());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale(")@Yb0u8H.]cMR;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: )@Yb0u8H.]cMR;
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }
}
