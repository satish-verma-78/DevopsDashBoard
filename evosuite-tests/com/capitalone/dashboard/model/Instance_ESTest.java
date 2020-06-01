/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:28:58 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.Instance;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Instance_ESTest extends Instance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setUpdated(2539L);
      long long0 = instance0.getUpdated();
      assertEquals(2539L, long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setUpdated((-1L));
      long long0 = instance0.getUpdated();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setStatus("tg%%Rq41$y\"wI@$btV");
      String string0 = instance0.getStatus();
      assertEquals("tg%%Rq41$y\"wI@$btV", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setStatus("");
      String string0 = instance0.getStatus();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setSeverity("");
      String string0 = instance0.getSeverity();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setPath("[PZX9m0Z78U");
      String string0 = instance0.getPath();
      assertEquals("[PZX9m0Z78U", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setPath("");
      String string0 = instance0.getPath();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setName("");
      String string0 = instance0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setDisposition("com.capitalone.dashboard.model.Instance");
      String string0 = instance0.getDisposition();
      assertEquals("com.capitalone.dashboard.model.Instance", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setAge("");
      String string0 = instance0.getAge();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Instance instance0 = new Instance();
      long long0 = instance0.getUpdated();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setAge("wb~k&");
      String string0 = instance0.getAge();
      assertEquals("wb~k&", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setDisposition("");
      String string0 = instance0.getDisposition();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Instance instance0 = new Instance();
      String string0 = instance0.getDisposition();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Instance instance0 = new Instance();
      String string0 = instance0.getStatus();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setName("] ");
      String string0 = instance0.getName();
      assertEquals("] ", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Instance instance0 = new Instance();
      instance0.setSeverity("Kh]rtA9d_z.,'");
      String string0 = instance0.getSeverity();
      assertEquals("Kh]rtA9d_z.,'", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Instance instance0 = new Instance();
      String string0 = instance0.getAge();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Instance instance0 = new Instance();
      String string0 = instance0.getPath();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Instance instance0 = new Instance();
      String string0 = instance0.getSeverity();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Instance instance0 = new Instance();
      String string0 = instance0.getName();
      assertNull(string0);
  }
}