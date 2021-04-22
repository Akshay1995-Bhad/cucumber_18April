package com.stepDefs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import jxl.Sheet;
import jxl.Workbook;

public class LoginWithExcel {
	WebDriver driver;

	public String getData(int row, int col) {
		FileInputStream fis = null;
		Workbook wb = null;
		Sheet sh = null;
		try {
			fis = new FileInputStream("LoginDataForJbk.xls");
			wb = Workbook.getWorkbook(fis);
			sh = wb.getSheet("login");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return sh.getCell(row, col).getContents();

	}

	@Given("^user should be on login page for Excel login$")
	public void user_should_be_on_login_page_for_Excel_login() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/Akshay/Downloads/software/Selenium%20Softwares/Offline%20Website/Offline%20Website/index.html");
	}

	@When("^user enters uname and pass from Excelsheet$")
	public void user_enters_uname_and_pass_from_Excelsheet() throws Throwable {
        for(int i=1;i<=3;i++) {
        	driver.findElement(By.id("email")).clear();
        	driver.findElement(By.id("email")).sendKeys(getData(0,i));
        	driver.findElement(By.id("password")).clear();
        	driver.findElement(By.id("password")).sendKeys(getData(1,i));
            driver.findElement(By.xpath("//button")).click();
            
            if(driver.getTitle().contains("Dashboard")) 
            	driver.findElement(By.linkText("LOGOUT")).click();
            	
            
        }
	}

	@Then("^user will verify home page title for Excel$")
	public void user_will_verify_home_page_title_for_Excel() throws Throwable {
            Assert.assertEquals("JavaByKiran | Log in", driver.getTitle());
	}
}
