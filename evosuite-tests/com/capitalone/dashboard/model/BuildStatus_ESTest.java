/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:45:21 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.BuildStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BuildStatus_ESTest extends BuildStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BuildStatus buildStatus0 = BuildStatus.fromString("InProgress");
      assertEquals(BuildStatus.InProgress, buildStatus0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BuildStatus[] buildStatusArray0 = BuildStatus.values();
      assertEquals(6, buildStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BuildStatus buildStatus0 = BuildStatus.valueOf("Unstable");
      assertEquals(BuildStatus.Unstable, buildStatus0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BuildStatus buildStatus0 = BuildStatus.fromString("Aborted");
      assertEquals(BuildStatus.Aborted, buildStatus0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        BuildStatus.fromString("AboQted");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // AboQted is not a valid BuildStatus.
         //
         verifyException("com.capitalone.dashboard.model.BuildStatus", e);
      }
  }
}