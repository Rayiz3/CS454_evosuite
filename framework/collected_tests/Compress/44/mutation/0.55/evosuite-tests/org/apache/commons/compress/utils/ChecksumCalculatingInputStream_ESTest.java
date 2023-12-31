/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 09:36:10 GMT 2023
 */

package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.PipedInputStream;
import java.util.zip.Adler32;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import org.apache.commons.compress.utils.ChecksumCalculatingInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChecksumCalculatingInputStream_ESTest extends ChecksumCalculatingInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte) (-1);
      byteArray0[0] = (byte) (-1);
      byte byte1 = (byte)43;
      byteArray0[1] = (byte)43;
      byteArray0[2] = (byte)14;
      byte byte2 = (byte)1;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)39;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(cRC32_0, byteArrayInputStream0);
      checksumCalculatingInputStream0.skip((-546L));
      checksumCalculatingInputStream0.markSupported();
      // Undeclared exception!
      try { 
        byteArrayInputStream0.read(byteArray0, 0, 6);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CRC32 cRC32_0 = new CRC32();
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte) (-1);
      byteArray0[1] = (byte) (-66);
      byteArray0[2] = (byte)0;
      byteArray0[3] = (byte) (-49);
      byteArray0[4] = (byte)55;
      byteArray0[5] = (byte) (-1);
      byteArray0[6] = (byte) (-80);
      byteArray0[7] = (byte)65;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(cRC32_0, byteArrayInputStream0);
      int int0 = checksumCalculatingInputStream0.read();
      assertEquals(4278190080L, checksumCalculatingInputStream0.getValue());
      assertEquals(255, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(adler32_0, pipedInputStream0);
      byte[] byteArray0 = new byte[8];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)20;
      byteArray0[2] = (byte)72;
      byteArray0[3] = (byte)1;
      byteArray0[4] = (byte)0;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte)0;
      byteArray0[7] = (byte)0;
      int int0 = checksumCalculatingInputStream0.read(byteArray0, 6, (int) (byte)0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      byte[] byteArray0 = new byte[5];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte) (-70);
      byteArray0[2] = (byte)13;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)100;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0, (-696), (byte) (-70));
      BufferedInputStream bufferedInputStream0 = new BufferedInputStream(byteArrayInputStream0, (byte)100);
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream((Checksum) null, bufferedInputStream0);
      long long0 = checksumCalculatingInputStream0.skip(0L);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)81;
      byteArray0[1] = (byte)102;
      byteArray0[2] = (byte) (-1);
      byteArray0[3] = (byte)42;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(adler32_0, byteArrayInputStream0);
      checksumCalculatingInputStream0.read();
      checksumCalculatingInputStream0.mark(81);
      checksumCalculatingInputStream0.read(byteArray0);
      checksumCalculatingInputStream0.read();
      checksumCalculatingInputStream0.read();
      checksumCalculatingInputStream0.markSupported();
      checksumCalculatingInputStream0.getValue();
      checksumCalculatingInputStream0.read(byteArray0);
      // Undeclared exception!
      try { 
        checksumCalculatingInputStream0.read(byteArray0, (-1), (int) (byte) (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.ByteArrayInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Adler32 adler32_0 = new Adler32();
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ChecksumCalculatingInputStream checksumCalculatingInputStream0 = new ChecksumCalculatingInputStream(adler32_0, pipedInputStream0);
      try { 
        checksumCalculatingInputStream0.read();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }
}
