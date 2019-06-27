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
import java.util.Random

import internal.GlobalVariable

public class PageCommons {

	public static openBaseUrl(String base){
		WebUI.openBrowser(base)
		WebUI.waitForPageLoad(1)
	}

	public static quitSession(){
		WebUI.deleteAllCookies()
		WebUI.closeBrowser()
	}

	public static randomUser() {
		String[] names = ["Billy", "Janet", "Bobby", "Christina", "Adam", "Veronica", "David", "Mindy","Jose","Deepal","Hitesh","Jennifer"]
		String randomName = (names[new Random().nextInt(names.length)])
		return randomName
	}

	public static randomSelection() {
		String[] pick = ["Neutral", "Ramshackle", "Malevolent", "Hearth"]
		String randomPick = (pick[new Random().nextInt(pick.length)])
		return randomPick
	}
}
