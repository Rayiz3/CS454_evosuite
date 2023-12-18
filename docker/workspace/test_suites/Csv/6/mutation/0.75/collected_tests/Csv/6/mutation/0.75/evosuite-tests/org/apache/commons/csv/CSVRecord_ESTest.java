/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 11:55:50 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.thoughtworks.xstream.io.StreamException;
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
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", (-36L));
      assertEquals((-36L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-1879048190));
      hashMap0.put("PRECISION,SCALE", integer0);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "PRECISION,SCALE", (-1L));
      boolean boolean0 = cSVRecord0.isSet("PRECISION,SCALE");
      assertEquals((-1L), cSVRecord0.getRecordNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(3);
      hashMap0.putIfAbsent("+l,w}-xTe=\">D`i", integer0);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "+l,w}-xTe=\">D`i", 0L);
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      cSVRecord0.isSet("+l,w}-xTe=\">D`i");
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        cSVRecord0.get("+l,w}-xTe=\">D`i");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index for header '+l,w}-xTe=\">D`i' is 3 but CSVRecord only has 1 values!
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String[] stringArray0 = new String[6];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      hashMap0.put((String) null, (Integer) null);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, (String) null, (-4465L));
      // Undeclared exception!
      try { 
        cSVRecord0.isSet((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer(2738);
      hashMap0.put("PRECISION,SCALE", integer0);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "PRECISION,SCALE", 0L);
      boolean boolean0 = cSVRecord0.isSet("PRECISION,SCALE");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[2];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      Integer integer0 = new Integer((-2));
      hashMap0.put("S{9OWunz", integer0);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "S{9OWunz", (-1L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("S{9OWunz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Index for header 'S{9OWunz' is -2 but CSVRecord only has 2 values!
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String[] stringArray0 = new String[3];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      hashMap0.put("S}{9OWuIz", (Integer) null);
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "S}{9OWuIz", (-36L));
      boolean boolean0 = cSVRecord0.isMapped("S}{9OWuIz");
      assertEquals((-36L), cSVRecord0.getRecordNumber());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "S}{9OWunz", (-36L));
      boolean boolean0 = cSVRecord0.isSet("S}{9OWunz");
      assertEquals((-36L), cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      String[] stringArray0 = new String[2];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "", 4294967295L);
      boolean boolean0 = cSVRecord0.isMapped("");
      assertEquals(4294967295L, cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      String[] stringArray0 = new String[2];
      stringArray0[0] = "+l,w}-xTe=\">D`i";
      stringArray0[1] = "+l,w}-xTe=\">D`i";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "+l,w}-xTe=\">D`i", 0L);
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      String[] stringArray1 = cSVRecord0.values();
      assertSame(stringArray1, stringArray0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      HashMap<String, Integer> hashMap1 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[6];
      stringArray0[0] = "]A-[]kY@zLOD$UF@";
      stringArray0[1] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[2] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[3] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[4] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      stringArray0[5] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", (-1949L));
      // Undeclared exception!
      try { 
        cSVRecord0.get((-1932735281));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1932735281
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      String[] stringArray0 = new String[2];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "S}{9OWunz", (-36L));
      cSVRecord0.getComment();
      assertEquals((-36L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[16];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", 0L);
      cSVRecord0.isConsistent();
      CSVRecord cSVRecord1 = new CSVRecord(stringArray0, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", (-699L));
      cSVRecord1.isConsistent();
      cSVRecord1.isConsistent();
      cSVRecord1.isConsistent();
      cSVRecord0.spliterator();
      boolean boolean0 = cSVRecord0.isConsistent();
      assertFalse(boolean0);
      
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      HashMap<String, String> hashMap2 = new HashMap<String, String>();
      cSVRecord0.putIn(hashMap2);
      long long0 = cSVRecord1.getRecordNumber();
      assertEquals((-699L), long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[2];
      String string0 = "W#jx/#p44G.";
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "W#jx/#p44G.", (-492L));
      hashMap0.put("W#jx/#p44G.", (Integer) null);
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
  public void test14()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "A$q:>6C> Q", 1000000L);
      // Undeclared exception!
      try { 
        cSVRecord0.get("A$q:>6C> Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mapping for A$q:>6C> Q not found, expected one of []
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      String[] stringArray0 = new String[19];
      String string0 = "CATALOG_NAME";
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, "CATALOG_NAME", (-1L));
      // Undeclared exception!
      try { 
        cSVRecord0.get("");
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // No header mapping was specified, the record values can't be accessed by name
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      String[] stringArray0 = new String[3];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, (Map<String, Integer>) null, (String) null, (-1538L));
      boolean boolean0 = cSVRecord0.isConsistent();
      assertTrue(boolean0);
      assertEquals((-1538L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, ">]]8{7&uZ|6~N4-`", (-36L));
      cSVRecord0.iterator();
      cSVRecord0.toString();
      // Undeclared exception!
      try { 
        cSVRecord0.get("Zo");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mapping for Zo not found, expected one of []
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-1512L));
      cSVRecord0.iterator();
      boolean boolean0 = cSVRecord0.isMapped(stringArray0[0]);
      assertFalse(boolean0);
      assertEquals((-1512L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-1512L));
      boolean boolean0 = cSVRecord0.isMapped(stringArray0[0]);
      assertEquals((-1512L), cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-1513L));
      cSVRecord0.toMap();
      boolean boolean0 = cSVRecord0.isMapped(stringArray0[0]);
      assertFalse(boolean0);
      assertEquals((-1513L), cSVRecord0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord((String[]) null, hashMap0, "A$q:>6C> Q", 0L);
      assertEquals("[]", cSVRecord0.toString());
      
      boolean boolean0 = cSVRecord0.isConsistent();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String[] stringArray0 = new String[1];
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "PW_a%ZE-LWNf:X%XD", 0L);
      cSVRecord0.size();
      HashMap<String, String> hashMap1 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        cSVRecord0.get("S}{9OWunz");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Mapping for S}{9OWunz not found, expected one of []
         //
         verifyException("org.apache.commons.csv.CSVRecord", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      String[] stringArray0 = new String[16];
      stringArray0[0] = "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>";
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, "<org.apache.commons.csv.CSVRecord>\n  <recordNumber>0</recordNumber>\n  <values>\n    <string>A</string>\n    <string>B</string>\n    <string>C</string>\n  </values>\n</org.apache.commons.csv.CSVRecord>", 0L);
      cSVRecord0.isConsistent();
      // Undeclared exception!
      try { 
        EvoSuiteXStream.fromString("No header mapping was specified, the record values can't be accessed by name");
        fail("Expecting exception: StreamException");
      
      } catch(StreamException e) {
         //
         // 
         //
         verifyException("com.thoughtworks.xstream.io.xml.XppReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[1];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[0], (-1512L));
      boolean boolean0 = cSVRecord0.isConsistent();
      assertEquals((-1512L), cSVRecord0.getRecordNumber());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      String[] stringArray0 = new String[2];
      CSVRecord cSVRecord0 = new CSVRecord(stringArray0, hashMap0, stringArray0[1], (-55L));
      assertEquals((-55L), cSVRecord0.getRecordNumber());
      assertEquals("[null, null]", cSVRecord0.toString());
  }
}