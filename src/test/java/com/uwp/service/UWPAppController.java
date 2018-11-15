package com.uwp.service;

import io.appium.java_client.windows.WindowsDriver;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.uwp.service.PropertyFileHandler.ConfigPropertyKeys;

/**
 * This Class contains all the methods to initialize UWP apps
 * 
 * @author Optimus
 *
 */
public class UWPAppController {

	/**
	 * Setting desired desired capabilities for the app
	 * 
	 * @return capabilities
	 */
	public static DesiredCapabilities setAppCapabilities() {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		String appID = PropertyFileHandler.getPropertyFromConfig(ConfigPropertyKeys.appID);
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
			String WinAppDriverURL = PropertyFileHandler.getPropertyFromConfig(ConfigPropertyKeys.WinAppDriverURL);
			appSession = new WindowsDriver<WebElement>(new URL(WinAppDriverURL), capabilities);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return appSession;
	}
}