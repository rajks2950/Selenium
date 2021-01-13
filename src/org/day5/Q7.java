package org.day5;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Q7 {

	public static void main(String[] args) throws InterruptedException, AWTException {
	       System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			
			driver.get(" http://greenstech.in/selenium-course-content.html");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			WebElement btn = driver.findElement(By.xpath("//h2[@class='title mb-0 center']"));
            btn.click();
            Actions action=new Actions(driver);
            Thread.sleep(1000);
            action.moveToElement(driver.findElement(By.xpath("//a[@href='http://greenstech.in/interview-questions/cts.pdf#toolbar=0']"))).perform();
            action.contextClick().perform();
           
            Robot a=new Robot();
            for (int i = 0; i <2; i++) {
            	
				a.keyPress(KeyEvent.VK_DOWN);
				a.keyRelease(KeyEvent.VK_DOWN);
				
			}
            a.keyPress(KeyEvent.VK_ENTER);
            a.keyRelease(KeyEvent.VK_ENTER);
	}

}
