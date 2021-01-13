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

    public class Roobot1 {
	public static void main(String[] args) throws AWTException, InterruptedException {
     System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement txt = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		txt.sendKeys("VelMurugan");
		
		Actions a=new Actions(driver);
		a.doubleClick(txt).perform();
		
		
		Robot r=new Robot();
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_X);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_X);
		
		
		
		
		
		
	}

}
