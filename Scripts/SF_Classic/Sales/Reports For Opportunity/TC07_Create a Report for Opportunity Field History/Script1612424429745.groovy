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

WebUI.maximizeWindow()

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Reports tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/New Report button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Opportunity maximize button'))

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Opportunity Field History Type'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Create button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Save button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Report Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Report Name'), 
    'Opportunity Field History Report')

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Report Unique Name'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Save Report button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Run Report button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj07_Create a Report for Opportunity Field History/Reports tab'))

WebUI.verifyTextPresent('Opportunity Field History Report', false)

WebUI.closeBrowser()

