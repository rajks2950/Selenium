package seleniumclass.org;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Mouse {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://www.shopclues.com/");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//a[@href='javascript:void(0);'])[21]")).click();
		WebElement element = driver.findElement(By.id("nav_44"));
		
		Actions a=new Actions(driver);
		a.moveToElement(element);
	}
}
