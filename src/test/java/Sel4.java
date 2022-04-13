import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sel4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		WebElement nameTextbox = driver.findElement(By.cssSelector("[name='name']"));
		driver.switchTo().newWindow(WindowType.TAB);
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parent_window = it.next();
		String child_window = it.next();
		driver.switchTo().window(child_window);
		driver.get("https://rahulshettyacademy.com/");
		List<WebElement> courses = driver.findElements(By.cssSelector("[href*='https://courses.rahulshettyacademy.com/p']"));
		String coursename = courses.get(1).getText();
		driver.switchTo().window(parent_window);
		nameTextbox.sendKeys(coursename);
		
		
		
		
		
		
		

	}

}
