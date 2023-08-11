package com.selenium.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.sukgu.Shadow;

public class testcase3 {
	public static void main(String[] args) throws InterruptedException, IOException 
	{
		ChromeOptions opt =new ChromeOptions();
		opt.addArguments("--disable-notifications");
		
		ChromeDriver driver=  new ChromeDriver(opt);
		
		driver.get("https://dev146490.service-now.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("Uouh$-9J2cIU");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();

//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));    
//		By elem_dynamic = By.xpath("//div[text()='All']");
//		wait.until(ExpectedConditions.presenceOfElementLocated(elem_dynamic));
		Shadow shadow=new Shadow(driver);
		shadow.setImplicitWait(30);
		shadow.findElementByXPath("//div[text()='All']").click();

		shadow.setImplicitWait(10);

		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		WebElement fram = shadow.findElementByXPath("//iframe[@name='gsft_main']");
		driver.switchTo().frame(fram);
		shadow.findElementByXPath("//h2[contains(text(),' Mobiles')]").click();
		shadow.findElementByXPath("//Strong[text()='Apple iPhone 13 pro']").click();
		
		driver.findElement(By.xpath("//input[@value='yes']//following-sibling::label")).click();
		driver.findElement(By.xpath("//input[@class='cat_item_option sc-content-pad form-control']")).sendKeys("99");
        Select option=new Select(driver.findElement(By.xpath("//select[@class=\"form-control cat_item_option \"]")));
        option.selectByIndex(2);
        driver.findElement(By.xpath("//input[@value='sierra_blue']//following::label[1]")).click();
        driver.findElement(By.xpath("//input[@value='512']//following::label[1]")).click();
        driver.findElement(By.xpath("//button[@id='oi_order_now_button']")).click();
        String rid=driver.findElement(By.xpath("//a[@id='requesturl']/b")).getText();
        System.out.println(rid);
    	File screesnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
         FileUtils.copyFile(screesnshot, new File("./snapshot/mobile_snap.png"));





		







}
}