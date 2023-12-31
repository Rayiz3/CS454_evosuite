/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:06:00 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.time.DayOfWeek;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.h2.jdbc.JdbcLob;
import org.h2.tools.SimpleResultSet;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      CSVParser.parse(",", cSVFormat1);
      CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse(",", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse(",", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      // Undeclared exception!
      try { 
        CSVParser.parse(",\n", cSVFormat1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The header contains a duplicate name: \"\" in [, ]
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      // Undeclared exception!
      try { 
        CSVParser.parse(",\n", cSVFormat1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The header contains a duplicate name: \"null\" in [null, null]
         //
         verifyException("org.apache.commons.csv.CSVParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("]B", cSVFormat0);
      cSVParser0.nextRecord();
      cSVParser0.nextRecord();
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVParser.parse(path0, charset0, cSVFormat0);
      cSVParser0.close();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      Class<DayOfWeek> class0 = DayOfWeek.class;
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(class0);
      CSVParser cSVParser0 = CSVParser.parse("tyT1.+2YQ9%<\"oY", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("]B", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("w+r", cSVFormat0);
      cSVParser0.close();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVFormat cSVFormat2 = cSVFormat1.withIgnoreHeaderCase();
      CSVParser cSVParser0 = CSVParser.parse("J", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("BU\"13luhP", cSVFormat0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse(",\n", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse(",", cSVFormat1);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertFalse(map0.isEmpty());
      
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse((InputStream) pipedInputStream0, charset0, cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      Character character0 = new Character('d');
      CSVFormat cSVFormat1 = cSVFormat0.withEscape(character0);
      CSVFormat cSVFormat2 = cSVFormat1.withRecordSeparator('j');
      cSVFormat2.withSkipHeaderRecord();
      cSVFormat2.withRecordSeparator('j');
      cSVFormat2.withEscape('d');
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-47);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte) (-47), (byte) (-47));
      CSVParser cSVParser0 = CSVParser.parse((InputStream) byteArrayInputStream0, charset0, cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("]B", cSVFormat0);
      cSVParser0.getRecords();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("MILLISECONDS", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse(",\n", cSVFormat0);
      cSVParser0.getCurrentLineNumber();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("bF", cSVFormat0);
      cSVParser0.spliterator();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Class<JdbcLob.State> class0 = JdbcLob.State.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      CSVParser.parse("CAST(REPEAT('00', ", cSVFormat1);
      Charset charset0 = Charset.defaultCharset();
      assertTrue(charset0.canEncode());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader();
      // Undeclared exception!
      try { 
        CSVParser.parse((Reader) pipedReader0, (CSVFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'format' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      cSVFormat0.withFirstRecordAsHeader();
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
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse(") invalid parse sequence", cSVFormat0);
      SimpleResultSet simpleResultSet0 = new SimpleResultSet();
      cSVParser0.getRecordNumber();
      cSVParser0.close();
      try { 
        cSVParser0.nextRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      URL uRL0 = MockURL.getFtpExample();
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

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("url", cSVFormat0);
      cSVParser0.isClosed();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("jCB'w!.|1>x{$\"1", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse("]B", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("getString", cSVFormat0);
      cSVParser0.getHeaderMap();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((Path) null, charset0, cSVFormat0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'path' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("/s8QH`>g{zbuG/en>/A", cSVFormat0);
      cSVParser0.getFirstEndOfLine();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("IF", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }
}
