package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.bass.Bassclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Youtub extends Bassclass {

	@BeforeClass
	private void beforeclass() {
		browserlaunch("chrome");
		timesout(5);
		System.out.println("beforeclass");
	}
	@AfterClass
	private void afterclass() {
		System.out.println("afterclass");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");
	}

	@AfterMethod
	private void aftermethod() {
		System.out.println("aftermethod");
	}
	@Test
	private void test() throws AWTException, InterruptedException {
		url("https://www.youtube.com/");
		WebElement element = driver.findElement(By.xpath("//input[@type='text']"));
		sendkeys(element, "angu");
		enterr();
		WebElement element1 = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
		click(element1);
		sleep(30000);
		WebElement element2 = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
		click(element2);
		sleep(5000);
		click(element2);
		WebElement element3 = driver.findElement(By.xpath("//button[@class='ytp-fullscreen-button ytp-button']"));
		click(element3);
		sleep(3000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_RIGHT);
		r.keyRelease(KeyEvent.VK_RIGHT);
		sleep(3000);
	System.out.println("test");
	}
	
	
	
	
}
