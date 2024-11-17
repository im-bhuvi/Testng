package org.test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.bass.Bassclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSample extends Bassclass{

	@BeforeClass
	private void BeforeClass() {
		browserlaunch("chrome");
		timesout(5);
		System.out.println("beforeclass");
	}
	@AfterClass
	private void afterclass() {
		//quit();
		System.out.println("afterclass");
	}
	@BeforeMethod
	private void BeforeMethod() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
	}
	@Test
	private void test1() throws AWTException {
		browserlaunch("chrome");
		timesout(5);
		url("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=6033873654071438790&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040218&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		WebElement element = driver.findElement(By.name("field-keywords"));
		element.sendKeys("iphone");
		enterr();
		WebElement phone = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]"));
		phone.click();
		
		Set<String> tab = driver.getWindowHandles();
		List<String> li=new ArrayList<String>();
		li.addAll(tab);
		driver.switchTo().window(li.get(1));
		
		
		
	
		
	}
	
	
}
