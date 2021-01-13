package seleniumclass.org;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class BrokensLinkes {
public static void main(String[] args) throws IOException {
		

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rajks\\eclipse-workspace\\selenium\\driver1\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//img broken and links  brokens allshow same 
		List<WebElement> findElements = driver.findElements(By.tagName("a"));
		
	for (int i = 0; i < findElements.size(); i++) {
		
		WebElement element = findElements.get(i);
		
		String links = element.getAttribute("href");
		if (links!=null) {
			
			URL url=new URL(links);
			
			
			
			
			URLConnection openconnection = url.openConnection();
			
			HttpsURLConnection connection=(HttpsURLConnection) openconnection;
			
			int responseCode = connection.getResponseCode();
			
			if (responseCode!=200) {
				
				
				System.out.println(links);
			}
			
			
			
		}
		
		
		
	}
		
		
		}
		
}		
			
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


