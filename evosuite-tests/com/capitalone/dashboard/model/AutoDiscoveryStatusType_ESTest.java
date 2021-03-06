/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:35:03 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.AutoDiscoveryStatusType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoDiscoveryStatusType_ESTest extends AutoDiscoveryStatusType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutoDiscoveryStatusType autoDiscoveryStatusType0 = AutoDiscoveryStatusType.fromString("USER_REJECTED");
      assertEquals(AutoDiscoveryStatusType.USER_REJECTED, autoDiscoveryStatusType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AutoDiscoveryStatusType[] autoDiscoveryStatusTypeArray0 = AutoDiscoveryStatusType.values();
      assertEquals(4, autoDiscoveryStatusTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AutoDiscoveryStatusType autoDiscoveryStatusType0 = AutoDiscoveryStatusType.valueOf("USER_ACCEPTED");
      assertEquals(AutoDiscoveryStatusType.USER_ACCEPTED, autoDiscoveryStatusType0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        AutoDiscoveryStatusType.fromString("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         //  is not a valid AutoDiscoveryStatusType
         //
         verifyException("com.capitalone.dashboard.model.AutoDiscoveryStatusType", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      AutoDiscoveryStatusType autoDiscoveryStatusType0 = AutoDiscoveryStatusType.fromString("USER_ACCEPTED");
      assertEquals(AutoDiscoveryStatusType.USER_ACCEPTED, autoDiscoveryStatusType0);
  }
}
