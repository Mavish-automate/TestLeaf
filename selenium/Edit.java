package com.week1.day4.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Edit {

	public static void main(String[] args) 
	{
		WebDriverManager.chromedriver().setup();

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("demoSalesManager");
	    driver.findElement(By.id("password")).sendKeys("crmsfa");
	    driver.findElement(By.className("decorativeSubmit")).click();
	   String title1= driver.getTitle();
	   System.out.println(title1);
	   driver.findElement(By.linkText("CRM/SFA")).click();
	   driver.findElement(By.linkText("Leads")).click();
	   driver.findElement(By.linkText("Create Lead")).click();
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys("VIRTUSA");
	   driver.findElement(By.id("createLeadForm_firstName")).sendKeys("mahe");
	   driver.findElement(By.id("createLeadForm_lastName")).sendKeys("vis");
	   driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("mahevis@gmail.com");
	   driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8879879898");
	   driver.findElement(By.name("submitButton")).click();
	   String title2= driver.getTitle();
	   System.out.println(title2);
	   driver.findElement(By.linkText("Edit")).click();
	   driver.findElement(By.id("updateLeadForm_companyName")).clear();
	   driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Testleaf");
	 driver.findElement(By.name("submitButton")).click();
		driver.close();
	}

}
