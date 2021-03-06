package reUsables;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class TestBase {
	
	static String chromeDriver = "webdriver.chrome.driver";
	static String driverLocation = "/Users/Mukit/Documents/Selenium/chromedriver";
	static String geckoDriver = "webdriver.gecko.driver";
	static String geckoDriverLocation = "/Users/Mukit/Downloads/geckodriver";
	static String url = "https://nexxvali.com/";
	
	private WebDriver driver;
	
	@Parameters("browser")
	@BeforeClass
	public void testDriver(String browser) throws Exception{
		
		if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty(geckoDriver, geckoDriverLocation);
			driver = new FirefoxDriver();
		} else if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty(chromeDriver, driverLocation);
			driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get(url);
		Thread.sleep(5000);
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
