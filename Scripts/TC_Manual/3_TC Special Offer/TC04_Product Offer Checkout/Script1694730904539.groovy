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

WebUI.callTestCase(findTestCase('TC_Manual/3_TC Special Offer/TC03_Access Product Offer'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-navbar-Page Location'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-navbar-Page Location'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-title-HP Pavilion'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-title-HP Pavilion'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-price-499USD'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-price-499USD'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-desc-Redesigned with you'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-desc-Redesigned with you'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-input-Quantity'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-input-Quantity'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-btn-Add To Cart'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-btn-Add To Cart'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-title-Product Specification'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-title-Product Specification'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionCustomization'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionCustomization'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionCustomization'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionDisplay'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionDisplay'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionDisplayResolution'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionDisplayResolution'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionDisplaySize'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionDisplaySize'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-Memory'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-Memory'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionOS'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionOS'), 0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionProcessor'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionProcessor'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionTouchScreen'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionTouchScreen'), 
    0)

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionWeight'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-Specification-SectionWeight'), 0)

WebUI.click(findTestObject('Object Spy Manual/Special Offer/SO_productCO-btn-colorPurple'))

// Get the quantity value
String quantityValue = WebUI.getAttribute(findTestObject('Object Spy Manual/Special Offer/SO_productCO-input-Quantity'), 
    'value')

// Parse the quantity value to an integer
int quantity = Integer.parseInt(quantityValue)

// Check if quantity is less than or equal to 1
if (quantity <= 1) {
    // Handle the case where quantity is less than or equal to 1
    WebUI.verifyElementPresent(findTestObject('Object Repository/Object Spy Manual/Special Offer/SO_productCO-btn-if1Less1-QuantityMinusDisabled'), 
        0)

    WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_productCO-btn-QuantityPlus'), 0 // Quantity is greater than 1 and the Quantity Minus button is present
        )
} else {
    WebUI.click(findTestObject('Object Spy Manual/Special Offer/SO_productCO-btn-QuantityPlus'))

    WebUI.click(findTestObject('Object Repository/Object Spy Manual/Special Offer/SO_productCO-btn-IfMore1-QuantityMinus'))
}

WebUI.click(findTestObject('Object Spy Manual/Special Offer/SO_productCO-btn-Add To Cart'))

WebUI.waitForElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_producPopUpCO-cardProduct'), 0)

WebUI.verifyElementPresent(findTestObject('Object Spy Manual/Special Offer/SO_producPopUpCO-cardProduct'), 0)

WebUI.click(findTestObject('Object Spy Manual/Authentication/1_Home Page/Home_link-logo-Advantage Demo'))

