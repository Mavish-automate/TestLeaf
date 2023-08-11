package com.selenium.marathon2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.idealized.Javascript;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class testCase1 
{
public static void main(String[] args) throws InterruptedException, IOException 
{
//	driver instance
	
	ChromeOptions opt =new ChromeOptions();
	opt.addArguments("--disable-notifications");
	
	ChromeDriver driver=  new ChromeDriver(opt);
	
	driver.get(" https://login.salesforce.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	
//	credentials
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
	driver.findElement(By.id("password")).sendKeys("Leaf$1234");
	driver.findElement(By.id("Login")).click();
	
//	Click on Learn More under Mobile Publisher
	
	driver.findElement(By.xpath("//span[text()='Learn More']")).click();
	
//	switch to new tab/window after clicking learn more
	
	Set<String> whs = driver.getWindowHandles();
	List<String> wh=new ArrayList<>(whs);
	driver.switchTo().window(wh.get(1));
	
	driver.findElement(By.xpath("//button[text()='Confirm']")).click();
	
//	Shadow root clicking on Learnings
	
	Shadow shadow=new Shadow(driver);
	shadow.findElementByXPath("//span[text()='Learning']").click();
	
	
//	Action class useage in Mouse-Hover in Learnings TrailHead
	
	Actions act=new Actions(driver);
	Thread.sleep(5000);
	act.moveToElement(shadow.findElementByXPath("//span[text()='Learning on Trailhead']")).click().perform();
	
	
//	java script executor for scroll down
	
	
	WebElement shadow1 = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
	JavascriptExecutor jse=   (JavascriptExecutor)driver;
	jse.executeScript("arguments[0].click();", shadow1);
	
	driver.findElement(By.xpath("//a[text()='Administrator']")).click();
	
	System.out.println(driver.findElement(By.xpath("//div[text()='ABOUT THE EXAM']//following::div[1]")).getText());

	List<WebElement> certificat_list = driver.findElements(By.xpath("//div[text()='Certification']//following-sibling::div[a]"));
	
//	//div[text()='Classes and Workshops']//following-sibling::ul//li
	for(WebElement li:certificat_list)
	{
	System.out.println(li.getText());	
	}
	JavascriptExecutor jse1=   (JavascriptExecutor)driver;
	WebElement certisnap = driver.findElement(By.xpath("(//div[text()='Certification']//following-sibling::div)[1]"));
	jse1.executeScript("arguments[0].scrollIntoView();",certisnap);

	File screesnshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
   FileUtils.copyFile(screesnshot, new File("./snapshot/certificate_snap.png"));
}
}
