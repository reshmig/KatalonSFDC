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

WebUI.callTestCase(findTestCase('SF_Classic/Login sales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(2)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Products_Object/Obj07_Add one Price Book for the Product for the first time/Products Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj07_Add one Price Book for the Product for the first time/Product Views Go'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj07_Add one Price Book for the Product for the first time/Product name link'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/Add to Price Book button'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/Price Book name checkbox'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/Select button'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/List Price text field'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/List Price text field'), 
    '30')

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/Save button for Add List Price'))

WebUI.delay(2)

WebUI.verifyElementPresent(findTestObject('SF_Classic/Sales/Products_Object/Obj08_Add a Price Book for a Product/Price Book Name value'), 
    2)

WebUI.closeBrowser()

