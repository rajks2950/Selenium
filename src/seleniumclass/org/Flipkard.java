package seleniumclass.org;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class Flipkard {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']"));
           if (element.isEnabled()) {
			
			element.click();
			
			driver.findElement(By.name("q")).sendKeys("tv");
			
			driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
			
			
		}
		
		else {
			driver.findElement(By.name("q")).sendKeys("phone");
			
				}
			
		
		
		
		
	}

}
