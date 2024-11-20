package org.test;

import java.awt.AWTException;
import java.util.List;

import org.bass.Bassclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Sampletest extends Bassclass {
	
	public static void main(String[] args) throws AWTException, InterruptedException {
		browserlaunch("chrome");
		timesout(5);
		maxmize();
		url("https://www.facebook.com/");
		WebElement element = driver.findElement(By.xpath("(//a[@role='button'])[2]"));
		element.click();
		
		WebElement element2 = driver.findElement(By.id("day"));
		Select s=new Select(element2);
		List<WebElement> options = s.getOptions();
		for (int i = 0; i <options.size(); i++) {
			WebElement webElement = options.get(i);
		}
		WebElement month = driver.findElement(By.id("month"));
		Select m=new Select(month);
		List<WebElement> options2 = m.getOptions();
		for (int i = 0; i <options2.size(); i++) {
			WebElement webElement = options2.get(i);
		}
		WebElement year = driver.findElement(By.id("year"));
		Select y=new Select(month);
		List<WebElement> options3 = y.getOptions();
		for (int i = 0; i < options3.size(); i++) {
			WebElement webElement = options2.get(i);	
			}
		for (int j = 0; j <options.size()+options2.size()+options3.size(); j++) {
			System.out.println(options.get(j).getText()+"/"+options2.get(j).getText()+"/"+options3.get(j).getText());
		
		}
	}
	
}
