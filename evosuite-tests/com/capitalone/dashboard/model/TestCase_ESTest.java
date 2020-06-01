/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:31:59 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.StoryIndicator;
import com.capitalone.dashboard.model.TestCase;
import com.capitalone.dashboard.model.TestCaseCondition;
import com.capitalone.dashboard.model.TestCaseStatus;
import com.capitalone.dashboard.model.TestCaseStep;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TestCase_ESTest extends TestCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setUnknownStatusTestStepCount(611);
      int int0 = testCase0.getUnknownStatusTestStepCount();
      assertEquals(611, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setUnknownStatusCount((-1970));
      int int0 = testCase0.getUnknownStatusTestStepCount();
      assertEquals((-1970), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setUnknownStatusCount(1);
      int int0 = testCase0.getUnknownStatusCount();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setUnknownStatusTestStepCount((-1092));
      int int0 = testCase0.getUnknownStatusCount();
      assertEquals((-1092), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setTotalTestStepCount(260);
      int int0 = testCase0.getTotalTestStepCount();
      assertEquals(260, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setTotalTestStepCount((-1143));
      int int0 = testCase0.getTotalTestStepCount();
      assertEquals((-1143), int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setTestSteps((Collection<TestCaseStep>) null);
      Collection<TestCaseStep> collection0 = testCase0.getTestSteps();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setTags((Set<String>) null);
      Set<String> set0 = testCase0.getTags();
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      LinkedHashSet<String> linkedHashSet0 = new LinkedHashSet<String>();
      linkedHashSet0.add("");
      testCase0.setTags(linkedHashSet0);
      Set<String> set0 = testCase0.getTags();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setSuccessTestStepCount(3);
      int int0 = testCase0.getSuccessTestStepCount();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setSuccessTestStepCount((-2934));
      int int0 = testCase0.getSuccessTestStepCount();
      assertEquals((-2934), int0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setStoryIndicators((Collection<StoryIndicator>) null);
      Collection<StoryIndicator> collection0 = testCase0.getStoryIndicators();
      assertNull(collection0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setStatus((TestCaseStatus) null);
      testCase0.getStatus();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setSkippedTestStepCount(2711);
      int int0 = testCase0.getSkippedTestStepCount();
      assertEquals(2711, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setSkippedTestStepCount((-1143));
      int int0 = testCase0.getSkippedTestStepCount();
      assertEquals((-1143), int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setId("c]");
      String string0 = testCase0.getId();
      assertEquals("c]", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setId("");
      String string0 = testCase0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setFailedTestStepCount(2040);
      int int0 = testCase0.getFailedTestStepCount();
      assertEquals(2040, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setFailedTestStepCount((-1));
      int int0 = testCase0.getFailedTestStepCount();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setDuration(1695L);
      long long0 = testCase0.getDuration();
      assertEquals(1695L, long0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setDuration((-1241L));
      long long0 = testCase0.getDuration();
      assertEquals((-1241L), long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setDescription("Success");
      String string0 = testCase0.getDescription();
      assertEquals("Success", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      testCase0.setDescription("");
      String string0 = testCase0.getDescription();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      int int0 = testCase0.getSuccessTestStepCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      int int0 = testCase0.getUnknownStatusCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      TestCaseStatus testCaseStatus0 = testCase0.getStatus();
      assertEquals(TestCaseStatus.Unknown, testCaseStatus0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      String string0 = testCase0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      int int0 = testCase0.getUnknownStatusTestStepCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      int int0 = testCase0.getFailedTestStepCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      int int0 = testCase0.getSkippedTestStepCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      Set<String> set0 = testCase0.getTags();
      assertTrue(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      long long0 = testCase0.getDuration();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      Collection<StoryIndicator> collection0 = testCase0.getStoryIndicators();
      testCase0.setStoryIndicators(collection0);
      assertEquals(0, testCase0.getUnknownStatusTestStepCount());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      Collection<TestCaseStep> collection0 = testCase0.getTestSteps();
      testCase0.setTestSteps(collection0);
      assertEquals(TestCaseStatus.Unknown, testCase0.getStatus());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      Collection<TestCaseCondition> collection0 = testCase0.getAfter();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      int int0 = testCase0.getTotalTestStepCount();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      Collection<TestCaseCondition> collection0 = testCase0.getBefore();
      assertNotNull(collection0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      TestCase testCase0 = new TestCase();
      String string0 = testCase0.getDescription();
      assertNull(string0);
  }
}