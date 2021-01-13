package org.day5;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Q6 {
  public static void main(String[] args) throws InterruptedException {
	
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.shopclues.com/wholesale.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//a[text()='Mobiles & More']")).click();
		WebElement btn = driver.findElement(By.xpath("//a[@href='//www.shopclues.com/mobiles-feature-phones.html?facet_brand[]=NOKIA&fsrc=facet_brand']"));
	//	btn.click();
		Actions A=new Actions(driver);
		A.moveToElement(btn).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//label[@for='Rs. 2000 and Above']")).click();
		
		
	  
	  
	  
	  
	  
	  
	  
	  
}
}
