package com.definition;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class tTrafTwodimlmap {
	static WebDriver driver;
	@When("User need to fill tariff details")
	public void user_need_to_fill_tariff_details(DataTable twomap ) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    WebElement home = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		home.click();
		driver.manage().window().maximize();
		List<Map<String, String>> two = twomap.asMaps(String.class,String.class );
		driver.findElement(By.id("rental1")).sendKeys(two.get(0).get("MonRen"));
		driver.findElement(By.id("local_minutes")).sendKeys(two.get(1).get("Freeloc"));
		driver.findElement(By.id("inter_minutes")).sendKeys(two.get(2).get("Freeinter"));
		driver.findElement(By.id("sms_pack")).sendKeys(two.get(3).get("Freesms"));
		driver.findElement(By.id("minutes_charges")).sendKeys(two.get(5).get("Locper"));
		driver.findElement(By.id("inter_charges")).sendKeys(two.get(6).get("Interper"));
		driver.findElement(By.id("sms_charges")).sendKeys(two.get(6).get("Sms"));
	    
		
	}

	@When("need to fill tariff detailss{string},{string},{string},{string},{string},{string},{string}")
	public void need_to_fill_tariff_detailss(String A, String B, String c, String d, String e, String f, String g) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\eclipse-workspace\\CucumberProject\\Drive\\chromedriver.exe");
	    driver= new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    WebElement home = driver.findElement(By.xpath("//a[text()='Add Tariff Plan']"));
		home.click();
		driver.manage().window().maximize();
		driver.findElement(By.id("rental1")).sendKeys(A);
		driver.findElement(By.id("local_minutes")).sendKeys(B);
		driver.findElement(By.id("inter_minutes")).sendKeys(c);
		driver.findElement(By.id("sms_pack")).sendKeys(d);
		driver.findElement(By.id("minutes_charges")).sendKeys(e);
		driver.findElement(By.id("inter_charges")).sendKeys(f);
		driver.findElement(By.id("sms_charges")).sendKeys(g);
	    
		
	}

	@When("need click submit buttons")
	public void need_click_submit_buttons() {
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		String Text1= driver.findElement(By.xpath("//h2[text()='Congratulation you add Tariff Plan']")).getText();
	    System.out.println(Text1);
	}


}
