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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://login.salesforce.com/')

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Login  Salesforce/input_Username_username'), 
    'qa.katalonautomation@gmail.com')

WebUI.setEncryptedText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Login  Salesforce/input_Password_pw'), 
    'y6DZPm+MBX0CnWA9hcdx/w==')

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Login  Salesforce/input_Password_Login'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Home  Salesforce/span_More'))

WebUI.enhancedClick(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Home  Salesforce/span_Assets'))

WebUI.delay(3)

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Recently Viewed  Assets  Salesforce/Click_List-icon'))

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Recently Viewed  Assets  Salesforce/a_Edit'))

WebUI.setText(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Edit Server-Dell  Salesforce/Enter_Serial Number'), 
    '11161')

WebUI.click(findTestObject('SF_Lightning/Sales/Asset_Object/Obj02_Asset_Edit_List/Page_Edit Server-Dell  Salesforce/span_Save'))

WebUI.delay(5)

WebUI.verifyTextPresent('Server-Dell', false)

WebUI.closeBrowser()

