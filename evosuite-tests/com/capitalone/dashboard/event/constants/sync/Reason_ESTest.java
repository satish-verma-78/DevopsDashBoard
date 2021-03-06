/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:58:27 GMT 2020
 */

package com.capitalone.dashboard.event.constants.sync;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.event.constants.sync.Reason;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Reason_ESTest extends Reason_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Reason[] reasonArray0 = Reason.values();
      assertEquals(3, reasonArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Reason reason0 = Reason.valueOf("CODEQUALITY_TRIGGERED_REASON");
      assertEquals(Reason.CODEQUALITY_TRIGGERED_REASON, reason0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Reason reason0 = Reason.CODEQUALITY_TRIGGERED_REASON;
      String string0 = reason0.getAction();
      assertEquals("Code scan triggered by build", string0);
  }
}
