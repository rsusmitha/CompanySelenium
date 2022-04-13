import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionAssignement {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		Actions actions = new Actions(driver);
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("pet");
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(3000);
		actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).sendKeys(Keys.ENTER).build().perform();
		

	}

}
