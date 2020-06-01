/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:00:00 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.LibraryPolicyThreatLevel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LibraryPolicyThreatLevel_ESTest extends LibraryPolicyThreatLevel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LibraryPolicyThreatLevel libraryPolicyThreatLevel0 = LibraryPolicyThreatLevel.fromString("Medium");
      assertEquals(LibraryPolicyThreatLevel.Medium, libraryPolicyThreatLevel0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LibraryPolicyThreatLevel[] libraryPolicyThreatLevelArray0 = LibraryPolicyThreatLevel.values();
      assertEquals(6, libraryPolicyThreatLevelArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LibraryPolicyThreatLevel libraryPolicyThreatLevel0 = LibraryPolicyThreatLevel.valueOf("Critical");
      assertEquals(LibraryPolicyThreatLevel.Critical, libraryPolicyThreatLevel0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        LibraryPolicyThreatLevel.fromString("MeCium");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // MeCium is not a valid LibraryPolicyThreatLevel
         //
         verifyException("com.capitalone.dashboard.model.LibraryPolicyThreatLevel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LibraryPolicyThreatLevel libraryPolicyThreatLevel0 = LibraryPolicyThreatLevel.fromString("Critical");
      assertEquals(LibraryPolicyThreatLevel.Critical, libraryPolicyThreatLevel0);
  }
}
