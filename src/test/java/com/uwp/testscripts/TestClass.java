package com.uwp.testscripts;

import io.qameta.allure.Description;
import java.io.IOException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.uwp.screen.TestScreen;
import com.uwp.service.UtilityService;
import com.uwp.utils.AssertionConstants;
import com.uwp.utils.BaseTest;
import com.uwp.utils.ErrorConstants;

/**
 * This Class contains all the test cases for 'TestScreen' Screen
 * 
 * @author Optimus
 *
 */
public class TestClass extends BaseTest {

	TestScreen testScreen = new TestScreen();
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
			log.info("Application is launched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod
	public static void quitApp() {
		if (driver != null) {
			driver.quit();
		}
		driver = null;
		log.info("Application is closed");
		log.info("-------------------------------------------");
	}
	
	@Description("This test case verify addition of two operands")
	@Test(description = "To verify addition", priority = 1, enabled = true, alwaysRun = true)
	public void Addition() {
		log.info(executing + "Addition");
		testScreen.clickOne();
		testScreen.clickPlus();
		testScreen.clickSeven();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInAddition);
		log.info(onTestPass);
	}

	@Description("This test case verify Combination of three operators and four operands")
	@Test(description = "To verify Combination", priority = 1, enabled = true, alwaysRun = true)
	public void Combination() {
		log.info(executing + "Combination");
		testScreen.clickSeven();
		testScreen.clickMultiply();
		testScreen.clickNine();
		testScreen.clickPlus();
		testScreen.clickOne();
		testScreen.clickEquals();
		testScreen.clickDivide();
		testScreen.clickEight();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInCombination);
		log.info(onTestPass);
	}

	@Description("This test case verify division of two operands")
	@Test(description = "To verify division", priority = 1, enabled = true, alwaysRun = true)
	public void Division() {
		log.info(executing + "Division");
		testScreen.clickEight();
		testScreen.clickEight();
		testScreen.clickDivide();
		testScreen.clickOne();
		testScreen.clickOne();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInDivision);
		log.info(onTestPass);
	}

	@Description("This test case verify multiplication of two operands")
	@Test(description = "To verify multiplication", priority = 1, enabled = true, alwaysRun = true)
	public void Multiplication() {
		log.info(executing + "Multiplication");
		testScreen.clickNine();
		testScreen.clickMultiply();
		testScreen.clickNine();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEightyOne, ErrorConstants.ErrorInMultiplication);
		log.info(onTestPass);
	}
	
	@Description("This test case verify subtraction of two operands")
	@Test(description = "To verify subtraction", priority = 1, enabled = true, alwaysRun = true)
	public void Subtraction() {
		log.info(executing + "Subtraction");
		testScreen.clickNine();
		testScreen.clickMinus();
		testScreen.clickOne();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInSubtraction);
		log.info(onTestPass);
	}
}