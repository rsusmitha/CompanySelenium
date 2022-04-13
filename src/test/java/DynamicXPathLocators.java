import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamicXPathLocators {

	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        
        driver.get("https://ui.cogmento.com/");
        String title_1 = driver.getTitle();
		
		System.out.println("===> before driver-close title<===" + title_1);
        
        WebElement name = driver.findElement(By.name("email"));
        		name.sendKeys("srpali576@gmail.com");
		name.getAttribute("name");
		driver.findElement(By.name("password")).sendKeys("3477Sai123");
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		System.out.println("===> before driver-close <===");
		driver.quit();
		
		String title = driver.getTitle();
		
		System.out.println("===> after driver-close <===" + title);
		
		/*WebElement login_bton = driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		boolean buttonStatus = login_bton.isEnabled();
		System.out.println("button Status ====>" + buttonStatus);
		
		*/

		/*
		driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		
		Actions action = new Actions(driver);
		WebElement contactsLink = driver.findElement(By.xpath("//span[contains(text(),'Contacts')]"));
		action.moveToElement(contactsLink).build().perform();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[contains(@class,'ui mini basic icon button')]//preceding-sibling::a//span[contains(text(),'Deals')]")).click();
		//driver.findElement(By.xpath("//i[contains(@class,'plus inverted icon')]/parent::button//preceding-sibling::a//span[contains(text(),'Deals')]")).click();
//		 List <WebElement> plusSigns = driver.findElements(By.xpath("//div[@class ='menu-item-wrapper']//button[@class='ui mini basic icon button']"));
//		 plusSigns.get(1).click();
//		 
		 driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys("SushR");
		 driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys("Velu");
		 driver.findElement(By.xpath("//i[@class='save icon']")).click();
		
*/
		 
/*
		List<WebElement> divs = driver.findElements(By.xpath("//div[@class='menu-item-wrapper']"));
		for(WebElement objElements : divs) {
			System.out.println("divs are : " +objElements.getTagName());
			List<WebElement> childs_of_divs =  objElements.findElements(By.xpath("./descendant::*"));
			for(int i=1; i<childs_of_divs.size(); i++) {
				System.out.println("child of divs are : " +childs_of_divs.get(i).getText());
				if(childs_of_divs.get(i).getText() == "Contacts") {
					driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
					//driver.findElement(By.xpath("//span[contains(text(),'Contacts')]//i[@class='plus inverted icon']")).click();
				}
			}
		}		
//				
		*/
		
		
		
		
		
		//driver.findElement(By.xpath("//span[contains(text(),'Contacts')]")).click();
//				List <WebElement> plusSigns = driver.findElements(By.xpath("//i[@class='plus inverted icon']"));
				/*
				 * for(WebElement we : plusSigns) {
				 * driver.findElement(By.xpath("//i[@class='plus inverted icon']")).click();
				 * 
				 * }
				 */
				
//				List<WebElement> spanTags = driver.findElements(By.xpath("//span[contains(text(),'Contacts')]"));
//				String leftNavigationLinks = atag.getText();
				
			
		
		
		/*
		 * System.out.println("divs are : " + childs_of_divs.size());
		 * 
		 * for(int i=1; i<divs.size(); i++) {
		 * 
		 * //WebElement myElement = driver.findElement(By.id("myDiv")); //
		 * List<WebElement> childs_of_divs = divs.findElement(By.xpath(".//*"));
		 * System.out.println("childs_of_divs are : " +
		 * childs_of_divs.get(i).getTagName()); // WebElement childs =
		 * driver.findElement(By.xpath("//div[@class='menu-item-wrapper']/*")); //
		 * System.out.println("Children of divs === = > "+ childs_of_divs ) ; }
		 */
		
		/*
		 * for(int i=0; i<plusSigns.size();i++) {
		 * 
		 * }
		 */
		
//		Thread.sleep(5);
//		
//		if(contcts.isDisplayed()) {
//			contcts.findElement(By.xpath("//i[@class='plus inverted icon']")).click();
//		}
		//System.out.println(plussign);

		
//		driver.findElement(By.xpath("//a[contains(text(),'Contacts')]")).click();
        /*
         * driver.get("https://www.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		*/
        
		//handling Java script pop ups
	     /*	Alert popupAlert = driver.switchTo().alert();
			System.out.println(popupAlert.getText());
			popupAlert.accept();
			*/
			//popupAlert.dismiss();
		
		//file upload pop ups.. Instead clicking on the button upload, write sendKeys method and pass the file as an argument 
		
			//driver.findElement(By.xpath("input[type='upload']")).sendKeys("file path");
		

        // Dynamic Google search text selecting using xpath 
		
	        /* driver.findElement(By.name("q")).sendKeys("Java");
	
	        List<WebElement> list = driver.findElements(By.xpath("//ul[@role ='listbox']//li/descendent::div[@class='sbl1']"));
	        System.out.println("Total no of suggestions in search box::" +list.size());
	
	        for(int i=0; i<list.size();i++) {
	            System.out.println(list.get(i));
	
	            if(list.get(i).getText().contains("Java Tutorial")) {
	                list.get(i).click();
	                break;
	            }
	        }
	        */
		
	
		
		
	}
}


