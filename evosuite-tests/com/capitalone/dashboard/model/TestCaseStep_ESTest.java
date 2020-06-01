/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:26:47 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.TestCaseStatus;
import com.capitalone.dashboard.model.TestCaseStep;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestCaseStep_ESTest extends TestCaseStep_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.setId("[MG4-gmX,qQm!");
      String string0 = testCaseStep0.getId();
      assertEquals("[MG4-gmX,qQm!", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.setDuration(1226L);
      long long0 = testCaseStep0.getDuration();
      assertEquals(1226L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.setDuration((-1704L));
      long long0 = testCaseStep0.getDuration();
      assertEquals((-1704L), long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.setDescription("");
      String string0 = testCaseStep0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      TestCaseStatus testCaseStatus0 = TestCaseStatus.Failure;
      testCaseStep0.setStatus(testCaseStatus0);
      TestCaseStatus testCaseStatus1 = testCaseStep0.getStatus();
      assertSame(testCaseStatus1, testCaseStatus0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.setId("");
      String string0 = testCaseStep0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.setDescription("[MG4-gmX,qQm!");
      String string0 = testCaseStep0.getDescription();
      assertEquals("[MG4-gmX,qQm!", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      String string0 = testCaseStep0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      long long0 = testCaseStep0.getDuration();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      String string0 = testCaseStep0.getDescription();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestCaseStep testCaseStep0 = new TestCaseStep();
      testCaseStep0.getStatus();
  }
}
