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

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Asset_Object/TC01_Create_Asset'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Asset_Object/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Home  Salesforce/span_More'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Home  Salesforce/span_Assets'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Recently Viewed  Assets  Salesforce/a_Server-Dell'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Server-Dell  Salesforce/span_New Task'))

WebUI.setText(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Server-Dell  Salesforce/input_Subject_input-288'), 
    'New Task01')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Server-Dell  Salesforce/input_Due Date_32300'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Server-Dell  Salesforce/Enter Date'), 
    '12/25/2020')

WebUI.delay(3)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Server-Dell  Salesforce/span_Save'))

WebUI.verifyElementPresent(findTestObject('SF_Lightning/Sales/Asset_Object/Obj07_Asset_Task/Page_Recently Viewed  Assets  Salesforce/TxtElement'), 
    0)

WebUI.delay(5)

WebUI.closeBrowser()

