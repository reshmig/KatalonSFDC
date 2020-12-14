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

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Asset_Object/TC01_Create_Asset'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('SF_Lightning/Sales/Asset_Object/Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_Home  Salesforce/span_More'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_Home  Salesforce/span_Assets'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_Recently Viewed  Assets  Salesforce/a_Server-Dell'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_Server-Dell  Salesforce/a_Show more actions'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_Server-Dell  Salesforce/a_Clone'))

WebUI.delay(5)

WebUI.clearText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_New Asset  Salesforce/Clear Text'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_New Asset  Salesforce/Enter New Asset'), 
    'IBM-Server')

WebUI.clearText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_New Asset  Salesforce/Clear_Text'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_New Asset  Salesforce/Enter Sr No'), 
    'IB01S-5TA')

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_New Asset  Salesforce/span_Save'))

WebUI.delay(5)

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj06_Asset_Clone/Page_Server-IBM  Salesforce/span_Assets'))

WebUI.closeBrowser()

