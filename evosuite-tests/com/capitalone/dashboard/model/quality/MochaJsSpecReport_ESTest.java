/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:05:43 GMT 2020
 */

package com.capitalone.dashboard.model.quality;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.quality.MochaJsSpecReport;
import com.capitalone.dashboard.model.quality.QualityVisitor;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MochaJsSpecReport_ESTest extends MochaJsSpecReport_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MochaJsSpecReport mochaJsSpecReport0 = new MochaJsSpecReport();
      // Undeclared exception!
      try { 
        mochaJsSpecReport0.accept((QualityVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.quality.MochaJsSpecReport", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = new MochaJsSpecReport.Stats();
      long long0 = mochaJsSpecReport_Stats0.getDuration();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = new MochaJsSpecReport.Stats();
      int int0 = mochaJsSpecReport_Stats0.getPending();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = new MochaJsSpecReport.Stats();
      int int0 = mochaJsSpecReport_Stats0.getTests();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = new MochaJsSpecReport.Stats();
      int int0 = mochaJsSpecReport_Stats0.getPasses();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = new MochaJsSpecReport.Stats();
      int int0 = mochaJsSpecReport_Stats0.getSuites();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = new MochaJsSpecReport.Stats();
      int int0 = mochaJsSpecReport_Stats0.getFailures();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MochaJsSpecReport.Test mochaJsSpecReport_Test0 = new MochaJsSpecReport.Test();
      String string0 = mochaJsSpecReport_Test0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MochaJsSpecReport.Test mochaJsSpecReport_Test0 = new MochaJsSpecReport.Test();
      String string0 = mochaJsSpecReport_Test0.getResult();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MochaJsSpecReport.Test mochaJsSpecReport_Test0 = new MochaJsSpecReport.Test();
      long long0 = mochaJsSpecReport_Test0.getDuration();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MochaJsSpecReport.Suite mochaJsSpecReport_Suite0 = new MochaJsSpecReport.Suite();
      List<MochaJsSpecReport.Test> list0 = mochaJsSpecReport_Suite0.getTests();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MochaJsSpecReport.Suite mochaJsSpecReport_Suite0 = new MochaJsSpecReport.Suite();
      String string0 = mochaJsSpecReport_Suite0.getTitle();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MochaJsSpecReport mochaJsSpecReport0 = new MochaJsSpecReport();
      QualityVisitor<Object> qualityVisitor0 = (QualityVisitor<Object>) mock(QualityVisitor.class, new ViolatedAssumptionAnswer());
      mochaJsSpecReport0.accept(qualityVisitor0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MochaJsSpecReport mochaJsSpecReport0 = new MochaJsSpecReport();
      List<MochaJsSpecReport.Suite> list0 = mochaJsSpecReport0.getSuites();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MochaJsSpecReport mochaJsSpecReport0 = new MochaJsSpecReport();
      MochaJsSpecReport.Stats mochaJsSpecReport_Stats0 = mochaJsSpecReport0.getStats();
      assertNull(mochaJsSpecReport_Stats0);
  }
}
