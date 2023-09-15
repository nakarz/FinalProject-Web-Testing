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

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_navbar-Popular Items'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_titile-Popular Items'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_titile-Popular Items'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-HP Elitebook'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-HP Elitebook'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-HP Elitepad'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-HP Elitepad'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-HP Roar Plus'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-HP Roar Plus'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Elitebook-View Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Elitebook-View Details'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Elitepad-View Details'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Elitepad-View Details'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Roar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Roar'), 0)

WebUI.click(findTestObject('Object Spy Manual/Popular Items/PI_label-btn-product-HP Roar'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_navbar-pageLocation-Hp Roar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_navbar-pageLocation-Hp Roar'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-nameProduct-HP Roar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-nameProduct-HP Roar'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-priceProduct-HP Roar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-priceProduct-HP Roar'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-descProduct-HP Roar'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-descProduct-HP Roar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-Colors'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_product-Colors'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionCompatibility'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionCompatibility'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionConnector'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionConnector'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionManufacturer'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionManufacturer'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionWeight'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionWeight'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionWirelessTech'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-title-Product Specification-SectionWirelessTech'), 
    0)

WebUI.click(findTestObject('Object Spy Manual/Popular Items/PI_productCO-colorProduct-HP Roar-Black'))

WebUI.click(findTestObject('Object Spy Manual/Popular Items/PI_productCO-btn-QuantityPlus'))

WebUI.click(findTestObject('Object Spy Manual/Popular Items/PI_productCO-btn-QuantityPlus'))

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-btn-Add to Cart'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Popular Items/PI_productCO-btn-Add to Cart'), 0)

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_link-logo-Advantage Demo'))

