import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class practiceSeli {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]/input")).click();
		String opt=driver.findElement(By.xpath("//div[@id='checkbox-example']/fieldset/label[2]")).getText();	
        
        Select dropdwn = new Select(driver.findElement(By.xpath("//select[@id='dropdown-class-example']")));
        dropdwn.selectByVisibleText(opt);
        
        driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(opt);
        
        driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
        
        String popupTextMsg = driver.switchTo().alert().getText();
//        String[] msgs = popupTextMsg.split(" ")[1].split(","); 
//       
//        System.out.println(msgs[0]);
//        if(opt.equals(msgs[0])) {
//        	driver.switchTo().alert().accept();
//        }
        if(popupTextMsg.contains(opt)) {
        	driver.switchTo().alert().accept();
        }
   
	}

}
