package com.selenium.browser;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CrossBrowser 
{
	
public void launch() 
{
//Launch the Browser
	
	WebDriver driver;
	driver=new ChromeDriver();
	driver.get("http://www.leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	
//	Enter the credentials using X-Path
	
	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demoSalesManager");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
	driver.findElement(By.xpath("//input[@type='submit']")).click();
	
//	click on the image to log-in using link text
	driver.findElement(By.linkText("CRM/SFA")).click();
	
//	click on leads 
	driver.findElement(By.linkText("Leads")).click();
	
//	click on create Leads
	driver.findElement(By.linkText("Create Lead")).click();
	
//	fill the mandatory fields
	driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Virtusa");
	driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Mahe");
	driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Vish");
	
//	DropDowns--Source
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	source.click();
	
	Select dropdown=new Select(source);
	dropdown.selectByIndex(4);
	dropdown.selectByVisibleText("Cold Call");
	dropdown.selectByValue("LEAD_DIRECTMAIL");
	
//DropDown--Marketing Campaign	
	WebElement marketingCampaign = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
	marketingCampaign.click();
	
	Select dropdown2=new Select(marketingCampaign);
	dropdown2.selectByIndex(4);
	dropdown2.selectByVisibleText("Car and Driver");
	dropdown2.selectByValue("CATRQ_AUTOMOBILE");
	
//	DropDown-Industry
	WebElement industry = driver.findElement(By.id("createLeadForm_industryEnumId"));
	industry.click();
	
	Select dropdown3=new Select(industry);
	dropdown3.selectByIndex(4);
	dropdown3.selectByVisibleText("Aerospace");
	dropdown3.selectByValue("IND_DISTRIBUTION");
	
//	DropDown--Currency
	
	WebElement currency = driver.findElement(By.id("createLeadForm_currencyUomId"));
	currency.click();
	
	Select dropdown4=new Select(currency);
	dropdown4.selectByIndex(3);
	dropdown4.selectByVisibleText("AFA - Afghani");
	dropdown4.selectByValue("ALL");
	
	

	
}

public static void main(String[] args) 
{
CrossBrowser project = new CrossBrowser();
project.launch();
}
}
