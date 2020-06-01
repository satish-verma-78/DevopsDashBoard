/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:30:37 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.RallyStoryStages;
import com.capitalone.dashboard.model.UserStory;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RallyStoryStages_ESTest extends RallyStoryStages_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      LinkedList<UserStory> linkedList0 = new LinkedList<UserStory>();
      rallyStoryStages0.setUserStories(linkedList0);
      List<UserStory> list0 = rallyStoryStages0.getUserStories();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      LinkedList<UserStory> linkedList0 = new LinkedList<UserStory>();
      UserStory userStory0 = new UserStory();
      linkedList0.add(userStory0);
      rallyStoryStages0.setUserStories(linkedList0);
      List<UserStory> list0 = rallyStoryStages0.getUserStories();
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setInProgress("7GeI/3utB~&");
      String string0 = rallyStoryStages0.getInProgress();
      assertEquals("7GeI/3utB~&", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setInProgress("");
      String string0 = rallyStoryStages0.getInProgress();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setDefined("w'");
      String string0 = rallyStoryStages0.getDefined();
      assertEquals("w'", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setDefects("com.capitalone.dashboard.model.RallyStoryStages");
      String string0 = rallyStoryStages0.getDefects();
      assertEquals("com.capitalone.dashboard.model.RallyStoryStages", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setCompleted("afq1N?|7Hubyo;;");
      String string0 = rallyStoryStages0.getCompleted();
      assertEquals("afq1N?|7Hubyo;;", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setCompleted("");
      String string0 = rallyStoryStages0.getCompleted();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setBacklog("m`{~BBJxZ");
      String string0 = rallyStoryStages0.getBacklog();
      assertEquals("m`{~BBJxZ", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setAccepted("G5AF Vt-");
      String string0 = rallyStoryStages0.getAccepted();
      assertEquals("G5AF Vt-", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setAccepted("");
      String string0 = rallyStoryStages0.getAccepted();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setDefects("");
      String string0 = rallyStoryStages0.getDefects();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      List<UserStory> list0 = rallyStoryStages0.getUserStories();
      assertNull(list0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setDefined("");
      String string0 = rallyStoryStages0.getDefined();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      rallyStoryStages0.setBacklog("");
      String string0 = rallyStoryStages0.getBacklog();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      String string0 = rallyStoryStages0.getDefects();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      String string0 = rallyStoryStages0.getInProgress();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      String string0 = rallyStoryStages0.getDefined();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      String string0 = rallyStoryStages0.getBacklog();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      String string0 = rallyStoryStages0.getAccepted();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RallyStoryStages rallyStoryStages0 = new RallyStoryStages();
      String string0 = rallyStoryStages0.getCompleted();
      assertNull(string0);
  }
}
