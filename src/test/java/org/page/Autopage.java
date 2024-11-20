package org.page;



import org.bass.Bassclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Autopage extends Bassclass {

	public Autopage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Register')]")
	private WebElement register;
	
	@FindBy(xpath = "(//input[@type='text'])[1]")
	private WebElement firstname;
	
	@FindBy(xpath ="(//input[@type='text'])[2]")
	private WebElement lastname;
	
	@FindBy(xpath = "//textarea[@rows='3']")
	private WebElement adders;
	
	@FindBy(xpath = "//input[@type='email']")
	private WebElement email;
	
	@FindBy(xpath = "//input[@type='tel']")
	private WebElement phone;
	
	@FindBy(xpath = "(//input[@type='radio'])[1]")
	private WebElement gender;
	
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement hobbis;
	
	@FindBy(id = "msdd")
	private WebElement laung;
	
	@FindBy(id = "Skills")
	private WebElement skills;
	
	@FindBy(xpath = "//span[@class='select2-selection__arrow']")
	private WebElement country;
	
	@FindBy(id = "yearbox")
	private WebElement yearbox;
	
	@FindBy(xpath = "(//select[@type='text'])[5]")
	private WebElement day;
	
	@FindBy(xpath = "(//select[@type='text'])[4]")
	private WebElement month;
	
	@FindBy(id = "firstpassword")
	private WebElement password;
	
	@FindBy(id = "secondpassword")
	private WebElement confirmpass;
	
	@FindBy(id = "submitbtn")
	private WebElement submit;

	public WebElement getRegister() {
		return register;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAdders() {
		return adders;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getHobbis() {
		return hobbis;
	}

	public WebElement getLaung() {
		return laung;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getYearbox() {
		return yearbox;
	}

	public WebElement getDay() {
		return day;
	}

	public WebElement getMonth() {
		return month;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpass() {
		return confirmpass;
	}

	public WebElement getSubmit() {
		return submit;
	}
}
