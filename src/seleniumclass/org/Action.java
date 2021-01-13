package seleniumclass.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("http://demo.guru99.com/test/drag_drop.html");
			driver.manage().window().maximize();
			
		//WebElement src = driver.findElement(By.xpath("//li[@id='credit2']"));
		WebElement des = driver.findElement(By.xpath("(//li[@id='fourth'])[1]"));
		
		Actions a=new Actions(driver);
		//a.dragAndDrop(src, des);
		
		
		
		
		
		
		
	}

	}


