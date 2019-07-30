package com.definition;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AddcustomerTrafPalnonemaplist {
	static WebDriver driver;
	@Given("User view home page")
	public void user_view_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
		
	}
	
	@Given("user click Add tariff plan")
	public void user_click_Add_tariff_plan() {
		WebElement home = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		home.click();
		driver.manage().window().maximize();
		
	}

	@When("User need to fill all the fieldss")
	public void user_need_to_fill_all_the_fieldss(DataTable tarifplan) {
		Map<String, String> Plandet = tarifplan.asMap(String.class, String.class);
		driver.findElement(By.id("rental1")).sendKeys(Plandet.get("Monthly"));
		driver.findElement(By.id("local_minutes")).sendKeys(Plandet.get("Free local minutes"));
		driver.findElement(By.id("inter_minutes")).sendKeys(Plandet.get("Free inter min"));
		driver.findElement(By.id("sms_pack")).sendKeys(Plandet.get("Free sms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(Plandet.get("Loc per min"));
		driver.findElement(By.id("inter_charges")).sendKeys(Plandet.get("Inter natio per min"));
		driver.findElement(By.id("sms_charges")).sendKeys(Plandet.get("Sms per charge"));
		
	   
	}

	@And("User need to click submit button")
	public void user_need_to_click_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("User should see the new tarif plan added page")
	public void user_should_see_the_new_tarif_plan_added_page() {
	    String Text1= driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
	    System.out.println(Text1);
	}




}
