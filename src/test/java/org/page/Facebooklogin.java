package org.page;

import org.bass.Bassclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebooklogin extends Bassclass{
	
	public Facebooklogin() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "email")
	private WebElement email;
	
	@FindBy(name = "pass")
	private WebElement pass;
	
	@FindBy(xpath = "//button[@value='1']")
	private WebElement loginbttn;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getLoginbttn() {
		return loginbttn;
	}
	
	

}
