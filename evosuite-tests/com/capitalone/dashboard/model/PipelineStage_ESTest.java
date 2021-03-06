/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:35:42 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.PipelineStage;
import com.capitalone.dashboard.model.PipelineStageType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PipelineStage_ESTest extends PipelineStage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("");
      String string0 = pipelineStage0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("qNm/Do66[m\"px!-Y;");
      PipelineStage pipelineStage1 = PipelineStage.valueOf("qNm/Do66[m\"px!-Y;");
      boolean boolean0 = pipelineStage0.equals(pipelineStage1);
      assertEquals("qNm/Do66[m\"px!-Y;", pipelineStage1.getName());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("%Sm}arPLjVD%{w");
      boolean boolean0 = pipelineStage0.equals("c_nT>OA$");
      assertFalse(boolean0);
      assertEquals("%Sm}arPLjVD%{w", pipelineStage0.getName());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.COMMIT;
      boolean boolean0 = pipelineStage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("qNm/Do66[m\"px!-Y;");
      boolean boolean0 = pipelineStage0.equals(pipelineStage0);
      assertTrue(boolean0);
      assertEquals(PipelineStageType.DEPLOY, pipelineStage0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.BUILD;
      PipelineStage pipelineStage1 = PipelineStage.valueOf("bxild");
      boolean boolean0 = pipelineStage1.equals(pipelineStage0);
      assertFalse(boolean0);
      assertEquals("bxild", pipelineStage1.getName());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.BUILD;
      pipelineStage0.hashCode();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("BUILD");
      assertEquals(PipelineStageType.BUILD, pipelineStage0.getType());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("commit");
      assertEquals(PipelineStageType.COMMIT, pipelineStage0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        PipelineStage.valueOf((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.PipelineStage", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.BUILD;
      String string0 = pipelineStage0.getName();
      assertEquals("Build", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.valueOf("%Sm}arPLjVD%{w");
      PipelineStageType pipelineStageType0 = pipelineStage0.getType();
      assertEquals(PipelineStageType.DEPLOY, pipelineStageType0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      PipelineStage pipelineStage0 = PipelineStage.BUILD;
      String string0 = pipelineStage0.toString();
      assertEquals("PipelineStage [name=Build, type=BUILD]", string0);
  }
}
