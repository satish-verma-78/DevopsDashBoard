/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:06:13 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.FeatureIssueLink;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FeatureIssueLink_ESTest extends FeatureIssueLink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setTargetIssueUri("s");
      String string0 = featureIssueLink0.getTargetIssueUri();
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setTargetIssueUri("");
      String string0 = featureIssueLink0.getTargetIssueUri();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setTargetIssueKey("");
      String string0 = featureIssueLink0.getTargetIssueKey();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setIssueLinkType("s");
      String string0 = featureIssueLink0.getIssueLinkType();
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setIssueLinkName("com.capitalone.dashboard.model.FeatureIssueLink");
      String string0 = featureIssueLink0.getIssueLinkName();
      assertEquals("com.capitalone.dashboard.model.FeatureIssueLink", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setIssueLinkName("");
      String string0 = featureIssueLink0.getIssueLinkName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setIssueLinkDirection("");
      String string0 = featureIssueLink0.getIssueLinkDirection();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      String string0 = featureIssueLink0.getIssueLinkDirection();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setTargetIssueKey("s");
      String string0 = featureIssueLink0.getTargetIssueKey();
      assertEquals("s", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setIssueLinkType("");
      String string0 = featureIssueLink0.getIssueLinkType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      String string0 = featureIssueLink0.getIssueLinkType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      String string0 = featureIssueLink0.getIssueLinkName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      featureIssueLink0.setIssueLinkDirection("BkLB[:-qj");
      String string0 = featureIssueLink0.getIssueLinkDirection();
      assertEquals("BkLB[:-qj", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      String string0 = featureIssueLink0.getTargetIssueUri();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FeatureIssueLink featureIssueLink0 = new FeatureIssueLink();
      String string0 = featureIssueLink0.getTargetIssueKey();
      assertNull(string0);
  }
}
