/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:22:07 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.model.RepoBranch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class RepoBranch_ESTest extends RepoBranch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      RepoBranch repoBranch0 = new RepoBranch("", "", repoBranch_RepoType0);
      repoBranch0.setUrl("https://null");
      String string0 = repoBranch0.getUrl();
      assertEquals("https://null", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.SVN;
      RepoBranch repoBranch0 = new RepoBranch("", "'j%Wdobt]!od", repoBranch_RepoType0);
      boolean boolean0 = repoBranch0.equals(repoBranch0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.fromString("Unknown");
      assertEquals(RepoBranch.RepoType.Unknown, repoBranch_RepoType0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.Unknown;
      RepoBranch repoBranch0 = new RepoBranch((String) null, "", repoBranch_RepoType0);
      String string0 = repoBranch0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch((String) null, (String) null, (RepoBranch.RepoType) null);
      repoBranch0.getType();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.SVN;
      RepoBranch repoBranch0 = new RepoBranch("t&.L>>hu#%o!#tA", (String) null, repoBranch_RepoType0);
      String string0 = repoBranch0.getBranch();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.SVN;
      RepoBranch repoBranch0 = new RepoBranch("", "'j%Wdobt]!od", repoBranch_RepoType0);
      String string0 = repoBranch0.getBranch();
      assertEquals("'j%Wdobt]!od", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      RepoBranch repoBranch0 = new RepoBranch("4.ZrXL\"PN", "", repoBranch_RepoType0);
      // Undeclared exception!
      try { 
        repoBranch0.setUrl((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.Unknown;
      RepoBranch repoBranch0 = new RepoBranch((String) null, (String) null, repoBranch_RepoType0);
      RepoBranch.RepoType repoBranch_RepoType1 = RepoBranch.RepoType.GIT;
      repoBranch0.setType(repoBranch_RepoType1);
      // Undeclared exception!
      try { 
        repoBranch0.setBranch((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      RepoBranch repoBranch0 = new RepoBranch("k9dh^%", "k9dh^%", repoBranch_RepoType0);
      // Undeclared exception!
      try { 
        repoBranch0.setBranch("/");
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.Unknown;
      RepoBranch repoBranch0 = new RepoBranch((String) null, "", repoBranch_RepoType0);
      // Undeclared exception!
      try { 
        repoBranch0.hashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.Unknown;
      RepoBranch repoBranch0 = new RepoBranch("/", "/", repoBranch_RepoType0);
      RepoBranch.RepoType repoBranch_RepoType1 = RepoBranch.RepoType.GIT;
      repoBranch0.setType(repoBranch_RepoType1);
      // Undeclared exception!
      try { 
        repoBranch0.hashCode();
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      repoBranch0.setType((RepoBranch.RepoType) null);
      // Undeclared exception!
      try { 
        repoBranch0.getUrl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      repoBranch0.setBranch((String) null);
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      repoBranch0.setType(repoBranch_RepoType0);
      // Undeclared exception!
      try { 
        repoBranch0.getBranch();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.Unknown;
      RepoBranch repoBranch0 = new RepoBranch("", (String) null, repoBranch_RepoType0);
      RepoBranch repoBranch1 = new RepoBranch("", " is not a valid RepoType.", repoBranch_RepoType0);
      // Undeclared exception!
      try { 
        repoBranch0.equals(repoBranch1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      repoBranch0.setType(repoBranch_RepoType0);
      String string0 = repoBranch0.getBranch();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      String string0 = repoBranch0.getBranch();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      String string0 = repoBranch0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      RepoBranch.RepoType repoBranch_RepoType0 = repoBranch0.getType();
      assertEquals(RepoBranch.RepoType.Unknown, repoBranch_RepoType0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      RepoBranch repoBranch0 = new RepoBranch("blpDc(bWb!fzz.git", "blpDc(bWb!fzz.git", repoBranch_RepoType0);
      repoBranch0.setUrl("blpDc(bWb!fzz.git");
      repoBranch0.setBranch("https://nullblpdc(bwb!fzz");
      RepoBranch.RepoType repoBranch_RepoType1 = RepoBranch.RepoType.SVN;
      RepoBranch repoBranch1 = new RepoBranch("https://nullblpdc(bwb!fzz", "blpDc(bWb!fzz.git", repoBranch_RepoType1);
      boolean boolean0 = repoBranch0.equals(repoBranch1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      Object object0 = new Object();
      boolean boolean0 = repoBranch0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.SVN;
      RepoBranch repoBranch0 = new RepoBranch("", "", repoBranch_RepoType0);
      boolean boolean0 = repoBranch0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.fromString((String) null);
      assertEquals(RepoBranch.RepoType.Unknown, repoBranch_RepoType0);
      
      RepoBranch repoBranch0 = new RepoBranch();
      RepoBranch repoBranch1 = new RepoBranch("git@", "*xO;'.oqE!UFkE~8|_I", repoBranch_RepoType0);
      boolean boolean0 = repoBranch0.equals(repoBranch1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.SVN;
      RepoBranch repoBranch0 = new RepoBranch("https://nullblpdc(bwb!fzz", "blpDc(bWb!fzz.git", repoBranch_RepoType0);
      repoBranch0.setBranch("blpDc(bWb!fzz.git");
      assertEquals(RepoBranch.RepoType.SVN, repoBranch0.getType());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.SVN;
      repoBranch0.setType(repoBranch_RepoType0);
      String string0 = repoBranch0.getUrl();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.fromString("SVN");
      assertEquals(RepoBranch.RepoType.SVN, repoBranch_RepoType0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      // Undeclared exception!
      try { 
        RepoBranch.RepoType.fromString("swn");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // swn is not a valid RepoType.
         //
         verifyException("com.capitalone.dashboard.model.RepoBranch$RepoType", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      RepoBranch.RepoType repoBranch_RepoType0 = RepoBranch.RepoType.GIT;
      RepoBranch repoBranch0 = new RepoBranch("git@", "*xO;'.oqE!UFkE~8|_I", repoBranch_RepoType0);
      repoBranch0.hashCode();
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      RepoBranch repoBranch0 = new RepoBranch();
      RepoBranch repoBranch1 = new RepoBranch();
      boolean boolean0 = repoBranch0.equals(repoBranch1);
      assertTrue(boolean0);
  }
}