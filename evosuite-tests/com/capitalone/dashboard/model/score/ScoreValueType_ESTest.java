/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:17:36 GMT 2020
 */

package com.capitalone.dashboard.model.score;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.score.ScoreValueType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScoreValueType_ESTest extends ScoreValueType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScoreValueType[] scoreValueTypeArray0 = ScoreValueType.values();
      assertEquals(1, scoreValueTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ScoreValueType scoreValueType0 = ScoreValueType.valueOf("DASHBOARD");
      assertEquals(ScoreValueType.DASHBOARD, scoreValueType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        ScoreValueType.fromString("dashboasd");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // dashboasd is not a valid ScoreValueType.
         //
         verifyException("com.capitalone.dashboard.model.score.ScoreValueType", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ScoreValueType scoreValueType0 = ScoreValueType.fromString("DASHBOARD");
      assertEquals(ScoreValueType.DASHBOARD, scoreValueType0);
  }
}