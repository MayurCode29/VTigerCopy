package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class homestepdefinitions {
	
	public WebDriver driver;
	
	@Given("user is on Home page")
	public void user_is_on_home_page() {
		driver=new ChromeDriver();
		driver.get("http://localhost:100");
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
	   
	}
	@When("user clicks on logout button")
	public void user_clicks_on_logout_button() {
		driver.findElement(By.xpath("//*[text()='Logout']")).click()
	    ;
	}
	@Then("user is should be navigated to login page")
	public void user_is_should_be_navigated_to_login_page() {
		
		driver.findElement(By.name("user_name")).isDisplayed();
	    
	}




}
