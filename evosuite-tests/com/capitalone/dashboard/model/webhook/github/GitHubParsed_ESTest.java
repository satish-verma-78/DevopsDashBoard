/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:19:05 GMT 2020
 */

package com.capitalone.dashboard.model.webhook.github;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.webhook.github.GitHubParsed;
import java.net.MalformedURLException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GitHubParsed_ESTest extends GitHubParsed_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GitHubParsed gitHubParsed0 = null;
      try {
        gitHubParsed0 = new GitHubParsed((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GitHubParsed gitHubParsed0 = null;
      try {
        gitHubParsed0 = new GitHubParsed("@jtD/.git");
        fail("Expecting exception: MalformedURLException");
      
      } catch(Throwable e) {
         //
         // no protocol: @jtD/
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GitHubParsed gitHubParsed0 = null;
      try {
        gitHubParsed0 = new GitHubParsed("");
        fail("Expecting exception: MalformedURLException");
      
      } catch(Throwable e) {
         //
         // no protocol: 
         //
         verifyException("java.net.URL", e);
      }
  }
}
