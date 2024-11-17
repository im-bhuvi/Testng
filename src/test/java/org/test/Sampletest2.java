package org.test;



import java.awt.AWTException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bass.Bassclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class Sampletest2 extends Bassclass {
	@BeforeClass
	private void beforeclass() {
		browserlaunch("chrome");
		timesout(5);
		System.out.println("beforeclass");
	}
	@AfterClass
	private void afterclass() throws InterruptedException {
	//	quit();
		System.out.println("afterclassB");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethodB");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethodB");
	}
	@Test(enabled = true)
	public void testb() throws AWTException {
		url("https://www.snapdeal.com/ ");
		WebElement element = driver.findElement(By.name("keyword"));
		sendkeys(element, "iphone");
		enterr();
		WebElement element2 = driver.findElement(By.xpath("(//p[@class='product-title'])[1]"));
		click(element2);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(1));
		WebElement element3 = driver.findElement(By.xpath("//h1[@class='pdp-e-i-head']"));
		System.out.println(gettext(element3));
     	System.out.println("testb");
	}
	@Test
	private void testbb() throws AWTException, InterruptedException {
		url("https://www.amazon.com/");
		WebElement element = driver.findElement(By.id("twotabsearchtextbox"));
		sendkeys(element, "iphone");
		enterr();
		List<WebElement> allphone = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < allphone.size(); i++) {
			WebElement webElement = allphone.get(i);
			System.out.println(i+webElement.getText());
		}
		WebElement greeniphone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[2]"));
		click(greeniphone);
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(windowHandles);
		driver.switchTo().window(li.get(1));
		
		
		System.out.println("testbb");

	}
	
	

	

}
