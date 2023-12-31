/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:19:54 GMT 2023
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
import java.io.Reader;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.time.chrono.MinguoEra;
import java.time.temporal.ChronoUnit;
import java.util.Map;
import java.util.function.Consumer;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter(true);
      CSVParser cSVParser0 = CSVParser.parse("=N\"-s{Mg,", cSVFormat1);
      cSVParser0.getCurrentLineNumber();
      cSVParser0.nextRecord();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse("a,b,c\n1,2\nx,y,z", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("=N\"-s{Mg,", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVParser cSVParser0 = CSVParser.parse("_s,NA_ec\"", cSVFormat0);
      cSVParser0.close();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat1 = CSVFormat.DEFAULT;
      CSVParser cSVParser0 = CSVParser.parse(path0, charset0, cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      Class<ChronoUnit> class0 = ChronoUnit.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      CSVFormat cSVFormat2 = cSVFormat1.withSkipHeaderRecord();
      CSVParser cSVParser0 = CSVParser.parse("3eccTxbai~", cSVFormat2);
      cSVParser0.close();
      MockFile mockFile0 = new MockFile("Gw?K+,");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse(path0, charset0, cSVFormat2);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse("FJ,,RfN#=", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = CSVFormat.MYSQL;
      CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("\n    OR ", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withIgnoreHeaderCase();
      CSVFormat cSVFormat2 = cSVFormat1.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("a,b,c,d\n a , b , 1 2 \n\"foo baar\", b,2  \"foo\n,,\n\"\",,\n\"\"\",d,e\n", cSVFormat2);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.EXCEL;
      String[] stringArray0 = new String[1];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("V", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVParser cSVParser0 = CSVParser.parse("T& Oh'39", cSVFormat0);
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
      cSVParser0.forEach(consumer0);
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("FJ,,RfN#=", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("latitude", cSVFormat0);
      assertEquals(0L, cSVParser0.getRecordNumber());
      
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte) (-18);
      byteArray0[1] = (byte)3;
      byteArray0[2] = (byte)97;
      byteArray0[3] = (byte) (-55);
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      Charset charset0 = Charset.defaultCharset();
      CSVParser cSVParser0 = CSVParser.parse((InputStream) byteArrayInputStream0, charset0, cSVFormat0);
      cSVParser0.close();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVParser cSVParser0 = CSVParser.parse("", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("FJ,,RfN#=", cSVFormat0);
      cSVParser0.getRecords();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVParser cSVParser0 = CSVParser.parse("latitude", cSVFormat0);
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("=N\"-s{Mg,", cSVFormat0);
      cSVParser0.getHeaderMap();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      CSVParser cSVParser0 = CSVParser.parse("disconnected session #{0}", cSVFormat0);
      cSVParser0.getFirstEndOfLine();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.MYSQL;
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
  public void test22()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("latitude", cSVFormat0);
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("latitude", cSVFormat0);
      cSVParser0.getRecordNumber();
      cSVParser0.nextRecord();
      cSVParser0.iterator();
      Csv csv0 = new Csv();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      cSVParser0.close();
      Charset charset0 = Charset.defaultCharset();
      assertEquals("UTF-8", charset0.displayName());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("FJ,,RfN#=", cSVFormat0);
      cSVParser0.getCurrentLineNumber();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("FJ,,RfN#=", cSVFormat0);
      cSVParser0.spliterator();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      URL uRL0 = MockURL.getHttpExample();
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse(uRL0, charset0, cSVFormat1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Could not find: www.someFakeButWellFormedURL.org
         //
         verifyException("org.evosuite.runtime.mock.java.net.EvoHttpURLConnection", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      Class<MinguoEra> class0 = MinguoEra.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      CSVParser cSVParser0 = CSVParser.parse("fcode", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      String[] stringArray0 = new String[0];
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse("SU", cSVFormat1);
      Map<String, Integer> map0 = cSVParser0.getHeaderMap();
      assertNotNull(map0);
      assertFalse(map0.isEmpty());
      
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      CSVFormat cSVFormat1 = cSVFormat0.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse("U", cSVFormat1);
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.DEFAULT;
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
  public void test31()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse("FJ,,RfN#=", cSVFormat0);
      cSVParser0.isClosed();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = CSVFormat.DEFAULT;
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        CSVParser.parse((Path) null, charset0, cSVFormat1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Parameter 'path' must not be null!
         //
         verifyException("org.apache.commons.csv.Assertions", e);
      }
  }
}
