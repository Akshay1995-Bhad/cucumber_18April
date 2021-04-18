package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;

public class RegisterPage {

	
	WebDriver driver;	
	@FindBy(id="name")
	private WebElement name;
	
	@FindBy(id="mobile")
	private WebElement mobile;

	@FindBy(id="email")
	private WebElement email;

	@FindBy(id="password")
	private WebElement pass;
	
	@FindBy(tagName="button")
	private WebElement btn;
	
	public RegisterPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void enterName(String text) {
		name.sendKeys(text);
	}
	public void enterMobile(String text) {
		mobile.sendKeys(text);
	}
	public void enterEmail(String text) {
		email.sendKeys(text);
	}
	public void enterPassword(String text) {
		pass.sendKeys(text);
	}
	public void clickBtn() {
		btn.click();
	}
}
