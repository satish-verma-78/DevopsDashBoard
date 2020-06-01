/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 09:50:50 GMT 2020
 */

package com.capitalone.dashboard.util;

import static org.junit.Assert.fail;

import org.junit.Test;

import com.capitalone.dashboard.model.Feature;

public class SuperFeatureComparator_ESTest {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SuperFeatureComparator superFeatureComparator0 = new SuperFeatureComparator();
      Feature feature0 = new Feature();
      // Undeclared exception!
      try { 
        superFeatureComparator0.compare(feature0, (Feature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }


}