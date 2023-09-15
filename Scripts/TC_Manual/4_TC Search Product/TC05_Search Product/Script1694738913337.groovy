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

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_navbar-Search'))

WebUI.waitForElementVisible(findTestObject('Object Spy Manual/Search Product/SP_input-txt-Search Product'), 10)

WebUI.setText(findTestObject('Object Spy Manual/Search Product/SP_input-txt-Search Product'), inputSearchProduct)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_list-titile-CATEGORIES'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_list-titile-CATEGORIES'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_txt-Top Results For headphone'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_txt-Top Results For headphone'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_label-Headphones'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_label-Headphones'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_btn-product-Beats Studio 2'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_btn-product-Beats Studio 2'), 0)

WebUI.click(findTestObject('Object Spy Manual/Search Product/SP_btn-product-Beats Studio 2'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-navbar-currentPageLocationSearch'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-navbar-currentPageLocationSearch'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-nameProduct-Beats Studio'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-nameProduct-Beats Studio'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-price-179'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-price-179'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-videoProduct'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-videoProduct'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_title-Product Specification'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_title-Product Specification'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-Specification-SectionCompatibility'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-Specification-SectionCompatibility'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-Specification-SectionConnector'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-Specification-SectionConnector'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-Specification-SectionWeight'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Search Product/SP_productCO-Specification-SectionWeight'), 
    0)

WebUI.click(findTestObject('Object Spy Manual/Search Product/SP_productCO-btn_Add To Cart'))

