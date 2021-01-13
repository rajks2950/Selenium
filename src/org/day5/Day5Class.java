package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumclass.org.Action;

public class Day5Class {
	public static void main(String[] args) throws AWTException, InterruptedException {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebElement clk = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
	    clk.click();
		
		Actions a=new Actions(driver);
		a.moveToElement(driver.findElement(By.xpath("//span[text()='Home & Furniture']"))).click().perform();
		Thread.sleep(1000);
	    WebElement ef = driver.findElement(By.xpath("//a[@title='Bath Towels']"));
		ef.click();
		
		
		 
		
		
		
		
		
		
		
	}

}
