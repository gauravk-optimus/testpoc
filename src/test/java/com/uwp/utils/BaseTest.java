package com.uwp.utils;

import org.apache.log4j.PropertyConfigurator;
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
