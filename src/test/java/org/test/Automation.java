package org.test;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.bass.Bassclass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.page.Autopage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Automation extends Bassclass{

	@BeforeClass
	private void BeforeClass() {
		browserlaunch("chrome");
		timesout(5);
		maxmize();
		System.out.println("Beforeclass");
	}
	@AfterClass
	private void Afterclass() {
		System.out.println("Afterclass");
	}
	@BeforeMethod
	private void beforemethod() {
		System.out.println("beforemethod");
	}
	@AfterMethod
	private void Aftermethod() {
		System.out.println("Aftermethod");
	}
	
	@Test
	private void Test() throws IOException, AWTException, InterruptedException {
		url("https://demo.automationtesting.in/Register.html");
		Autopage a=new Autopage();
		sendkeys(a.getFirstname(),readExcel("Sample","sheet1", 1, 0));
		doubleclick(a.getFirstname());
		copy();
		click(a.getLastname());
		paste();
		sendkeys(a.getAdders(), "44 minnapan st");
		sendkeys(a.getEmail(), "bhuvi12345@gamil.com");
		sendkeys(a.getPhone(), readExcel("Sample", "sheet1", 0, 3));
		click(a.getGender());
		click(a.getHobbis());
		click(a.getLaung());
		WebElement element = driver.findElement(By.xpath("(//a[@class='ui-corner-all'])[8]"));
		click(element);
		selectByVisbleText(a.getSkills(), "Java");
		click(a.getCountry());
		Robot r=new Robot();
		for (int i = 0; i <5; i++) {
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}
		enterr();
		selectByValue(a.getYearbox(), "2003");
		selectByValue(a.getMonth(), "June");
		selectbyindex(a.getDay(), 15);
		sendkeys(a.getPassword(), "12345");
		sendkeys(a.getConfirmpass(), "12345");
		click(a.getSubmit());
		sleep(3000);
		WebElement element2 = driver.findElement(By.id("Button1"));
		click(element2);
		
		
		System.out.println("Test");
	}
	
	
	
}
