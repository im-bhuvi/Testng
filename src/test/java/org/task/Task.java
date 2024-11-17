package org.task;

import java.awt.RenderingHints.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.jar.Manifest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task  {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.flipkart.com/?s_kwcid=AL!739!3!582822043580!b!!g!!flipkart&gclsrc=aw.ds&&semcmpid=sem_8024046704_brand_exe_buyers_goog&gad_source=1&gclid=CjwKCAiA3Na5BhAZEiwAzrfagFTqMLYfT_zHk0Rwp_mucZeavlw7LOxL9dG0J6E4TAPXT47rOdNXXRoCmOMQAvD_BwE");
		
		WebElement element = driver.findElement(By.name("q"));
		element.sendKeys("iphone",Keys.ENTER);
		List<WebElement> numof = driver.findElements(By.xpath("//div[@class='_75nlfW']"));
		System.out.println("Showing results "+numof.size()+" iphones out of "+numof.size()*24);
		System.out.println("===============================================================");
		
		List<WebElement> allphones = driver.findElements(By.xpath("//div[@class='KzDlHZ']"));
		for (int i = 0; i <allphones.size(); i++) {
			WebElement webElement = allphones.get(i);
			System.out.println(i+webElement.getText());
		}
		System.out.println("===============================================================");
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='Nx9bqj _4b5DiR']"));
		for (int i = 0; i <price.size(); i++) {
			WebElement webElement = price.get(i);
			System.out.println(i+webElement.getText());
		}
		System.out.println("===============================================================");
		WebElement iphone = driver.findElement(By.xpath("(//div[@class='KzDlHZ'])[5]"));
		WebElement cost = driver.findElement(By.xpath("(//div[@class='Nx9bqj _4b5DiR'])[5]"));
		System.out.println(iphone.getText()+cost.getText());
		
		System.out.println("===============================================================");
		for (int i = 0; i <numof.size(); i++) {
			System.out.println(i+allphones.get(i).getText()+"=="+price.get(i).getText());
		}
		
	}
	}

