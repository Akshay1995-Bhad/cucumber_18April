package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(id="email")
	private WebElement uname;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button")
	private WebElement lgnBtn;
	
	@FindBy(xpath="//img")
	private WebElement logo;
	
	@FindBy(partialLinkText="Register")
	private WebElement link;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public RegisterPage clickLink() {
		link.click();
		return new RegisterPage(driver);
	}
	public void enterUname(String text) {
		uname.sendKeys(text);
	}
	public void enterPass(String text) {
		password.sendKeys(text);
	}
	public void clickBtn() {
		lgnBtn.click();
	}
	public boolean verifyLogo() {
		return logo.isDisplayed();
	}
	public void validLogin() {
		enterUname("kiran@gmail.com");
		enterPass("123456");
		clickBtn();
	}
}
