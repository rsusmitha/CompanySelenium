import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HandleCalender {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		System.setProperty("webdriver.driver.chrome", "/Users/srakapali/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver =new ChromeDriver(options);

 		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
 		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://www.redbus.in/");

		driver.findElement(By.cssSelector("#onward_cal")).click();
		
		String monthYear = "Feb 2022";
		String day = "28";
		
		
		while(true) {
			String dateTextOnCal = driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[1]/td[2]")).getText();
			if(dateTextOnCal.equals(monthYear)) {
					break;
			}
			else {
				driver.findElement(By.xpath("/html/body/div[5]/table/tbody/tr[1]/td[3]/button")).click();
			}
			
		}
		String beforeXpath = "//tbody/tr[";
		String afterXpath = "]/td[";
		
		final int totalWeekDays = 7;
		boolean flag = false;
		String dayVal = null;
		
		for(int rowNum=3; rowNum<=7; rowNum++){
			
			for(int colNum = 1; colNum<=totalWeekDays; colNum++){
				try{
			    dayVal =driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).getText();
				}catch (org.openqa.selenium.NoSuchElementException e){
					System.out.println("Please enter a correct date value");
					flag = false;
					break;
				}
				System.out.println(dayVal);
				if(dayVal.equals(day)){
					driver.findElement(By.xpath(beforeXpath+rowNum+afterXpath+colNum+"]")).click();
					flag = true;
					break;
				}				
			}
			if(flag){
				break;
			}
			
		}
		

	}
	
}
