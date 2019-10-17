package com.test.com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1
{
	WebDriver driver;
 // launch Browser
   @BeforeMethod
   public  void Test11()
   {
	   
	   System.setProperty("webdriver.chrome.driver","chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.testing-web-sites.co.uk/testing-plans-checklists/testing-plan-for-forms/");
       driver.manage().window().maximize();
       System.out.println("Lauched Browser");
   }
// Registration successfully
   @Test(priority=1)
   public  void Register()
   {
	   
	driver.findElement(By.cssSelector("#menu-item-3458 > a")).click();   
	driver.findElement(By.cssSelector("#user_login-3410")).sendKeys("Nitinjangra");
	driver.findElement(By.cssSelector("#first_name-3410")).sendKeys("Nitin");
	driver.findElement(By.cssSelector("#last_name-3410")).sendKeys("jangra");
	driver.findElement(By.cssSelector("#user_email-3410")).sendKeys("nitin.jangra@yopmail.com");
	driver.findElement(By.cssSelector("#user_password-3410")).sendKeys("Arxaa@123");
	driver.findElement(By.cssSelector("#confirm_user_password-3410")).sendKeys("Arxaa@123");
	driver.findElement(By.cssSelector("#um-submit-btn")).click();
	System.out.println("REgister ___");
   }
/*  
// Login Successfully   
   @Test(priority=2)
   public static void login()
   {
	   driver.findElement(By.cssSelector("#menu-item-3459 > a")).click();
	   driver.findElement(By.cssSelector("#username-3411")).sendKeys("nitin.jangra@yopmail.com");
	   driver.findElement(By.cssSelector("#user_password-3411")).sendKeys("Arxaa@123");
	   driver.findElement(By.cssSelector("#um-submit-btn")).click();
	   System.out.println("Login");
   }
   */
   
// close Browser  
	 @AfterMethod
	   public  void close()
	   {
//		   driver.close();
	      System.out.println("passed");
	      driver.quit();
	   }
   
	 
}
   
   
