package com.uwp.screen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uwp.eventlistner.EventHandlerService;

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

	public void clickOne() throws IOException {
		EventHandlerService.getInstance().clickButton(ONE_KEY);
		log.info("Clicked on One button");
	}

	public void clickSeven() throws IOException {
		EventHandlerService.getInstance().clickButton(SEVEN_KEY);
		log.info("Clicked on Seven button");
	}

	public void clickEight() throws IOException {
		EventHandlerService.getInstance().clickButton(EIGHT_KEY);
		log.info("Clicked on Eight button");
	}

	public void clickNine() throws IOException {
		EventHandlerService.getInstance().clickButton(NINE_KEY);
		log.info("Clicked on Nine button");
	}

	public void clickPlus() throws IOException {
		EventHandlerService.getInstance().clickButton(PLUS_KEY);
		log.info("Clicked on Plus Key");
	}

	public void clickMinus() throws IOException {
		EventHandlerService.getInstance().clickButton(MINUS_KEY);
		log.info("Clicked on Minus Key");
	}

	public void clickMultiply() throws IOException {
		EventHandlerService.getInstance().clickButton(MULTIPLY_KEY);
		log.info("Clicked on Multiply Key");
	}

	public void clickDivide() throws IOException {
		EventHandlerService.getInstance().clickButton(DIVIDE_KEY);
		log.info("Clicked on Divide Key");
	}

	public void clickEquals() throws IOException {
		EventHandlerService.getInstance().clickButton(EQUALS_KEY);
		log.info("Clicked on Divide Key");
	}

	public String getResult() throws IOException {
		String text = EventHandlerService.getInstance().getTextById(RESULT);
		String trimmedString = text.replace("Display is", "").trim();
		log.info("Extracted the result");
		return trimmedString;
	}
}