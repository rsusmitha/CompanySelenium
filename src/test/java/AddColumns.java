import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddColumns {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,600)");
		
		WebElement table = driver.findElement(By.id("product"));
		System.out.println(table.findElements(By.tagName("tr")).size());
		System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> sec_row_data = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName("td"));
		System.out.println( sec_row_data.get(0).getText());
		System.out.println(sec_row_data.get(1).getText());
		System.out.println(sec_row_data.get(2).getText());
		
		/*List<WebElement> rows = driver.findElements(By.cssSelector(".table-display tr"));
		int no_of_rows = rows.size();
		System.out.println("no_of_rows" + no_of_rows);
		
		List<WebElement> cols = driver.findElements(By.cssSelector(".table-display tr th"));
		int no_of_cols = cols.size();
		System.out.println("no_of_cols" + no_of_cols);
		
		
		
		List<WebElement> second_rowContent = driver.findElements(By.cssSelector(".table-display tr:nth-child(3)"));
		
		int second_rowData = second_rowContent.size();
		System.out.println("second_rowData" + second_rowData);
		
		for(int i=0;i<second_rowData;i++ ) {	
			String row_sec_data = second_rowContent.get(i).getText();		
			System.out.println("row_sec_data== >" + row_sec_data );	
		}
		*/
	}
}
/*
 * WebElement table=driver.findElement(By.id("product"));
 * System.out.println(table.findElements(By.tagName("tr")).size());
 * System.out.println(table.findElements(By.tagName("tr")).get(0).findElements(
 * By.tagName("th")).size()); List<WebElement>
 * secondrow=table.findElements(By.tagName("tr")).get(2).findElements(By.tagName
 * ("td")); System.out.println(secondrow.get(0).getText());
 * System.out.println(secondrow.get(1).getText());
 * System.out.println(secondrow.get(2).getText());
 */









