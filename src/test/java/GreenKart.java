import java.util.Arrays;
import java.util.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class GreenKart {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		
		String[] itemsneeded = {"Brocolli", "Cauliflower", "Cucumber","Carrot", "Tomato", "Walnuts"};
		addItems(driver, itemsneeded);
	
	}
	public static void addItems(WebDriver driver, String[] itemsneeded ) throws InterruptedException {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0; i<products.size(); i++) {
			String[] names = products.get(i).getText().split("-");
			String formattedname  = names[0].trim();
			//System.out.println("names of the products  " + names);
			
			List<String> neededitemslist = Arrays.asList(itemsneeded);
			int j=0;
			if(neededitemslist.contains(formattedname)) {
				j++;
				
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsneeded.length)
					break;
				
			}
			
		}
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		driver.findElement(By.xpath("//div[@class='promoWrapper']/input")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		
		
		
		/*WebDriverWait w = new WebDriverWait(driver, 5);
		//(driver, 5)
		w.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Code applied ..!']")));
		
		String promoappliedtext = driver.findElement(By.xpath("//span[text()='Code applied ..!']")).getText();
		System.out.print(promoappliedtext);
		
		Assert.assertEquals(promoappliedtext, "Code applied ..!");
		
		driver.findElement(By.xpath("//button[text()='Place Order']")).click();
		
		WebElement wecountry = driver.findElement(By.cssSelector("div[class='wrapperTwo'] div select"));
		wecountry.click();
		
		
		Select countries = new Select(wecountry);
		
		countries.selectByVisibleText("United States");
		
		driver.findElement(By.cssSelector("input[type='checkbox']")).click();
		
		driver.findElement(By.xpath("//button[text()='Proceed']")).click();
		
		*/

		
		
		
		
	}

}
