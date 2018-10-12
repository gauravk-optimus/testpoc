package com.uwp.testscripts;

import java.io.IOException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.uwp.locators.Locators;
import com.uwp.service.Keywords;
import com.uwp.service.UtilityService;
import com.uwp.utils.AssertionConstants;
import com.uwp.utils.BaseTest;

public class TestClass extends BaseTest{
	static DesiredCapabilities capabilities;
	private static Logger log;	
	public TestClass() throws IOException {
		log = LoggerFactory.getLogger(TestClass.class);		
	}	

	@BeforeMethod
	public static void launchApp() {
		try {
			capabilities = UtilityService.setAppCapabilities();
			driver = UtilityService.createWindowsDriverSession(capabilities);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	@AfterMethod
	public static void quitApp() {
		if (driver != null) {
			driver.quit();
		}
		driver = null;
	}

	@Test(description = "To verify addition", priority = 1, enabled = true, alwaysRun = true)
	public void Addition() {
		log.info("Addition Test Case");
		Keywords.clickByName(Locators.ONE_KEY);
		Keywords.clickByName(Locators.PLUS_KEY);
		Keywords.clickByName(Locators.SEVEN_KEY);
		Keywords.clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify Combination", priority = 1, enabled = true, alwaysRun = true)
	public void Combination() {
		Keywords.clickByName(Locators.SEVEN_KEY);
		Keywords.clickByName(Locators.MULTIPLY_KEY);
		Keywords.clickByName(Locators.NINE_KEY);
		Keywords.clickByName(Locators.PLUS_KEY);
		Keywords.clickByName(Locators.ONE_KEY);
		Keywords.clickByName(Locators.EQUALS_KEY);
		Keywords.clickByName(Locators.DIVIDE_KEY);
		Keywords.clickByName(Locators.EIGHT_KEY);
		Keywords.clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify division", priority = 1, enabled = true, alwaysRun = true)
	public void Division() {
		Keywords.clickByName(Locators.EIGHT_KEY);
		Keywords.clickByName(Locators.EIGHT_KEY);
		Keywords.clickByName(Locators.DIVIDE_KEY);
		Keywords.clickByName(Locators.ONE_KEY);
		Keywords.clickByName(Locators.ONE_KEY);
		Keywords.clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify multiplication", priority = 1, enabled = true, alwaysRun = true)
	public void Multiplication() {
		Keywords.clickByName(Locators.NINE_KEY);
		Keywords.clickByName(Locators.MULTIPLY_KEY);
		Keywords.clickByName(Locators.NINE_KEY);
		Keywords.clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEightyOne, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify subtraction", priority = 1, enabled = true, alwaysRun = true)
	public void Subtraction() {
		Keywords.clickByName(Locators.NINE_KEY);
		Keywords.clickByName(Locators.MINUS_KEY);
		Keywords.clickByName(Locators.ONE_KEY);
		Keywords.clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}
}