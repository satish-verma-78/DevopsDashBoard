/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:01:22 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.ArtifactIdentifier;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArtifactIdentifier_ESTest extends ArtifactIdentifier_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, "Y{", "Y{");
      String string0 = artifactIdentifier0.getVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("", "", "", "", "");
      String string0 = artifactIdentifier0.getVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, "Y{", "Y{");
      String string0 = artifactIdentifier0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("", "", "", "", "");
      String string0 = artifactIdentifier0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("ow9", "", "_GM", "", "");
      String string0 = artifactIdentifier0.getGroup();
      assertEquals("", artifactIdentifier0.getExtension());
      assertEquals("", artifactIdentifier0.getName());
      assertEquals("", artifactIdentifier0.getClassifier());
      assertEquals("_GM", artifactIdentifier0.getVersion());
      assertEquals("ow9", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("", "", "w", (String) null, "");
      String string0 = artifactIdentifier0.getGroup();
      assertEquals("w", artifactIdentifier0.getVersion());
      assertEquals("", string0);
      assertEquals("", artifactIdentifier0.getExtension());
      assertEquals("", artifactIdentifier0.getName());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      String string0 = artifactIdentifier0.getExtension();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("", "", "", "", "");
      String string0 = artifactIdentifier0.getExtension();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, "Y{", "Y{");
      String string0 = artifactIdentifier0.getClassifier();
      assertEquals("Y{", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("YT$E,~ww%", "}W|{:D", "2ah`v,", "", "}W|{:D");
      String string0 = artifactIdentifier0.getClassifier();
      assertEquals("YT$E,~ww%", artifactIdentifier0.getGroup());
      assertEquals("}W|{:D", artifactIdentifier0.getExtension());
      assertEquals("}W|{:D", artifactIdentifier0.getName());
      assertEquals("2ah`v,", artifactIdentifier0.getVersion());
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("", "", "", "", "");
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("", "", "", "", "");
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier((String) null, "3tV8-s<@+lVXM-F[=", "3tV8-s<@+lVXM-F[=", (String) null, (String) null);
      boolean boolean0 = artifactIdentifier1.equals(artifactIdentifier0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier((String) null, "", "", (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("T={_]}", "", "T={_]}", "", "");
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("T={_]}", "", "", "", "");
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertEquals("", artifactIdentifier0.getName());
      assertEquals("", artifactIdentifier0.getExtension());
      assertEquals("T={_]}", artifactIdentifier1.getGroup());
      assertFalse(boolean0);
      assertEquals("", artifactIdentifier0.getClassifier());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("ArtifactIdentifier [group=null, name=null, version=null, classifier=null, extension=null]", (String) null, "6*PBAdw8dh}R#1QS=i", (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertEquals("6*PBAdw8dh}R#1QS=i", artifactIdentifier1.getVersion());
      assertFalse(boolean0);
      assertEquals("ArtifactIdentifier [group=null, name=null, version=null, classifier=null, extension=null]", artifactIdentifier1.getGroup());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("h/!fV,", "h/!fV,", "h/!fV,", "h/!fV,", "Z");
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("h/!fV,", "h/!fV,", "h/!fV,", "h/!fV,", "[");
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertEquals("h/!fV,", artifactIdentifier1.getGroup());
      assertEquals("h/!fV,", artifactIdentifier1.getClassifier());
      assertEquals("h/!fV,", artifactIdentifier1.getVersion());
      assertEquals("h/!fV,", artifactIdentifier1.getName());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("ArtifactIdentifier [group=", "ArtifactIdentifier [group=", "ArtifactIdentifier [group=", (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("ArtifactIdentifier [group=ArtifactIdentifier [group=, name=ArtifactIdentifier [group=, version=ArtifactIdentifier [group=, classifier=null, extension=null]", (String) null, "ArtifactIdentifier [group=ArtifactIdentifier [group=, name=ArtifactIdentifier [group=, version=ArtifactIdentifier [group=, classifier=null, extension=null]", (String) null, "ArtifactIdentifier [group=");
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertFalse(boolean0);
      assertEquals("ArtifactIdentifier [group=", artifactIdentifier1.getExtension());
      assertEquals("ArtifactIdentifier [group=ArtifactIdentifier [group=, name=ArtifactIdentifier [group=, version=ArtifactIdentifier [group=, classifier=null, extension=null]", artifactIdentifier1.getVersion());
      assertEquals("ArtifactIdentifier [group=ArtifactIdentifier [group=, name=ArtifactIdentifier [group=, version=ArtifactIdentifier [group=, classifier=null, extension=null]", artifactIdentifier1.getGroup());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("com.capitalone.dashboard.moden.ArtifactIdentifier", "com.capitalone.dashboard.moden.ArtifactIdentifier", "com.capitalone.dashboard.moden.ArtifactIdentifier", "com.capitalone.dashboard.moden.ArtifactIdentifier", "com.capitalone.dashboard.moden.ArtifactIdentifier");
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("com.capitalone.dashboard.moden.ArtifactIdentifier", "com.capitalone.dashboard.moden.ArtifactIdentifier", "ArtifactIdentifier [group=com.capitalone.dashboard.moden.ArtifactIdentifier, name=com.capitalone.dashboard.moden.ArtifactIdentifier, version=com.capitalone.dashboard.moden.ArtifactIdentifier, classifier=com.capitalone.dashboard.moden.ArtifactIdentifier, extension=com.capitalone.dashboard.moden.ArtifactIdentifier]", "com.capitalone.dashboard.model.ArtifactIdentifier", "P>k+]$Z;L~XI");
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertEquals("com.capitalone.dashboard.moden.ArtifactIdentifier", artifactIdentifier1.getGroup());
      assertFalse(boolean0);
      assertEquals("ArtifactIdentifier [group=com.capitalone.dashboard.moden.ArtifactIdentifier, name=com.capitalone.dashboard.moden.ArtifactIdentifier, version=com.capitalone.dashboard.moden.ArtifactIdentifier, classifier=com.capitalone.dashboard.moden.ArtifactIdentifier, extension=com.capitalone.dashboard.moden.ArtifactIdentifier]", artifactIdentifier1.getVersion());
      assertEquals("P>k+]$Z;L~XI", artifactIdentifier1.getExtension());
      assertEquals("com.capitalone.dashboard.moden.ArtifactIdentifier", artifactIdentifier1.getName());
      assertEquals("com.capitalone.dashboard.model.ArtifactIdentifier", artifactIdentifier1.getClassifier());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("ArtifactIdentjfier [gro3p=", "ArtifactIdentjfier [gro3p=", "ArtifactIdentjfier [gro3p=", (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("ArtifactIdentifier [group=ArtifactIdentjfier [gro3p=, name=ArtifactIdentjfier [gro3p=, version=ArtifactIdentjfier [gro3p=, classifier=null, extension=null]", "ArtifactIdentjfier [gro3p=", "ArtifactIdentifier [group=ArtifactIdentjfier [gro3p=, name=ArtifactIdentjfier [gro3p=, version=ArtifactIdentjfier [gro3p=, classifier=null, extension=null]", "ArtifactIdentifier [group=ArtifactIdentjfier [gro3p=, name=ArtifactIdentjfier [gro3p=, version=ArtifactIdentjfier [gro3p=, classifier=null, extension=null]", (String) null);
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertFalse(boolean0);
      assertEquals("ArtifactIdentifier [group=ArtifactIdentjfier [gro3p=, name=ArtifactIdentjfier [gro3p=, version=ArtifactIdentjfier [gro3p=, classifier=null, extension=null]", artifactIdentifier1.getGroup());
      assertEquals("ArtifactIdentifier [group=ArtifactIdentjfier [gro3p=, name=ArtifactIdentjfier [gro3p=, version=ArtifactIdentjfier [gro3p=, classifier=null, extension=null]", artifactIdentifier1.getVersion());
      assertEquals("ArtifactIdentifier [group=ArtifactIdentjfier [gro3p=, name=ArtifactIdentjfier [gro3p=, version=ArtifactIdentjfier [gro3p=, classifier=null, extension=null]", artifactIdentifier1.getClassifier());
      assertEquals("ArtifactIdentjfier [gro3p=", artifactIdentifier1.getName());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("\"RGc-\"l%^**1s[&}Y", "\"RGc-\"l%^**1s[&}Y", "", "", "");
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier("/IYjjQdk^h62?bdG}", "", "ArtifactIdentifier [group=\"RGc-\"l%^**1s[&}Y, name=\"RGc-\"l%^**1s[&}Y, version=, classifier=, extension=]", "", "");
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertEquals("", artifactIdentifier1.getClassifier());
      assertEquals("", artifactIdentifier0.getExtension());
      assertEquals("\"RGc-\"l%^**1s[&}Y", artifactIdentifier0.getName());
      assertFalse(boolean0);
      assertEquals("", artifactIdentifier1.getExtension());
      assertEquals("", artifactIdentifier0.getClassifier());
      assertEquals("", artifactIdentifier1.getName());
      assertEquals("ArtifactIdentifier [group=\"RGc-\"l%^**1s[&}Y, name=\"RGc-\"l%^**1s[&}Y, version=, classifier=, extension=]", artifactIdentifier1.getVersion());
      assertEquals("/IYjjQdk^h62?bdG}", artifactIdentifier1.getGroup());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals("ArtifactIdentifier [group=null, name=null, version=null, classifier=null, extension=null]");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      ArtifactIdentifier artifactIdentifier1 = new ArtifactIdentifier((String) null, (String) null, ">", (String) null, (String) null);
      boolean boolean0 = artifactIdentifier0.equals(artifactIdentifier1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      artifactIdentifier0.hashCode();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("'", "'", "'", "'", "'");
      artifactIdentifier0.hashCode();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("'", "'", "'", "'", "'");
      String string0 = artifactIdentifier0.toString();
      assertEquals("ArtifactIdentifier [group=', name=', version=', classifier=', extension=']", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("'", "'", "'", "'", "'");
      String string0 = artifactIdentifier0.getName();
      assertEquals("'", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      String string0 = artifactIdentifier0.getClassifier();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier((String) null, (String) null, (String) null, (String) null, (String) null);
      String string0 = artifactIdentifier0.getGroup();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("'", "'", "'", "'", "'");
      String string0 = artifactIdentifier0.getExtension();
      assertEquals("'", string0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ArtifactIdentifier artifactIdentifier0 = new ArtifactIdentifier("'", "'", "'", "'", "'");
      String string0 = artifactIdentifier0.getVersion();
      assertEquals("'", string0);
  }
}