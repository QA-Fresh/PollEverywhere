package PageObjects

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import java.util.List
import org.openqa.selenium.By
import org.openqa.selenium.interactions.Actions
import PageObjects.PageCommons
import PageObjects.InterviewTO
public class qainterview880Presentation {

	public static pollContinue(){
		WebUI.setText(InterviewTO.introField, PageCommons.randomUser())
		WebUI.click(InterviewTO.continueBtn)
	}

	public static questionaire() {
		WebUI.delay(3)
		String answer = PageCommons.randomSelection()
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement buttons = driver.findElement(By.xpath("//button/div[contains(normalize-space(.), '" + answer + "')]"))
		buttons.click()
	}
	
	public static numberOfParticipants(int num) {
		for (int i = 0; i < num; i++) {
		PageCommons.openBaseUrl(InterviewTO.pollUrl)
		qainterview880Presentation.pollContinue()
		qainterview880Presentation.questionaire()
		PageCommons.quitSession()
		}
	}
}
