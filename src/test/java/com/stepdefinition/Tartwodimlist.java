package com.stepdefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class Tartwodimlist {
static WebDriver driver;

	@When("need to tarif details")
	public void need_to_tarif_details(DataTable twolist) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    WebElement home = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		home.click();
		driver.manage().window().maximize();
		List<String>two = twolist.asList(String.class);
		driver.findElement(By.id("rental1")).sendKeys(two.get(0));
		driver.findElement(By.id("local_minutes")).sendKeys(two.get(1));
		driver.findElement(By.id("inter_minutes")).sendKeys(two.get(2));
		driver.findElement(By.id("sms_pack")).sendKeys(two.get(3));
		driver.findElement(By.id("minutes_charges")).sendKeys(two.get(4));
		driver.findElement(By.id("inter_charges")).sendKeys(two.get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(two.get(6));
	    
	}

	@When("need click submit button")
	public void need_click_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}

	@Then("User view the successful page")
	public void user_view_the_successful_page() {
		String Text1= driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
	    System.out.println(Text1);

	    
	}

	@When("check tarif detailss")
	public void check_tarif_detailss(DataTable twolistt) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    WebElement home = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		home.click();
		driver.manage().window().maximize();
		List<List<String>> list = twolistt.asLists();
		driver.findElement(By.id("rental1")).sendKeys(list.get(0).get(3));
		driver.findElement(By.id("local_minutes")).sendKeys(list.get(1).get(3));
		driver.findElement(By.id("inter_minutes")).sendKeys(list.get(2).get(4));
		driver.findElement(By.id("sms_pack")).sendKeys(list.get(3).get(6));
		driver.findElement(By.id("minutes_charges")).sendKeys(list.get(4).get(2));
		driver.findElement(By.id("inter_charges")).sendKeys(list.get(5).get(5));
		driver.findElement(By.id("sms_charges")).sendKeys(list.get(6).get(5));
	    
	}

	@When("click submit button")
	public void click_submit_button() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
	}



}
