package com.uwp.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.uwp.utils.BaseTest;

/**
 * This Class is used for reusable methods
 * 
 * @author Optimus
 *
 */
public class Keywords extends BaseTest {
	private static Keywords keywords;

	private Keywords() {
	}

	/**
	 * Applying singleton design pattern for 'Keywords' class
	 *
	 */
	public static Keywords getInstance() {
		if (keywords == null) {
			keywords = new Keywords();
		}
		return keywords;
	}

	public void clickButton(By element) {
		try {
			driver.findElement(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getTextById(String element) {
		return driver.findElementByAccessibilityId(element).getText();
	}

	public void captureScreenshot() {
		File scrFile;
		try {
			String methodName = Thread.currentThread().getStackTrace()[2].getMethodName();
			String path = System.getProperty("user.dir") + "\\artifacts\\Screenshots\\";
			System.out.println("Capture the Screen shot" + methodName);
			scrFile = new File(path);
			scrFile = ((TakesScreenshot) Keywords.driver).getScreenshotAs(OutputType.FILE);
			path = path + methodName + "_" + new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss").format(Calendar.getInstance().getTime()) + ".png";
			FileUtils.copyFile(scrFile, new File(path));
		} catch (Exception exception) {
			// logger.warn(exception);
		}
	}
}