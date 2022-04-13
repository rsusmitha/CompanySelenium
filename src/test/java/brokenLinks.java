import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class brokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		List<WebElement> links =  driver.findElements(By.cssSelector(".gf-li a"));
		
		SoftAssert a = new SoftAssert();
		
		for(WebElement link: links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn  = (HttpURLConnection)new URL(url).openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			
			int resp_code = conn.getResponseCode();
			System.out.println(resp_code);
			a.assertTrue(resp_code <400, link.getText() + resp_code);
			/*
			 * if(resp_code >400) { System.out.println(link.getText() + resp_code);
			 * Assert.assertTrue(true);
			 * 
			 * }
			 */	
		}
		a.assertAll();
	}

}
