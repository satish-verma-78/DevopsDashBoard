/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:07:05 GMT 2020
 */

package com.capitalone.dashboard.request;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.request.GenericCollectorItemCreateRequest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenericCollectorItemCreateRequest_ESTest extends GenericCollectorItemCreateRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setToolName("~vc~kGV3");
      String string0 = genericCollectorItemCreateRequest0.getToolName();
      assertEquals("~vc~kGV3", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setToolName("");
      String string0 = genericCollectorItemCreateRequest0.getToolName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setSource("Z%}-,ic;NCqrvv$}H");
      String string0 = genericCollectorItemCreateRequest0.getSource();
      assertEquals("Z%}-,ic;NCqrvv$}H", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setSource("");
      String string0 = genericCollectorItemCreateRequest0.getSource();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setRawData("4h<)^q85,drIX'fixG");
      String string0 = genericCollectorItemCreateRequest0.getRawData();
      assertEquals("4h<)^q85,drIX'fixG", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setRawData("");
      String string0 = genericCollectorItemCreateRequest0.getRawData();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setPattern("yO|1a>f:bGFD8<y");
      String string0 = genericCollectorItemCreateRequest0.getPattern();
      assertEquals("yO|1a>f:bGFD8<y", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setBuildId("NQr.JDVo~_I`6=?");
      String string0 = genericCollectorItemCreateRequest0.getBuildId();
      assertEquals("NQr.JDVo~_I`6=?", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setBuildId("");
      String string0 = genericCollectorItemCreateRequest0.getBuildId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      String string0 = genericCollectorItemCreateRequest0.getSource();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      String string0 = genericCollectorItemCreateRequest0.getRelatedCollectorItemId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setRelatedCollectorItemId("");
      String string0 = genericCollectorItemCreateRequest0.getRelatedCollectorItemId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      String string0 = genericCollectorItemCreateRequest0.getRawData();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      genericCollectorItemCreateRequest0.setPattern("");
      String string0 = genericCollectorItemCreateRequest0.getPattern();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      String string0 = genericCollectorItemCreateRequest0.getPattern();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      String string0 = genericCollectorItemCreateRequest0.getToolName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      GenericCollectorItemCreateRequest genericCollectorItemCreateRequest0 = new GenericCollectorItemCreateRequest();
      String string0 = genericCollectorItemCreateRequest0.getBuildId();
      assertNull(string0);
  }
}
