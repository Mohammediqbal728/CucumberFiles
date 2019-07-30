package com.definition;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class CucumberOneDimenList {
	static WebDriver driver;
	@Given("User is in telecom home pages")
	public void user_is_in_telecom_home_pages() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
		 driver=new ChromeDriver();
		 driver.get("http://demo.guru99.com/telecom/");
	    
	}

	@And("User click on add customer buttons")
	public void user_click_on_add_customer_buttons() {
		driver.findElement(By.xpath("//a[text()='Add Customer']")).click();
		driver.manage().window().maximize();
	}

	@When("User filling the all detailss")
	public void user_filling_the_all_detailss(DataTable dataTable) {
		List<String> datas = dataTable.asList(String.class);
		driver.findElement(By.xpath("//label[@for='done']")).click();
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(datas.get(0));
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(datas.get(1));
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(datas.get(2));
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(datas.get(3));
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(datas.get(4));
	}

	@And("User is submitting the detailss")
	public void user_is_submitting_the_detailss() {
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("User is able to see customer IDenerated is generatedd")
	public void user_is_able_to_see_customer_IDenerated_is_generatedd(io.cucumber.datatable.DataTable dataTable) {
		String text1 = driver.findElement(By.xpath("(//td[@align='center'])[2]")).getText();
		System.out.println(text1);
	}


		}




