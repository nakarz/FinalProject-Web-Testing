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

WS.callTestCase(findTestCase('TC_Manual/1_TC Home/TC00_Access Home'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_navbar-UserAccount'))

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_navbarModal-Sign In-createAcc'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Authentication/2_Register/Register_title-Create Account'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Authentication/2_Register/Register_title-Create Account'), 
    0)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Username'), GlobalVariable.username)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Email'), GlobalVariable.email)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Password'), GlobalVariable.password)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Confirm Password'), GlobalVariable.confirmPassword)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-First Name'), GlobalVariable.firstName)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Last Name'), GlobalVariable.lastName)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Phone Number'), GlobalVariable.phoneNumber)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-City'), GlobalVariable.city)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-Address'), GlobalVariable.address)

WebUI.setText(findTestObject('Object Spy Manual/Authentication/2_Register/Register_input-State'), GlobalVariable.state)

WebUI.click(findTestObject('Object Spy Manual/Authentication/2_Register/Register_select-Country'))

WebUI.click(findTestObject('Object Spy Manual/Authentication/2_Register/Register_checkBox-Receive exclusive'))

WebUI.click(findTestObject('Object Spy Manual/Authentication/2_Register/Register_checkBox-Agree Terms'))

WebUI.click(findTestObject('Object Spy Manual/Authentication/2_Register/Register_btn-Register'))

