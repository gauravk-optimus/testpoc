package com.uwp.testscripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.uwp.service.UtilityService;

import java.util.concurrent.TimeUnit;
import java.net.URL;

import io.appium.java_client.windows.WindowsDriver;

public class CalculatorTest {

	private static WindowsDriver<WebElement> appSession = null;
	private static WebElement element = null;

	@BeforeMethod
	public static void setup() {
		try {
			DesiredCapabilities capabilities = new DesiredCapabilities();
//			capabilities.setCapability("app", "Microsoft.WindowsCalculator_8wekyb3d8bbwe!App");
			capabilities.setCapability("app", UtilityService.getPropertyFromFile("appID"));
			appSession = new WindowsDriver<WebElement>(new URL("http://127.0.0.1:4723"), capabilities);
			appSession.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
			element = appSession.findElementByAccessibilityId("elements");
			Assert.assertNotNull(element);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
		}
	}

	//@BeforeTest
	public void Clear() {
		appSession.findElementByName("Clear").click();
		Assert.assertEquals("0", _GetelementText());
	}

	@AfterMethod
	public static void TearDown() {
		element = null;
		if (appSession != null) {
			appSession.quit();
		}
		appSession = null;
	}

	@Test
	public void empty() {

	}

	@Test
	public void Addition() {
		appSession.findElementByName("One").click();
		appSession.findElementByName("Plus").click();
		appSession.findElementByName("Seven").click();
		appSession.findElementByName("Equals").click();
		Assert.assertEquals("8", _GetelementText());
	}

//	@Test
	public void Combination() {
		appSession.findElementByName("Seven").click();
		appSession.findElementByName("Multiply by").click();
		appSession.findElementByName("Nine").click();
		appSession.findElementByName("Plus").click();
		appSession.findElementByName("One").click();
		appSession.findElementByName("Equals").click();
		appSession.findElementByName("Divide by").click();
		appSession.findElementByName("Eight").click();
		appSession.findElementByName("Equals").click();
		Assert.assertEquals("8", _GetelementText());
	}

//	@Test
	public void Division() {
		appSession.findElementByName("Eight").click();
		appSession.findElementByName("Eight").click();
		appSession.findElementByName("Divide by").click();
		appSession.findElementByName("One").click();
		appSession.findElementByName("One").click();
		appSession.findElementByName("Equals").click();
		Assert.assertEquals("8", _GetelementText());
	}

//	@Test
	public void Multiplication() {
		appSession.findElementByName("Nine").click();
		appSession.findElementByName("Multiply by").click();
		appSession.findElementByName("Nine").click();
		appSession.findElementByName("Equals").click();
		Assert.assertEquals("81", _GetelementText());
	}

//	@Test
	public void Subtraction() {
		appSession.findElementByName("Nine").click();
		appSession.findElementByName("Minus").click();
		appSession.findElementByName("One").click();
		appSession.findElementByName("Equals").click();
		Assert.assertEquals("8", _GetelementText());
	}

	protected String _GetelementText() {
		return element.getText().replace("Display is", "").trim();
	}
}