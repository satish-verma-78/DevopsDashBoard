/*
 * This file was automatically generated by EvoSuite
 * Mon Jun 01 09:56:27 GMT 2020
 */

package com.capitalone.dashboard.status;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.capitalone.dashboard.model.quality.ArtifactType;

public class ArtifactAuditStatus_ESTest {

	@Test
	public void test1() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_DOCK_IMG_FOUND;
		assertEquals(ArtifactAuditStatus.valueOf("ART_DOCK_IMG_FOUND"), type);  
	}
	@Test
	public void test2() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_SYS_ACCT_BUILD_AUTO;
		assertEquals(ArtifactAuditStatus.valueOf("ART_SYS_ACCT_BUILD_AUTO"), type);  
	}
	@Test
	public void test3() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_SYS_ACCT_BUILD_USER;
		assertEquals(ArtifactAuditStatus.valueOf("ART_SYS_ACCT_BUILD_USER"), type);  
	}
	@Test
	public void test4() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_DOCK_IMG_FOUND;
		assertEquals(ArtifactAuditStatus.valueOf("ART_DOCK_IMG_FOUND"), type);  
	}
	@Test
	public void test5() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_SYS_ACCT_BUILD_THIRD_PARTY;
		assertEquals(ArtifactAuditStatus.valueOf("ART_SYS_ACCT_BUILD_THIRD_PARTY"), type);  
	}
	@Test
	public void test6() {
		ArtifactAuditStatus type=ArtifactAuditStatus.COLLECTOR_ITEM_ERROR;
		assertEquals(ArtifactAuditStatus.valueOf("COLLECTOR_ITEM_ERROR"), type);  
	}
	@Test
	public void test7() {
		ArtifactAuditStatus type=ArtifactAuditStatus.NO_ACTIVITY;
		assertEquals(ArtifactAuditStatus.valueOf("NO_ACTIVITY"), type);  
	}
	@Test
	public void test8() {
		ArtifactAuditStatus type=ArtifactAuditStatus.UNAVAILABLE;
		assertEquals(ArtifactAuditStatus.valueOf("UNAVAILABLE"), type);  
	}
	@Test
	public void test9() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_PROD_DEPLOY_OK;
		assertEquals(ArtifactAuditStatus.valueOf("ART_PROD_DEPLOY_OK"), type);  
	}
	@Test
	public void test10() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_PROD_DEPLOY_FAIL;
		assertEquals(ArtifactAuditStatus.valueOf("ART_PROD_DEPLOY_FAIL"), type);  
	}
	@Test
	public void test11() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_TEST_FOUND;
		assertEquals(ArtifactAuditStatus.valueOf("ART_TEST_FOUND"), type);  
	}
	@Test
	public void test12() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ART_TEST_NOT_FOUND;
		assertEquals(ArtifactAuditStatus.valueOf("ART_TEST_NOT_FOUND"), type);  
	}
	@Test
	public void test13() {
		ArtifactAuditStatus type=ArtifactAuditStatus.ARTIFACT_NOT_CONFIGURED;
		assertEquals(ArtifactAuditStatus.valueOf("ARTIFACT_NOT_CONFIGURED"), type);  
	}
	
}
