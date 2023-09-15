import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('TC_Manual/2_TC Authentication/TC02_Login User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_navbar-Special Offer'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_title-Special Offer'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_title-Special Offer'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_product-img_Laptop HP'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_product-img_Laptop HP'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_product-title-HP Pavilion'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_product-title-HP Pavilion'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_commerce-txt-Explore'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_commerce-txt-Explore'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_product-desc-Supremely thin'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_product-desc-Supremely thin'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_btn-See Offer'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_btn-See Offer'), 0)

WebUI.click(findTestObject('Object Spy Manual/Special Offer/SO_btn-See Offer'))

