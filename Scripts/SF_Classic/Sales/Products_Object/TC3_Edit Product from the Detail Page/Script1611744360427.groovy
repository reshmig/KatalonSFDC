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

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Products Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Product Views Go'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj03_Edit Product from the Detail Page/Product name link'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj03_Edit Product from the Detail Page/Edit button'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Product Name'))

WebUI.clearText(findTestObject('SF_Classic/Sales/Products_Object/Obj03_Edit Product from the Detail Page/Product Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Product Name'), 
    'QA Katalon1Edit')

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Save button'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Products Tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Products_Object/Obj01_Create Product manually from Home Page/Product Views Go'))

WebUI.verifyTextPresent('QA Katalon1Edit', false)

WebUI.closeBrowser()

