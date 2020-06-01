/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:37:10 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.CodeQualityType;
import com.capitalone.dashboard.model.CollectorType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CodeQualityType_ESTest extends CodeQualityType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CodeQualityType codeQualityType0 = CodeQualityType.fromString("SecurityAnalysis");
      assertEquals(CodeQualityType.SecurityAnalysis, codeQualityType0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CodeQualityType[] codeQualityTypeArray0 = CodeQualityType.values();
      assertEquals(2, codeQualityTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CodeQualityType codeQualityType0 = CodeQualityType.valueOf("StaticAnalysis");
      assertEquals(CollectorType.CodeQuality, codeQualityType0.collectorType());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        CodeQualityType.fromString("YMfMn)Uao|$+a");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // YMfMn)Uao|$+a is not a valid CodeQualityType.
         //
         verifyException("com.capitalone.dashboard.model.CodeQualityType", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CodeQualityType codeQualityType0 = CodeQualityType.fromString("StaticAnalysis");
      CollectorType collectorType0 = codeQualityType0.collectorType();
      assertEquals(CollectorType.CodeQuality, collectorType0);
  }
}