/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 18:14:32 GMT 2023
 */

package org.apache.commons.csv;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedReader;
import java.io.PipedWriter;
import java.io.Reader;
import java.net.URL;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.sql.ResultSet;
import java.time.Month;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.QuoteMode;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.io.MockFileInputStream;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.h2.tools.Csv;
import org.h2.tools.SimpleResultSet;
import org.h2.value.ValueLong;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CSVParser_ESTest extends CSVParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong valueLong0 = ValueLong.get(185L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter(true);
      Object[] objectArray0 = new Object[8];
      CSVFormat cSVFormat2 = cSVFormat1.withHeaderComments(objectArray0);
      CSVFormat cSVFormat3 = CSVFormat.POSTGRESQL_CSV;
      Csv csv0 = new Csv();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      cSVFormat1.withHeader((ResultSet) simpleResultSet0);
      String[] stringArray0 = new String[6];
      stringArray0[0] = "MINUTES";
      stringArray0[1] = "gtopo30";
      stringArray0[2] = "a,b,c\n1,2,3\nx,y,z";
      stringArray0[3] = "8WwG>ArcN/$d";
      stringArray0[4] = "";
      stringArray0[5] = "LOCKS";
      CSVFormat cSVFormat4 = cSVFormat2.withHeader(stringArray0);
      CSVParser cSVParser0 = CSVParser.parse(reader0, cSVFormat4);
      cSVParser0.nextRecord();
      MockFile mockFile0 = new MockFile("APRIL");
      mockFile0.toPath();
      // Undeclared exception!
      try { 
        Charset.forName("MINUTES");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // MINUTES
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong valueLong0 = ValueLong.get(185L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter(true);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) cSVFormat0;
      cSVFormat1.withHeaderComments(objectArray0);
      CSVFormat cSVFormat2 = CSVFormat.ORACLE;
      CSVParser cSVParser0 = CSVParser.parse(reader0, cSVFormat2);
      cSVParser0.nextRecord();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong valueLong0 = ValueLong.get(0L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter(true);
      Object[] objectArray0 = new Object[0];
      cSVFormat0.withHeaderComments(objectArray0);
      CSVParser cSVParser0 = new CSVParser(reader0, cSVFormat0, 31557600000L, 19);
      cSVParser0.getHeaderMap();
      PipedReader pipedReader0 = new PipedReader(2110);
      CSVParser cSVParser1 = CSVParser.parse((Reader) pipedReader0, cSVFormat1);
      cSVParser1.close();
      cSVParser0.getRecords();
      System.setCurrentTimeMillis(1048576L);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong valueLong0 = ValueLong.get(185L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      cSVFormat0.withTrailingDelimiter(true);
      Object[] objectArray0 = new Object[8];
      objectArray0[0] = (Object) cSVFormat0;
      CSVFormat cSVFormat1 = cSVFormat0.withHeaderComments(objectArray0);
      CSVFormat cSVFormat2 = CSVFormat.POSTGRESQL_CSV;
      Csv csv0 = new Csv();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      CSVFormat cSVFormat3 = cSVFormat1.withHeader((ResultSet) simpleResultSet0);
      CSVParser cSVParser0 = CSVParser.parse(reader0, cSVFormat3);
      cSVParser0.nextRecord();
      cSVParser0.getRecords();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong valueLong0 = ValueLong.get(185L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      cSVFormat0.withAllowMissingColumnNames();
      Object[] objectArray0 = new Object[5];
      CSVFormat cSVFormat1 = cSVFormat0.withHeaderComments(objectArray0);
      CSVParser cSVParser0 = CSVParser.parse(reader0, cSVFormat1);
      cSVParser0.nextRecord();
      cSVParser0.getFirstEndOfLine();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ValueLong valueLong0 = ValueLong.get(0L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      Object[] objectArray0 = new Object[0];
      cSVFormat0.withHeaderComments(objectArray0);
      CSVFormat cSVFormat1 = CSVFormat.POSTGRESQL_CSV;
      Csv csv0 = new Csv();
      SimpleResultSet simpleResultSet0 = new SimpleResultSet(csv0);
      CSVFormat cSVFormat2 = cSVFormat0.withHeaderComments(objectArray0);
      CSVFormat cSVFormat3 = cSVFormat2.withHeader((ResultSet) simpleResultSet0);
      CSVParser cSVParser0 = CSVParser.parse(reader0, cSVFormat3);
      cSVParser0.nextRecord();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      Class<Month> class0 = Month.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      cSVFormat0.withNullString("pFGJI@S_");
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat1, 0L, 495L);
      CSVParser cSVParser1 = cSVFormat0.parse(pipedReader0);
      cSVParser0.getHeaderMap();
      CSVParser.parse((Reader) pipedReader0, cSVFormat0);
      cSVParser0.close();
      try { 
        cSVParser1.getRecords();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      Class<Month> class0 = Month.class;
      CSVFormat cSVFormat1 = cSVFormat0.withHeader(class0);
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 0L, 20L);
      cSVParser0.getHeaderMap();
      CSVParser cSVParser1 = CSVParser.parse((Reader) pipedReader0, cSVFormat1);
      cSVParser1.close();
      try { 
        cSVParser0.getRecords();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe closed
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      cSVFormat0.withEscape('M');
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat1, 0L, 0L);
      cSVParser0.getCurrentLineNumber();
      cSVParser0.getHeaderMap();
      cSVParser0.close();
      assertEquals((-1L), cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      Charset.isSupported("charset");
      CSVFormat cSVFormat0 = CSVFormat.RFC4180;
      cSVFormat0.withAllowMissingColumnNames();
      charset0.encode("XqPa4y");
      PipedReader pipedReader0 = new PipedReader(62);
      char[] charArray0 = new char[0];
      CSVFormat cSVFormat1 = cSVFormat0.withAllowMissingColumnNames(true);
      CSVParser cSVParser0 = cSVFormat1.parse(pipedReader0);
      cSVParser0.getRecordNumber();
      try { 
        cSVParser0.nextRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      QuoteMode quoteMode0 = QuoteMode.NONE;
      CSVFormat cSVFormat1 = cSVFormat0.withQuoteMode(quoteMode0);
      CSVFormat cSVFormat2 = cSVFormat1.withIgnoreSurroundingSpaces();
      CSVFormat cSVFormat3 = cSVFormat2.withIgnoreSurroundingSpaces(true);
      // Undeclared exception!
      try { 
        CSVParser.parse(uRL0, charset0, cSVFormat3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong valueLong0 = ValueLong.get(185L);
      Reader reader0 = valueLong0.getReader();
      CSVFormat cSVFormat0 = CSVFormat.INFORMIX_UNLOAD_CSV;
      cSVFormat0.withAllowMissingColumnNames();
      Object[] objectArray0 = new Object[5];
      CSVFormat cSVFormat1 = cSVFormat0.withHeaderComments(objectArray0);
      CSVParser cSVParser0 = CSVParser.parse(reader0, cSVFormat1);
      cSVParser0.nextRecord();
      cSVParser0.nextRecord();
      assertEquals(1L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      cSVFormat0.withEscape('M');
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 0L, 0L);
      cSVParser0.getHeaderMap();
      cSVParser0.close();
      assertEquals((-1L), cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.ORACLE;
      CSVFormat cSVFormat1 = cSVFormat0.withEscape('?');
      CSVFormat cSVFormat2 = CSVFormat.EXCEL;
      cSVFormat2.withAllowMissingColumnNames(false);
      CSVFormat cSVFormat3 = cSVFormat1.withIgnoreSurroundingSpaces();
      String string0 = "tvl_por_list";
      MockFile mockFile0 = new MockFile("tvl_por_list", "tvl_por_list");
      try { 
        CSVParser.parse((File) mockFile0, charset0, cSVFormat3);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockFileInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      cSVFormat0.withIgnoreEmptyLines();
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 0L, 0L);
      assertEquals((-1L), cSVParser0.getRecordNumber());
      
      cSVParser0.getHeaderMap();
      assertEquals((-1L), cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      CSVFormat cSVFormat2 = cSVFormat0.withEscape('M');
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat1, 0L, 0L);
      cSVParser0.isClosed();
      cSVParser0.getHeaderMap();
      CSVParser.parse((Reader) pipedReader0, cSVFormat0);
      MockFile mockFile0 = new MockFile("ALWAYS");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse(path0, charset0, cSVFormat2);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      Character character0 = new Character('&');
      CSVFormat cSVFormat2 = cSVFormat1.withEscape(character0);
      Charset charset1 = Charset.defaultCharset();
      CharBuffer charBuffer0 = CharBuffer.allocate(22025);
      ByteBuffer byteBuffer0 = charset1.encode(charBuffer0);
      charset0.decode(byteBuffer0);
      CSVParser cSVParser0 = CSVParser.parse((InputStream) mockFileInputStream0, charset0, cSVFormat2);
      cSVParser0.getRecordNumber();
      try { 
        cSVParser0.nextRecord();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.NativeMockedIO", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileSystemHandling.shouldThrowIOException((EvoSuiteFile) null);
      FileDescriptor fileDescriptor0 = new FileDescriptor();
      MockFileInputStream mockFileInputStream0 = new MockFileInputStream(fileDescriptor0);
      Charset charset0 = Charset.defaultCharset();
      CSVFormat cSVFormat0 = CSVFormat.TDF;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      Character character0 = new Character('&');
      CSVFormat cSVFormat2 = cSVFormat1.withEscape(character0);
      Charset charset1 = Charset.defaultCharset();
      CharBuffer charBuffer0 = CharBuffer.allocate(22025);
      ByteBuffer byteBuffer0 = charset1.encode(charBuffer0);
      charset0.decode(byteBuffer0);
      cSVFormat2.withFirstRecordAsHeader();
      CSVParser cSVParser0 = CSVParser.parse((InputStream) mockFileInputStream0, charset0, cSVFormat2);
      cSVParser0.iterator();
      cSVParser0.getHeaderMap();
      cSVParser0.isClosed();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileSystemHandling.shouldAllThrowIOExceptions();
      ValueLong.get(185L);
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_CSV;
      cSVFormat0.withIgnoreEmptyLines();
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0);
      cSVParser0.spliterator();
      cSVParser0.close();
      assertEquals(0L, cSVParser0.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      cSVFormat0.withIgnoreEmptyLines();
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 0L, 1979L);
      cSVParser0.getHeaderMap();
      assertEquals(1978L, cSVParser0.getRecordNumber());
      
      CSVParser cSVParser1 = CSVParser.parse("Stuct", cSVFormat0);
      cSVParser1.close();
      assertEquals(0L, cSVParser1.getRecordNumber());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat0, 0L, 0L);
      CSVParser cSVParser1 = CSVParser.parse((Reader) pipedReader0, cSVFormat0);
      cSVParser1.close();
      try { 
        cSVParser1.getRecords();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Stream closed
         //
         verifyException("java.io.BufferedReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      PipedWriter pipedWriter0 = new PipedWriter();
      PipedReader pipedReader0 = new PipedReader(pipedWriter0);
      CSVFormat cSVFormat0 = CSVFormat.POSTGRESQL_TEXT;
      CSVFormat cSVFormat1 = cSVFormat0.withTrailingDelimiter();
      cSVFormat0.withEscape('M');
      CSVParser cSVParser0 = new CSVParser(pipedReader0, cSVFormat1, 0L, 0L);
      cSVParser0.getHeaderMap();
      CSVParser.parse((Reader) pipedReader0, cSVFormat0);
      MockFile mockFile0 = new MockFile("ALWAYS");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      try { 
        CSVParser.parse(path0, charset0, cSVFormat0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }
}
