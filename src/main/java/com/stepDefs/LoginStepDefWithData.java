package com.stepDefs;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefWithData {
	WebDriver driver;

	@Before("@data")
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
	}

	@After("@data")
	public void tearDown() {
		driver.close();
	}

	@Given("^user should launch \"([^\"]*)\"$")
	public void user_should_launch(String Url) throws Throwable {
		driver.get(Url);
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\" and click login button$")
	public void user_enters_and_and_click_login_button(String uname, String pass) throws Throwable {
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pass);
		driver.findElement(By.xpath("//button")).click();
	}

	@Then("^user will verify home page title$")
	public void user_will_verify_home_page_title() throws Throwable {
		if (driver.getTitle().contains("Dashboard"))
			driver.findElement(By.linkText("LOGOUT")).click();
		Assert.assertEquals("JavaByKiran | Log in", driver.getTitle());
	}
}
