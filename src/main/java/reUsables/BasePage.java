package reUsables;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class BasePage {

	static String ssLocation = "/Users/Mukit/Documents/workspace/nexxvali/screenShots/TestNexx.jpeg";

	protected WebDriver driver;

	public BasePage(WebDriver driver) {
		this.driver = driver;
	}

	public void ifTestFailes() {
		TakesScreenshot ss = (TakesScreenshot) driver;

		try {
			FileUtils.copyFile(ss.getScreenshotAs(OutputType.FILE), new File(ssLocation));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
