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
 * This Class contains all the methods to read config files, setting
 * capabilities, app sessions and winAppDriver sessions
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
		return value;
	}

	/**
	 * Setting desired desired capabilities for the app
	 * 
	 * @return capabilities
	 */
	public static DesiredCapabilities setAppCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String appID = UtilityService.getPropertyFromConfig("appID");
		capabilities.setCapability("app", appID + "!App");
		return capabilities;
	}

	/**
	 * Creating windows driver session
	 * 
	 * @param capabilities
	 *            object returned by setAppCapabilities method
	 * @return value corresponding to the key
	 */
	public static WindowsDriver<WebElement> createWindowsDriverSession(DesiredCapabilities capabilities) {
		WindowsDriver<WebElement> appSession = null;
		try {
			String WinAppDriverURL = UtilityService.getPropertyFromConfig("WinAppDriverURL");
			appSession = new WindowsDriver<WebElement>(new URL(WinAppDriverURL), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return appSession;
	}
}