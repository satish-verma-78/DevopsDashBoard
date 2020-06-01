/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:15:03 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.MaturityModel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MaturityModel_ESTest extends MaturityModel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MaturityModel maturityModel0 = new MaturityModel();
      maturityModel0.setRules("R");
      String string0 = maturityModel0.getRules();
      assertEquals("R", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MaturityModel maturityModel0 = new MaturityModel();
      maturityModel0.setRules("");
      String string0 = maturityModel0.getRules();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MaturityModel maturityModel0 = new MaturityModel();
      maturityModel0.setProfile("|(4A'/7*A&");
      String string0 = maturityModel0.getProfile();
      assertEquals("|(4A'/7*A&", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MaturityModel maturityModel0 = new MaturityModel();
      maturityModel0.setProfile("");
      String string0 = maturityModel0.getProfile();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MaturityModel maturityModel0 = new MaturityModel();
      String string0 = maturityModel0.getProfile();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      MaturityModel maturityModel0 = new MaturityModel();
      String string0 = maturityModel0.getRules();
      assertNull(string0);
  }
}