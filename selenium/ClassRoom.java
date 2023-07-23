package com.week1.day4.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassRoom {
	public WebDriver driver;
	
	public void launch() {
WebDriverManager.chromedriver().setup();

		
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String title = driver.getTitle();
		System.out.println(title);
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		driver.close();
		
	}
	
	public void launch1() 
	{
WebDriverManager.firefoxdriver().setup();

		
		FirefoxDriver driver2=new FirefoxDriver();
		driver2.get("https://www.facebook.com/");
		driver2.manage().window().maximize();
		String title = driver2.getTitle();
		System.out.println(title);
		String pageSource = driver2.getPageSource();
		System.out.println(pageSource);
		driver2.close();
	
	}
	
	public static   void main(String[] args) 
	{
		ClassRoom l = new ClassRoom();
	l.launch();
	l.launch1();
		

	}

}
