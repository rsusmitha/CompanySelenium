import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
	
public class WebLinksinYahoo {
	
	private static final String DRIVER_PATH = "/Users/srakapali/sushmita/chromedriver";
	static {
		System.setProperty("webdriver.chrome.driver", DRIVER_PATH);
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = null;
		//WebElement headerDriver = null;
		try {
			WebLinksinYahoo objWebLinksinYahoo = new WebLinksinYahoo();
			driver = objWebLinksinYahoo.initDriver("https://www.yahoo.com/");
			List<WebElement> elements = objWebLinksinYahoo.findWebLinks( "headerDriver", driver );
			objWebLinksinYahoo.print(elements);
	
		}catch( Exception e ) {
			e.printStackTrace();
			// logger.error( "Exception in WebLinksinYahoo " + e );
		} finally {
			driver.close();
			}	
	}

	private WebDriver initDriver( String URL ) {
		if( URL == null ) 
			throw new IllegalArgumentException("URL is null");
		WebDriver driver = new ChromeDriver();
		driver.get( URL);
		return driver;
	}
	
	private List<WebElement> findWebLinks( String elementId, WebDriver driver ) {
		WebElement headerDriver = driver.findElement(By.xpath("//*[contains(@id, 'header')]/ul"));
		java.util.List<WebElement> links = headerDriver.findElements(By.tagName("a"));
		return links;
	}
	
	private void print( List<WebElement> elements ) {
		Iterator<WebElement> iterater = elements.iterator();
		String url = null;
		while (iterater.hasNext()) {
			url = iterater.next().getAttribute("href");
			System.out.println(url);
		}
	}
}
