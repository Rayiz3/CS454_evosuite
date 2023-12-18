/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 12:07:25 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thoughtworks.xstream.security.ForbiddenClassException;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.testcarver.testcase.EvoSuiteXStream;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVRecord_ESTest extends CSVRecord_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "$ir%s/", (-9223372036854775798L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("$ir%s/");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No header mapping was specified, the record values can't be accessed by name
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-2136240276));
      hashMap0.put("ir%s/", integer0);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "ir%s/", (-9223372036854775808L));
      boolean boolean0 = cSVRecord0.isSet("ir%s/");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = Integer.valueOf(207);
      hashMap0.putIfAbsent("", integer0);
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "m2`*J36Hx#q,_", (-2086L));
      boolean boolean0 = cSVRecord0.isSet("");
      assertFalse(boolean0);
      assertEquals((-2086L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(207);
      hashMap0.putIfAbsent("", integer0);
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-2086L));
      boolean boolean0 = cSVRecord0.isSet("");
      assertFalse(boolean0);
      assertEquals((-2086L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-5));
      hashMap0.put("", integer0);
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-2086L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index for header '' is -5 but CSVRecord only has 0 values!
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[7];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      hashMap0.put("$ir%s/", (Integer) null);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "$ir%s/", (-9223372036854775808L));
      // Undeclared exception!
      try { 
        cSVRecord0.isSet("$ir%s/");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, (Map<String, Integer>) null, "jir%sS", (-413L));
      boolean boolean0 = cSVRecord0.isSet("jir%sS");
      assertFalse(boolean0);
      assertEquals((-413L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-2086L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mapping for  not found, expected one of []
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, (Map<String, Integer>) null, "d6J8r]Ro2C;YLaGYBH,", 18L);
      boolean boolean0 = cSVRecord0.isConsistent();
      assertEquals(18L, cSVRecord0.getRecordNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object object0 = new Object();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      stringArray0[2] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      stringArray0[3] = "";
      stringArray0[4] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      stringArray0[5] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      stringArray0[7] = "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>", 0L);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      hashMap1.remove((Object) "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>", (Object) "<org.apache.commons.csv.CSVRecord>\n  <rvcordNumber>0</r*cordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apacWe.commons.csv.CSVRecord>");
      CSVRecord cSVRecord1 = new CSVRecord(stringArray0, hashMap1, "", 0L);
      cSVRecord0.toMap();
      long long0 = cSVRecord0.getRecordNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[2] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[3] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[4] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "", 127L);
      cSVRecord0.isConsistent();
      boolean boolean0 = cSVRecord0.isConsistent();
      assertFalse(boolean0);
      
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      CSVRecord cSVRecord1 = new CSVRecord(stringArray0, hashMap1, "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", 1029L);
      CSVRecord cSVRecord2 = new CSVRecord(stringArray0, hashMap0, "NOT MAPPED", 127L);
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      HashMap<String, String> hashMap3 = new HashMap<String, String>();
      cSVRecord0.putIn(hashMap3);
      cSVRecord1.values();
      assertEquals(1029L, cSVRecord1.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(1);
      Integer integer1 = new Integer((-736));
      hashMap1.replace("yARi^", integer1);
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, (String) null, 1);
      boolean boolean0 = cSVRecord0.isConsistent();
      assertTrue(boolean0);
      
      cSVRecord0.toString();
      assertEquals(1L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[4], 32L);
      hashMap0.put("8T'", (Integer) null);
      // Undeclared exception!
      try { 
        cSVRecord0.toMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object object0 = new Object();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[2] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[3] = "a";
      stringArray0[4] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[5] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap1, "a", 0L);
      cSVRecord0.isConsistent();
      // Undeclared exception!
      try { 
        cSVRecord0.get(221);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 221
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[4], 32L);
      cSVRecord0.spliterator();
      boolean boolean0 = cSVRecord0.isSet(stringArray0[1]);
      assertEquals(32L, cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object object0 = new Object();
      String[] stringArray0 = new String[8];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[2] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[3] = "a";
      stringArray0[4] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[5] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[6] = "a";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "|;!ta", 519L);
      Map<String, Integer> map0 = cSVRecord0.putIn((Map<String, Integer>) hashMap0);
      CSVRecord cSVRecord1 = new CSVRecord(stringArray0, map0, (String) null, 519L);
      cSVRecord1.size();
      assertEquals(519L, cSVRecord1.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[6];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[4], 82L);
      cSVRecord0.toMap();
      boolean boolean0 = cSVRecord0.isSet(stringArray0[1]);
      assertEquals(82L, cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "X{", (-2084L));
      assertEquals((-2084L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "", (-2086L));
      assertEquals("[]", cSVRecord0.toString());
      
      boolean boolean0 = cSVRecord0.isConsistent();
      assertEquals((-2086L), cSVRecord0.getRecordNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray1 = new String[5];
      stringArray1[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray1[1] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray1[2] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray1[3] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray1[4] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      CSVRecord cSVRecord0 = new CSVRecord(stringArray1, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", (-2711L));
      cSVRecord0.isConsistent();
      boolean boolean0 = cSVRecord0.isConsistent();
      assertEquals((-2711L), cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[4], 32L);
      boolean boolean0 = cSVRecord0.isConsistent();
      assertFalse(boolean0);
      assertEquals(32L, cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[4], 32L);
      boolean boolean0 = cSVRecord0.isSet(stringArray0[1]);
      assertFalse(boolean0);
      assertEquals(32L, cSVRecord0.getRecordNumber());
      assertEquals("[null, null, null, null, null, null, null, null]", cSVRecord0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[2] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[3] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[4] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[5] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[6] = "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", 1873L);
      cSVRecord0.getComment();
      // Undeclared exception!
      try { 
        EvoSuiteXStream.fromString("<org.apache.commons.csv.CSVRecord>\n  <mapping>\n    <entry>\n      <string>third</string>\n      <int>2</int>\n    </entry>\n    <entry>\n      <string>first</string>\n      <int>0</int>\n    </entry>\n    <entry>\n      <string>second</string>\n      <int>1</int>\n    </entry>\n  </mapping>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>");
        fail("Expecting exception: ForbiddenClassException");
      
      } catch(ForbiddenClassException e) {
         //
         // org.apache.commons.csv.CSVRecord
         //
         verifyException("com.thoughtworks.xstream.security.NoTypePermission", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[8];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[4], 45L);
      assertEquals(45L, cSVRecord0.getRecordNumber());
      assertEquals("[null, null, null, null, null, null, null, null]", cSVRecord0.toString());
  }
}