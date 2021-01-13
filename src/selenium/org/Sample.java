package selenium.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
      driver.manage().window().maximize();
	    
       WebElement txtBox = driver.findElement(By.xpath("//*[@id='email']"));
    	
    	txtBox.sendKeys("rajks.@gmail.com");
    	
    	WebElement passBox = driver.findElement(By.xpath("(//div//child::input)[4]"));
    	passBox.sendKeys("raj975");
    	
    	WebElement btn = driver.findElement(By.xpath("//div//child::button"));
    	
    	btn.click();
	    
	    
    	Thread.sleep(4000);
	
	
}
}
