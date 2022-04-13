import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropDownLocation {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://sfbay.craigslist.org/d/bicycles/search/eby/bia");
//        WebElement ele = driver.findElement(By.xpath("//*[@id='areaAbb']"));
//        
//        Select location = new Select(ele);
//        location.selectByVisibleText("sacramento");
        
        driver.findElement(By.xpath("//div[@data-attr='nh']//div")).click();
        
        List<WebElement> neighbourhood = driver.findElements(By.xpath("//div[@data-attr='nh']//ul//li"));
        System.out.println(neighbourhood.size());      
        
        for(int i=0; i<neighbourhood.size(); i++) {
        	System.out.println(neighbourhood.get(i).getText());
        	if(neighbourhood.get(i).getText().contains("pleasanton")) {
        		neighbourhood.get(i).click();
        		
        	}
        	if(true) {
        	//neighbourhood.get(7).click();
        	neighbourhood.get(i).getText().contains("deselect all");
        	neighbourhood.get(i).click();
        	break;
        	}
        		
        }

	}

}
