/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 12:32:42 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.LinkedList;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.apache.commons.csv.Quote;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Character character0 = new Character('C');
      Quote quote0 = Quote.NONE;
      Character character1 = new Character('L');
      String[] stringArray0 = new String[2];
      stringArray0[0] = "v+KR&w";
      CSVFormat cSVFormat0 = new CSVFormat('(', character0, quote0, character0, character1, true, true, "v+KR&w", "v+KR&w", stringArray0, true);
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar('k');
      CSVFormat cSVFormat2 = cSVFormat1.withQuotePolicy(quote0);
      CSVParser cSVParser0 = CSVParser.parse("CREATE ALIA4 IF NOT EXISTS SYSTEM_COMBINE_CFOB FOR \"", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Character character0 = new Character('d');
      Quote quote0 = Quote.NONE;
      String[] stringArray0 = new String[2];
      stringArray0[1] = "WPk1!(dBy%.x\"vY]\"";
      CSVFormat cSVFormat0 = new CSVFormat('T', character0, quote0, (Character) null, character0, false, false, "WPk1!(dBy%.x\"vY]\"", "nuDg>de-lt.g9", stringArray0, true);
      CSVParser cSVParser0 = CSVParser.parse("WPk1!(dBy%.x\"vY]\"", cSVFormat0);
      cSVParser0.close();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Character character0 = new Character('C');
      Quote quote0 = Quote.NONE;
      Character character1 = new Character('L');
      String[] stringArray0 = new String[2];
      stringArray0[0] = "v+KR&w";
      CSVFormat cSVFormat0 = new CSVFormat('(', character0, quote0, character0, character1, true, true, "v+KR&w", "v+KR&w", stringArray0, true);
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteChar('k');
      StringReader stringReader0 = new StringReader("v+KR&w");
      cSVFormat1.parse(stringReader0);
      CSVFormat cSVFormat2 = cSVFormat1.withQuotePolicy(quote0);
      CSVParser cSVParser0 = CSVParser.parse("CREATE ALIA4 IF NOT EXISTS SYSTEM_COMBINE_CFOB FOR \"", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test
  public void test03() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test03()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.EXCEL;
//       Character character0 = Character.valueOf('/');
//       Character character1 = new Character('?');
//       Character character2 = Character.valueOf('Y');
//       Quote quote0 = Quote.MINIMAL;
//       Character character3 = new Character('Y');
//       CSVFormat cSVFormat1 = new CSVFormat('?', character2, quote0, character0, character3, false, false, "Nu\"G>3E#lT.g9", "UPDATE_RULE SMALLINT", (String[]) null, false);
//       CSVParser cSVParser0 = CSVParser.parse("UPDATE_RULE SMALLINT", cSVFormat1);
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       Consumer<Object> consumer1 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer1);
//       cSVParser0.nextRecord();
//       CSVRecord cSVRecord0 = cSVParser0.nextRecord();
//       assertNull(cSVRecord0);
//   }

  @Test
  public void test04() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test04()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
//       CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
//       Character character0 = new Character('\\');
//       Quote quote0 = Quote.ALL;
//       CSVFormat cSVFormat1 = new CSVFormat('9', character0, quote0, (Character) null, (Character) null, false, false, "", "WPk1!(dBy%.x\"vY]\"", (String[]) null, false);
//       CSVParser cSVParser1 = CSVParser.parse("SCHEMA_OWNER", cSVFormat1);
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       CSVRecord cSVRecord0 = cSVParser1.nextRecord();
//       assertEquals("[SCHEMA_OWNER]", cSVRecord0.toString());
//   }

  @Test
  public void test05() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test05()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
//       CSVFormat cSVFormat1 = cSVFormat0.withNullString("-7");
//       CSVParser cSVParser0 = CSVParser.parse("baQs~1W?`", cSVFormat1);
//       LinkedList<CSVRecord> linkedList0 = new LinkedList<CSVRecord>();
//       cSVParser0.getRecords(linkedList0);
//       cSVParser0.spliterator();
//       CSVRecord cSVRecord0 = cSVParser0.nextRecord();
//       assertNull(cSVRecord0);
//   }

  @Test
  public void test06() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test06()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
//       CSVParser cSVParser0 = CSVParser.parse("7?<Vy(8kI> ~Y*ZN/", cSVFormat0);
//       cSVParser0.close();
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(0L, cSVParser0.getRecordNumber());
//   }

  @Test
  public void test07() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test07()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
//       CSVParser cSVParser0 = CSVParser.parse("CSVParser as been closed", cSVFormat0);
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(1L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("u@>JfZ~%p|]+[uwMiXnW", cSVFormat0);
      cSVParser0.getHeaderMap();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[3];
      stringArray0[0] = "A";
      stringArray0[1] = "B";
      stringArray0[2] = "a,b";
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("a,b", cSVFormat1);
      cSVParser0.iterator();
      cSVParser0.isClosed();
      cSVParser0.getHeaderMap();
      cSVParser0.getHeaderMap();
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertNotNull(map0);
      assertEquals(0L, cSVParser0.getRecordNumber());
      assertEquals(3, map0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      URL uRL0 = MockURL.getFileExample();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse(uRL0, charset0, cSVFormat0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      String[] stringArray0 = new String[3];
      stringArray0[0] = "A";
      stringArray0[1] = "B";
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withIgnoreEmptyLines(true);
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat2);
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse(":,dsdhF", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      long long0 = cSVParser0.getCurrentLineNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      CSVRecord cSVRecord0 = cSVParser0.nextRecord();
      assertNull(cSVRecord0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("oQO2)gA.mHRT", cSVFormat0);
      cSVParser0.getRecords();
      CSVRecord cSVRecord0 = cSVParser0.nextRecord();
      assertNull(cSVRecord0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("T[:j\"],\"~|{o//y.d%}", cSVFormat0);
      try { 
        cSVParser0.nextRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // (startline 1) EOF reached before encapsulated token finished
         //
         verifyException("org.apache.commons.csv.Lexer", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("CSVParser has been closed", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      MockFile mockFile0 = new MockFile("D;WtzmXCC", "D;WtzmXCC");
      try { 
        CSVParser.parse((File) mockFile0, cSVFormat0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse(")\n", cSVFormat1);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("~?<[(w", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("NcHLM$F3", cSVFormat0);
      cSVParser0.isClosed();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      try { 
        CSVParser.parse("T[:j\"],\"~|{o//y.d%}", cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // (startline 1) EOF reached before encapsulated token finished
         //
         verifyException("org.apache.commons.csv.Lexer", e);
      }
  }

  @Test
  public void test24() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test24()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
//       CSVParser cSVParser0 = CSVParser.parse("CSVParser as been closed", cSVFormat0);
//       cSVParser0.spliterator();
//       cSVParser0.nextRecord();
//       assertEquals(1L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("slow query: {0} ms", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }
}
