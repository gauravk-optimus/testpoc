package com.uwp.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
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
	
	// Locators
	private By ONE_KEY = By.name("One"); 
	private By SEVEN_KEY = By.name("Seven");
	private By EIGHT_KEY = By.name("Eight");	
	private By NINE_KEY = By.name("Nine");
	private By PLUS_KEY = By.name("Plus");
	private By MINUS_KEY = By.name("Minus");
	private By MULTIPLY_KEY = By.name("Multiply by");	
	private By DIVIDE_KEY = By.name("Divide by");
	private By EQUALS_KEY = By.name("Equals");	
	private By RESULT = By.name("CalculatorResults");
	
	static DesiredCapabilities capabilities;
	private static Logger log;	
	public TestClass() throws IOException {
		log = LoggerFactory.getLogger(TestClass.class);		
	}	

	@BeforeMethod
	public static void launchApp() {
		try {System.out.println("A");
			capabilities = UtilityService.setAppCapabilities();
			System.out.println("B");
			driver = UtilityService.createWindowsDriverSession(capabilities);
			System.out.println("C");
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
//		Keywords.getInstance().clickByName(Locators.ONE_KEY);
		driver.findElement(ONE_KEY).click();
		Keywords.getInstance().clickByName(Locators.PLUS_KEY);
		Keywords.getInstance().clickByName(Locators.SEVEN_KEY);
		Keywords.getInstance().clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify Combination", priority = 1, enabled = true, alwaysRun = true)
	public void Combination() {
		Keywords.getInstance().clickByName(Locators.SEVEN_KEY);
		Keywords.getInstance().clickByName(Locators.MULTIPLY_KEY);
		Keywords.getInstance().clickByName(Locators.NINE_KEY);
		Keywords.getInstance().clickByName(Locators.PLUS_KEY);
		Keywords.getInstance().clickByName(Locators.ONE_KEY);
		Keywords.getInstance().clickByName(Locators.EQUALS_KEY);
		Keywords.getInstance().clickByName(Locators.DIVIDE_KEY);
		Keywords.getInstance().clickByName(Locators.EIGHT_KEY);
		Keywords.getInstance().clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify division", priority = 1, enabled = true, alwaysRun = true)
	public void Division() {
		Keywords.getInstance().clickByName(Locators.EIGHT_KEY);
		Keywords.getInstance().clickByName(Locators.EIGHT_KEY);
		Keywords.getInstance().clickByName(Locators.DIVIDE_KEY);
		Keywords.getInstance().clickByName(Locators.ONE_KEY);
		Keywords.getInstance().clickByName(Locators.ONE_KEY);
		Keywords.getInstance().clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify multiplication", priority = 1, enabled = true, alwaysRun = true)
	public void Multiplication() {
		Keywords.getInstance().clickByName(Locators.NINE_KEY);
		Keywords.getInstance().clickByName(Locators.MULTIPLY_KEY);
		Keywords.getInstance().clickByName(Locators.NINE_KEY);
		Keywords.getInstance().clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEightyOne, Keywords.getTextById(Locators.RESULT));
	}

	@Test(description = "To verify subtraction", priority = 1, enabled = true, alwaysRun = true)
	public void Subtraction() {
		Keywords.getInstance().clickByName(Locators.NINE_KEY);
		Keywords.getInstance().clickByName(Locators.MINUS_KEY);
		Keywords.getInstance().clickByName(Locators.ONE_KEY);
		Keywords.getInstance().clickByName(Locators.EQUALS_KEY);
		Assert.assertEquals(AssertionConstants.CalcResultEight, Keywords.getTextById(Locators.RESULT));
	}
}