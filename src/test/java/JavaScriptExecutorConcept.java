import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptExecutorConcept {
	
	public static void main(String[] args) throws InterruptedException, IOException {
		
		System.setProperty("webdriver.chrome.driver", "/Users/srakapali/eclipse-workspace/Selenium/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().window().maximize();
        /*driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
         * /*
         */
        
        driver.get("https://ui.cogmento.com/");
        
        driver.findElement(By.name("email")).sendKeys("srpali576@gmail.com");
		driver.findElement(By.name("password")).sendKeys("3477Sai123");
		
		/*
		//driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//div[contains(@class, 'submit')]"));
		
		//1. Highlight an Element using JS executor
		flash(loginBtn, driver);
		
		//2. DrawBorder around an Element 
		drawBorderElement(loginBtn, driver);
		
		//take screenshot:
		// Take screenshot and store as a file format
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		// now copy the screenshot to desired location using copyFile //method
		FileUtils.copyFile(src, new File("/Users/srakapali/eclipse-workspace/Selenium/screenshots.png"));
				
		//3. Generate custom Alert during Test Execution  and accept alert by clicking on OK
		generateAlert(driver, "There is an issue with login button on Login Page");
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		//   4. Click on an Element by using JaveScript 
		clickElementByJS(loginBtn, driver);
		Thread.sleep(2000);
		
		//    5. Refresh browser by using JavaScript 
		refreshBrowserByJS(driver);
		
	    //6. Get Title by using JavaScript 
		getTitleByJS(driver);
		
		//    7. Get InnerText of page by using JavaScript 
		getPageInnerText(driver);
		
		//8. Scroll Page Down
		scrollPageDown(driver);
		
		//Scroll Into View (scroll to the page until that element is visible)
		WebElement element = driver.findElement(By.xpath("//div[contains(text(),'Exchange Rates')]"));
		scrollIntoView(element, driver);
	}
	
	
	
	
	public static void flash(WebElement element, WebDriver driver) {
        JavascriptExecutor js = ((JavascriptExecutor) driver);
        String bgcolor  = element.getCssValue("backgroundColor");
        for (int i = 0; i <  10; i++) {
            changeColor("rgb(0,200,0)", element,driver);//1
            changeColor(bgcolor, element,driver);//2
        }
    }
    public static void changeColor(String color, WebElement element, WebDriver driver) {
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("arguments[0].style.backgroundColor = '"+color+"'",  element);

        try {
            Thread.sleep(20);
        }  catch (InterruptedException e) {
        }
     }
    
    public static void drawBorderElement(WebElement element, WebDriver driver) {
    	JavascriptExecutor js = (JavascriptExecutor) driver;
    	js.executeScript("arguments[0].style.border = '3px solid red'", element);
    	
    }
    public static void generateAlert(WebDriver driver, String message){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("alert('"+message+"')");

    }
    public static void clickElementByJS(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].click();", element);
    }
    public static void refreshBrowserByJS(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("history.go(0)");
    }
    public static String getTitleByJS(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String title = js.executeScript("return document.title;").toString();
    	return title;
    }
    
    public static String getPageInnerText(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	String pageText = js.executeScript("return document.documentElement.innerText;").toString();
    	return pageText;
    }
    
    public static void scrollPageDown(WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
    }
    
    public static void scrollIntoView(WebElement element, WebDriver driver){
    	JavascriptExecutor js = ((JavascriptExecutor) driver);
    	js.executeScript("arguments[0].scrollIntoView(true);", element);
    }
    
    */
	}   
}


