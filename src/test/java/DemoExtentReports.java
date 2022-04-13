import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class DemoExtentReports {
	ExtentReports extentReport;
	@BeforeTest
	public void config() {
		
		//ExtentReports, ExtentSparksReporter
		String path = System.getProperty("user.dir")+ "/reports/index.html";
		ExtentSparkReporter spark = new ExtentSparkReporter(path);
		spark.config().setReportName("My Results");
		
		extentReport = new ExtentReports();
		extentReport.attachReporter(spark);
		extentReport.setSystemInfo("Tester", "Sush");
	}
	
	
	@Test
	public void Demo() {
		ExtentTest test = extentReport.createTest("My initial demo");
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/sushmita/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		extentReport.flush();
		driver.close();
		test.fail("Results do not match");
		
		}
	

}
