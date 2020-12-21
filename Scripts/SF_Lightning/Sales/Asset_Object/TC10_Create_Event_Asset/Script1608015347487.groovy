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
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Asset_Object/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Home  Salesforce/span_More'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Home  Salesforce/span_Assets'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Recently Viewed  Assets  Salesforce/a_Server-Dell'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/span_Add'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Subject'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Enter Subject line'), 
    'Call', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Starting Date'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Enter Date'), 
    'Dec 30, 2020')

WebUI.clearText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Starting Time'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Starting Time'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Enter Time'), 
    '9:00 AM')

WebUI.clearText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/End Date'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Enter End date'), 
    'Dec 31, 2020')

WebUI.delay(5)

WebUI.clearText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/End Time'))

WebUI.delay(5)

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Enter End Time'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/Enter End Time'), 
    '10:00 PM')

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/span_Save'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Recently Viewed  Assets  Salesforce/TxtElement'), 
    0)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj10_Asset_Event_Create/Page_Server-Dell  Salesforce/span_Assets'))

WebUI.closeBrowser()

