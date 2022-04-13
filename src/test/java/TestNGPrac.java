
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
public class TestNGPrac {
	WebDriver driver;	
	@Test
	public void ChromeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		driver = new ChromeDriver();
		driver.get("https://demoqa.com/");
		WebElement firstElement = driver.findElement(By.xpath("//div[@class='category-cards']/div[4]"));
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", firstElement);	
	}
	@Test
	public void FirefoxTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "/Users/srakapali/Documents/selenium prep/geckodriver");
		driver = new FirefoxDriver();
		driver.get("https://demoqa.com/");
		WebElement firstElement = driver.findElement(By.xpath("//div[@class='category-cards']/div[1]"));	
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", firstElement);	
		
	}

}
