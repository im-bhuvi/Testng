package org.bass;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Bassclass {
	public static WebDriver driver;
	public static void browserlaunch(String Browser) {
		switch (Browser) {
		case "chrome":
			 driver =new ChromeDriver();
			break;
		case "edge":
			driver =new EdgeDriver();
			break;
		case "firefox":
			driver =new FirefoxDriver();
			break;
		default:
			driver =new ChromeDriver();
		}
	}
	
	public static void url(String url) {
		driver.get(url);
	}
	public static void maxmize() {
		driver.manage().window().maximize();
	}
	public static  void timesout(int a) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(a));
	}
	public static  void quit() {
		driver.quit();
	}
	public static  void xpath(String path) {
		driver.findElement(By.xpath(path));
	}
	public static  void id(String id) {
		driver.findElement(By.id(id));
	}
	public static  void name(String name) {
		driver.findElement(By.name(name));
	}
	public static  void sendkeys(WebElement s,String value) {
		s.sendKeys(value);
	}
	public static  void click(WebElement c) {
		c.click();
	}
	public static  void sleep(int sec) throws InterruptedException {
		Thread.sleep(sec);
	}
	public static String currenturl() {
	    return driver.getCurrentUrl();
	}
	public static String gettext(WebElement g) {
		String text = g.getText();
		return text;
	}
	public static String getattribute(WebElement g) {
		String attribute = g.getAttribute("value");
		return attribute;
	}
	public static  void selectbyindex(WebElement i,int index) {
		Select s=new Select(i);
		s.selectByIndex(index);
	}
	public static  void selectByVisbleText(WebElement i,String value) {
		Select s=new Select(i);
		s.selectByVisibleText(value);
	}
	public static  void selectByValue(WebElement i, String value) {
		Select s=new Select(i);
	    s.selectByValue(value);
	}
	public static  void doubleclick(WebElement d) {
		Actions a =new Actions(driver);
		a.doubleClick(d).perform();
	}
	public static void rightclick(WebElement c) {
		Actions a =new Actions(driver);
		a.contextClick(c).perform();
	}
	public static void movetoelement(WebElement b) {
		Actions a =new Actions(driver);
		a.moveToElement(b).perform();
	}
	public static void dragandDrop(WebElement from,WebElement to) {
		Actions a =new Actions(driver);
		a.dragAndDrop(from, to).perform();
	}
	public static void Scrollto(WebElement s) {
		Actions a =new Actions(driver);
		a.scrollToElement(s).perform();
	}
	public static void copy() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_C);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_C);
	}
	public static void paste() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
	}
	public static void enterr() throws AWTException {
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	
	
	
	
	
	  
	
	
	
	
	
	
	
	
	

}
