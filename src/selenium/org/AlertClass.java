package selenium.org;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("http://demo.automationtesting.in/Alerts.html");
	    
	    	//WebElement txtBox = driver.findElement(By.xpath("//input[@type='email']"));
	    	
	    	//txtBox.sendKeys("rajks.@gmail.com");
	    	
	    	////WebElement passBox = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
	    	//passBox.sendKeys("raj975");
	    	
	    	//WebElement btn = driver.findElement(By.xpath("//input[@value='Log In']"));
	    	
	    	//btn.click();
	       // Actions act=new Actions(driver);
	    
	    //// // WebElement courses = driver.findElement(By.xpath("//div[@title='Courses']"));
	      //WebElement software = driver.findElement(By.xpath("//span[test()='Software Testing (12)']"));
	   //   WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certifiction Training']"));
	      
	      
	     // act.moveToElement(courses).perform();
	      
	     // act.moveToElement(software).perform();
	     
	      ////selenium.click();
	    
	    //  driver.quit();
	    
	    
	   // WebElement simple = driver.findElement(By.xpath("//a[taxt()='Alert with OK ']"));
	   // simple.click();
	   // Thread.sleep(4000);
	   // WebElement btn = driver.findElement(By.xpath("//button[@onclick='alertbox']"));
	   // btn.click();
	    
	    //Thread.sleep(4000);
	    
	    WebElement Simple = driver.findElement(By.xpath("//a[taxt()='Alert with Textbox']"));
	    Simple.click();
	    Thread.sleep(4000);
	    WebElement Btn = driver.findElement(By.xpath("//button[@onclick='promptbox']"));
	    
	    Btn.click();
	    
	    Thread.sleep(4000);
	     
	    Alert a=driver.switchTo().alert();
	    
	    a.accept();
	    
		
		
		

	}

}
