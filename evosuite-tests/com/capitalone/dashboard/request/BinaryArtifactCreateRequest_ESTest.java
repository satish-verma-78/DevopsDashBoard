/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:02:19 GMT 2020
 */

package com.capitalone.dashboard.request;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.SCM;
import com.capitalone.dashboard.request.BinaryArtifactCreateRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BinaryArtifactCreateRequest_ESTest extends BinaryArtifactCreateRequest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setCanonicalName("Oe(/?M<rJ;");
      assertNull(binaryArtifactCreateRequest0.getArtifactName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setTimestamp((-1007L));
      long long0 = binaryArtifactCreateRequest0.getTimestamp();
      assertEquals((-1007L), long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setMetadata((Map<String, Object>) null);
      Map<String, Object> map0 = binaryArtifactCreateRequest0.getMetadata();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("c.L|'a]$3Jz_X15 ", "c.L|'a]$3Jz_X15 ");
      binaryArtifactCreateRequest0.setMetadata(hashMap0);
      Map<String, Object> map0 = binaryArtifactCreateRequest0.getMetadata();
      assertFalse(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.canonicalName = "aNd";
      String string0 = binaryArtifactCreateRequest0.getCanonicalName();
      assertEquals("aNd", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.canonicalName = "";
      String string0 = binaryArtifactCreateRequest0.getCanonicalName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setBuildId("Z]MS(-");
      String string0 = binaryArtifactCreateRequest0.getBuildId();
      assertEquals("Z]MS(-", string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setBuildId("");
      String string0 = binaryArtifactCreateRequest0.getBuildId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactVersion("3ErHm&0Suxa((");
      String string0 = binaryArtifactCreateRequest0.getArtifactVersion();
      assertEquals("3ErHm&0Suxa((", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactVersion("");
      String string0 = binaryArtifactCreateRequest0.getArtifactVersion();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactName(":%prVHRm");
      String string0 = binaryArtifactCreateRequest0.getArtifactName();
      assertEquals(":%prVHRm", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactModule("!3Gkks7]$EJ");
      String string0 = binaryArtifactCreateRequest0.getArtifactModule();
      assertEquals("!3Gkks7]$EJ", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactGroup("S?KHumJ7h ");
      String string0 = binaryArtifactCreateRequest0.getArtifactGroup();
      assertEquals("S?KHumJ7h ", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactGroup("");
      String string0 = binaryArtifactCreateRequest0.getArtifactGroup();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactExtension("@yE$j_Za");
      String string0 = binaryArtifactCreateRequest0.getArtifactExtension();
      assertEquals("@yE$j_Za", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactExtension("");
      String string0 = binaryArtifactCreateRequest0.getArtifactExtension();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactClassifier("}t&?w:Yqc.Wz");
      String string0 = binaryArtifactCreateRequest0.getArtifactClassifier();
      assertEquals("}t&?w:Yqc.Wz", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactClassifier("");
      String string0 = binaryArtifactCreateRequest0.getArtifactClassifier();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getArtifactModule();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      List<SCM> list0 = binaryArtifactCreateRequest0.getSourceChangeSet();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      long long0 = binaryArtifactCreateRequest0.getTimestamp();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactModule("");
      String string0 = binaryArtifactCreateRequest0.getArtifactModule();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getCanonicalName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setTimestamp(1L);
      long long0 = binaryArtifactCreateRequest0.getTimestamp();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getBuildId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      Map<String, Object> map0 = binaryArtifactCreateRequest0.getMetadata();
      binaryArtifactCreateRequest0.setMetadata(map0);
      assertEquals(0L, binaryArtifactCreateRequest0.getTimestamp());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getArtifactVersion();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getArtifactGroup();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getArtifactClassifier();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getArtifactExtension();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      binaryArtifactCreateRequest0.setArtifactName("");
      String string0 = binaryArtifactCreateRequest0.getArtifactName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      BinaryArtifactCreateRequest binaryArtifactCreateRequest0 = new BinaryArtifactCreateRequest();
      String string0 = binaryArtifactCreateRequest0.getArtifactName();
      assertNull(string0);
  }
}
