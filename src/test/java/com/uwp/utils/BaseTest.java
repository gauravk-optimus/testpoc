package com.uwp.utils;

import java.io.IOException;

import io.appium.java_client.windows.WindowsDriver;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.uwp.service.UtilityService;
import com.uwp.utils.Constants;

/**
 * This Class is used for calling the listeners after test completions
 * 
 * @author Optimus
 *
 */
public class BaseTest {
	static SoftAssert softAssert;
	protected String onTestPass = "Execution Completed Test Passed";
	protected String executing = "Executing Test Case - ";
	public static WindowsDriver<WebElement> driver = null;
	protected static Logger log;
	static DesiredCapabilities capabilities;
	
    /**
	 * Configure Logger
	 */
	static {
		PropertyConfigurator.configure(Constants.PATH_LOGGER);	
	}
	
	public BaseTest() throws IOException {
		log = LoggerFactory.getLogger(BaseTest.class);
	}
	
	@BeforeMethod(alwaysRun = true)
	public static void launchApp() {
		try {
			capabilities = UtilityService.setAppCapabilities();
			driver = UtilityService.createWindowsDriverSession(capabilities);
			log.info("Application is launched");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@AfterMethod(alwaysRun = true)
	public static void quitApp() {
		softAssert = new SoftAssert();
		if (driver != null) {
			driver.quit();
		}
		driver = null;
		log.info("Application is closed");
		log.info("-------------------------------------------");
	}
}
