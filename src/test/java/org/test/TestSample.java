package org.test;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
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
		url("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=713930225169&hvpos=&hvnetw=g&hvrand=6033873654071438790&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9040218&hvtargid=kwd-64107830&hydadcr=14452_2402225&gad_source=1");
		WebElement element = driver.findElement(By.name("field-keywords"));
		element.sendKeys("iphone");
		enterr();
		
		List<WebElement> element2 = driver.findElements(By.xpath("//div[@class='puisg-col-inner']"));
		System.out.println("showing result "+element2.size()+" out of "+element2.size()*28);
		System.out.println("=============================================");
		
		List<WebElement> elements = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		for (int i = 0; i < elements.size(); i++) {
			WebElement webElement = elements.get(i);
			System.out.println(i+webElement.getText());
			System.out.println("=============================================");
		}
		
		List<WebElement> price = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		for (int i = 0; i <price.size(); i++) {
			WebElement webElement = price.get(i);
			System.out.println(webElement.getText());
			System.out.println("=============================================");
		}
		 List <Integer> l = new ArrayList<Integer>(); 
			
			for(WebElement x : price) {
				String text = x.getText();
				String replace = text.replace("₹", "");
				String replace2 = replace.replace(",", "");
				int int1 = Integer.parseInt(replace2);
				Integer CostInteger = Integer.valueOf(int1);
				l.add(CostInteger);
			}
			System.out.println("===============================================================");
	        Collections.sort(l);
			System.out.println("Minimum price = "+l.get(0));
			System.out.println("Maximum price = "+l.get(l.size()-1));

		WebElement red = driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[9]"));
		WebElement redprice = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[9]"));
		System.out.println(red.getText()+" "+redprice.getText());
		System.out.println("xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
		
		WebElement element3 = driver.findElement(By.xpath("(//a[@class='nav-a  '])[5]"));
		click(element3);
		
		List<WebElement> todays = driver.findElements(By.xpath("//span[@class='a-truncate-cut']"));
		for (int i = 0; i < todays.size(); i++) {
			WebElement webElement = todays.get(i);
			System.out.println(webElement.getText());
		}
	}
	
}
