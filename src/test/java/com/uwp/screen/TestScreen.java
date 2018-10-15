package com.uwp.screen;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.uwp.locators.Locators;
import com.uwp.service.Keywords;
import com.uwp.testscripts.TestClass;

public class TestScreen{
	
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
	private By RESULT = By.name("CalculatorResults");
	private static Logger log;
	
	public TestScreen() throws IOException {
		log = LoggerFactory.getLogger(TestClass.class);		
	}
	
	public static void clickByName(String ele){
	Keywords.getInstance().clickByName(ele);
	}
	
}