/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:47:54 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.CodeQualityMetric;
import com.capitalone.dashboard.model.CodeQualityMetricStatus;
import com.capitalone.dashboard.model.Instance;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeQualityMetric_ESTest extends CodeQualityMetric_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric();
      codeQualityMetric0.setValue(")@I~1mKu");
      String string0 = codeQualityMetric0.getValue();
      assertEquals(")@I~1mKu", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("com.capitalone.dashboard.model.Instance");
      codeQualityMetric0.setValue("");
      String string0 = codeQualityMetric0.getValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      codeQualityMetric0.setStatusMessage("(G-zeE|?6");
      String string0 = codeQualityMetric0.getStatusMessage();
      assertEquals("(G-zeE|?6", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      codeQualityMetric0.setStatusMessage("");
      String string0 = codeQualityMetric0.getStatusMessage();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric();
      CodeQualityMetricStatus codeQualityMetricStatus0 = CodeQualityMetricStatus.Warning;
      codeQualityMetric0.setStatus(codeQualityMetricStatus0);
      CodeQualityMetricStatus codeQualityMetricStatus1 = codeQualityMetric0.getStatus();
      assertSame(codeQualityMetricStatus1, codeQualityMetricStatus0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric((String) null);
      String string0 = codeQualityMetric0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      String string0 = codeQualityMetric0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      Instance instance0 = new Instance();
      codeQualityMetric0.addInstance(instance0);
      List<Instance> list0 = codeQualityMetric0.getInstances();
      assertTrue(list0.contains(instance0));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric();
      codeQualityMetric0.setFormattedValue("Ps7");
      String string0 = codeQualityMetric0.getFormattedValue();
      assertEquals("Ps7", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric(")11LV~");
      codeQualityMetric0.setFormattedValue("");
      String string0 = codeQualityMetric0.getFormattedValue();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      codeQualityMetric0.setName((String) null);
      // Undeclared exception!
      try { 
        codeQualityMetric0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.CodeQualityMetric", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      List<Instance> list0 = codeQualityMetric0.getInstances();
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric();
      CodeQualityMetric codeQualityMetric1 = new CodeQualityMetric();
      // Undeclared exception!
      try { 
        codeQualityMetric1.equals(codeQualityMetric0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("TM@raRQJ(=DU");
      boolean boolean0 = codeQualityMetric0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("7T3+\"4");
      boolean boolean0 = codeQualityMetric0.equals(codeQualityMetric0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("TM@raRQJ(=DU");
      Object object0 = new Object();
      boolean boolean0 = codeQualityMetric0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("[");
      codeQualityMetric0.hashCode();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("TM@raRQJ(=DU");
      String string0 = codeQualityMetric0.getStatusMessage();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("");
      String string0 = codeQualityMetric0.getValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("TM@raRQJ(=DU");
      String string0 = codeQualityMetric0.getFormattedValue();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric("TM@raRQJ(=DU");
      String string0 = codeQualityMetric0.getName();
      assertEquals("TM@raRQJ(=DU", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CodeQualityMetric codeQualityMetric0 = new CodeQualityMetric();
      codeQualityMetric0.getStatus();
  }
}
