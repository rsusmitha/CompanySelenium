
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class streamsExamples {

	public static void main(String[] args) {
		
		//get unique numbers from array and convert to list and print them in sorted order
			/*
			 List<Integer> lits =  Stream.of(5,3,3,1,4,6,7,8,0,9,1,9).collect(Collectors.toList());
			 List<Integer> lsr = lits.stream().distinct().sorted().collect(Collectors.toList());
			 lsr.forEach(s->System.out.println(s));
			*/
		//set whole column names in sorted order
			System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
			WebDriver driver = new ChromeDriver();
	
			driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");		
			driver.findElement(By.xpath("//tr/th[1]")).click();
			List<WebElement> names = driver.findElements(By.xpath("//tr/td[1]"));
			List<String> original_names = names.stream().map(s->s.getText()).collect(Collectors.toList());
			List<String> sorted_names = original_names.stream().sorted().collect(Collectors.toList());
			
			Assert.assertTrue(original_names.equals(sorted_names));
			
		//From the table - get all the veggie names and get beans and price for beans only. 
			List<String> list_price;
			do{
				List<WebElement> rows = driver.findElements(By.xpath("//tr/td[1]"));
				list_price = rows.stream().filter(s->s.getText().equals("Rice")).map(s->getPriceValue(s)).collect(Collectors.toList());
				list_price.forEach(s->System.out.println(s));
				System.out.println("list_price -- > > > "+list_price.size());
				if(list_price.size()<1) {
					driver.findElement(By.cssSelector("[aria-label='Next']")).click();	
				}
			}while(list_price.size()<1);
			

	}

	private static String getPriceValue(WebElement s) {
		String price = s.findElement(By.xpath("following-sibling::td[1]")).getText();
		return price;
	}
	

}
