/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:38:50 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.ServiceAccount;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ServiceAccount_ESTest extends ServiceAccount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount("", "");
      serviceAccount0.setServiceAccountName("WUrC");
      serviceAccount0.getServiceAccountName();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount("hulq5T'iX}Zv~> ,%", (String) null);
      serviceAccount0.setServiceAccountName("");
      serviceAccount0.getServiceAccountName();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount("I31M77P1bh!Ev", "I31M77P1bh!Ev");
      serviceAccount0.getFileNames();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount("", "");
      serviceAccount0.getFileNames();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount((String) null, (String) null);
      serviceAccount0.getServiceAccountName();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount((String) null, (String) null);
      serviceAccount0.setFileNames((String) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount((String) null, (String) null);
      serviceAccount0.getFileNames();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ServiceAccount serviceAccount0 = new ServiceAccount((String) null, (String) null);
      serviceAccount0.toString();
  }
}
