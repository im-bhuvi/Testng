package org.test;

import java.awt.AWTException;
import java.io.IOException;

import org.bass.Bassclass;
import org.page.AccCreate;
import org.page.Facebooklogin;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Facebook extends Bassclass {
	
	@BeforeClass
	private void beforeclass() {
		browserlaunch("chrome");
		maxmize();
		timesout(5);
		System.out.println("beforeclass");
	}
	@AfterClass
	private void afterclass() throws InterruptedException {
		sleep(3000);
		quit();
		System.out.println("afterclass");
	}
	@BeforeMethod
	private void beforemethod() {
		java.util.Date d=new java.util.Date();
		System.out.println("beforemethod...."+d);
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftercmethod");
	}
	
	@Test
	private void test1() throws AWTException, InterruptedException, IOException {
		url("https://www.facebook.com/");
		SoftAssert s=new SoftAssert();
		
		//verify url
		String currenturl = currenturl();
		boolean contains = currenturl.contains("facebook");
		s.assertTrue(contains,"verify url");
		AccCreate a=new AccCreate();
		click(a.getCeratebttn());
		sendkeys(a.getFirstname(),readExcel("Sample", "sheet1", 1, 0));
		
		//verify name
		String getattribute = getattribute(a.getFirstname());
		s.assertEquals(getattribute, "huvi","verify name");
		sleep(2000);
		doubleclick(a.getFirstname());
		copy();
		click(a.getLastname());
		paste();
		sendkeys(a.getEmail(), "bhuvi1606");
		doubleclick(a.getEmail());
		copy();
		click(a.getPassword());
		paste();
		selectbyindex(a.getDay(), 15);
		System.out.println(getattribute(a.getDay()));
		selectByVisbleText(a.getMonth(),"Jun");
		selectByValue(a.getYear(),"2003");
		click(a.getGender());
		driver.navigate().back();
		
		s.assertAll();//to get faild asserts
		System.out.println("test 1");
	}
	
	@Test
	private void test2() {
		Facebooklogin f=new Facebooklogin();
		sendkeys(f.getEmail(), "bhuvi");
		sendkeys(f.getPass(), "1112");
		click(f.getLoginbttn());
		System.out.println("test 2");
	}
	
	

}
