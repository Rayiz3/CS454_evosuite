/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 21:05:10 GMT 2023
 */

package org.apache.commons.lang3;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
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
      Locale locale0 = LocaleUtils.toLocale("fr__P");
      assertEquals("P", locale0.getVariant());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("gz_=Q\"k ATz@+vn@");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: gz_=Q\"k ATz@+vn@
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("us_EN");
      assertEquals("us", locale0.getLanguage());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_E(N_a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_E(N_a
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_ENJa");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_ENJa
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("us_EN_a");
      assertEquals("us_EN_a", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("us_EN_");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: us_EN_
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("yi;");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: yi;
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("org.apache.commons.lang3.LocaleUtils$SyncAvoid");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: org.apache.commons.lang3.LocaleUtils$SyncAvoid
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("n[k");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: n[k
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry("a");
      LocaleUtils.languagesByCountry("JP");
      LocaleUtils.languagesByCountry("JP");
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("CU");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: CU
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      Locale locale1 = Locale.SIMPLIFIED_CHINESE;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale1, locale0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      boolean boolean0 = LocaleUtils.isAvailableLocale((Locale) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("bg");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      HashMap<String, List<String>> hashMap0 = new HashMap<String, List<String>>();
      Set<Locale> set0 = LocaleUtils.availableLocaleSet();
      assertEquals(160, set0.size());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("CA");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      locale0.getDisplayCountry();
      LocaleUtils.countriesByLanguage("th");
      LocaleUtils.countriesByLanguage("bTkZ-)V/tWj\"(");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      List<Locale> list0 = LocaleUtils.languagesByCountry("GB");
      LocaleUtils.languagesByCountry("GB");
      LocaleUtils.languagesByCountry("ZZ");
      LocaleUtils.localeLookupList(locale0, locale0);
      LocaleUtils.countriesByLanguage((String) null);
      List<Locale> list1 = LocaleUtils.countriesByLanguage("bf>Ck^%");
      assertFalse(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.languagesByCountry("<locale>en</locale>");
      LocaleUtils.languagesByCountry(":9h,J*d-0b");
      LocaleUtils.languagesByCountry("da");
      LocaleUtils.languagesByCountry("");
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      LocaleUtils.languagesByCountry((String) null);
      List<Locale> list1 = LocaleUtils.languagesByCountry("org.apache.commons.lang3.LocaleUtilsSyncAvoid");
      assertTrue(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale locale0 = (Locale)EvoSuiteXStream.fromString("<locale>en</locale>");
      LocaleUtils.isAvailableLocale(locale0);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage((String) null);
      LocaleUtils.countriesByLanguage("de");
      LocaleUtils.countriesByLanguage("de");
      LocaleUtils.countriesByLanguage("zz");
      LocaleUtils.countriesByLanguage("zz");
      LocaleUtils.languagesByCountry("zz");
      LocaleUtils.languagesByCountry("file.separator");
      LocaleUtils.SyncAvoid localeUtils_SyncAvoid0 = new LocaleUtils.SyncAvoid();
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("^nk");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("org.apache.commons.lang3.LocaleUtils");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage("user.dir");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.countriesByLanguage((String) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry("da");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.languagesByCountry((String) null);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LocaleUtils localeUtils0 = new LocaleUtils();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Locale locale0 = Locale.ROOT;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Locale locale0 = new Locale("Vk", "Vk", "Vk");
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(3, list0.size());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Locale locale0 = Locale.ITALY;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.localeLookupList((Locale) null, (Locale) null);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Locale locale0 = Locale.UK;
      List<Locale> list0 = LocaleUtils.localeLookupList(locale0, locale0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale("nk");
      assertEquals("nk", locale0.toString());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      List<Locale> list0 = LocaleUtils.availableLocaleList();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      // Undeclared exception!
      try { 
        LocaleUtils.toLocale("Hv&AO #!0|~");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid locale format: Hv&AO #!0|~
         //
         verifyException("org.apache.commons.lang3.LocaleUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Locale locale0 = Locale.TRADITIONAL_CHINESE;
      boolean boolean0 = LocaleUtils.isAvailableLocale(locale0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Locale locale0 = LocaleUtils.toLocale((String) null);
      assertNull(locale0);
  }
}