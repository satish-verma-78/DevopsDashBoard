/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 13:23:14 GMT 2020
 */

package com.capitalone.dashboard.misc;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.capitalone.dashboard.misc.HygieiaException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class HygieiaException_ESTest extends HygieiaException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      HygieiaException hygieiaException0 = new HygieiaException("a$JN9\"eM", mockThrowable0, 171);
      int int0 = hygieiaException0.getErrorCode();
      assertEquals(171, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      HygieiaException hygieiaException0 = new HygieiaException(mockThrowable0);
      HygieiaException hygieiaException1 = new HygieiaException("K.H gB*bE&#WsY", hygieiaException0, true, true);
      assertEquals((-11), HygieiaException.COLLECTOR_ITEM_CREATE_ERROR);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("1");
      HygieiaException hygieiaException0 = new HygieiaException("1", mockThrowable0, (-999));
      int int0 = hygieiaException0.getErrorCode();
      assertEquals((-999), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      HygieiaException hygieiaException0 = new HygieiaException(mockThrowable0);
      int int0 = hygieiaException0.getErrorCode();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HygieiaException hygieiaException0 = new HygieiaException("y1`{]@Y0F0']t", (-1378));
      HygieiaException hygieiaException1 = null;
      try {
        hygieiaException1 = new HygieiaException("", hygieiaException0, false, false);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("org.evosuite.runtime.mock.java.lang.MockException", e);
      }
  }
}
