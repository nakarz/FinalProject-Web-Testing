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

WebUI.callTestCase(findTestCase('TC_Manual/5_TC Popular Items/TC06_Order Popular Items'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_navbar-Contact Us'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_card'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_card'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_title-Contact Us'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_title-Contact Us'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_select-Category'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_select-Category'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_select-Product'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_select-Product'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_input-Email'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_input-Email'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_input-Subject'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_input-Subject'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_btn-Send'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_btn-Send'), 0)

WebUI.selectOptionByIndex(findTestObject('Object Spy Manual/Contact Us/CU_select-Category'), 2, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Spy Manual/Contact Us/CU_input-Email'), GlobalVariable.emailCS, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Object Spy Manual/Contact Us/CU_input-Subject'), 'Something went wrong when I try to shut down my laptop')

WebUI.click(findTestObject('Object Spy Manual/Contact Us/CU_btn-Send'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_title-done_Thank you for contacting Advantage support'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_title-done_Thank you for contacting Advantage support'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_btn-done-Continue Shopping'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Contact Us/CU_btn-done-Continue Shopping'), 0)

WebUI.click(findTestObject('Object Spy Manual/Contact Us/CU_btn-done-Continue Shopping'))

