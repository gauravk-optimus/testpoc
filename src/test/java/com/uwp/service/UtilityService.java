package com.uwp.service;

import io.appium.java_client.windows.WindowsDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uwp.utils.Constants;

/**
 * This Class is used for reading files
 * 
 * @author Optimus
 *
 */
public class UtilityService {

	private static Logger log = LoggerFactory.getLogger(UtilityService.class);
	private static Properties config;
	private static FileInputStream inputFile;
	private static String propertyKey;

	static {
		config = new Properties();
		try {
			inputFile = new FileInputStream(Constants.PATH_ROOT + Constants.CONFIG_FILE_PATH);
			config.load(inputFile);
		} catch (IOException exception) {
			log.error("Exception occured while reading the " + propertyKey);
			exception.printStackTrace();
		}
	}

	/**
	 * Fetching property from properties file
	 * 
	 * @param propertyKey
	 *            key to be read
	 * @return value corresponding to the key
	 */
	public static String getPropertyFromConfig(String propertyKey) {
		String value = config.getProperty(propertyKey);
		log.info(value + " of property " + propertyKey + " is read by Properties Reader");
		return value;
	}

	public static DesiredCapabilities setAppCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("app", UtilityService.getPropertyFromConfig("appID") + "!App");
		return capabilities;
	}

	public static WindowsDriver<WebElement> createWindowsDriverSession(DesiredCapabilities capabilities) {
		WindowsDriver<WebElement> appSession = null;
		try {
			appSession = new WindowsDriver<WebElement>(new URL(UtilityService.getPropertyFromConfig("WinAppDriverURL")), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return appSession;
	}
}