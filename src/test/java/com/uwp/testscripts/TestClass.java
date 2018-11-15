package com.uwp.testscripts;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

import java.io.IOException;

import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.uwp.constants.AssertionConstants;
import com.uwp.constants.ErrorConstants;
import com.uwp.eventlistner.BaseClass;
import com.uwp.screen.TestScreen;

/**
 * This Class contains all the test cases for 'TestScreen' Screen
 * 
 * @author Optimus
 *
 */
public class TestClass extends BaseClass {

	TestScreen testScreen = new TestScreen();
	public TestClass() throws IOException {
		log = LoggerFactory.getLogger(TestClass.class);
	}
	
	@Severity(SeverityLevel.MINOR)
	@Link(name="WinCalcApp", url="https://www.microsoft.com/en-us/p/windows-calculator/9wzdncrfhvn5#activetab=pivot:overviewtab")
	@Description("This test case verify addition of two operands")
	@Test(description = "To verify addition", priority = 1, enabled = true, alwaysRun = true, groups = { "Smoke" })
	public void Addition() throws IOException {
		log.info(executing + "Addition");
		testScreen.clickOne();
		testScreen.clickPlus();
		testScreen.clickSeven();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInAddition);
		log.info(onTestPass);
	}

	@Severity(SeverityLevel.BLOCKER)
	@Link(name="WinCalcApp", url="https://www.microsoft.com/en-us/p/windows-calculator/9wzdncrfhvn5#activetab=pivot:overviewtab")
	@Description("This test case verify Combination of three operators and four operands")
	@Test(description = "To verify may operation", priority = 1, enabled = true, alwaysRun = true)
	public void ManyOperation() throws IOException {
		log.info(executing + "ManyOperation");
		testScreen.clickSeven();
		testScreen.clickMultiply();
		testScreen.clickNine();
		testScreen.clickPlus();
		testScreen.clickOne();
		testScreen.clickEquals();
		testScreen.clickDivide();
		testScreen.clickEight();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInCombination);
		log.info(onTestPass);
	}

	@Severity(SeverityLevel.TRIVIAL)
	@Link(name="WinCalcApp", url="https://www.microsoft.com/en-us/p/windows-calculator/9wzdncrfhvn5#activetab=pivot:overviewtab")
	@Description("This test case verify division of two operands")
	@Test(description = "To verify division", priority = 1, enabled = true, alwaysRun = true, groups = { "Smoke" })
	public void Division() throws IOException {
		log.info(executing + "Division");
		testScreen.clickEight();
		testScreen.clickEight();
		testScreen.clickDivide();
		testScreen.clickOne();
		testScreen.clickOne();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInDivision);
		log.info(onTestPass);
	}
	
	@Severity(SeverityLevel.NORMAL)
	@Link(name="WinCalcApp", url="https://www.microsoft.com/en-us/p/windows-calculator/9wzdncrfhvn5#activetab=pivot:overviewtab")
	@Description("This test case verify multiplication of two operands")
	@Test(description = "To verify multiplication", priority = 1, enabled = true, alwaysRun = true, groups = { "Smoke" })
	public void Multiplication() throws IOException {
		log.info(executing + "Multiplication");
		testScreen.clickNine();
		testScreen.clickMultiply();
		testScreen.clickNine();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEightyOne, ErrorConstants.ErrorInMultiplication);
		log.info(onTestPass);
	}
	
//	@Severity(SeverityLevel.BLOCKER) // when severity is commented or not added, it will appear as 'Normal' in allure report
	@Link(name="WinCalcApp", url="https://www.microsoft.com/en-us/p/windows-calculator/9wzdncrfhvn5#activetab=pivot:overviewtab")
	@Description("This test case verify subtraction of two operands")
	@Test(description = "To verify subtraction", priority = 1, enabled = true, alwaysRun = true, groups = { "Smoke", "Regression" })
	public void Subtraction() throws IOException {
		log.info(executing + "Subtraction");
		testScreen.clickNine();
		testScreen.clickMinus();
		testScreen.clickOne();
		testScreen.clickEquals();
		Assert.assertEquals(testScreen.getResult(), AssertionConstants.CalcResultEight, ErrorConstants.ErrorInSubtraction);
		log.info(onTestPass);
	}

	@Link(name="WinCalcApp", url="https://www.microsoft.com/en-us/p/windows-calculator/9wzdncrfhvn5#activetab=pivot:overviewtab")
	@Description("This test case verify all the operations in this single test case")
	@Test(groups = { "Combined" })
	public void CombinedTestCaseforAll() throws IOException{
		log.info(executing + "CombinedTestCaseforAll");
		Addition();
		ManyOperation();
		Division();
		Multiplication();
	}
}