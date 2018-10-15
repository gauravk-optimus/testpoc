package com.uwp.service;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.io.FileUtils;
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

	public static Keywords getInstance() {
		if (keywords == null) {
			keywords = new Keywords();
		}
		return keywords;
	}

	public void clickByName(String element) {
		try {
			driver.findElementByName(element).click();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static String getTextById(String element) {
		String text = driver.findElementByAccessibilityId(element).getText();
		return text.replace("Display is", "").trim();
	}

	/**
	 * This method is used for taking a screenshot within a method. Not to be
	 * confused with captureScreenshotOnFailure() under TestListener class
	 */
	public void captureScreenshot() {
//		log.info("Capture the Screen shot");
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
//			logger.warn(exception);
		}
	}
}