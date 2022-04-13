import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestAutoSuggest {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/eclipse-workspace/Introduction/chromedriver");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		String textToSelect = "selenium webdriver";
		
		driver.get("https://www.google.com/");
		
	    driver.findElement(By.name("q")).sendKeys("selenium");

	    List<WebElement> optionsToSelect = driver.findElements(By.xpath("//ul[@role='listbox']//li/descendant::div[@class='sbl1']"));
	    System.out.println("<<<>>>>> " + optionsToSelect.size());
	   
	    	for(WebElement option : optionsToSelect){
	            //System.out.println("list options are >>>>" + option.getText());
	            if(option.getText().equals(textToSelect)) {
	            	Thread.sleep(2000);
	                System.out.println("Trying to select: "+textToSelect);
	                    option.click();
	                    break;
	            }
	        }
		
		//driver.close();
	}
}
























