/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 09:42:54 GMT 2020
 */

package com.capitalone.dashboard.client;

import org.junit.Test;
import static org.junit.Assert.*;
import com.capitalone.dashboard.client.RestUserInfo;
import org.junit.runner.RunWith;

public class RestUserInfo_ESTest  {

  @Test
  public void test00()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo((String) null, "", "zGSSK");
      String string0 = restUserInfo0.getUserId();
      assertNull(string0);
      assertEquals("", restUserInfo0.getPassCode());
      assertEquals("zGSSK", restUserInfo0.getToken());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("", "", "");
      String string0 = restUserInfo0.getUserId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("=$B(gA$cUDB!YL ZF&", "=$B(gA$cUDB!YL ZF&");
      restUserInfo0.setToken("");
      String string0 = restUserInfo0.getToken();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("", "com.capitalone.dashboard.client.RestUserInfo");
      assertEquals("com.capitalone.dashboard.client.RestUserInfo", restUserInfo0.getPassCode());
      
      restUserInfo0.setPassCode((String) null);
      restUserInfo0.getPassCode();
      assertEquals("", restUserInfo0.getUserId());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("", "", "");
      String string0 = restUserInfo0.getPassCode();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("", "com.capitalone.dashboard.client.RestUserInfo");
      restUserInfo0.setPassCode((String) null);
      // Undeclared exception!
      try { 
        restUserInfo0.getFormattedString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.capitalone.dashboard.client.RestUserInfo", e);
      }
  }

  private void verifyException(String string, NullPointerException e) {
	// TODO Auto-generated method stub
	
}

@Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("V5gp^bE", "V5gp^bE");
      restUserInfo0.setUserId("V5gp^bE");
      assertEquals("V5gp^bE", restUserInfo0.getUserId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("V5gp^bE", "V5gp^bE");
      restUserInfo0.setToken("V5gp^bE");
      String string0 = restUserInfo0.getToken();
      assertEquals("V5gp^bE", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("V5gp^bE", "V5gp^bE");
      String string0 = restUserInfo0.getUserId();
      assertEquals("V5gp^bE", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("", "com.capitalone.dashboard.client.RestUserInfo");
      String string0 = restUserInfo0.getFormattedString();
      assertEquals(":com.capitalone.dashboard.client.RestUserInfo", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("V5gp^bE", "V5gp^bE");
      String string0 = restUserInfo0.getPassCode();
      assertEquals("V5gp^bE", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RestUserInfo restUserInfo0 = new RestUserInfo("V5gp^bE", "V5gp^bE");
      String string0 = restUserInfo0.getToken();
      assertNull(string0);
  }
}
