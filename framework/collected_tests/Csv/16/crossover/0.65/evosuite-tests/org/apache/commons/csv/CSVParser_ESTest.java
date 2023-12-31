/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:11:17 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Reader;
import java.net.Proxy;
import java.net.URI;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentMarker('d');
      CSVParser cSVParser0 = CSVParser.parse("d]GK*DHq", cSVFormat1);
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("\n    OR ", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      Class<QuoteMode> class0 = QuoteMode.class;
      CSVFormat cSVFormat2 = cSVFormat1.withHeader(class0);
      CSVParser cSVParser0 = CSVParser.parse("PDHq7v8&9v##fz", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("N", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVFormat cSVFormat2 = cSVFormat1.withTrailingDelimiter(false);
      CSVFormat cSVFormat3 = cSVFormat2.withIgnoreHeaderCase();
      CSVParser cSVParser0 = CSVParser.parse("!Y", cSVFormat3);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("lTfo9*29/2<J6m$gS,", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      Class<Proxy.Type> class0 = Proxy.Type.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      CSVParser cSVParser0 = CSVParser.parse("Le", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVParser cSVParser0 = CSVParser.parse("zXM", cSVFormat0);
      cSVParser0.close();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("iD", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("k*", cSVFormat1);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertEquals(1, map0.size());
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVFormat cSVFormat1 = cSVFormat0.withCommentMarker('V');
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      cSVParser0.nextRecord();
      Charset.defaultCharset();
      CSVFormat cSVFormat2 = CSVFormat.RFC4180;
      Charset charset0 = Charset.defaultCharset();
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      CSVParser cSVParser1 = CSVParser.parse(path0, charset0, cSVFormat1);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(0L, cSVParser0.getRecordNumber());
      
      cSVParser1.isClosed();
      assertEquals(0L, cSVParser1.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("$", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse(":XA9,<o*@Ji,", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("iD", cSVFormat0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVParser cSVParser0 = CSVParser.parse("Atnqm^fUxgV[%< ?`E,", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("iD", cSVFormat0);
      cSVParser0.getCurrentLineNumber();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("iD", cSVFormat0);
      cSVParser0.getRecords();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("iD", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      CSVParser cSVParser0 = CSVParser.parse("'D", cSVFormat0);
      cSVParser0.getFirstEndOfLine();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("k*", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("Q!A", cSVFormat0);
      cSVParser0.isClosed();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      // Undeclared exception!
      try { 
        CSVParser.parse((InputStream) null, (Charset) null, (CSVFormat) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'inputStream' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
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
  public void test25()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      CSVFormat cSVFormat1 = cSVFormat0.withSystemRecordSeparator();
      CSVParser cSVParser0 = CSVParser.parse("<HT#4JRe_%s-9X", cSVFormat0);
      Class<TimeUnit> class0 = TimeUnit.class;
      cSVFormat0.withHeader(class0);
      cSVParser0.isClosed();
      long long0 = cSVParser0.getRecordNumber();
      assertEquals(0L, long0);
      
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)36;
      byteArray0[1] = (byte) (-17);
      byteArray0[2] = (byte)24;
      byteArray0[3] = (byte)84;
      byteArray0[4] = (byte)4;
      byteArray0[5] = (byte) (-45);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (byte)4, 1645);
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser1 = CSVParser.parse((InputStream) byteArrayInputStream0, charset0, cSVFormat1);
      assertEquals(0L, cSVParser1.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      URL uRL0 = MockURL.getFtpExample();
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
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
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
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("S", cSVFormat0);
      cSVParser0.spliterator();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse((File) mockFile0, charset0, cSVFormat0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
      CSVParser cSVParser0 = CSVParser.parse("iD", cSVFormat0);
      cSVParser0.getHeaderMap();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      CSVParser cSVParser0 = CSVParser.parse("`", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }
}
