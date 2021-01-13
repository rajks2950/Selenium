package org.day5;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
	
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			WebElement men = driver.findElement(By.xpath("//span[text()='Men']"));
         
         Actions action=new Actions(driver);
         
         action.moveToElement(men).perform();
         Thread.sleep(3000);
         driver.findElement(By.xpath("//a[@title='Jackets']")).click();
         driver.findElement(By.xpath("(//img[@class=\"_2r_T1I\"])[1]")).click();
        
         Thread.sleep(3000);
         Set<String> windowHandles = driver.getWindowHandles();
         ArrayList<String> l = new ArrayList<String>(windowHandles);
         String id = l.get(1);
         driver.switchTo().window(id);
         String text = driver.findElement(By.xpath("//div[@class=\"_30jeq3 _16Jk6d\"]")).getText();
         System.out.println(text);
//         
         
	}

}
