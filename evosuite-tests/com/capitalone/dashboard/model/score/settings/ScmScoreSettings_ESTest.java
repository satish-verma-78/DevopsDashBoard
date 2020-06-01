/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:09:15 GMT 2020
 */

package com.capitalone.dashboard.model.score.settings;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.score.settings.ScmScoreSettings;
import com.capitalone.dashboard.model.score.settings.ScoreComponentSettings;
import com.capitalone.dashboard.model.score.settings.ScoreCriteria;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScmScoreSettings_ESTest extends ScmScoreSettings_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      assertEquals(14, scmScoreSettings0.getNumberOfDays());
      
      scmScoreSettings0.setWeight(4055);
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings0.setWeight((-16));
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings2);
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings3.setNumberOfDays((-16));
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings0);
      scmScoreSettings0.toString();
      scmScoreSettings1.toString();
      scmScoreSettings0.getDaysWithCommits();
      scmScoreSettings0.toString();
      scmScoreSettings0.toString();
      scmScoreSettings0.setNumberOfDays(2563);
      assertEquals(2563, scmScoreSettings0.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      assertNotSame(scmScoreSettings1, scmScoreSettings0);
      assertEquals(14, scmScoreSettings1.getNumberOfDays());
      assertEquals(14, scmScoreSettings0.getNumberOfDays());
      
      scmScoreSettings0.setDisabled(false);
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings3.toString();
      scmScoreSettings1.setNumberOfDays(14);
      scmScoreSettings3.setDaysWithCommits(scmScoreSettings1);
      ScmScoreSettings.cloneScmScoreSettings((ScmScoreSettings) null);
      scmScoreSettings3.setDisabled(false);
      scmScoreSettings1.setNumberOfDays(14);
      ScmScoreSettings scmScoreSettings4 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings5 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings5.setNumberOfDays(14);
      scmScoreSettings5.toString();
      String string0 = scmScoreSettings0.toString();
      assertEquals("ScmScoreSettings{commitsPerDay=null, numberOfDays=14, disabled=false, weight=0, criteria=null}", string0);
      
      scmScoreSettings1.setCriteria((ScoreCriteria) null);
      ScmScoreSettings scmScoreSettings6 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      ScmScoreSettings scmScoreSettings7 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings7.setDaysWithCommits(scmScoreSettings6);
      scmScoreSettings5.getDaysWithCommits();
      scmScoreSettings0.setDisabled(true);
      scmScoreSettings4.setNumberOfDays(14);
      scmScoreSettings2.setDaysWithCommits(scmScoreSettings0);
      ScoreComponentSettings.copyScoreComponentSettings((ScoreComponentSettings) null, scmScoreSettings1);
      scmScoreSettings0.setNumberOfDays(14);
      scmScoreSettings3.getDaysWithCommits();
      ScmScoreSettings scmScoreSettings8 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings3);
      scmScoreSettings8.setDaysWithCommits((ScoreComponentSettings) null);
      scmScoreSettings7.getNumberOfDays();
      scmScoreSettings3.setNumberOfDays(0);
      scmScoreSettings3.setNumberOfDays(0);
      assertEquals(0, scmScoreSettings3.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings2 = new ScmScoreSettings();
      scmScoreSettings2.setNumberOfDays(125);
      scmScoreSettings0.setWeight(907);
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings2);
      ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings3);
      scmScoreSettings1.getDaysWithCommits();
      ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings3);
      scmScoreSettings1.setNumberOfDays(14);
      scmScoreSettings2.setWeight((-2844));
      ScoreCriteria scoreCriteria0 = new ScoreCriteria();
      scmScoreSettings2.toString();
      scmScoreSettings0.setCriteria(scoreCriteria0);
      scmScoreSettings1.toString();
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings2);
      scmScoreSettings2.getDaysWithCommits();
      scmScoreSettings0.getDaysWithCommits();
      scmScoreSettings2.getDaysWithCommits();
      scmScoreSettings2.toString();
      ScmScoreSettings scmScoreSettings4 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings4.setNumberOfDays(14);
      // Undeclared exception!
      try { 
        ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("com.capitalone.dashboard.model.score.settings.ScoreCriteria", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      scmScoreSettings0.setWeight(1713);
      scmScoreSettings0.setDisabled(false);
      scmScoreSettings0.toString();
      scmScoreSettings0.setDisabled(false);
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings0.setDisabled(false);
      scmScoreSettings1.setNumberOfDays((-60));
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings1);
      ScoreComponentSettings.copyScoreComponentSettings(scmScoreSettings0, scmScoreSettings0);
      scmScoreSettings0.setDisabled(false);
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings0.setNumberOfDays(14);
      ScoreComponentSettings scoreComponentSettings0 = scmScoreSettings0.getDaysWithCommits();
      scoreComponentSettings0.toString();
      scmScoreSettings0.setDisabled(false);
      ScmScoreSettings scmScoreSettings4 = new ScmScoreSettings();
      ScoreComponentSettings.copyScoreComponentSettings(scoreComponentSettings0, scmScoreSettings2);
      ScmScoreSettings scmScoreSettings5 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings4);
      scmScoreSettings0.setNumberOfDays(0);
      ScoreComponentSettings.copyScoreComponentSettings(scmScoreSettings1, scoreComponentSettings0);
      scmScoreSettings0.setDaysWithCommits(scoreComponentSettings0);
      ScoreComponentSettings scoreComponentSettings1 = scmScoreSettings3.getDaysWithCommits();
      ScmScoreSettings scmScoreSettings6 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings5.toString();
      scmScoreSettings2.setDaysWithCommits(scoreComponentSettings1);
      scmScoreSettings6.setDaysWithCommits(scmScoreSettings3);
      int int0 = scmScoreSettings1.getNumberOfDays();
      assertEquals((-60), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScoreComponentSettings.copyScoreComponentSettings(scmScoreSettings0, scmScoreSettings0);
      scmScoreSettings0.setNumberOfDays((-1347));
      scmScoreSettings0.getNumberOfDays();
      scmScoreSettings0.getNumberOfDays();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings1.getNumberOfDays();
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings0);
      scmScoreSettings1.setNumberOfDays(2902);
      scmScoreSettings1.setDisabled(false);
      ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings1);
      scmScoreSettings1.setNumberOfDays((-1347));
      scmScoreSettings1.getDaysWithCommits();
      ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      assertEquals((-1347), scmScoreSettings0.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScoreComponentSettings scoreComponentSettings0 = new ScoreComponentSettings();
      scoreComponentSettings0.toString();
      scoreComponentSettings0.setWeight(14);
      scmScoreSettings0.setDisabled(true);
      scmScoreSettings0.setDaysWithCommits(scoreComponentSettings0);
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings1);
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      ScoreComponentSettings.copyScoreComponentSettings(scmScoreSettings0, scmScoreSettings2);
      scmScoreSettings2.setNumberOfDays(1032);
      scmScoreSettings2.getNumberOfDays();
      scmScoreSettings2.getNumberOfDays();
      scmScoreSettings0.getDaysWithCommits();
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings2);
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings2);
      ScmScoreSettings scmScoreSettings4 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings1.toString();
      scmScoreSettings4.setNumberOfDays(1032);
      scmScoreSettings1.getDaysWithCommits();
      scmScoreSettings3.setCriteria((ScoreCriteria) null);
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings3);
      ScmScoreSettings scmScoreSettings5 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings3);
      scmScoreSettings5.setDaysWithCommits(scoreComponentSettings0);
      ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings3);
      scmScoreSettings1.getNumberOfDays();
      scmScoreSettings0.toString();
      scmScoreSettings4.getDaysWithCommits();
      assertEquals(1032, scmScoreSettings4.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScoreCriteria scoreCriteria0 = new ScoreCriteria();
      scmScoreSettings0.setCriteria(scoreCriteria0);
      // Undeclared exception!
      try { 
        ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/collections/CollectionUtils
         //
         verifyException("com.capitalone.dashboard.model.score.settings.ScoreCriteria", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
      scmScoreSettings0.toString();
      String string0 = scmScoreSettings0.toString();
      assertEquals("ScmScoreSettings{commitsPerDay=null, numberOfDays=14, disabled=false, weight=0, criteria=null}", string0);
      
      scmScoreSettings0.setNumberOfDays(0);
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      int int0 = scmScoreSettings1.getNumberOfDays();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      scmScoreSettings0.setWeight(5);
      scmScoreSettings0.getNumberOfDays();
      ScoreComponentSettings.copyScoreComponentSettings(scmScoreSettings0, scmScoreSettings0);
      scmScoreSettings0.toString();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings1.setWeight(0);
      scmScoreSettings1.setNumberOfDays(2180);
      ScoreComponentSettings.copyScoreComponentSettings(scmScoreSettings0, scmScoreSettings0);
      scmScoreSettings0.setDisabled(true);
      scmScoreSettings1.setWeight(14);
      scmScoreSettings1.setNumberOfDays(14);
      scmScoreSettings0.setWeight(0);
      scmScoreSettings0.toString();
      scmScoreSettings0.toString();
      scmScoreSettings0.toString();
      ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
      ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
      scmScoreSettings1.toString();
      scmScoreSettings1.setNumberOfDays(0);
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings0);
      ScoreComponentSettings scoreComponentSettings0 = ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
      scmScoreSettings1.setDaysWithCommits(scoreComponentSettings0);
      scmScoreSettings1.getDaysWithCommits();
      assertEquals(0, scmScoreSettings1.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings1 = new ScmScoreSettings();
      ScoreComponentSettings scoreComponentSettings0 = ScoreComponentSettings.cloneScoreComponentSettings(scmScoreSettings0);
      scmScoreSettings1.setNumberOfDays(14);
      scmScoreSettings1.setWeight(14);
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings1);
      scmScoreSettings1.setDaysWithCommits(scoreComponentSettings0);
      scmScoreSettings1.getNumberOfDays();
      scmScoreSettings0.setNumberOfDays(14);
      ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings0.getNumberOfDays();
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      ScoreCriteria scoreCriteria0 = new ScoreCriteria();
      scmScoreSettings2.setCriteria(scoreCriteria0);
      assertEquals(14, scmScoreSettings2.getWeight());
      
      scmScoreSettings0.setNumberOfDays(14);
      assertEquals(14, scmScoreSettings0.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      scmScoreSettings0.setWeight(1);
      scmScoreSettings0.getDaysWithCommits();
      assertEquals(14, scmScoreSettings0.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      int int0 = scmScoreSettings1.getNumberOfDays();
      assertEquals(14, int0);
      assertEquals(14, scmScoreSettings0.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings2 = (ScmScoreSettings)scmScoreSettings1.getDaysWithCommits();
      assertNotSame(scmScoreSettings2, scmScoreSettings1);
      
      String string0 = scmScoreSettings0.toString();
      assertEquals("ScmScoreSettings{commitsPerDay=null, numberOfDays=14, disabled=false, weight=0, criteria=null}", string0);
      
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings2);
      assertEquals(14, scmScoreSettings2.getNumberOfDays());
      assertEquals(14, scmScoreSettings1.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      String string0 = scmScoreSettings1.toString();
      assertNotSame(scmScoreSettings1, scmScoreSettings0);
      assertEquals("ScmScoreSettings{commitsPerDay=null, numberOfDays=14, disabled=false, weight=0, criteria=null}", string0);
      
      scmScoreSettings0.setDaysWithCommits(scmScoreSettings1);
      scmScoreSettings0.getNumberOfDays();
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings2.setWeight(14);
      scmScoreSettings2.setDisabled(true);
      scmScoreSettings2.getNumberOfDays();
      scmScoreSettings0.toString();
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings2);
      scmScoreSettings2.setDaysWithCommits(scmScoreSettings1);
      ScmScoreSettings.cloneScmScoreSettings((ScmScoreSettings) null);
      scmScoreSettings2.getNumberOfDays();
      scmScoreSettings1.setDisabled(true);
      ScmScoreSettings.cloneScmScoreSettings((ScmScoreSettings) null);
      scmScoreSettings1.setNumberOfDays(14);
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings((ScmScoreSettings) null);
      assertNull(scmScoreSettings3);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      int int0 = scmScoreSettings0.getNumberOfDays();
      assertEquals(14, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      assertEquals(14, scmScoreSettings0.getNumberOfDays());
      
      scmScoreSettings0.setNumberOfDays(1);
      scmScoreSettings0.toString();
      assertEquals(1, scmScoreSettings0.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      scmScoreSettings0.setNumberOfDays(0);
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings1.getDaysWithCommits();
      ScmScoreSettings scmScoreSettings2 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings2);
      scmScoreSettings1.setDaysWithCommits(scmScoreSettings3);
      assertEquals(0, scmScoreSettings0.getNumberOfDays());
      assertEquals(14, scmScoreSettings3.getNumberOfDays());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      ScmScoreSettings scmScoreSettings1 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      scmScoreSettings0.setDisabled(false);
      ScmScoreSettings scmScoreSettings2 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      assertNotNull(scmScoreSettings2);
      
      ScmScoreSettings scmScoreSettings3 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings3.toString();
      scmScoreSettings1.setNumberOfDays(14);
      scmScoreSettings3.setDaysWithCommits(scmScoreSettings1);
      ScmScoreSettings.cloneScmScoreSettings((ScmScoreSettings) null);
      scmScoreSettings3.setDisabled(false);
      scmScoreSettings1.setNumberOfDays(14);
      ScmScoreSettings scmScoreSettings4 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings0);
      ScmScoreSettings scmScoreSettings5 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings5.setNumberOfDays(14);
      scmScoreSettings5.toString();
      scmScoreSettings1.toString();
      scmScoreSettings1.setCriteria((ScoreCriteria) null);
      ScmScoreSettings scmScoreSettings6 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      ScmScoreSettings scmScoreSettings7 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings1);
      scmScoreSettings7.setDaysWithCommits(scmScoreSettings6);
      scmScoreSettings5.getDaysWithCommits();
      scmScoreSettings0.setDisabled(true);
      scmScoreSettings4.setNumberOfDays(14);
      scmScoreSettings2.setDaysWithCommits(scmScoreSettings0);
      ScoreComponentSettings.copyScoreComponentSettings((ScoreComponentSettings) null, scmScoreSettings1);
      scmScoreSettings0.setNumberOfDays(14);
      scmScoreSettings3.getDaysWithCommits();
      ScmScoreSettings scmScoreSettings8 = ScmScoreSettings.cloneScmScoreSettings(scmScoreSettings3);
      scmScoreSettings8.setDaysWithCommits((ScoreComponentSettings) null);
      scmScoreSettings7.getNumberOfDays();
      scmScoreSettings3.setNumberOfDays(0);
      scmScoreSettings3.setNumberOfDays(0);
      assertEquals(0, scmScoreSettings3.getNumberOfDays());
      
      String string0 = scmScoreSettings2.toString();
      assertEquals("ScmScoreSettings{commitsPerDay=ScmScoreSettings{commitsPerDay=null, numberOfDays=14, disabled=true, weight=0, criteria=null}, numberOfDays=14, disabled=false, weight=0, criteria=null}", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ScmScoreSettings scmScoreSettings0 = new ScmScoreSettings();
      String string0 = scmScoreSettings0.toString();
      assertEquals("ScmScoreSettings{commitsPerDay=null, numberOfDays=14, disabled=false, weight=0, criteria=null}", string0);
  }
}