package com.vtiger.stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginstepdefinitions {
	
	public WebDriver driver;
	
	@Given("user should be on login page")
	public void user_should_be_on_login_page() {
		
		driver=new ChromeDriver();
		driver.get("http://localhost:100");
		
	   
	}
	@When("user enters valid credentials")
	public void user_enters_valid_credentials() {
		
		driver.findElement(By.name("user_name")).sendKeys("admin");
		driver.findElement(By.name("user_password")).sendKeys("admin");
		driver.findElement(By.name("Login")).click();
	    
	}
	@Then("user should be naviagate to home page")
	public void user_should_be_naviagate_to_home_page() {
		
		driver.findElement(By.linkText("Home")).isDisplayed();
	    
	}
	@Then("user can click on logout page")
	public void user_can_click_on_logout_page() {
		
		driver.findElement(By.linkText("Logout")).isDisplayed();
	   
	}
	
	@When("user enters invalid credentials")
	public void user_enters_invalid_credentials() {
		
		driver.findElement(By.name("user_name")).sendKeys("admin123");
		driver.findElement(By.name("user_password")).sendKeys("admin123");
		driver.findElement(By.name("Login")).click();
	    
	}

	@Then("user should be naviagate to login page")
	public void user_should_be_naviagate_to_login_page() {
		
		driver.findElement(By.name("Login")).isDisplayed();
		
	    
	}

	@Then("user can see the error message")
	public void user_can_see_the_error_message() {
		
		driver.findElement(By.xpath("//*[contains(text(),'You must ')]")).isDisplayed();
	    
	}





}
