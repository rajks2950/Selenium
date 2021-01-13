package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/ref=nav_logo");
		driver.manage().window().maximize();
		
		WebElement click = driver.findElement(By.xpath("(//div[@class='layoutToolbarPadding']//child::a)[2]"));
		
		click.click();
		
	     driver.findElement(By.id("ap_email")).sendKeys("Rajkumar");
		//enter.sendKeys("Rajkumar");
		Thread.sleep(30000);
		 driver.findElement(By.id("continue")).click();
		 
		 
		 
		//count.click();
		 
		 
	Thread.sleep(30000);
		
		
	}

}
