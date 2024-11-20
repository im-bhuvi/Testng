package org.page;

import org.bass.Bassclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccCreate extends Bassclass {

	public AccCreate() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (xpath = "(//a[@role='button'])[2]")
	private WebElement ceratebttn;
	
	@FindBy(name = "firstname")
	private WebElement firstname;
	
	@FindBy (name = "lastname")
	private WebElement lastname;
	
	@FindBy (xpath = "(//input[@type='text'])[5]")
	private WebElement email;
	
	@FindBy (xpath = "//input[@type='password']")
	private WebElement password;
	
	@FindBy (id = "day")
	private WebElement day;
	
	@FindBy (id = "month")
	private WebElement month;
	
	@FindBy (id = "year")
	private WebElement year;
	
	@FindBy (xpath = "(//input[@type='radio'])[2]")
	private WebElement gender;

	public WebElement getCeratebttn() {
		return ceratebttn;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getYear() {
		return year;
	}

	public WebElement getGender() {
		return gender;
	}
	
	
	
	
	
	
	
	
	
	
}
