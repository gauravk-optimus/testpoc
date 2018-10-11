package com.uwp.service;

import com.uwp.utils.BaseTest;

/**
 * This Class is used for reusable methods
 * 
 * @author Optimus
 *
 */
public class Keywords extends BaseTest {

	public static void clickByName(String element) {
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
}