import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WindowHandles {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		
		//WindowHandles
		//driver.findElement(By.cssSelector("a[href='/windows']")).click();
		
		/*
		 * driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
		 * 
		 * Set<String> window_ids = driver.getWindowHandles();
		 * 
		 * Iterator<String> iterator = window_ids.iterator(); String parentID =
		 * iterator.next();
		 * 
		 * String childID = iterator.next();
		 * 
		 * driver.switchTo().window(childID); System.out.println(driver.findElement(By.
		 * cssSelector("div[class='example'] h3")).getText());
		 * 
		 * driver.switchTo().window(parentID); System.out.println(driver.findElement(By.
		 * cssSelector("div[class='example'] h3")).getText()); Actions a = new
		 * Actions(driver); a.
		 */
		
		//frames
		
		driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
		
		System.out.println(driver.findElements(By.tagName("frame")).size());
		
		driver.switchTo().frame("frame-top");
		driver.switchTo().frame("frame-middle");
		
		System.out.println(driver.findElement(By.cssSelector("div[id='content']")).getText());
		
		
		/*
		 * driver.switchTo().frame(0);
		 * System.out.println(driver.findElements(By.tagName("frame")).size());
		 * 
		 * System.out.println(driver.switchTo().frame(1));
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(
		 * "frame[src='/frame_middle']")).getText());
		 * 
		 * 
		 */
		
		
		//driver.switchTo().frame(driver.findElement(By.cssSelector("frame[src='/frame_middle']"))).getTitle();
		
		
		
	}

}
