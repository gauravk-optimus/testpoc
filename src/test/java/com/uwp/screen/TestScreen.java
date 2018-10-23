package com.uwp.screen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.uwp.service.Keywords;

/**
 * This Class contains all the page objects and methods of 'TestScreen' screen
 * 
 * @author Optimus
 *
 */
public class TestScreen {

	// Locators
	private By ONE_KEY = By.name("One");
	private By SEVEN_KEY = By.name("Seven");
	private By EIGHT_KEY = By.name("Eight");
	private By NINE_KEY = By.name("Nine");
	private By PLUS_KEY = By.name("Plus");
	private By MINUS_KEY = By.name("Minus");
	private By MULTIPLY_KEY = By.name("Multiply by");
	private By DIVIDE_KEY = By.name("Divide by");
	private By EQUALS_KEY = By.name("Equals");
	private String RESULT = "CalculatorResults";
	private static Logger log;

	public TestScreen() throws IOException {
		log = LoggerFactory.getLogger(TestScreen.class);
	}

	public void clickOne() {
		Keywords.getInstance().clickButton(ONE_KEY);
		log.info("Clicked on One button");
	}

	public void clickSeven() {
		Keywords.getInstance().clickButton(SEVEN_KEY);
		log.info("Clicked on Seven button");
	}

	public void clickEight() {
		Keywords.getInstance().clickButton(EIGHT_KEY);
		log.info("Clicked on Eight button");
	}

	public void clickNine() {
		Keywords.getInstance().clickButton(NINE_KEY);
		log.info("Clicked on Nine button");
	}

	public void clickPlus() {
		Keywords.getInstance().clickButton(PLUS_KEY);
		log.info("Clicked on Plus Key");
	}

	public void clickMinus() {
		Keywords.getInstance().clickButton(MINUS_KEY);
		log.info("Clicked on Minus Key");
	}

	public void clickMultiply() {
		Keywords.getInstance().clickButton(MULTIPLY_KEY);
		log.info("Clicked on Multiply Key");
	}

	public void clickDivide() {
		Keywords.getInstance().clickButton(DIVIDE_KEY);
		log.info("Clicked on Divide Key");
	}

	public void clickEquals() {
		Keywords.getInstance().clickButton(EQUALS_KEY);
		log.info("Clicked on Divide Key");
	}

	public String getResult() {
		String text = Keywords.getInstance().getTextById(RESULT);
		String trimmedString = text.replace("Display is", "").trim();
		log.info("Extracted the result");
		return trimmedString;
	}
}