/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 14:04:23 GMT 2020
 */

package com.capitalone.dashboard.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.model.AutoDiscoverCollectorItem;
import com.capitalone.dashboard.model.AutoDiscoveryStatusType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AutoDiscoverCollectorItem_ESTest extends AutoDiscoverCollectorItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AutoDiscoverCollectorItem autoDiscoverCollectorItem0 = new AutoDiscoverCollectorItem();
      AutoDiscoveryStatusType autoDiscoveryStatusType0 = AutoDiscoveryStatusType.USER_REJECTED;
      autoDiscoverCollectorItem0.setAutoDiscoverStatus(autoDiscoveryStatusType0);
      autoDiscoverCollectorItem0.getAutoDiscoverStatus();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AutoDiscoverCollectorItem autoDiscoverCollectorItem0 = new AutoDiscoverCollectorItem();
      autoDiscoverCollectorItem0.getAutoDiscoverStatus();
  }
}