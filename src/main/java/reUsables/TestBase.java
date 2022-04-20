package reUsables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestBase {
	
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String geckoDriver = "webdriver.gecko.driver";
	static String geckoDriverLocation = "/Users/Mukit/Downloads/geckodriver";
	static String url = "https://nexxvali.com/";
	
	private WebDriver driver;
	
	@BeforeClass
	public void testDriver(){
		
		System.setProperty(chromeDriver, driverLocation);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);
	}

	@AfterTest
	public void closeBrowser(){

		 driver.close();
         driver.quit();
	}
	
	public WebDriver getDriver() {
        return driver;
    }
}
