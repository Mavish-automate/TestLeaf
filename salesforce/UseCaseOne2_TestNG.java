package com.selenium.salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class UseCaseOne2_TestNG {
@Test
	public  void mainassignment2() throws InterruptedException {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
		driver.findElement(By.id("password")).sendKeys("Leaf$1234");
		driver.findElement(By.id("Login")).click();

		driver.findElement(By.className("slds-icon-waffle")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		driver.findElement(By.xpath("(//div[@class='slds-truncate'])[2]")).click();
		
//		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Opportunities']")));
		WebElement ele=driver.findElement(By.xpath("(//span[text()='Opportunities'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).click().perform();
		driver.findElement(By.xpath("//div[text()='New']")).click();
	    driver.findElement(By.xpath("//button[text()='Save']")).click();
	    if(driver.getPageSource().contains("We hit a snag."))
	    {
	    	System.out.println("Text is present");	
	    }
	    else
	    {
	    	System.out.println("Not Text is present");

	    }


		
		
		
			
		
	}

}
