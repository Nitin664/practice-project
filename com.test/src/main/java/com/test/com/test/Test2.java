package com.test.com.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Test2 {
// Home Page
	   
	public  WebDriver driver;
	
	@Test(priority=3)
	public void HomePage() throws Exception
	{
		driver=new ChromeDriver();
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		
		driver.get("https://www.testing-web-sites.co.uk/login/");
		 
		  
		driver.manage().window().maximize();
		 driver.findElement(By.cssSelector("#username-3411")).sendKeys("nitin.jangra@yopmail.com");
		   driver.findElement(By.cssSelector("#user_password-3411")).sendKeys("Arxaa@123");
		   driver.findElement(By.cssSelector("#um-submit-btn")).click();
		   System.out.println("Login");
		   Thread.sleep(2000);
	driver.findElement(By.cssSelector("#Subheader > div > div > ul > li:nth-child(1) > a")).click();
	  
	}	
	
//MouseHover
	@Test(priority=4)
	public void MouseHover()
	{
	          Actions action = new Actions(driver);
	          action.moveToElement(driver.findElement(By.cssSelector("#menu-item-2031 > a > span"))).build().perform();         
	          driver.findElement(By.cssSelector("#menu-item-3132 > a > span > span")).click();
             System.out.println("Second class passed");
	}        
	 
/*//Dropdown	
	@Test(priority=5)
	public void Dropdown()
	{
		
	}*/


	
	
}


	


