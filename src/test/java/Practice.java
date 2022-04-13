import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/angularpractice/");
		driver.findElement(By.cssSelector("input[name='name']")).sendKeys("Sushmita");
		
		driver.findElement(By.cssSelector("input[name='email']")).sendKeys("Sush@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("password");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		Select gender = new Select(driver.findElement(By.id("exampleFormControlSelect1")));
		gender.selectByIndex(1);
		
		driver.findElement(By.cssSelector("input[value='option1']")).click();
		
		driver.findElement(By.cssSelector("input[name='bday']")).sendKeys("01/01/2022");
		
		driver.findElement(By.cssSelector("input[value='Submit']")).click();
	}

}
