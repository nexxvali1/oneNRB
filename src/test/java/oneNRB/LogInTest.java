package oneNRB;

import org.testng.annotations.Test;
import reUsables.TestBase;
import pages.HomePage;

public class LogInTest extends TestBase {
	

	@Test
	public void test1(){
		
		HomePage home = new HomePage(getDriver());
		home.verifyTitle();
	}

}
