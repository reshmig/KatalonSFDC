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

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Home  Salesforce/span_More'))

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Home  Salesforce/span_Assets'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Recently Viewed  Assets  Salesforce/a_Server-Dell'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Server-Dell  Salesforce/a_New Task01'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_New Task01  Salesforce/a_Show more actions'))

WebUI.click(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_New Task01  Salesforce/a_Edit'))

WebUI.clearText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Edit New Task01  Salesforce/Clear Text'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Edit New Task01  Salesforce/Enter Date'), 
    '15/12/2020')

WebUI.enhancedClick(findTestObject('Object Repository/SF_Lightning/Sales/Asset_Object/Obj08_Asset_Edit_Task/Page_Edit New Task01  Salesforce/span_Save'))

WebUI.delay(5)

WebUI.closeBrowser()

