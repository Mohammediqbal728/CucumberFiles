package org.test.cucumber;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CucumberProject {
	static WebDriver driver;
		@Given("User is in telecom home page")
	public void user_is_in_telecom_home_page() {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
	 driver=new ChromeDriver();
	 driver.get("http://demo.guru99.com/telecom/");
		}

	@Given("User click on add customer button")
	public void user_click_on_add_customer_button() {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		driver.manage().window().maximize();
	}

	@When("User filling the all details")
	public void user_filling_the_all_details() {
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Mohammed");
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys("Iqbal");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Mohammed@mail.com");
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("Chennai");
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys("9877678900");
		
		
	    
	}

	@When("User is submitting the details")
	public void user_is_submitting_the_details() {
	    driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User is able to see customer IDenerated is generated")
	public void user_is_able_to_see_customer_IDenerated_is_generated() {
	//Assert.assertTrue(driver.findElement(By.xpath("(//td[@align='center'])[2]")).isDisplayed());
		driver.findElement(By.xpath("(//td[@align='center'])[2]")).getAttribute("value");
	    
	}


	
}
