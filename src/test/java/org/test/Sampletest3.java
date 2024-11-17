package org.test;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Sampletest3 {
	@BeforeClass
	private void beforeclass() {
		System.out.println("beforeclassC");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("afterclassC");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethodC");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethodC");
	}
	@Test
	private void test() {
		SoftAssert s=new SoftAssert();
		s.assertTrue(false);
	System.out.println("testC");
	s.assertAll();
	}
	
	@Test
	private void test1() {
		//bhuvi git check
		System.out.println("test1");

	}
	

}
