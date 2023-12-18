/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 13:54:45 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Character character0 = Character.valueOf('M');
      CSVFormat cSVFormat1 = CSVFormat.RFC4180;
      CSVFormat cSVFormat2 = cSVFormat1.withCommentStart(character0);
      CSVParser cSVParser0 = CSVParser.parse("MRfg~%M_AZDv#4", cSVFormat2);
      cSVParser0.nextRecord();
      CSVParser cSVParser1 = CSVParser.parse("Nc", cSVFormat0);
      cSVParser1.close();
      assertNotSame(cSVParser1, cSVParser0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[1];
      cSVFormat0.withHeader(stringArray0);
      cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("'a\rb\nc',x\by\fz", cSVFormat0);
      cSVParser0.nextRecord();
      cSVParser0.nextRecord();
      cSVParser0.close();
      assertEquals(2L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("HASH ");
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("HASH ", cSVFormat2);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("8");
      CSVParser cSVParser0 = CSVParser.parse("8", cSVFormat1);
      CSVRecord cSVRecord0 = cSVParser0.nextRecord();
      assertEquals("[null]", cSVRecord0.toString());
  }

  @Test
  public void test04() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test04()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.TDF;
//       CSVParser cSVParser0 = CSVParser.parse("rs", cSVFormat0);
//       cSVParser0.close();
//       Consumer<CSVRecord> consumer0 = (Consumer<CSVRecord>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(0L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("format", cSVFormat0);
      CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "";
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      CSVParser.parse("", cSVFormat2);
      CSVParser.parse("", cSVFormat1);
      boolean boolean0 = cSVParser0.isClosed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("Rs3", cSVFormat0);
      cSVParser0.getCurrentLineNumber();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("8", cSVFormat1);
      assertEquals(1L, cSVParser0.getRecordNumber());
      
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertEquals(1, map0.size());
      
      cSVParser0.close();
      cSVParser0.close();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test
  public void test10() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test10()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.EXCEL;
//       CSVParser cSVParser0 = CSVParser.parse("fFrmat", cSVFormat0);
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(1L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("a,b", cSVFormat0);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((File) null, charset0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'file' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((URL) null, charset0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'url' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("org.apache.commons.io.filefilter.AndFileFilter", cSVFormat0);
      cSVParser0.getHeaderMap();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "A";
      stringArray0[1] = "5B";
      stringArray0[2] = "5B";
      CSVFormat cSVFormat1 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("a,b", cSVFormat1);
      cSVParser0.iterator();
      cSVParser0.isClosed();
      cSVParser0.getRecordNumber();
      try { 
        MockURL.URL("The header contains a duplicate name: \"", "BG_", "h,QbsAy\"u1KX+kS");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // unknown protocol: the header contains a duplicate name: \"
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      // Undeclared exception!
      try { 
        CSVParser.parse("8", cSVFormat1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("/qp2Voj[*W", cSVFormat0);
      boolean boolean0 = cSVParser0.isClosed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("9DQ\"ZU+", cSVFormat0);
      cSVParser0.iterator();
      boolean boolean0 = cSVParser0.isClosed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("`", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }
}