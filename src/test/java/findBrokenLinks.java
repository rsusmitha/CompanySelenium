import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class findBrokenLinks {

	public static void main(String[] args) throws MalformedURLException, IOException {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
		
		//Added implicit wait from Selenium 4 as Selenium 3 implicitwait depracated. 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        
        driver.get("https://www.nfl.com/");
        List<WebElement> tags = driver.findElements(By.tagName("a"));
        
        tags.addAll(driver.findElements(By.tagName("img")));
        System.out.println("Total number of links and images = = >  " +tags.size());
        
        List<WebElement> activeLinksImages = new ArrayList<WebElement>();
        
        for(int i=0; i<tags.size(); i++) {
        	if(tags.get(i).getAttribute("href") != null &&(!(tags.get(i).getAttribute("href").contains("javascript")))) {
        		activeLinksImages.add(tags.get(i));
        		
        	}	
        }
        System.out.println("activeLinksImages = = > " + activeLinksImages.size());     
        
        for(int j=0; j<=activeLinksImages.size(); j++) {
        	System.out.println("HREF Links =>  "+activeLinksImages.get(j).getAttribute("href"));
        	HttpURLConnection connection = (HttpURLConnection) new URL(activeLinksImages.get(j).getAttribute("href")).openConnection();
        	connection.connect();
        	String resonseMsg = connection.getResponseMessage();
        	connection.disconnect();
        	System.out.println(activeLinksImages.get(j).getAttribute("href") + "- - - >" + resonseMsg);
        }
	}

}
