/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 09:52:04 GMT 2020
 */

package com.capitalone.dashboard.util;

import static org.junit.Assert.fail;

import javax.crypto.SecretKey;

import org.junit.Test;

public class Encryption_ESTest  {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        Encryption.decryptString("", "]N,7~)80N&;1");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  private void verifyException(String string, NoClassDefFoundError e) {
	// TODO Auto-generated method stub
	
}

@Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        Encryption.encryptString("L\"5l-Er)c", "");
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SecretKey secretKey0 = Encryption.getSecretKey();
      // Undeclared exception!
      try { 
        Encryption.encryptString("", secretKey0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SecretKey secretKey0 = Encryption.getSecretKey();
      // Undeclared exception!
      try { 
        Encryption.decryptString("i3;", secretKey0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        Encryption.getStringKey();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      String[] stringArray0 = new String[10];
      // Undeclared exception!
      try { 
        Encryption.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/apache/commons/codec/binary/Base64
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SecretKey secretKey0 = Encryption.getSecretKey();
      try { 
        Encryption.encryptString((String) null, secretKey0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot encrypt this message
         // null
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      try { 
        Encryption.decryptString("", (SecretKey) null);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Cannot decrypt this message
         // No installed provider supports this key: (null)
         //
         verifyException("com.capitalone.dashboard.util.Encryption", e);
      }
  }

private void verifyException(String string, Exception e) {
	// TODO Auto-generated method stub
	
}
}