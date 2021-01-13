package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1Class {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
	
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone12");
	
	driver.findElement(By.xpath("(//*[@class='nav-input'])[2]")).click();
	
	Thread.sleep(30000);
	}
	
	
	

}
