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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('SF_Classic/Login sales'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Pricebook_Object/Obj01_Create new Pricebook/Pricebook Tab Click'))

WebUI.click(findTestObject('SF_Classic/Sales/Pricebook_Object/Obj01_Create new Pricebook/New Button Price Book Home Page'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Pricebook_Object/Obj01_Create new Pricebook/Name field on Creation page'), 
    'TEST SR  KAT123')

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Pricebook_Object/Obj01_Create new Pricebook/Description Field on Creation Page'), 
    '" ST TEST THIS RECORD HAS BEEN CREATED USING KATALON"')

WebUI.selectOptionByValue(findTestObject('SF_Classic/Sales/Pricebook_Object/Obj01_Create new Pricebook/Pricebook selection from existing'), 
    '01s5g000001tvCf', false)

WebUI.click(findTestObject('SF_Classic/Sales/Pricebook_Object/Obj01_Create new Pricebook/Save Button on Creation Page'))

WebUI.delay(5)

WebUI.verifyTextPresent('TEST SR  KAT123', false)

WebUI.closeBrowser()

