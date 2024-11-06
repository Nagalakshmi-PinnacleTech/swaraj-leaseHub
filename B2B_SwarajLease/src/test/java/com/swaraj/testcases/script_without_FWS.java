package com.swaraj.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script_without_FWS {

public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup(); //base
//		System.setProperty("<Path of the ChromeDriver>");
		WebDriver driver = new ChromeDriver(); //base

		// Navigate to a website
		driver.get("http://swaraj-lease-hub.s3-website.ap-south-1.amazonaws.com/"); //properties

		//Maximize current window
		driver.manage().window().maximize();

		//Delay execution for 5 seconds to view the maximize operation
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//a[normalize-space()='LOGIN']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("newuser@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("newuser@gmail.com@1");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='btn-primary_1 btn-login flex-center ']")).click();
		Thread.sleep(6000);
//		driver.findElement(By.xpath("//div[@data-title='Notification']")).click();
//		driver.findElement(By.xpath("//div[@data-title='Announcement']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("(//a[@class='topBarHead'])[1]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[normalize-space()='Add Property']//*[name()='svg']")).click();
		driver.findElement(By.xpath("//input[@id='propertyName']")).sendKeys("prop1");
		driver.findElement(By.xpath("//textarea[@id='propertyAddress']")).sendKeys("prop1");
		driver.findElement(By.xpath("//input[@id='unitName']")).sendKeys("unit1");
		driver.findElement(By.xpath("//textarea[@id='unitDesc']")).sendKeys("two BHK");
		driver.findElement(By.xpath("//input[@id='unitRentPerMonth']")).sendKeys("5000");
		driver.findElement(By.xpath("//input[@id='unitInc']")).sendKeys("10");
		Thread.sleep(5000);
		
		//Close the browser
		driver.quit();

	}


	}


