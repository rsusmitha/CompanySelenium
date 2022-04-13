import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;



public class Assignment {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		driver.findElement(By.cssSelector("input#username")).sendKeys("rahulshettyacademy");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("learning");
		
		driver.findElement(By.xpath("(//span[@class='checkmark'])[2]")).click();
		
		WebDriverWait ew = new WebDriverWait(driver, Duration.ofMillis(3000));
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.id("okayBtn")));
		
		driver.findElement(By.id("okayBtn")).click();
		
		Select dropdown = new Select(driver.findElement(By.cssSelector("select[class='form-control']")));
		List<WebElement> list= dropdown.getOptions();
		for(WebElement s : list) {
			System.out.println(s.getText());
			if(s.getText().equals("Consultant") ){
				s.click();
					
			}
		}
		
		driver.findElement(By.id("signInBtn")).click();
		
		
		ew.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Checkout")));
		
		List<WebElement> add_btns= driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		for(int i=0; i<add_btns.size(); i++) {
			add_btns.get(i).click();
		}
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
		
	}

}
























