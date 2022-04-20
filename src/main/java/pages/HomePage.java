package pages;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.openqa.selenium.By;
import reUsables.BasePage;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
        super(driver);
    }

	By contactUs = By.xpath(
			"//*[@id='post-6']/div/div/section[1]/div[3]/div/div/section/div/div[1]/div/div/div/div/a/span/span");

	public void clickOnContactUsBtn() {

		driver.findElement(contactUs).click();
	}

	public void verifyTitle() {
		Assert.assertEquals(driver.getTitle(), "Nexxvali – QA Consultancy Services");

	}
	
}