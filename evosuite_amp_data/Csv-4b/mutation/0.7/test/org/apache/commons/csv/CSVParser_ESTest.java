/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 11:32:59 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.EvoSuiteURL;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.evosuite.runtime.testdata.NetworkHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Character character0 = Character.valueOf('7');
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
      CSVParser cSVParser0 = CSVParser.parse("7&Zni34", cSVFormat1);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      File file0 = MockFile.createTempFile("wKncu+?n:(", "wKncu+?n:(", (File) null);
      CSVParser cSVParser0 = CSVParser.parse(file0, cSVFormat1);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withSkipHeaderRecord(true);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "org.h2.store.LobStorage$CountingReaderInputStream";
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      CSVParser.parse("format", cSVFormat2);
      try { 
        CSVParser.parse(uRL0, charset0, cSVFormat2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      cSVFormat0.withNullString(" >=e|xS$4QG=L?");
      CSVFormat cSVFormat1 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("\n*/", cSVFormat1);
      cSVParser0.getRecords();
      assertEquals(2L, cSVParser0.getRecordNumber());
  }

  @Test
  public void test04() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test04()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.RFC4180;
//       CSVFormat cSVFormat1 = CSVFormat.MYSQL;
//       CSVFormat cSVFormat2 = cSVFormat1.withNullString("org.apache.commons.io.filefilter.AndFileFilter");
//       cSVFormat2.withSkipHeaderRecord(true);
//       CSVFormat cSVFormat3 = cSVFormat0.withDelimiter('b');
//       Character.valueOf('b');
//       Character character0 = Character.valueOf('7');
//       cSVFormat2.withEscape(character0);
//       cSVFormat3.withNullString("$|$%QzR9MFd6bGNnp");
//       String[] stringArray0 = new String[2];
//       stringArray0[0] = "{bq>w(;i$!3,GU;EzoH";
//       stringArray0[1] = "{bq>w(;i$!3,GU;EzoH";
//       cSVFormat1.withHeader(stringArray0);
//       CSVParser cSVParser0 = CSVParser.parse("org.apache.commons.io.filefilter.AndFileFilter", cSVFormat2);
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(1L, cSVParser0.getRecordNumber());
//   }

  @Test
  public void test05() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test05()  throws Throwable  {
//       MockURL.getHttpExample();
//       Charset.defaultCharset();
//       FileSystemHandling.createFolder((EvoSuiteFile) null);
//       CSVFormat cSVFormat0 = CSVFormat.newFormat('7');
//       CSVFormat cSVFormat1 = cSVFormat0.withDelimiter('h');
//       Character character0 = Character.valueOf('-');
//       CSVFormat cSVFormat2 = cSVFormat1.withEscape(character0);
//       CSVFormat cSVFormat3 = cSVFormat2.withNullString("{bq>w(;i$!3,GU;EzoH");
//       String[] stringArray0 = new String[1];
//       stringArray0[0] = "yq?Ro";
//       CSVFormat cSVFormat4 = cSVFormat3.withHeader(stringArray0);
//       CSVParser cSVParser0 = CSVParser.parse("yq?Ro", cSVFormat4);
//       assertEquals(0L, cSVParser0.getRecordNumber());
//       
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(1L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("nW=R+*a7Zt0E[:PeR0d");
      CSVParser cSVParser0 = CSVParser.parse("nW=R+*a7Zt0E[:PeR0d", cSVFormat1);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withNullString("yl?Ro");
      CSVParser cSVParser0 = CSVParser.parse("8&/EA", cSVFormat1);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("or.apache.commos.csv.CSVParser$2", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("org.apache.commons.csv.CSVParser$2", cSVFormat1);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Charset charset0 = Charset.defaultCharset();
      FileSystemHandling.appendLineToFile((EvoSuiteFile) null, "x![;:a3D`I");
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "76)|2<PuRB$$");
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse(uRL0, charset0, cSVFormat0);
      cSVParser0.nextRecord();
      cSVParser0.close();
      cSVParser0.close();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getHttpExample();
      Charset charset0 = Charset.defaultCharset();
      EvoSuiteURL evoSuiteURL0 = new EvoSuiteURL("http://www.someFakeButWellFormedURL.org/fooExample");
      NetworkHandling.createRemoteTextFile(evoSuiteURL0, "string");
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse(uRL0, charset0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test
  public void test12() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test12()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.EXCEL;
//       CSVParser cSVParser0 = CSVParser.parse("nW=R+*a7Zt0E[:PeR0d", cSVFormat0);
//       cSVParser0.close();
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       cSVParser0.close();
//       assertEquals(0L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("0G5+;,I-U5D}}`", cSVFormat0);
      List<CSVRecord> list0 = cSVParser0.getRecords();
      assertFalse(list0.isEmpty());
  }

  @Test
  public void test14() {}
// Defects4J: flaky method
//   @Test(timeout = 4000)
//   public void test14()  throws Throwable  {
//       CSVFormat cSVFormat0 = CSVFormat.RFC4180;
//       CSVParser cSVParser0 = CSVParser.parse("No mDre CSN records vailabl", cSVFormat0);
//       Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
//       cSVParser0.forEach(consumer0);
//       assertEquals(1L, cSVParser0.getRecordNumber());
//   }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("No mDre SN records vailabl", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
      
      cSVParser0.getRecords();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = MockFile.createTempFile("No more CSV records available", "No more CSV records available");
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse(file0, cSVFormat0);
      long long0 = cSVParser0.getCurrentLineNumber();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      File file0 = MockFile.createTempFile("No more CSV records available", "No more CSV records available");
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse(file0, cSVFormat0);
      boolean boolean0 = cSVParser0.isClosed();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      File file0 = MockFile.createTempFile("No mDre CSN records vailabl", "No mDre CSN records vailabl");
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse(file0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileSystemHandling.createFolder((EvoSuiteFile) null);
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0, 10000);
      pipedReader0.ready();
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      pipedReader0.markSupported();
      CSVFormat.newFormat(']');
      Character character0 = Character.valueOf(']');
      CSVFormat cSVFormat1 = cSVFormat0.withCommentStart(character0);
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0);
      cSVParser0.iterator();
      cSVParser0.isClosed();
      cSVParser0.getRecordNumber();
      CSVFormat cSVFormat2 = CSVFormat.TDF;
      CSVParser.parse("", cSVFormat2);
      MockFile mockFile0 = new MockFile("");
      mockFile0.deleteOnExit();
      try { 
        CSVParser.parse((File) mockFile0, cSVFormat1);
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
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("=qzfowq", cSVFormat0);
      cSVParser0.iterator();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("?[3orimQjA7-RnRj6Q", cSVFormat0);
      // Undeclared exception!
      try { 
        cSVParser0.getHeaderMap();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.HashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("'o#e", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }
}