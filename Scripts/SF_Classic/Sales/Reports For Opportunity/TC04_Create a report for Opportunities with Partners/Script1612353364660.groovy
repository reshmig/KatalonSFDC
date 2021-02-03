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

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Reports tab'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/New Report button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Opportunity maximize button'))

WebUI.enhancedClick(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Opportunity with Partners type'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Create button'))

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Save button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Report Name'))

WebUI.sendKeys(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Report Name'), 
    'Opportunity with Partners1 Report')

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Report Unique Name'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Save Report button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Run Report button'))

WebUI.delay(2)

WebUI.click(findTestObject('SF_Classic/Sales/Reports for Opportunity/Obj04_Create a report for Opportunities with Partners/Reports tab'))

WebUI.verifyTextPresent('Opportunity with Partners1 Report', false)

WebUI.closeBrowser()

