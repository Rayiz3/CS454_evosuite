/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:03:21 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.Reader;
import java.io.StringReader;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.time.Month;
import java.time.chrono.IsoEra;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockPrintStream;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse(",,2bF$k}", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      // Undeclared exception!
      try { 
        CSVParser.parse(",,2bF$k}", cSVFormat1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The header contains a duplicate name: \"\" in [, , 2bF$k}]
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      // Undeclared exception!
      try { 
        CSVParser.parse("INSERT INTO INFORMATION_SCHEMA.LOB_MAP(LOB, SEQ, POS, HASH, BLOCK) VALUES(?, ?, ?, ?, ?)", cSVFormat1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The header contains a duplicate name: \" ?\" in [INSERT INTO INFORMATION_SCHEMA.LOB_MAP(LOB,  SEQ,  POS,  HASH,  BLOCK) VALUES(?,  ?,  ?,  ?,  ?)]
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter(true);
      CSVFormat cSVFormat3 = cSVFormat2.withSkipHeaderRecord(false);
      CSVFormat cSVFormat4 = cSVFormat3.withQuote('B');
      cSVFormat4.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("(R-'dzV,", cSVFormat4);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse(" COMPRESSED", cSVFormat0);
      cSVParser0.close();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      Class<Month> class0 = Month.class;
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(class0);
      CSVParser cSVParser0 = CSVParser.parse("^l3e!iDM[^_Fvu}i", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVParser cSVParser0 = CSVParser.parse("CE", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
      
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      cSVFormat0.withFirstRecordAsHeader();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((InputStream) null, charset0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'inputStream' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      String[] stringArray0 = new String[3];
      stringArray0[0] = "K";
      stringArray0[1] = "Another process was faster";
      stringArray0[2] = "uMetaRecord [id=";
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(stringArray0);
      Class<IsoEra> class0 = IsoEra.class;
      CSVFormat cSVFormat3 = cSVFormat2.withHeader(class0);
      cSVFormat0.withTrim(true);
      CSVParser cSVParser0 = CSVParser.parse("city_code_list", cSVFormat3);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
      
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-61);
      byteArray0[1] = (byte) (-122);
      byteArray0[2] = (byte) (-38);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, 22012, (byte) (-38));
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser1 = CSVParser.parse((InputStream) byteArrayInputStream0, charset0, cSVFormat2);
      assertEquals(0L, cSVParser1.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("; SQL statement:\n", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipedReader pipedReader0 = new PipedReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentMarker('z');
      CSVFormat cSVFormat2 = CSVFormat.newFormat('z');
      cSVFormat2.withIgnoreHeaderCase();
      FileSystemHandling.appendStringToFile((EvoSuiteFile) null, "");
      CSVFormat cSVFormat3 = CSVFormat.POSTGRESQL_CSV;
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser0 = CSVParser.parse(path0, charset0, cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("!", cSVFormat1);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertEquals(0L, cSVParser0.getRecordNumber());
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse(",tmT]u:z/Lhfd/wAHL}", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVFormat cSVFormat2 = cSVFormat1.withIgnoreHeaderCase();
      CSVParser cSVParser0 = CSVParser.parse("$kJtc]n0Ljjpm'%n", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("<", cSVFormat0);
      cSVParser0.getRecords();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("N", cSVFormat0);
      cSVParser0.getHeaderMap();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVParser cSVParser0 = CSVParser.parse("dU2TM,4}gW", cSVFormat0);
      cSVParser0.getFirstEndOfLine();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.newFormat('m');
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.isClosed();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      StringReader stringReader0 = new StringReader("page_rank");
      stringReader0.reset();
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      FileSystemHandling.shouldAllThrowIOExceptions();
      CSVFormat cSVFormat1 = cSVFormat0.withSystemRecordSeparator();
      CSVFormat cSVFormat2 = cSVFormat1.withIgnoreEmptyLines();
      CSVParser cSVParser0 = CSVParser.parse((Reader) stringReader0, cSVFormat2);
      cSVParser0.getFirstEndOfLine();
      cSVParser0.getCurrentLineNumber();
      cSVParser0.isClosed();
      stringReader0.skip(1287L);
      MockFile mockFile0 = new MockFile("lXfv<", "reader");
      MockPrintStream mockPrintStream0 = new MockPrintStream(mockFile0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) cSVFormat1;
      objectArray0[1] = (Object) cSVFormat0;
      cSVFormat2.printRecord(mockPrintStream0, objectArray0);
      cSVParser0.iterator();
      cSVParser0.getCurrentLineNumber();
      cSVParser0.getCurrentLineNumber();
      cSVParser0.getHeaderMap();
      cSVParser0.getHeaderMap();
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(0L, long0);
      
      cSVParser0.isClosed();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("'ouHm-,;]", cSVFormat0);
      cSVParser0.getCurrentLineNumber();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("N(}D'v|0:y,", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse("N(}D'v|0:y,", cSVFormat0);
      cSVParser0.iterator();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      Class<IsoEra> class0 = IsoEra.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      CSVParser cSVParser0 = CSVParser.parse("bN(}D#'|0:y,", cSVFormat1);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      try { 
        CSVParser.parse(path0, charset0, cSVFormat0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      // Undeclared exception!
      try { 
        CSVParser.parse((Reader) null, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'reader' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("org.h2.index.PageDataOverflow", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVParser cSVParser0 = CSVParser.parse("CE", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse("CE", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
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
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      URL uRL0 = MockURL.getHttpExample();
      // Undeclared exception!
      try { 
        CSVParser.parse(uRL0, (Charset) null, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'charset' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }
}
