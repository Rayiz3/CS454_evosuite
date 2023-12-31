/*
 * This file was automatically generated by EvoSuite
 * Sat Dec 16 06:42:01 GMT 2023
 */

package org.apache.commons.compress.utils;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.nio.ByteOrder;
import org.apache.commons.compress.utils.BitInputStream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BitInputStream_ESTest extends BitInputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      byte[] byteArray0 = new byte[4];
      byteArray0[0] = (byte)83;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      BitInputStream bitInputStream0 = new BitInputStream(byteArrayInputStream0, byteOrder0);
      long long0 = bitInputStream0.readBits((byte)52);
      assertEquals(0, byteArrayInputStream0.available());
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedOutputStream0.write(Integer.MAX_VALUE);
      pipedOutputStream0.close();
      BitInputStream bitInputStream0 = new BitInputStream(pipedInputStream0, (ByteOrder) null);
      bitInputStream0.readBits(1);
      long long0 = bitInputStream0.readBits(6);
      assertEquals(0, pipedInputStream0.available());
      assertEquals(63L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      PipedInputStream pipedInputStream0 = new PipedInputStream(pipedOutputStream0);
      pipedOutputStream0.close();
      BitInputStream bitInputStream0 = new BitInputStream(pipedInputStream0, byteOrder0);
      BitInputStream bitInputStream1 = new BitInputStream(pipedInputStream0, byteOrder0);
      long long0 = bitInputStream0.readBits(35);
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ByteOrder byteOrder0 = ByteOrder.BIG_ENDIAN;
      BitInputStream bitInputStream0 = new BitInputStream(pipedInputStream0, byteOrder0);
      long long0 = bitInputStream0.readBits(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BitInputStream bitInputStream0 = new BitInputStream(pipedInputStream0, byteOrder0);
      long long0 = bitInputStream0.readBits(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BitInputStream bitInputStream0 = new BitInputStream(pipedInputStream0, byteOrder0);
      // Undeclared exception!
      try { 
        bitInputStream0.readBits((-2801));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // count must not be negative or greater than 63
         //
         verifyException("org.apache.commons.compress.utils.BitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      BitInputStream bitInputStream0 = new BitInputStream(dataInputStream0, byteOrder0);
      // Undeclared exception!
      try { 
        bitInputStream0.readBits(2138345419);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // count must not be negative or greater than 63
         //
         verifyException("org.apache.commons.compress.utils.BitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BitInputStream bitInputStream0 = new BitInputStream((InputStream) null, byteOrder0);
      // Undeclared exception!
      try { 
        bitInputStream0.readBits(17);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.compress.utils.BitInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      BitInputStream bitInputStream0 = new BitInputStream(dataInputStream0, byteOrder0);
      bitInputStream0.close();
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      DataInputStream dataInputStream0 = new DataInputStream(pipedInputStream0);
      ByteOrder byteOrder0 = ByteOrder.LITTLE_ENDIAN;
      BitInputStream bitInputStream0 = new BitInputStream(pipedInputStream0, byteOrder0);
      bitInputStream0.clearBitCache();
      long long0 = bitInputStream0.readBits(0);
      assertEquals(0L, long0);
  }
}
