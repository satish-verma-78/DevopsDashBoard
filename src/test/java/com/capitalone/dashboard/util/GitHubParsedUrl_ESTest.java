/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 09:46:48 GMT 2020
 */

package com.capitalone.dashboard.util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.fail;

import org.junit.Test;

public class GitHubParsedUrl_ESTest{

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("");
      gitHubParsedUrl0.setUrl((String) null);
      String string0 = gitHubParsedUrl0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("l>%e;8rN");
      String string0 = gitHubParsedUrl0.getUrl();
      assertEquals("l>%e;8rN", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("");
      gitHubParsedUrl0.setRepoName("");
      String string0 = gitHubParsedUrl0.getRepoName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("");
      gitHubParsedUrl0.setOrgName("");
      String string0 = gitHubParsedUrl0.getOrgName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("zD~t[");
      gitHubParsedUrl0.setHost("zD~t[");
      String string0 = gitHubParsedUrl0.getHost();
      assertEquals("zD~t[", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("s");
      gitHubParsedUrl0.setHost("");
      String string0 = gitHubParsedUrl0.getHost();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("YK`Iq<JToK&-g~9S1b");
      gitHubParsedUrl0.setApiUrl("YK`Iq<JToK&-g~9S1b");
      String string0 = gitHubParsedUrl0.getApiUrl();
      assertEquals("YK`Iq<JToK&-g~9S1b", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("l>%e;8rN");
      gitHubParsedUrl0.setApiUrl("");
      String string0 = gitHubParsedUrl0.getApiUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = null;
      try {
        gitHubParsedUrl0 = new GitHubParsedUrl((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl(".git");
      gitHubParsedUrl0.setRepoName(".git");
      gitHubParsedUrl0.getRepoName();
      assertEquals("", gitHubParsedUrl0.getUrl());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl(".git");
      gitHubParsedUrl0.getApiUrl();
      assertEquals("", gitHubParsedUrl0.getUrl());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl("{dl?.gjt");
      String string0 = gitHubParsedUrl0.getHost();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl(".git");
      gitHubParsedUrl0.getOrgName();
      assertEquals("", gitHubParsedUrl0.getUrl());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl(".git");
      gitHubParsedUrl0.setOrgName(".git");
      gitHubParsedUrl0.getOrgName();
      assertEquals("", gitHubParsedUrl0.getUrl());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl(".git");
      gitHubParsedUrl0.getRepoName();
      assertEquals("", gitHubParsedUrl0.getUrl());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      GitHubParsedUrl gitHubParsedUrl0 = new GitHubParsedUrl(".git");
      String string0 = gitHubParsedUrl0.getUrl();
      assertEquals("", string0);
  }
}
