package com.uwp.utils;

import io.appium.java_client.windows.WindowsDriver;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;

import com.uwp.utils.Constants;

/**
 * This Class is used for calling the listeners after test completions
 * 
 * @author Optimus
 *
 */
public class BaseTest {
	SoftAssert softAssert;
	protected String onTestPass = "Execution Completed Test Passed";
	protected String executing = "Executing Test Case - ";
	public static WindowsDriver<WebElement> driver = null;
	
    /**
	 * Configure Logger
	 */
	static {
		PropertyConfigurator.configure(Constants.PATH_LOGGER);	
	}
	
	@BeforeMethod(alwaysRun=true)
	public void setup() {
		softAssert = new SoftAssert();
	}
}
