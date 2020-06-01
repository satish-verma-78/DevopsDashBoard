/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:04:11 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.CollectionError;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CollectionError_ESTest extends CollectionError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      System.setCurrentTimeMillis(0L);
      CollectionError collectionError0 = new CollectionError((String) null, (String) null);
      long long0 = collectionError0.getTimestamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      System.setCurrentTimeMillis((-1906L));
      CollectionError collectionError0 = new CollectionError("<)[&Q}/~iy{7Ko6%{", "vdCdd9");
      long long0 = collectionError0.getTimestamp();
      assertEquals("vdCdd9", collectionError0.getErrorMessage());
      assertEquals("<)[&Q}/~iy{7Ko6%{", collectionError0.getErrorCode());
      assertEquals((-1906L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError((String) null, (String) null);
      String string0 = collectionError0.getErrorMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError("Zdj[?>|-", "Zdj[?>|-");
      String string0 = collectionError0.getErrorMessage();
      assertEquals("Zdj[?>|-", string0);
      assertEquals("Zdj[?>|-", collectionError0.getErrorCode());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError((String) null, (String) null);
      String string0 = collectionError0.getErrorCode();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError("*FfPI|2TO Hd1gij", "*FfPI|2TO Hd1gij");
      String string0 = collectionError0.getErrorCode();
      assertEquals("*FfPI|2TO Hd1gij", collectionError0.getErrorMessage());
      assertEquals("*FfPI|2TO Hd1gij", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError("", "");
      String string0 = collectionError0.getErrorCode();
      assertEquals("", string0);
      assertEquals("", collectionError0.getErrorMessage());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError("", "");
      String string0 = collectionError0.getErrorMessage();
      assertEquals("", string0);
      assertEquals("", collectionError0.getErrorCode());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      CollectionError collectionError0 = new CollectionError("", "");
      long long0 = collectionError0.getTimestamp();
      assertEquals(1392409281320L, long0);
      assertEquals("", collectionError0.getErrorMessage());
      assertEquals("", collectionError0.getErrorCode());
  }
}